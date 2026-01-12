package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.pages.TermsPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static com.codeborne.selenide.Selenide.actions;

public class TermsSteps extends BaseSteps{
    public static final Logger logger = LogManager.getLogger();
    TermsPage termsPage = new TermsPage();

    public TermsSteps(boolean isMobile) {
        super(isMobile);
    }

    public TermsSteps assertTermsPageLoaded(){
        if (!isMobile){
            termsPage.getTermsPageText().shouldBe(Condition.visible);
        }
        return this;
    }

    public TermsSteps scrollToCalculator(){
        termsPage.getCalculatorButton().scrollTo();
        return this;
    }

    public TermsSteps moveMoneySlider(){
        if (!isMobile){
            actions().dragAndDropBy(termsPage.getMoneySlider(), 150, 0).perform();
        }
        return this;
    }

    public TermsSteps moveMonthsSlider(){
        if (!isMobile){
            actions().dragAndDropBy(termsPage.getMonthsSlider(), -150, 0).perform();
        }
        return this;
    }

    public TermsSteps enterMoneyInput(String amount){
        if (isMobile){
            termsPage.getMoneyInput().setValue(amount);
        }
        return this;
    }

    public TermsSteps enterMonthsInput(String months){
        if (isMobile){
            termsPage.getMonthsInput().setValue(months);
        }
        return this;
    }

    public TermsSteps assertMonthlyPayment(){
        termsPage.getMonthlyPayment().shouldBe(Condition.visible);
        return this;
    }

    public String getMonthlyPaymentValue(){
        return termsPage.getMonthlyPayment().getText().replace("\n", "");
    }

}
