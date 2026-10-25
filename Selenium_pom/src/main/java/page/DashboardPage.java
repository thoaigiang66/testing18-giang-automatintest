package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends basePage{
 // <a data-v-6475d26d="" class="oxd-main-menu-item active toggle" href="/web/index.php/admin/viewAdminModule">
public static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
// ////span[text()='Admin']
    // có thể dung cai tren
  // //a[.//span[text()='Admin']]
  // //a => tìm tất ca các thẻ a có trong page
  // . => co nghia la chính thẻ <a> đang xét
  // .// => tim tat ca cac the span co trong the a này
    private static final By ADMIN_HEADER = By.xpath("//h6[text()='Admin']");
    

    public DashboardPage(WebDriver driver, WebDriverWait wait) {
  super(driver, wait);}

    public boolean isElenmentPresnt() {
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        menuAdmin.click();
        boolean checkLocators = true;
        if (!menuAdmin.isDisplayed()) {
            checkLocators = false;
        }
        WebElement adminHeader = driver.findElement(ADMIN_HEADER);
        if (!adminHeader.isDisplayed()) {
            checkLocators = false;
        }

        return checkLocators;
    }
}

