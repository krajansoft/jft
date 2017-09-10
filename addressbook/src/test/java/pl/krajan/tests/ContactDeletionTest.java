package pl.krajan.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;
import pl.krajan.model.Contacts;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactDeletionTest extends TestBase {

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
    public void testContactDeletion() {
        Contacts before = app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delate(deletedContact);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo( before.size() - 1));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before.withOut(deletedContact)));
    }



}
