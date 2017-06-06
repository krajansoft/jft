package pl.krajan.addressbook.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.addressbook.model.ContactData;

import java.util.concurrent.TimeUnit;

public class AddCreationContactNew extends TestBase {

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/");
        login();
    }

    @Test
    public void testCreationContact() {
        goToPageAddContact();
        fillContactForm(new ContactData("Adam", "Krajewski", "krajan", "777-999-888", "krajansoft@gmail.com"));
        submitCreationContakt();
        returnToContactPage();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
