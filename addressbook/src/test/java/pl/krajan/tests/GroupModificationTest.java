package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * Created by kraja on 2017-06-12.
 */
public class GroupModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if(app.group().all().size() == 0) {
            app.group().create(new GroupData().withName("AdamQA1"));
        }
    }

    @Test
    public void testGroupModification(){
        Set<GroupData> before = app.group().all();
        GroupData modyfiGroup = before.iterator().next();
        GroupData group = new GroupData()
                .withId(modyfiGroup.getId()).withName("AdamQA1").withHeader("Header test").withFooter("Footer test");
        app.group().modify(group);
        Set<GroupData> after = app.group().all();
        Assert.assertEquals(after.size(), before.size());

        before.remove(modyfiGroup);
        before.add(group);
        Assert.assertEquals(before, after);


    }

}
