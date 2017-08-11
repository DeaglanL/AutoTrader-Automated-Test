package TestClasses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.junit.*;

public class Tests {



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




    @BeforeClass
    public static void beforeClass()
    {


        report = new ExtentReports();
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
        extentHtmlReporter.config().setReportName("DemoQa.com");
        extentHtmlReporter.config().setDocumentTitle("The demo site test report");
        report.attachReporter(extentHtmlReporter);

        test1 = report.createTest("Add A Name");
        test2 = report.createTest("Add A Name");
        test3 = report.createTest("Add A Name");
        test4 = report.createTest("Add A Name");
        test5 = report.createTest("Add A Name");
        test6 = report.createTest("Add A Name");
        test7 = report.createTest("Add A Name");
        test8 = report.createTest("Add A Name");
        test9 = report.createTest("Add A Name");
        test10 = report.createTest("Add A Name");

    }

    @Before
    public void beforeTest()
    {

    }

    @Test
    public void Test1()
    {
        test1.fail("");
        Assert.fail("Not implemented");
    }
    @Test
    public void Test2()
    {
        test2.fail("");
        Assert.fail("Not implemented");
    }

    @Test
    public void Test3()
    {
        test3.fail("");
        Assert.fail("Not implemented");
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
    public void Test10()
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
        report.flush();

    }


}
