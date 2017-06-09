package pl.krajan.tests;


import org.testng.annotations.Test;
import pl.krajan.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("AdamQA1", "Header test", "Footer test"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
