package ge.tbc.testautomation.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.testautomation.pages.LocationsPage;

import static com.codeborne.selenide.Selenide.$$;

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

    public LocationsSteps filterBranches(){
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

}
