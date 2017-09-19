package pl.krajan.tests;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;
import pl.krajan.model.Groups;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;



public class GroupCreationTest extends TestBase {

    @DataProvider
    public Iterator<Object[]> validGroups() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        /*list.add(new Object[] {new GroupData().withName("test1").withHeader("header 1").withFooter("footer 1")});
        list.add(new Object[] {new GroupData().withName("test2").withHeader("header 2").withFooter("footer 2")});
        list.add(new Object[] {new GroupData().withName("test3").withHeader("header 3").withFooter("footer 3")});*/ //Dodawanie danych z data providera
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/groups.csv"));
        String line = reader.readLine();
        while (line != null){
            String[] split = line.split(";");
            list.add(new Object[]{new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
            line = reader.readLine();
        }
        return list.iterator();
    }



    @Test(dataProvider = "validGroups")
    public void testGroupCreation(GroupData group) {
            app.goTo().groupPage();
            Groups before = app.group().all();
            app.group().create(group);
            assertThat(app.group().count(), equalTo( before.size() + 1));
            Groups after = app.group().all();
            assertThat(after, equalTo(
                    before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));

    }

    @Test
    public void testBadGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("AdamQA1'").withHeader("Q");
        app.group().create(group);
        assertThat(app.group().count(), equalTo( before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before));
    }

}
