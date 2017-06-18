package pl.krajan.tests;

import org.testng.annotations.Test;
import pl.krajan.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNawigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("AdamQA1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
