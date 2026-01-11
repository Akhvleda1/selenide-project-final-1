package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Condition;
import ge.tbc.testautomation.data.Constants;
import ge.tbc.testautomation.pages.CurrencyPage;

public class CurrencySteps extends BaseSteps{
    CurrencyPage currencyPage = new CurrencyPage();

    public CurrencySteps(boolean isMobile) {
        super(isMobile);
    }

    public CurrencySteps assertCurrenciesPageLoaded(){
        currencyPage.getPopularCurrenciesTitle().shouldBe(Condition.visible);
        return this;
    }

    public CurrencySteps clickFirstSelectOption(){
        currencyPage.getFirstSelectElement().click();
        return this;
    }

    public CurrencySteps chooseUSD(){
        currencyPage.getUsdOption().click();
        return this;
    }

    public CurrencySteps clickSecondSelectOption(){
        currencyPage.getSecondSelectElement().click();
        return this;
    }

    public CurrencySteps chooseGEL(){
        currencyPage.getGelOption().click();
        return this;
    }

    public CurrencySteps enterUSDNumber(String number){
        currencyPage.getFirstInput().setValue(number);
        return this;
    }

    public CurrencySteps assertSecondInput(){
        double inputAmount = Double.parseDouble(Constants.CURRENCY_INPUT_AMOUNT);
        double usdRate = Double.parseDouble(currencyPage.getUsdBuyRate().getText());
        double expected = inputAmount * usdRate;
        String result = String.valueOf(expected).replaceAll("\\.0$", "");
        currencyPage.getSecondInput()
                .shouldHave(Condition.value(result));
        return this;
    }

}
