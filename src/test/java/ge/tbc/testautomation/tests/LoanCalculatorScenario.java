package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.data.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"CRUM-T36 - E2E სცენარი - სამომხმარებლო სესხის კალკულატორი"})
public class LoanCalculatorScenario extends BaseTest{
    @Test(priority = 1)
    public void navigateToMain(){
        mainSteps
                .assertMainPageLoaded()
                .acceptCookie();
    }

    @Test(priority = 2)
    public void redirectToConsumerLoanPage(){
        consumerLoanSteps
                .hoverOnForMeNavItem()
                .clickBurger()
                .clickNavLoansItem()
                .clickConsumerLoanNavItem();

        consumerLoanSteps.assertCunsomerLoanPageLoaded();
    }

    @Test(priority = 3, dependsOnMethods = {"redirectToConsumerLoanPage"})
    public void redirectToTermsPage(){
        consumerLoanSteps
                .clickTerms();

        termsSteps.assertTermsPageLoaded();
    }

    @Test(priority = 4, dependsOnMethods = {"redirectToTermsPage"})
    public void calculateMonthlyPayment(){
        termsSteps
                .scrollToCalculator()
                .moveMoneySlider() // for desktop
                .moveMonthsSlider() // for desktop
                .enterMoneyInput(Constants.MONEY_LOAN_CALCULATOR) // for mobile
                .enterMonthsInput(Constants.MONTHS_LOAN_CALCULATOR) // for mobile
                .assertMonthlyPayment();

        String monthlyPayment = termsSteps.getMonthlyPaymentValue();
        System.out.println(monthlyPayment);
        Assert.assertTrue(monthlyPayment.contains("₾"), "monthly payment doesn't contain an amount");
    }

}
