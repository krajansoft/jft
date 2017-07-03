package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.getNawigationHelper().goToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNawigationHelper().goToPageNewContact();
        ContactData contact = new ContactData("Adamqa2", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1");
        app.getContactHelper().createContact(contact, true);
        app.getNawigationHelper().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

}
