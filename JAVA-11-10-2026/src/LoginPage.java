
public class LoginPage {

    String username;
    String password;

    // Nhap username
    public void enterUsername(String username) {
        System.out.println("Enter username: ");
        this.username = username;
    }

    // Nhap password
    public void enterPassword(String password) {
        System.out.println("Enter password: ");
        this.password = password;
    }

    // Click nut Login
    public void clickLoginBtn() {
        System.out.println("Click login button");
    }

    // Thuc hien dang nhap
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }

    // Kiem tra dang nhap thanh cong hay khong
    public boolean isLoginSuccess() {
        return "admin".equals(username)
                && "Admin123".equals(password);
    }
}
