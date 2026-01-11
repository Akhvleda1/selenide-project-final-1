package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.MainPage;

public class MainSteps extends BaseSteps{
    MainPage mainPage = new MainPage();

    public MainSteps(boolean isMobile) {
        super(isMobile);
    }

    public MainSteps assertMainPageLoaded(){
        mainPage.getMainHeader().shouldBe(Condition.visible);
        return this;
    }
}
