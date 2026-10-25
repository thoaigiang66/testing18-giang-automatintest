//package test;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import page.loginPage;
//
//public class loginTest extends BaseTest {
//
//    @Test(description = "Test login success")
//    public void testLoginSuccess() {
//  // tạo dối tượng loginPage
//  loginPage loginPage = new loginPage(driver, wait);
//  loginPage.open();
//  loginPage.login("admin");
//
// //so sánh với kết quả mong đợi expectef với actual
//
//        Assert.assertTrue(true);
//    }
//}
//-----------------------------

package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.loginPage;
import utils.ConfigReader;

public class loginTest extends BaseTest {

    @Test(description = "Test login success")
    public void testLoginSuccess() throws InterruptedException {
        loginPage loginPage = new loginPage(driver, wait);

        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        Thread.sleep(10000);

        // so sánh expected vs result
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
}
