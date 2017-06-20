package pl.krajan.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNawigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData("AdamQA1", "Q", null));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before+1);
    }

}
