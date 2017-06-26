package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

import java.util.HashSet;
import java.util.List;

/**
 * Created by kraja on 2017-06-12.
 */
public class ContactModificationTest extends TestBase {

    @Test
    public void testModificationContact(){
        app.getNawigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getNawigationHelper().goToPageNewContact();
            app.getContactHelper().createContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1"), true);
            app.getNawigationHelper().goToHomePage();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectedContact(before.size() - 1);
        app.getContactHelper().initContactModification();
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Adamqa", null, "Krajankamod", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", null);
        app.getContactHelper().fillContactForm(contact, false);
        app.getContactHelper().submitContactModification();
        app.getNawigationHelper().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
