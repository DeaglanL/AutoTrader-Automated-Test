package Pages;


import TestClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(css = "#signin-email")
    private WebElement emailInput;

    @FindBy(css = "#signin-password")
    private WebElement passwordInput;

    @FindBy(css = "#signInSubmit")
    private WebElement signInButton;

    public void enterEmail(WebDriver wD, String input)
    {
        Wait.waitToLoad(wD, "#signin-email");

        emailInput.sendKeys(input);
    }

    public void enterPass(WebDriver wD, String input)
    {
        Wait.waitToLoad(wD, "#signin-password");

        passwordInput.sendKeys(input);
    }

    public void clickSignIn()
    {
        signInButton.click();
    }

}
