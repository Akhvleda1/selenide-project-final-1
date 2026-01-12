package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.ConsumerLoanPage;

public class ConsumerLoanSteps extends BaseSteps{
    ConsumerLoanPage consumerLoanPage = new ConsumerLoanPage();

    public ConsumerLoanSteps(boolean isMobile) {
        super(isMobile);
    }

    public ConsumerLoanSteps assertCunsomerLoanPageLoaded(){
        consumerLoanPage.getCunsomerLoanHeader().shouldBe(Condition.visible);
        return this;
    }

    public ConsumerLoanSteps clickTerms(){
        consumerLoanPage.getTermsButton().click();
        return this;
    }

}
