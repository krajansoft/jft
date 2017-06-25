package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;
import pl.krajan.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase {
    
    @Test
    public void testContactCreation() {

        app.getNawigationHelper().goToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getNawigationHelper().goToPageNewContact();
        app.getContactHelper().createContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1"), true);
        app.getNawigationHelper().goToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
