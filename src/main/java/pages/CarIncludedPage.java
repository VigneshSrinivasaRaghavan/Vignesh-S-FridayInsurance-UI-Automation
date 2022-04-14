package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class CarIncludedPage extends BasePage {

    private By constructCarIncludedXpath(String text){
        String xpathText=String.format("//*[contains(text(),'%s')]",text);
        return By.xpath(xpathText);
    }

    public FirstRegistrationPage selectCarIncluded(String carIncludedText){
        click(constructCarIncludedXpath(carIncludedText), WaitStrategy.CLICKABLE,"Car Included Number "+carIncludedText);
        return new FirstRegistrationPage();
    }
}
