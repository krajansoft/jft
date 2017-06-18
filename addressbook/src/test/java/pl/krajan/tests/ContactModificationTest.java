package pl.krajan.tests;

import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

/**
 * Created by kraja on 2017-06-12.
 */
public class ContactModificationTest extends TestBase {

    @Test
    public void testModificationContact(){
        app.getNawigationHelper().goToHome();
        app.getContactHelper().selectedContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Adamqa", "Krajan", "Krajanka", "krajansoft", "777444233", "krajansoft@gmail.com", "test adres", null), false);
        app.getContactHelper().submitContactModification();
    }
}
