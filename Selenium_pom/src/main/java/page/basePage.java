//package page;
//
//import org.openqa.selenium.JavascriptException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class basePage {
//    // thuộc tính giúp tương tác trên website như:
//    // truy ập page, fill page, click, checkbox,...
//    protected WebDriver driver;
//
//    // thuộc tính giúp tìm kiếm locater dễ dàng hơn, tránh trường hop
//    // flaky test ( lúc có lúc không)
//    protected WebDriverWait wait;
//
//    //THUOC TINH de truyen code java script giúp tương tác
//    // trên website
//    //highlight, scoll, click, double click,...
//    protected JavascriptException js;
//
//    public basePage(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//        this.js = (JavascriptException) driver;
//    }
//}
////------------------

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public basePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
