package pl.krajan.tests;

import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

public class ContactCreationTest extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.goToPageNewContact();
        app.fillNewContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres"));
        app.submitNewContact();
        app.returnToNewContact();
    }

}
