package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.BasePage;
import static com.codeborne.selenide.Condition.*;

public class BaseSteps {
    BasePage basePage = new BasePage();

    protected boolean isMobile;
    public BaseSteps(boolean isMobile) { this.isMobile = isMobile; }

    public BaseSteps acceptCookie(){
        basePage.getCookieAcceptButton()
                .shouldBe(visible)
                .click();
        return this;
    }

    public BaseSteps hoverOnForMyBusinessNavItem(){
        if (!isMobile){
            basePage.getNavItemForMyBusiness().hover();
        }
        return this;
    }

    public BaseSteps clickBurger(){
        if (isMobile){
            basePage.getBurgerBar().click();
        }
        return this;
    }

    public BaseSteps clickNavLoansItem(){
        if (isMobile){
            basePage.getNavLoansItem().click();
        }
        return this;
    }

    public BaseSteps clickCurrencies(){
        if (!isMobile){
            basePage.getNavToCurrenciesButton()
                    .shouldBe(interactable)
                    .click();
        }else {
            basePage.getNavToCurrenciesButtonMobile()
                    .shouldBe(visible)
                    .click();
        }
        return this;
    }

    public BaseSteps hoverOnForMeNavItem(){
        if (!isMobile){
            basePage.getNavItemForMe().hover();
        }
        return this;
    }

    public BaseSteps clickOffers(){
        if (!isMobile){
            basePage.getNavToOffersButton()
                    .shouldBe(interactable)
                    .click();
        } else{
            basePage.getNavToOffersButtonMobile()
                    .shouldBe(visible)
                    .click();
        }
        return this;
    }

    public BaseSteps clickConsumerLoanNavItem(){
        if (!isMobile){
            basePage.getNavToConsumerLoans()
                    .shouldBe(interactable)
                    .click();
        }else {
            basePage.getNavToConsumerLoansMobile()
                    .shouldBe(visible)
                    .click();
        }
        return this;
    }

    public BaseSteps scrollToLocationsItemMobile(){
        if (isMobile){
            basePage.getNavToLocationsMobile().scrollTo();
        }
        return this;
    }

    public BaseSteps clickNavToLocations(){
        if (!isMobile){
            basePage.getNavToLocations().click();
        }else {
            basePage.getNavToLocationsMobile().click();
        }
        return this;
    }



}
