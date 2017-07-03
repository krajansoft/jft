package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Created by kraja on 2017-06-12.
 */
public class GroupModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.getNawigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("AdamQA1", null, null));
        }
    }

    @Test
    public void testGroupModification(){
        List<GroupData> before = app.getGroupHelper().getGroupList();
        int index = before.size() -1;
        GroupData group = new GroupData(before.get(index).getId(),"AdamQA1", "Header test", "Footer test");
        app.getGroupHelper().modifyGroup(index, group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(group);
        Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);


    }

}
