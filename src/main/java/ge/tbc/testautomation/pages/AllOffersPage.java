package ge.tbc.testautomation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class AllOffersPage extends BasePage{
    private final SelenideElement allOffersHeader =
            $x("//h2[@class='marketing__header__title' and contains(text(), 'შეთავაზებები')]");
    private final SelenideElement checkboxSection =
            $x("//h3[contains(@class, 'filter__title') and contains(text(),'შეთავაზების ტიპი')]");
    private final SelenideElement cashbackCheckbox =
        $x("//h3[contains(@class, 'filter__title') and contains(text(),'შეთავაზების ტიპი')]/parent::div/following-sibling::ul//div[contains(text(),' ქეშბექი ')]//input");
    private final ElementsCollection firstTenResultCards =
            $$x("//div[contains(@class, 'marketing__cards-list')]/a[position() <=10]");
    private final By cashbackContainer =
            By.xpath((".//div[contains(@class, 'tbcx-pw-text-badge') and contains(text(), 'დაიბრუნე')]"));
    private final SelenideElement filterButtonMobile =
            $x("//div[contains(@class, 'marketing__filter-chip__title') and contains(text(), ' ფილტრი ')]");
    private final SelenideElement checkboxSectionMobile =
            $$x("//h3[contains(@class, 'filter__title') and contains(text(),'შეთავაზების ტიპი')]")
                    .filter(Condition.visible).first();
    private final SelenideElement cashbackCheckboxMobile =
            $$x("//h3[contains(@class, 'filter__title') and contains(text(),'შეთავაზების ტიპი')]/parent::div/following-sibling::ul//div[contains(text(),' ქეშბექი ')]//input")
                    .filter(Condition.visible).first();
    private final SelenideElement endFilterButtonMobile =
            $x("//button[contains(text(), 'ფილტრი')]");
}
