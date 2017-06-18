package pl.krajan.tests;


import org.testng.annotations.Test;
import pl.krajan.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNawigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("AdamQA1", null, null));
    }

}
