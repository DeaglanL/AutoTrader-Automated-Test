package Pages;


import TestClasses.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowseMakeAndModel {

    @FindBy(css = "#seo-full-columns ol:nth-child(3) li:nth-child(1) ul:nth-child(2) li:nth-child(1) a:nth-child(1)")
    private WebElement usedNissan;

    @FindBy(css = "ol.alphabeticColumn2:nth-child(4) li:nth-child(2) ul:nth-child(2) li:nth-child(1) a:nth-child(1)")
    private WebElement newTesla;

    public void clickOnUsedNissan(WebDriver wD)
    {
        Wait.waitToBeVisble(wD, "#seo-full-columns ol:nth-child(3) li:nth-child(1) ul:nth-child(2) li:nth-child(1) a:nth-child(1)");

        usedNissan.click();
    }

    public void clickOnNewTesla(WebDriver wD)
    {
        Wait.waitToBeVisble(wD, "ol.alphabeticColumn2:nth-child(4) li:nth-child(2) ul:nth-child(2) li:nth-child(1) a:nth-child(1)");

        newTesla.click();
    }
}
