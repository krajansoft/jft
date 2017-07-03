package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

import java.util.List;

public class ContactDeletionTest extends TestBase {
    
    @Test
    public void testContactDeletion() {
    app.goTo().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
        app.goTo().goToPageNewContact();
        app.getContactHelper().createContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1"), true);
        app.goTo().goToHomePage();
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectedContact(before.size() - 1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertAfterDeleteContact(); //akceptacja okna js-owego :)
    app.goTo().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);
    }

}
