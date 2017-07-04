package pl.krajan.tests;



import org.testng.annotations.Test;
import pl.krajan.model.GroupData;
import pl.krajan.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;



public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goTo().groupPage();
        Groups before = app.group().all();
        GroupData group = new GroupData().withName("AdamQA1").withHeader("Q");
        app.group().create(group);
        Groups after = app.group().all();
        assertThat(after.size(), equalTo( before.size() + 1));
        assertThat(after, equalTo(
                before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    }

}
