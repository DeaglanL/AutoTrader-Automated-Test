package Pages;

import TestClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = ".test-header__sign-in")
    private WebElement signIn;

    @FindBy(css = ".icon-my-account")
    private WebElement accountIcon;

    @FindBy(css = "button.test-header__sub-nav-link")
    private WebElement signOutButton;

    public void open(WebDriver wD)
    {
        wD.navigate().to("http://www.autotrader.co.uk/");
    }

    public void clickSignin(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".test-header__sign-in");

        signIn.click();
    }

    public boolean isSignButtonThere()
    {
        return signIn.isDisplayed();
    }

    public void hoverOverAccIcon(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".icon-my-account");

        Actions a =  new Actions(wD);

        a.moveToElement(accountIcon).perform();
    }

    public void clickSignOut(WebDriver wD)
    {
        Wait.waitToBeVisble(wD, "button.test-header__sub-nav-link");

        signOutButton.click();
    }
}
