package ge.tbc.testautomation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class TermsPage extends BasePage{
    private final SelenideElement termsPageText =
            $x("//button[contains(@class, 'tbcx-pw-tab-menu__item')]//span[contains(., 'პირობები')]");

    private final SelenideElement calculatorButton =
            $x("//button[contains(@class,'tbcx-pw-tab-menu__item')]/span[contains(.,'კალკულატორი')]");

    private final SelenideElement moneySlider = // for desktop
            $$x("//div[contains(@class, 'slider-circle-button')]").get(0);

    private final SelenideElement monthsSlider = // for desktop
            $$x("//div[contains(@class, 'slider-circle-button')]").get(1);

    private final SelenideElement moneyInput = // for mobile
            $x("//label[contains(text(), 'სესხის თანხა')]/preceding-sibling::input[contains(@class, 'input ng-untouched ng-pristine ng-valid')]");

    private final SelenideElement monthsInput = // for mobile
            $x("//label[contains(text(), 'თვე')]/preceding-sibling::input[contains(@class, 'input ng-untouched ng-pristine ng-valid')]");

    private final SelenideElement enteredMoneyAmount =
            $x("//div[contains(@class, 'tbcx-pw-calculated-info__rows-item-info') and contains(.,'₾')]");

    private final SelenideElement enteredMonths =
            $x("//div[contains(@class, 'tbcx-pw-calculated-info__rows-item-info') and contains(.,'თვე')]");

    private final SelenideElement monthlyPayment =
            $$x("//div[contains(@class, 'tbcx-pw-calculated-info__number tbcx-pw-calculated-info__number--new')]")
                    .filter(Condition.visible)
                    .first();

}
