package ge.tbc.testautomation.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.AllOffersPage;

public class AllOffersSteps extends BaseSteps{
    AllOffersPage allOffersPage = new AllOffersPage();

    public AllOffersSteps(boolean isMobile) {
        super(isMobile);
    }

    public AllOffersSteps assertAllOffersPageLoaded(){
        allOffersPage.getAllOffersHeader().shouldBe(Condition.visible);
        return this;
    }

    public AllOffersSteps clickFilterButtonMobile(){
        if (isMobile){
            allOffersPage.getFilterButtonMobile().click();
        }
        return this;
    }

    public AllOffersSteps scrollToCheckboxSection(){
        if (isMobile){
            allOffersPage.getCheckboxSectionMobile().scrollTo();
        }else {
            allOffersPage.getCheckboxSection().scrollTo();
        }
        return this;
    }

    public AllOffersSteps clickCashbackCheckbox(){
        if (isMobile){
            allOffersPage.getCashbackCheckboxMobile().click();
        }else {
            allOffersPage.getCashbackCheckbox().click();
        }
        return this;
    }

    public AllOffersSteps clickEndFilterButtonMobile(){
        if (isMobile){
            allOffersPage.getEndFilterButtonMobile().click();
        }
        return this;
    }

    public AllOffersSteps scrollBackUp(){
        if (!isMobile){
            allOffersPage.getAllOffersHeader().scrollTo();
        }
        return this;
    }

    public AllOffersSteps assertResultsAppeared(){
        allOffersPage.getFirstTenResultCards().shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

    public Long countCardsThatHaveCashback(){
        return allOffersPage.getFirstTenResultCards().stream()
                .filter(card -> card.$(allOffersPage.getCashbackContainer()).exists())
                .count();
    }

}
