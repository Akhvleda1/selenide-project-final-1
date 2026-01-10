package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.data.Constants;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeClass
    public void setUp(){
        open(Constants.TBC_URL);
    }
}
