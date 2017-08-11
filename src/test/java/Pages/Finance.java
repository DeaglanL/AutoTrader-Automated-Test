package Pages;

import TestClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Finance {

    @FindBy(css = ".gui-test-slider-amount div:nth-child(1) div:nth-child(1) div:nth-child(1)")
    private WebElement findSlider1;

    @FindBy(css = ".noUi-stacking > div:nth-child(1)")
    private WebElement findSlider2;

    @FindBy(css = ".js-finance-amount > span:nth-child(3)")
    private WebElement plus1;

    @FindBy(css = ".js-finance-amount > span:nth-child(3)")
    private WebElement minus2;

    @FindBy(css = ".finance-form__summary-text")
    private WebElement sumText;

    public void moveSlider1ToMax(WebDriver wD)
    {
        //Wait.waitToLoad(wD, ".gui-test-slider-amount div:nth-child(1) div:nth-child(1) div:nth-child(1)");

        Actions a = new Actions(wD);

        Wait.waitToBeVisble(wD, ".gui-test-slider-amount div:nth-child(1) div:nth-child(1) div:nth-child(1)");

        a.clickAndHold(findSlider1).moveToElement(plus1).release().perform();
    }

    public void moveSlider2ToMin(WebDriver wD)
    {
        Wait.waitToLoad(wD, ".noUi-stacking > div:nth-child(1)");

        Actions a = new Actions(wD);

        Wait.waitToBeVisble(wD, ".noUi-stacking > div:nth-child(1)");

        a.clickAndHold(findSlider2).moveToElement(minus2).release().perform();
    }

    public String getSumText()
    {
        Wait.waitMilli(300);

        return sumText.getText();

    }

}
