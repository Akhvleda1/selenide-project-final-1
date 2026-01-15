package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ConsumerLoanPage extends BasePage{
    private final SelenideElement termsButton =
            $$x("//button[contains(@class, 'primary') and contains(., 'პირობები')]").first();

    private final SelenideElement cunsomerLoanHeader =
            $$x("//h1[contains(text(), 'სამომხმარებლო სესხი')]").first();
}
