package pl.krajan.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.krajan.appmanager.ApplicationManager;

/**
 * Created by kraja on 2017-06-08.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }
}
