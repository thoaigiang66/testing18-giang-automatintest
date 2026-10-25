//package test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.time.Duration;
//
//
/// / basetest là class để thiết lập môi trường chạy test
//public class BaseTest {
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//
//  // hàm setup môi trường test
//  // thêm key BeforeMethod để chạy hàm này trước khi test
//    @BeforeMethod(alwaysRun = true)
//    public void setup() {
//        WebDriverManager.chromedriver().setup();
//// CẤU HÌNH GIAO DIỆN CHROME
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-mãinized");
//
//        ChromeDriver driver = new ChromeDriver(options);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    }
// // HÀM TEARDOWN môi truường sau khi chạy test
// @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
// }
//}
//--------------------------------
//package test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import java.time.Duration;
//
/// / BaseTest là class để thiết lập môi trường chạy test
//public class BaseTest {
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//
//    // hàm setUp môi trường test
//// thêm key BeforeMethod để chạy hàm này trước khi chạy test
//    @BeforeMethod(alwaysRun = true)
//    public void setUp() {
//// WebDriverManager.chromedriver().setup();
//// cấu hình giao diện chrome
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//
//        driver = new ChromeDriver(options);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//    }
//
//    // hàm tearDown môi trường sau khi chạy test
//    @AfterMethod(alwaysRun = true)
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
//-----------------------------------

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.loginPage;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        int timeout = Integer.parseInt(ConfigReader.get("timeout"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    // VI Cac page con deu can login truoc nen can define function login trong class cha
    protected void loginAsAdmin() throws InterruptedException {
        loginPage loginPage = new loginPage(driver, wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }
}
