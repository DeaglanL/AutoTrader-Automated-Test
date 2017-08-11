package TestClasses;

import Pages.HomePage;
import Pages.SignInPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Tests {

    private  static WebDriver webDriver;
    private static ChromeOptions chromeOptions = new ChromeOptions();


    //report vars
    private static ExtentReports report;
    private static String reportFilePath = "report.html";
    private static ExtentTest test1;
    private static ExtentTest test2;
    private static ExtentTest test3;
    private static ExtentTest test4;
    private static ExtentTest test5;
    private static ExtentTest test6;
    private static ExtentTest test7;
    private static ExtentTest test8;
    private static ExtentTest test9;
    private static ExtentTest test10;

    //Pages
    private HomePage homePage;
    private SignInPage signInPage;




    @BeforeClass
    public static void beforeClass()
    {

        chromeOptions.addArguments("--start-maximized");

        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("DemoQa.com");
        extentHtmlReporter.config().setDocumentTitle("The demo site test report");
        report.attachReporter(extentHtmlReporter);

        test1 = report.createTest("SignIn");
        test2 = report.createTest("Register");
        test3 = report.createTest("Log out");
        test4 = report.createTest("Add A Name");
        test5 = report.createTest("Add A Name");
        test6 = report.createTest("Add A Name");
        test7 = report.createTest("Add A Name");
        test8 = report.createTest("Add A Name");
        test9 = report.createTest("Add A Name");
        test10 = report.createTest("Add A Name");


        webDriver = new ChromeDriver(chromeOptions);
    }

    @Before
    public void beforeTest()
    {
        //initialize pages
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        signInPage = PageFactory.initElements(webDriver, SignInPage.class);






    }

    @Test
    public void SignIn()
    {
        //Cmax@hotmail.com
        //a123456789

        homePage.open(webDriver);
        test1.log(Status.INFO, "Page opened");

        homePage.clickSignin(webDriver);
        test1.log(Status.INFO, "Sign in button clicked");

        signInPage.enterEmail(webDriver, "Cmax@hotmail.com");
        test1.log(Status.INFO, "email entered: " + "Cmax@hotmail.com");

        signInPage.enterPass(webDriver, "a123456789");
        test1.log(Status.INFO, "password entered: " + "a123456789");

        signInPage.clickSignIn();

        assertEquals("Didnt sign into account", webDriver.getCurrentUrl(), "https://www.autotrader.co.uk/secure/my-auto-trader/my-car/create");

        if (webDriver.getCurrentUrl().equals("https://www.autotrader.co.uk/secure/my-auto-trader/my-car/create"))
            test1.pass("Signed in correctly");
        else
            test1.fail("Sign in failed");


    }
    @Test
    public void logOut()
    {
        homePage.open(webDriver);

        homePage.hoverOverAccIcon(webDriver);

        homePage.clickSignOut(webDriver);

        assertFalse("not signed out", homePage.isSignButtonThere());

        if (homePage.isSignButtonThere())
            test3.fail("Not signed out");
        else
            test3.pass("Signed out");




        test3.fail("");
        Assert.fail("Not implemented");
    }
    @Test
    public void Register()
    {
        homePage.open(webDriver);
        test2.log(Status.INFO, "Page opened");

        homePage.clickSignin(webDriver);
        test2.log(Status.INFO, "Sign in button clicked");

        signInPage.clickSignUpTab(webDriver);

        signInPage.enterSignUpEmail(webDriver, "Amax@hotmail.co.uk");
        test3.log(Status.INFO, "email entered: " + "Amax@hotmail.com");

        signInPage.enterSignUpPass(webDriver, "a123456789");
        test4.log(Status.INFO, "password entered: " + "a123456789");

        signInPage.clickSignUpButton();

        assertEquals("Sign up failed", webDriver.getCurrentUrl(), "http://www.autotrader.co.uk/");

        if (webDriver.getCurrentUrl().equals("http://www.autotrader.co.uk/"))
            test2.pass("Sign up successful");
        else
            test2.fail("Sign up failed");

    }
    @Test
    public void Test4()
    {
        test4.fail("");
        Assert.fail("Not implemented");
    }

    @Test
    public void Test5()
    {
        test5.fail("");
        Assert.fail("Not implemented");
    }

    @Test
    public void Test6()
    {
        test6.fail("");
        Assert.fail("Not implemented");
    }

    @Test
    public void Test7()
    {
        test7.fail("");
        Assert.fail("Not implemented");
    }
    @Test
    public void Test8()
    {
        test8.fail("");
        Assert.fail("Not implemented");
    }
    @Test
    public void Test9()
    {
        test9.fail("");
        Assert.fail("Not implemented");
    }
    @Test
    public void Test2()
    {
        test10.fail("");
        Assert.fail("Not implemented");
    }






    @After
    public void afterTest()
    {


    }

    @AfterClass
    public static void afterClass()
    {
        webDriver.quit();

        report.flush();

    }


}
