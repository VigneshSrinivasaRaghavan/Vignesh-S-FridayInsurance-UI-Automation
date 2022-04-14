package pages;

import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public final class HomePage extends BasePage {

    private static final By carIsAlreadyInsuredRadioButton = By.cssSelector("label[data-testid*='keepingCarquoting']>input");
    private static final By carWillBeInsuredRadioButton = By.cssSelector("label[data-testid*='buyingCarquoting']>input");
    private static final By insuranceStartDate = By.cssSelector("input[name='inceptionDate']");
    private static final By continueButton = By.cssSelector("button[type='submit']");

    public HomePage waitForHomePageToLoad(){
        waitForElementToLoad(continueButton,WaitStrategy.VISIBLE);
        return this;
    }

    public HomePage clickCarIsAlreadyInsuredRadioButton(){
        click(carIsAlreadyInsuredRadioButton,WaitStrategy.CLICKABLE,"Car Is Already Insured Radio Button");
        return this;
    }

    public HomePage enterInsuranceStartDate(String date){
        sendKeys(insuranceStartDate,date,WaitStrategy.VISIBLE,"Insurance Start Date");
        return this;
    }

    public OwnerDetailsPage clickContinueButton(){
        click(continueButton,WaitStrategy.CLICKABLE,"Continue Button");
        return new OwnerDetailsPage();
    }
}
