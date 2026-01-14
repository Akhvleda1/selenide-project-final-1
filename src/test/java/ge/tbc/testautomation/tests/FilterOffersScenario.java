package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.util.RetryAnalyzer;
import ge.tbc.testautomation.util.RetryCount;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups = {"SCRUM T35 - E2E სცენარი - გაფილტრული შეთავაზებების ნახვა"})
public class FilterOffersScenario extends BaseTest{

    @Test(priority = 1)
    public void navigateToMain(){
        mainSteps
                .assertMainPageLoaded()
                .acceptCookie();
    }

    @Test(priority = 2, dependsOnMethods = {"navigateToMain"})
    public void navigateToOffers(){
        mainSteps
                .hoverOnForMeNavItem()
                .clickBurger() // for mobile
                .clickOffers();

        offersSteps.assertOffersPageLoaded();
    }

    @Test(priority = 3, dependsOnMethods = {"navigateToOffers"})
    public void navigateToAllOffers(){
        offersSteps
                .clickAllOffers();

        allOffersSteps
                .assertAllOffersPageLoaded();
    }

    @RetryCount(count = 3)
    @Test(priority = 4, dependsOnMethods = {"navigateToAllOffers"}, retryAnalyzer = RetryAnalyzer.class)
    public void assertFilterResults(){
        allOffersSteps
                .clickFilterButtonMobile() // for mobile
                .scrollToCheckboxSectionMobile() // for mobile
                .clickCashbackCheckboxMobile() // for mobile
                .clickEndFilterButtonMobile() // for mobile
                .scrollToCashbackCheckbox() // for desktop
                .clickCashbackCheckbox(); // for desktop

        allOffersSteps
                .scrollBackUp()
                .assertResultsAppeared();

        Long cardsThatHaveCashback = allOffersSteps.countCardsThatHaveCashback();

        logger.info("Number of cards that have cashback: {}", cardsThatHaveCashback); // allowing 2 cards without cashback in card container because not all have it
        Assert.assertTrue(cardsThatHaveCashback >= 8, "more than 2 result cards don't have cashback");
    }

}
