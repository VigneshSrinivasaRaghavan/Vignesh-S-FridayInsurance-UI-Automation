package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class ChooseYourCarPage extends BasePage {

    private static final By findByMakeAndModelButton = By.cssSelector("button[name='list']");
    private static final By carBrandSearchBar = By.cssSelector("input[name='makeFilter']");
    private static final By firstSearchResult = By.cssSelector("button[name='make']");


    public ChooseYourCarPage waitForChooseYourCarPageToLoad(){
        waitForElementToLoad(findByMakeAndModelButton,WaitStrategy.VISIBLE);
        return this;
    }

    public ChooseYourCarPage clickFindByMakeAndModelButton(){
        click(findByMakeAndModelButton,WaitStrategy.CLICKABLE,"FindBy Make And Model Button");
        return this;
    }

    public ChooseYourCarPage searchCarBrand(String text){
        sendKeys(carBrandSearchBar,text,WaitStrategy.VISIBLE,"Car Brand SearchBar");
        return this;
    }

    public ModelPage selectFirstSearchResult(){
        click(firstSearchResult,WaitStrategy.CLICKABLE,"Car Brand First Search Result");
        return new ModelPage();
    }

}
