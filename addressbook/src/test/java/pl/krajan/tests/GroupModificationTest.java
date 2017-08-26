package pl.krajan.tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.krajan.model.GroupData;
import pl.krajan.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by kraja on 2017-06-12.
 */
public class GroupModificationTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if(app.group().all().size() == 0) {
            app.group().create(new GroupData().withName("AdamQA1"));
        }
    }

    @Test
    public void testGroupModification(){
        Groups before = app.group().all();
        GroupData modyfiGroup = before.iterator().next();
        GroupData group = new GroupData()
                .withId(modyfiGroup.getId()).withName("AdamQA1").withHeader("Header test").withFooter("Footer test");
        app.group().modify(group);
        assertThat(app.group().count(), equalTo( before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before.withOut(modyfiGroup).withAdded(group)));



    }

}
