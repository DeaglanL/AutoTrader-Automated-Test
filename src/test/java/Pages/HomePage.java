package Pages;

import TestClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = ".test-header__sign-in")
    private WebElement signIn;

    public void open(WebDriver wD)
    {
        wD.navigate().to("http://www.autotrader.co.uk/");
    }

    public void clickSignin(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".test-header__sign-in");

        signIn.click();
    }
}
