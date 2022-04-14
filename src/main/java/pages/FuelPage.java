package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class FuelPage extends BasePage {

    private By constructFuelXpath(String text){
        String xpathText=String.format("//*[contains(text(),'%s')]",text);
        return By.xpath(xpathText);
    }

    public HpPage selectFuel(String fuelText){
        click(constructFuelXpath(fuelText), WaitStrategy.CLICKABLE,"Fuel type "+fuelText);
        return new HpPage();
    }
}
