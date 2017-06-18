package pl.krajan.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {
    
    @Test
    public void testContactDeletion() {
    app.getNawigationHelper().goToHomePage();
    app.getContactHelper().selectedContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertAfterDeleteContact(); //akceptacja okna js-owego :)
    app.getNawigationHelper().goToHomePage();
    }

}
