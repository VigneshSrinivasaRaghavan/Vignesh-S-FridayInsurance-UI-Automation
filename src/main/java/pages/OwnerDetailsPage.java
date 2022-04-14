package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OwnerDetailsPage extends BasePage {

    private static final By ownerOfCarYesRadioButton = By.cssSelector("label[data-testid='shared.yes']>input");
    private static final By ownerOfCarNoRadioButton = By.cssSelector("label[data-testid='shared.no']>input");
    private static final By usedAtPurchaseRadioButton = By.cssSelector("label[data-testid*='selectRegisteredOwner.used']>input");
    private static final By whenBuyingNewRadioButton = By.cssSelector("label[data-testid*='selectRegisteredOwner.brandNew']>input");
    private static final By continueButton = By.cssSelector("button[type='submit']");

    public OwnerDetailsPage waitForOwnerDetailsPageToLoad(){
        waitForElementToLoad(continueButton,WaitStrategy.VISIBLE);
        return this;
    }

    public OwnerDetailsPage selectOwnerOfCar(String text){
        if(text.equalsIgnoreCase("yes")){
            click(ownerOfCarYesRadioButton,WaitStrategy.CLICKABLE,"Owner of the Car - Yes Radio Button");
        }
        else if(text.equalsIgnoreCase("no")){
            click(ownerOfCarNoRadioButton,WaitStrategy.CLICKABLE,"Owner of the Car - No Radio Button");
        }
        return this;
    }

    public OwnerDetailsPage selectCarPurchase(String text){
        if(text.equalsIgnoreCase("used")){
            click(usedAtPurchaseRadioButton,WaitStrategy.CLICKABLE,"Used at Purchase Radio Button");
        }
        else if(text.equalsIgnoreCase("new")){
            click(whenBuyingNewRadioButton,WaitStrategy.CLICKABLE,"When Buying New Radio Button");
        }
        return this;
    }

    public ChooseYourCarPage clickContinueButton(){
        click(continueButton,WaitStrategy.CLICKABLE,"Continue Button");
        return new ChooseYourCarPage();
    }

}
