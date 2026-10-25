// package test;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import page.DashboardPage;
//import page.loginPage;
//
//public class DashboardTest {
//
//    @Test(description = "Find locators")
//    public void findLocators() throws InterruptedException {
//
//        loginPage loginPage = new loginPage(driver, wait);
//        loginPage.open();
//        loginPage.login("Amin", "admin123");
//
//        // vi du page login -> dashboard se co khoang tỉm
//        // doi cai=c element xuat hiện trên dashboard
//        // tim dieu kien de waiting
//
//        Thread.sleep(10_000);
//
//        DashboardPage dashboardPage = new DashboardPage(driver, wait);
//        Assert.assertTrue(dashboardPage.isElenmentPresnt());
//
//    }
//}


package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.loginPage;

public class DashboardTest extends BaseTest {
    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAsAdmin();
    }

    @Test(description = "Find locators")
    public void findLocators() throws InterruptedException {

        // xoa:
        // loginPage loginPage = new loginPage(driver, wait);
        //        loginPage.open();
        //        loginPage.login("Admin", "admin123");
       // Thread.sleep(10_000);

       //  wait.until(ExpectedConditions.urlContains("dashboard"));
     //doi xuat hien mot trong cac element thì bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));

        DashboardPage dashboardPage = new DashboardPage(driver, wait);

        Assert.assertTrue(dashboardPage.isElenmentPresnt());

    }
}
