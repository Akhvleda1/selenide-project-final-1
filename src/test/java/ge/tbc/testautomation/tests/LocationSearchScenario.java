package ge.tbc.testautomation.tests;

import ge.tbc.testautomation.data.Constants;
import org.testng.annotations.Test;

@Test(groups = {"SCRUM-T38 - E2E სცენარი - ფილიალის მოძებნა რაიონის მიხედვით"})
public class LocationSearchScenario extends BaseTest{
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
    public void filterBranches(){
        locationsSteps
                .clickCityFilterDropDown()
                .chooseCityOption()
                .chooseBranches()
                .scrollToMap()
                .assertResultsAppeared()
                .chooseWorkOption()
                .assertFilteredList();
    }

    @Test(priority = 4)
    public void searchBranchesByDistrict(){
        locationsSteps
                .fillSearchInput(Constants.INPUT_DISTRICT)
                .scrollToMap()
                .assertDistrictResults();
    }

}
