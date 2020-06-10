package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By txtUserName = By.xpath("//input[@name='uid']");
    By txtPassword = By.xpath("//input[@name='password']");
    By lblTitleText = By.className("barone");
    By btnLogin = By.name("btnLogin");

//    setting up user actions
    public void setUserName (String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
    }

    public void setPassword (String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin () {
        driver.findElement(btnLogin).click();
    }

//    to check if properly navigated to the page; for validation
    public String getLoginTitle () {
        return driver.findElement(lblTitleText).getText();
    }

    public void login(String userName, String password){
        this.setUserName(userName);
        this.setPassword(password);
        this.clickLogin();
    }

}
