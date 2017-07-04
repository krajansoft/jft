package pl.krajan.tests;


import org.testng.annotations.Test;
import pl.krajan.model.ContactData;
import pl.krajan.model.Contacts;



import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {

        app.goTo().homePage();
        Contacts before = app.contact().all();
        app.goTo().goNewContact();
        ContactData contact = new ContactData().withFirstname("Adamqa2").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1");
        app.contact().create(contact, true);
        app.goTo().homePage();
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() + 1));
        assertThat(after, equalTo(
                before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }

}
