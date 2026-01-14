package ge.tbc.testautomation.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.steps.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public static final Logger logger = LogManager.getLogger();
    CurrencySteps currencySteps;
    MainSteps mainSteps;
    OffersSteps offersSteps;
    AllOffersSteps allOffersSteps;
    ConsumerLoanSteps consumerLoanSteps;
    TermsSteps termsSteps;
    LocationsSteps locationsSteps;

    @Parameters("device")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("chrome") String device){
        currencySteps = new CurrencySteps(device.equalsIgnoreCase("mobile"));
        mainSteps = new MainSteps(device.equalsIgnoreCase("mobile"));
        offersSteps = new OffersSteps(device.equalsIgnoreCase("mobile"));
        allOffersSteps = new AllOffersSteps(device.equalsIgnoreCase("mobile"));
        consumerLoanSteps = new ConsumerLoanSteps(device.equalsIgnoreCase("mobile"));
        termsSteps = new TermsSteps(device.equalsIgnoreCase("mobile"));
        locationsSteps = new LocationsSteps(device.equalsIgnoreCase("mobile"));

        Configuration.timeout = 8000;
        Configuration.fastSetValue = false;
        Configuration.browser = "chrome";
//        Configuration.holdBrowserOpen = true;
        open(Constants.TBC_URL);
        logger.info("Browser is configured and launched");

        if (device.equalsIgnoreCase("desktop")) {
            WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920, 1080));
        } else if (device.equalsIgnoreCase("mobile")) {
            WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(390, 844));
        }
    }


}
