package pl.krajan.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
    
    @Test
    public void testContactDeletion() {
    app.getNawigationHelper().goToHome();
    app.getContactHelper().selectedContact();
    app.getContactHelper().deleteContact();
    //app.getNawigationHelper().goToHome();
    }

}
