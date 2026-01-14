package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.data.Constants;
import org.testng.annotations.Test;

@Test(groups = {"SCRUM-T34 - E2E სცენარი - ბანკის ვალუტის კურსის გადამოწმება"})
public class CurrencyScenario extends BaseTest{

    @Test(priority = 1)
    public void navigateToMain(){
        mainSteps
                .assertMainPageLoaded()
                .acceptCookie();
    }

    @Test(priority = 2)
    public void navigateToCurrencies(){
        currencySteps
                .hoverOnForMyBusinessNavItem() // for desktop
                .clickBurger() // for mobile
                .clickCurrencies();

        currencySteps.assertCurrenciesPageLoaded();
    }

    @Test(priority = 3)
    public void chooseCurrencies(){
        currencySteps
                .clickFirstSelectOption()
                .chooseUSD()
                .clickSecondSelectOption()
                .chooseGEL();
    }

    @Test(priority = 4)
    public void enterAmount(){
        currencySteps
                .enterUSDNumber(Constants.CURRENCY_INPUT_AMOUNT)
                .assertSecondInput();
    }

}
