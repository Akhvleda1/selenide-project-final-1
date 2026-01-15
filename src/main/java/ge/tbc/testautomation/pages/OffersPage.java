package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class OffersPage extends BasePage{
    private final SelenideElement offersPageHeader2 =
            $x("//h2[@class='tbcx-pw-title' and contains(text(),' თიბისი ბარათის შეთავაზებები  ')]");

    private final SelenideElement allOffersButton =
            $x("//button[contains(@class,'primary') and contains(@class,'size-m') and contains(., 'ვრცლად')]");
}
