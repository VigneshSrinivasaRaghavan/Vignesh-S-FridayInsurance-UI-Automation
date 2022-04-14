package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class FirstRegistrationPage extends BasePage {

    private static final By firstRegistrationDate = By.cssSelector("input[name='monthYearFirstRegistered']");
    private static final By admissionToYouDate = By.cssSelector("input[name='monthYearOwnerRegistered']");
    private static final By continueButton = By.cssSelector("button[type='submit']");


    public FirstRegistrationPage waitForRegistrationPageToLoad(){
        waitForElementToLoad(firstRegistrationDate,WaitStrategy.VISIBLE);
        return this;
    }

    public FirstRegistrationPage enterFirstRegistrationDate(String text){
        sendKeys(firstRegistrationDate,text,WaitStrategy.VISIBLE,"First Registration Date");
        return this;
    }

    public FirstRegistrationPage enterAdmissionToYouDate(String text){
        sendKeys(admissionToYouDate,text,WaitStrategy.VISIBLE,"Admission To You Date");
        return this;
    }

    public OwnerDetailsPage clickContinueButton(){
        click(continueButton,WaitStrategy.CLICKABLE,"Continue Button");
        return new OwnerDetailsPage();
    }
}
