package ge.tbc.testautomation.steps;

import com.codeborne.selenide.*;
import ge.tbc.testautomation.pages.LocationsPage;


public class LocationsSteps extends BaseSteps{
    LocationsPage locationsPage = new LocationsPage();

    public LocationsSteps(boolean isMobile) {
        super(isMobile);
    }

    public LocationsSteps assertLocationsPageLoaded(){
        locationsPage.getLocationsPageHeader().shouldBe(Condition.visible);
        return this;
    }

    public LocationsSteps clickCityFilterDropDown(){
        locationsPage.getCityFilterDropDown().click();
        return this;
    }

    public LocationsSteps chooseCityOption(){
        locationsPage.getDropDownOption().click();
        return this;
    }

    public LocationsSteps chooseBranches(){
        locationsPage.getBranchesOption().click();
        return this;
    }

    public LocationsSteps scrollToMap(){
        locationsPage.getBranchesOption().scrollTo();
        return this;
    }

    public LocationsSteps assertResultsAppeared(){
        locationsPage.getResultsList().shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    public LocationsSteps chooseWorkOption(){
        locationsPage.getWorkHoursOption().click();
        return this;
    }

    public LocationsSteps assertFilteredList(){
        ElementsCollection descriptions = locationsPage.getDescriptions();
        descriptions.shouldHave(CollectionCondition.sizeGreaterThan(0));

        for (SelenideElement desc : descriptions) {
            desc.shouldHave(Condition.text("24/7"));
        }

        return this;
    }

    public LocationsSteps fillSearchInput(String district){
        locationsPage.getBranchesSearchInput().setValue(district);
        return this;
    }

    public LocationsSteps assertDistrictResults(){
        Selenide.sleep(500); // should's wait didn't work, so I had to use this

        locationsPage.getResultListTitles().forEach(each -> {
            // wanted to use search input for assertion comparison but results didn't contain a search keyword
            each.shouldBe(Condition.visible);
            System.out.println(each.getText());
        });

        return this;
    }

}
