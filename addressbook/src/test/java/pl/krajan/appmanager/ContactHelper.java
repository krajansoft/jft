package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pl.krajan.model.ContactData;
import pl.krajan.model.Contacts;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kraja on 2017-06-09.
 */
public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        type(By.name("address2"), contactData.getAddress2());

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void selectedContactById(int id) {
        wd.findElement(By.cssSelector("input[value ='" + id + "']")).click();
    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void initContactModification() {
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void alertAfterDeleteContact() {
        wd.switchTo().alert().accept();
    }

    public void create(ContactData contact, boolean b) {
        fillContactForm(contact, true);
        submitContactCreation();
        contactsCache = null;

    }
    public void modyfy(ContactData contact) {
        selectedContactById(contact.getId());
        initContactModification();
        fillContactForm(contact, false);
        submitContactModification();
        contactsCache = null;
    }

    public void delate(ContactData contact) {
        selectedContactById(contact.getId());
        deleteContact();
        alertAfterDeleteContact(); //akceptacja okna js-owego :)
        contactsCache = null;
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));

    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public ContactData infoFromEditForm(ContactData contact) {
        initContactModificationById(contact.getId());
        String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
        String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
        String address = wd.findElement(By.name("address")).getAttribute("value");
        String email = wd.findElement(By.name("email")).getAttribute("value");
        String email2 = wd.findElement(By.name("email2")).getAttribute("value");
        String email3 = wd.findElement(By.name("email3")).getAttribute("value");
        String home = wd.findElement(By.name("home")).getAttribute("value");
        String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
        String work = wd.findElement(By.name("work")).getAttribute("value");
        wd.navigate().back();
        return new ContactData().withId(contact.getId()).withFirstname(firstname).withLastname(lastname)
                .withAddress(address).withEmail(email).withEmail2(email2).withEmail3(email3)
                .withHomePhone(home).withMobile(mobile).withWorkPhone(work);
    }
    public void initContactModificationById(int id) {
        wd.findElement(By.cssSelector(String.format("a[href='edit.php?id=%s']", id))).click();
    }

    private Contacts contactsCache = null;

    public Contacts all() {
        if (contactsCache != null){
            return new Contacts(contactsCache);
        }
        contactsCache = new Contacts();
        List<WebElement> elements = wd.findElements(By.cssSelector("#maintable tr[name='entry']"));
        for (WebElement element : elements) {
            String firstname = element.findElement(By.cssSelector("td:nth-child(3)")).getText();
            String lastname = element.findElement(By.cssSelector("td:nth-child(2)")).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            //ContactData contact = new ContactData().withId(id).withFirstname(firstname).withLastname(lastname);
            contactsCache.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname));
        }
        return new Contacts(contactsCache);
    }


}
