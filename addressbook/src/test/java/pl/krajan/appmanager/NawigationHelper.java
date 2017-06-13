package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kraja on 2017-06-09.
 */
public class NawigationHelper extends BaseHelper {

    public NawigationHelper(WebDriver wd) {
        super(wd);
    }
    public void goToGroupPage() {
        click(By.linkText("groups"));
    }
    public void goToPageNewContact() {
        click(By.linkText("add new"));
    }

    public void goToHome() {
        click(By.linkText("home"));
    }
}
