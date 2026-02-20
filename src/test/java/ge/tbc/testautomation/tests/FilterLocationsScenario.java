package ge.tbc.testautomation.tests;

import org.testng.annotations.Test;

@Test(groups = {"SCRUM-T37 - E2E სცენარი - მისამართების გვერდზე ფილიალების გაფილტვრა"})
public class FilterLocationsScenario extends BaseTest{

    @Test(priority = 1)
    public void navigateToMain(){
        mainSteps
                .assertMainPageLoaded()
                .acceptCookie();
    }

    @Test(priority = 2)
    public void navigateToLocationsPage(){
        locationsSteps
                .clickOnForMeNavItem()
                .scrollToLocationsItemMobile() // for mobile
                .clickNavToLocations();

        locationsSteps.assertLocationsPageLoaded();
    }

    @Test(priority = 3)
    public void chooseCityAndBranches(){
        locationsSteps
                .clickCityFilterDropDown()
                .chooseCityOption()
                .chooseBranches()
                .scrollToMap()
                .assertResultsAppeared();
    }

    @Test(priority = 4)
    public void filterBranches(){
        locationsSteps
                .chooseWorkOption()
                .assertFilteredList();
    }

}
