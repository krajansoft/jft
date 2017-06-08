package pl.krajan;


import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("AdamQA1", "Header test", "Footer test"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
