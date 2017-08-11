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

    @FindBy(css = ".footer__nav-native a:nth-child(1)")
    private WebElement IphoneApp;

    @FindBy(css = ".footer__nav-searches ul:nth-child(2) li:nth-child(1) a:nth-child(1)")
    private WebElement makeAndModel;

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

    public void clickIphoneAppLink(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".footer__nav-native a:nth-child(1)");

        IphoneApp.click();
    }

    public void moveToAndClickMakeAndModel(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".footer__nav-searches ul:nth-child(2) li:nth-child(1) a:nth-child(1)");
        Actions a =  new Actions(wD);

        a.moveToElement(makeAndModel).perform();

        Wait.waitToBeVisble(wD, ".footer__nav-searches ul:nth-child(2) li:nth-child(1) a:nth-child(1)");

        makeAndModel.click();

    }
}
