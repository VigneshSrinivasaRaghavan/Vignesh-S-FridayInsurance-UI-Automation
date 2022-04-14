package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class CarShapePage extends BasePage {

    private By constructCarShapeXpath(String text){
        String xpathText=String.format("//*[contains(text(),'%s')]",text);
        return By.xpath(xpathText);
    }

    public FuelPage selectCarShape(String carShapeText){
        waitForElementToLoad(constructCarShapeXpath(carShapeText),WaitStrategy.VISIBLE);
        click(constructCarShapeXpath(carShapeText), WaitStrategy.CLICKABLE,"Car Shape "+carShapeText);
        return new FuelPage();
    }
}
