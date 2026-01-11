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

}
