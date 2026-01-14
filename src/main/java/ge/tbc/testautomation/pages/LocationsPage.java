package ge.tbc.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class LocationsPage extends BasePage{
    private final SelenideElement locationsPageHeader =
            $x("//h2[contains(@class, 'tbcx-pw-atm-branches-section__title ') and contains(text(), ' ფილიალი, ბანკომატი და თანხის მიმღები ')]");

    private final SelenideElement cityFilterDropDown =
            $x("//div[contains(@class, 'tbcx-label-selected-container')]/parent::button");

    private final SelenideElement dropDownOption =
            $x("//div[@class = 'tbcx-dropdown-popover-item__title' and contains(., 'თბილისი')]");

    private final SelenideElement branchesOption =
            $x("//button[contains(@class, 'tbcx-pw-tab-menu__item') and contains(.,'ფილიალები')]");

    private final ElementsCollection resultsList =
            $$x("//div[@class='tbcx-pw-atm-branches-section__list-wrapper']/div[contains(@class,'tbcx-pw-atm-branches-section__list')]//div[@class='tbcx-pw-atm-branches-section__list-item']");

    private final SelenideElement workHoursOption =
            $x("//span[contains(@class, 'tbcx-pw-chip__checkmark') and contains(.,'24/7')]");

    private final ElementsCollection descriptions =
            $$(".tbcx-pw-atm-branches-section__list-item-description");


}
