package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class ModelPage extends BasePage {

    private static final By modelSearchBar = By.cssSelector("input[name='modelFilter']");
    private static final By firstSearchResult = By.cssSelector("button[name='model']");


    public ModelPage waitForModelPageToLoad(){
        waitForElementToLoad(modelSearchBar,WaitStrategy.VISIBLE);
        return this;
    }

    public ModelPage searchModel(String text){
        this.waitForModelPageToLoad();
        sendKeys(modelSearchBar,text,WaitStrategy.VISIBLE,"Car Model SearchBar");
        return this;
    }

    public CarShapePage selectFirstSearchResult(){
        click(firstSearchResult,WaitStrategy.CLICKABLE, "Car Model First Search Result");
        return new CarShapePage();
    }

}
