package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pl.krajan.model.ContactData;

/**
 * Created by kraja on 2017-06-09.
 */
public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToNewContact() {
        click(By.linkText("home page"));
    }

    public void submitNewContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContact(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("company"), contactData.getCompany());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        type(By.name("address2"), contactData.getAddress2());
    }

    public void selectedContact() {
            if (!wd.findElement(By.name("selected[]")).isSelected()) {
                click(By.name("selected[]"));
            }
    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void initContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void alertAfterDeleteContact() {
        wd.switchTo().alert().accept();
    }
}
