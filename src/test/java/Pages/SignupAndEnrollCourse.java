package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(className = "udlite-toggle-input-block-outline")
    List<WebElement> careerGoal;
    @FindBy(css = "button")
    List <WebElement> btnNext1;
    @FindBy(xpath = "//span[contains(text(),'Software Development')]")
   WebElement professionLearning;
    @FindBy(name = "Web Developer")
    WebElement professionWebDev;
    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    WebElement btnNext2;
    @FindBy(css = "a")
    List <WebElement> btnFinish;


    public SignupAndEnrollCourse(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userSignup(String fullname, String email, String password) throws InterruptedException {
        navbarSignup.click();
        txtFullName.sendKeys(fullname);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        checkBox.click();
        btnSignUP.click();
        Thread.sleep(1500);
        careerGoal.get(2).click();
        btnNext1.get(0).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //To scroll down to the bottom of the webpage
        professionLearning.click();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        professionWebDev.click();
        btnNext2.click();
        Thread.sleep(1000);
        btnFinish.get(1).click();

    }


}
