package pages;

import enums.WaitStrategy;
import org.openqa.selenium.By;

public final class HpPage extends BasePage {

    private By constructHpXpath(String text){
        String xpathText=String.format("//*[contains(text(),'%s')]",text);
        return By.xpath(xpathText);
    }

    public CarIncludedPage selectHp(String hpText){
        waitForElementToLoad(constructHpXpath(hpText),WaitStrategy.VISIBLE);
        click(constructHpXpath(hpText), WaitStrategy.CLICKABLE,"HorsePower "+hpText);
        return new CarIncludedPage();
    }
}
