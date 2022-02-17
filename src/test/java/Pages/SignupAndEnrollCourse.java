package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupAndEnrollCourse {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Sign up')]")
    WebElement navbarSignup;
    @FindBy(id = "id_fullname")
    WebElement txtFullName;
    @FindBy(id = "email--1")
    WebElement txtEmail;
    @FindBy(id = "password")
    WebElement txtPassword;
    @FindBy(className = "checkbox-label")
    WebElement checkBox;
    @FindBy(id = "submit-id-submit")
    WebElement btnSignUP;


    public SignupAndEnrollCourse(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userSignup(String fullname, String email, String password) {
        navbarSignup.click();
        txtFullName.sendKeys(fullname);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        checkBox.click();
        btnSignUP.click();
    }


}
