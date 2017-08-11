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

    @FindBy(css = "#js-social__signup-tab span:nth-child(1)")
    private  WebElement signUpTab;

    @FindBy(css = "#email")
    private WebElement signUpEmail;

    @FindBy(css = "#password")
    private WebElement signUpPass;

    @FindBy(css = "#social--signup--submit")
    private WebElement signUpButton;

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

    public void clickSignUpTab(WebDriver wD)
    {
        Wait.waitToLoad(wD, "#js-social__signup-tab span:nth-child(1)");

        signUpTab.click();
    }

    public void enterSignUpEmail(WebDriver wD, String input)
    {
        Wait.waitToLoad(wD, "#email");

        signUpEmail.sendKeys(input);
    }

    public void enterSignUpPass(WebDriver wD, String input)
    {
        Wait.waitToLoad(wD, "#password");

        signUpPass.sendKeys(input);
    }

    public void clickSignUpButton()
    {
        signUpButton.click();
    }

}
