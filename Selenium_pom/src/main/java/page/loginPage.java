//package page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class loginPage extends basePage{
// //<input data-v-1f99f73c="" class="oxd-input oxd-input--active"
//    //    name="username" placeholder="Username" autofocus="">
//    // xpath: ruler để tìm locator trên website
//    // // input[@name='username'] => tìm tất cả cac the input c
//    // thuôc tin name voi value là username
//
//    private static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
//     public loginPage(WebDriver driver, WebDriverWait wait) {
//         super(driver, wait);
//     }
//     //step 1: truy cap vao page login
//    public void  open() {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//  // fix thêm cho case web hin thị lâu
//  // đợi co điều kiện => đợi xuất hiện th input
//  wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
//
//     }
/// / step 2: login
// // enterusername, enterPassword, clickLoginBtn
// // 2 cách viết
// // c1: tách từng step thànhtuwfung function
// // UU DIEM: de tang them log kiem tra, de sua
// // c2: gom cac step chung 1 function
//
// public void login(String username) {
//     WebElement usernameInput = driver.findElement(INPUT_USERNAME);
//     usernameInput.sendKeys(username);
// }
//}
//------------------------

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage {

    private static final By INPUT_USERNAME =
            By.xpath("//input[@name='username']");
    private static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");


    public loginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() {
        driver.get(
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        );

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME)
        );
    }

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput = driver.findElement(INPUT_USERNAME);
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(INPUT_PASSWORD);
        passwordInput.sendKeys(password);

        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(LOGIN_BTN);
        loginBtn.click();
    }

}
