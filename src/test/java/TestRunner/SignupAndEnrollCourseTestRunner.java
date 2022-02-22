package TestRunner;

import Pages.SignupAndEnrollCourse;
import Setup.Setup;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupAndEnrollCourseTestRunner extends Setup {

    @Test(priority = 0)
    public void doSignupAndEnrollFreeCourse() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.udemy.com/");
        SignupAndEnrollCourse signup = new SignupAndEnrollCourse(driver);
        Utils utils = new Utils();
        utils.getUserDetails(1);
        signup.userSignup(utils.getUserFullName(), utils.getUserEmail(), utils.getUserPassword());
        driver.get("https://www.udemy.com/topic/selenium-webdriver/");
        signup.enrollFreeCourse1();

    }


}
