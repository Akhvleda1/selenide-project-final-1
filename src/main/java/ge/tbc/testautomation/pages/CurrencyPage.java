package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class CurrencyPage extends BasePage{
    private final SelenideElement popularCurrenciesTitle =
            $x("//div[@class='tbcx-pw-popular-currencies__main-title']");

    private final SelenideElement usdBuyRate =
            $x("//div[text()='1 აშშ დოლარი']/parent::div/following-sibling::div/div[text()=' ყიდვა ']/following-sibling::div");

    private final SelenideElement firstSelectElement =
            $$x("//button[@class='tbcx-field tbcx-bg-color-high']").get(0);

    private final SelenideElement usdOption =
            $x("//div[@class='tbcx-dropdown-popover-item__title' and contains(text(), 'USD')]");

    private final SelenideElement secondSelectElement =
            $$x("//button[@class='tbcx-field tbcx-bg-color-high']").get(1);

    private final SelenideElement gelOption =
            $x("//div[@class='tbcx-dropdown-popover-item__title' and contains(text(), 'GEL')]");

    private final SelenideElement firstInput =
            $$x("//input[@type='number']").get(0);

    private final SelenideElement secondInput =
            $$x("//input[@type='number']").get(1);

}
