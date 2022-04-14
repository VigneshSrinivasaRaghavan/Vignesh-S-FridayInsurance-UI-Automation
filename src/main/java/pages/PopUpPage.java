package pages;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public final class PopUpPage extends BasePage {

    private static final String rootElementId = "#usercentrics-root";
    private static final String acceptButton = "button[data-testid=\"uc-accept-all-button\"]";

    public HomePage clickOnPopup() {
        Uninterruptibles.sleepUninterruptibly(7, TimeUnit.SECONDS);
        WebElement acceptBtn = getShadowRootElement(rootElementId, acceptButton);
        acceptBtn.click();
        return new HomePage();
    }

}
