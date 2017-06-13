package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kraja on 2017-06-12.
 */
public class BaseHelper {
    protected WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By lokator, String text) {
        click(lokator);
        wd.findElement(lokator).clear();
        wd.findElement(lokator).sendKeys(text);
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
