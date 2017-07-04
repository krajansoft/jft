package pl.krajan.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by kraja on 2017-06-12.
 */
public class ContactModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().list().size() == 0) {
            app.goTo().goNewContact();
            ContactData contact = new ContactData().withFirstname("Adamqa2").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1");
            app.contact().create(contact, true);
            app.goTo().homePage();
        }
    }

    @Test
    public void testModificationContact(){
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData()
                .withId(before.get(index).getId()).withFirstname("Adamqa2").withLastname("Krajan").withNickname("Krajanka").withCompany("krajansoft").withMobile("777444233").withEmail("krajansoft@gmail.com").withAddress2("test adres").withGroup("AdamQA1");
        app.contact().modyfy(index, contact);
        app.goTo().homePage();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }


}
