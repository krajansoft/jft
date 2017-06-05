package pl.krajan.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    
    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deletedSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
