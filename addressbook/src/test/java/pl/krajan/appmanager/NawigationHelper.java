package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kraja on 2017-06-09.
 */
public class NawigationHelper {
    private FirefoxDriver wd;

    public NawigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }
    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
    public void goToPageNewContact() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void goToHome() {
        wd.findElement(By.linkText("home")).click();
    }
}
