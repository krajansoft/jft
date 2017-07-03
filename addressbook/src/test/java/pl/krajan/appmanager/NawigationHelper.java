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

    public void groupPage() {
        if(isElementPresent(By.tagName("h1"))
                    && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                    && isElementPresent(By.name("new"))) {
                return;
            }
        click(By.linkText("groups"));
    }


    public void goToPageNewContact() {
        click(By.linkText("add new"));
    }


    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText("home"));
    }
}
