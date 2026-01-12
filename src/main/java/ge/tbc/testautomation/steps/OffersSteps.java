package ge.tbc.testautomation.steps;

import ge.tbc.testautomation.pages.OffersPage;

import static com.codeborne.selenide.Condition.visible;

public class OffersSteps extends BaseSteps{
    OffersPage offersPage = new OffersPage();

    public OffersSteps(boolean isMobile) {
        super(isMobile);
    }

    public OffersSteps assertOffersPageLoaded(){
        offersPage.getOffersPageHeader2().shouldBe(visible);
        return this;
    }

    public OffersSteps clickAllOffers(){
        offersPage.getAllOffersButton().click();
        return this;
    }


}
