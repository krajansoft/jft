package pl.krajan.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kraja on 2017-06-05.
 */
public class SessionHelper {
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

}
