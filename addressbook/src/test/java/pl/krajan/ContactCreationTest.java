package pl.krajan;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    
    @Test
    public void testContactCreation() {
        goToPageNewContact();
        fillNewContact(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres"));
        submitNewContact();
        returnToNewContact();
    }

}
