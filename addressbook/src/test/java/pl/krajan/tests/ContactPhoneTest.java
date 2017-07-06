package pl.krajan.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

/**
 * Created by kraja on 2017-07-07.
 */
public class ContactPhoneTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().all().size() == 0) {
            app.goTo().goNewContact();
            ContactData contact = new ContactData().withFirstname("Adamqa2").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1");
            app.contact().create(contact, true);
            app.goTo().homePage();
        }
    }

    @Test
    public void testContactPhones(){
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
    }
}
