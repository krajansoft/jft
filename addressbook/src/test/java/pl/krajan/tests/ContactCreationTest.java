package pl.krajan.tests;

import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

public class ContactCreationTest extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.getNawigationHelper().goToPageNewContact();
        app.getContactHelper().createContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", "AdamQA1"), true);
        app.getNawigationHelper().goToHomePage();
    }

}
