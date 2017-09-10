package pl.krajan.tests;


import org.testng.annotations.Test;
import pl.krajan.model.ContactData;
import pl.krajan.model.Contacts;


import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.goTo().homePage();
        Contacts before = app.contact().all();
        app.goTo().goNewContact();
        File photo = new File("src/test/resources/plik.png");
        ContactData contact = new ContactData().withFirstname("Adamqa2").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1").withPhoto(photo);
        app.contact().create(contact, true);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo( before.size() + 1));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(
                before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }
    @Test
    public void testBadContactCreation() {

        app.goTo().homePage();
        Contacts before = app.contact().all();
        app.goTo().goNewContact();
        ContactData contact = new ContactData().withFirstname("Adamqa2'").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1");
        app.contact().create(contact, true);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo( before.size()));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before));


    }

}
