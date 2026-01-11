package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class MainPage extends BasePage{
    private final SelenideElement mainHeader =
            $x("//ng-component[@class='ng-star-inserted' and text()='თიბისი არის ტექნოლოგიური კომპანია, რომელიც ზრუნავს მომხმარებლებზე და ამარტივებს მათ ცხოვრებას.']");

}
