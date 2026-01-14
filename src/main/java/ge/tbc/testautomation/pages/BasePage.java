package ge.tbc.testautomation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class BasePage {
    private final SelenideElement navItemForMyBusiness =
            $x("//div[@class='tbcx-pw-navigation-item__link ng-star-inserted' and contains(text(), ' ჩემი ბიზნესისთვის ')]");

    private final SelenideElement navToCurrenciesButton =
            $$x("//div[contains(@class, 'tbcx-pw-mega-menu__additional') and contains(@class, 'show-desktop-up')]//span[text()=' ვალუტის კურსები']")
                    .filter(Condition.visible) // because there is a hidden element like it
                    .first();

    private final SelenideElement burgerBar =
            $x("//button[contains(@class,'tbcx-pw-hamburger-menu__button')]");

    private final SelenideElement navToCurrenciesButtonMobile =
            $$x("//div[@class='tbcx-pw-mega-menu-quick-acitons-item__content']/span[contains(text(), 'ვალუტის კურსები')]")
                    .filter(Condition.visible) // because there is a hidden element like it
                    .first();

    private final SelenideElement cookieAcceptButton =
            $x("//div[@class='tbcx-pw-cookie-consent']//button[contains(text(), ' თანხმობა ')]");

    private final SelenideElement navItemForMe =
            $x("//div[@class='tbcx-pw-navigation-item__link ng-star-inserted' and contains(text(), ' ჩემთვის ')]");

    private final SelenideElement navToOffersButton =
            $x("//div[contains(@class, 'tbcx-pw-mega-menu__additional') and contains(@class, 'show-desktop-up')]//span[text()=' შეთავაზებები']");

    private final SelenideElement navToOffersButtonMobile =
            $$x("//div[@class='tbcx-pw-mega-menu-quick-acitons-item__content']/span[contains(text(), ' შეთავაზებები')]")
                    .filter(Condition.visible)
                    .first();

    private final SelenideElement navLoansItem =
            $$x("//span[contains(@class,'tbcx-pw-mega-menu-sub-item__title') and text()='სესხები']")
                    .filter(Condition.visible).first();

    private final SelenideElement navToConsumerLoans =
            $x("//span[contains(@class, 'tbcx-pw-mega-menu-sub-item__title') and contains(text(),'სამომხმარებლო')]");

    private final SelenideElement navToConsumerLoansMobile =
            $$x("//span[contains(@class, 'tbcx-pw-mega-menu-sub-item__title') and contains(text(),'სამომხმარებლო')]")
                    .filter(Condition.visible).first();

    private final SelenideElement navToLocations =
            $$x("//div[contains(@class, 'tbcx-pw-mega-menu__additional') and contains(@class, 'show-desktop-up')]//span[text()=' მისამართები']")
                    .filter(Condition.visible)
                    .first();

    private final SelenideElement navToLocationsMobile =
            $$x("//div[@class='tbcx-pw-mega-menu-quick-acitons-item__content']/span[contains(text(), ' მისამართები')]")
                    .filter(Condition.visible)
                    .first();

}
