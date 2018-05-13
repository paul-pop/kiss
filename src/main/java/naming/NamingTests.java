package naming;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NamingTests {

    @Test
    public void whenIAmOnStageAndIDontKnowWhatToSayThenIShouldChangeTheSubject() {
        Assert.fail("Change the subject!");
    }

    @Test
    public void i_am_capable_of_creating_very_long_test_names_because_that_wont_even_fit_the_slides_haha_lol_yolo() {
        Assert.fail("Yuck");
    }

    @Test
    public void givenAnEmptyNameWhenCreatingUserThenThrowException() {
        Assert.fail("Not bad");
    }

    @Test
    public void whenEmptyNameOnUserCreationThenThrowException() {
        Assert.fail("Not bad");
    }

    @Test
    public void shouldThrowExceptionWhenCreatingUserWithEmptyName() {
        Assert.fail("Still not bad");
    }

    public class CreateUserTest {

        @Test
        public void testEmptyNameThrowsException() {
            Assert.fail("That's because the context of this test is in the test class name!");
        }
    }
}
