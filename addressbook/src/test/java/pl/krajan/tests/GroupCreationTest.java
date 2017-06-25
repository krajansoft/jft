package pl.krajan.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNawigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData group = new GroupData("AdamQA1", "Q", null);
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);

        int max = 0;
        for (GroupData g : after) {
            if (g.getId() > max){
                max = g.getId();
            }
        }
        group.setId(max);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
