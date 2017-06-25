package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

public class ContactDeletionTest extends TestBase {
    
    @Test
    public void testContactDeletion() {
    app.getNawigationHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
        app.getNawigationHelper().goToPageNewContact();
        app.getContactHelper().createContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1"), true);
        app.getNawigationHelper().goToHomePage();
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectedContact(before - 1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertAfterDeleteContact(); //akceptacja okna js-owego :)
    app.getNawigationHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
    }

}
