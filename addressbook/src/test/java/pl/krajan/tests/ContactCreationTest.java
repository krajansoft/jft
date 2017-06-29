package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

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

        contact.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }

}
