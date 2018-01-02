import base.BaseSetUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    BaseSetUp setUp = new BaseSetUp();

    @Before
    public void beforeTest() throws Exception
    {
        setUp.launch();
    }

    @After
    public void afterTest()
    {
        setUp.closeDriver();
    }
}
