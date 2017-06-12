package pl.krajan.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by kraja on 2017-06-09.
 */
public class SessionHelper extends BaseHelper {

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void login(String username, String password) {
        //wd.findElement(By.id("LoginForm")).click();
        click(By.id("LoginForm"));
        type(By.name("user"),username);
        type(By.name("pass"),password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
