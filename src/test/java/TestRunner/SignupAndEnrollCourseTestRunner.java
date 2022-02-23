package TestRunner;

import Pages.SignupAndEnrollCourse;
import Setup.Setup;
import Utils.Utils;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupAndEnrollCourseTestRunner extends Setup {

    @Test(priority = 1)
    public void doSignupAndEnrollFreeCourse() throws IOException, ParseException, InterruptedException {
        SignupAndEnrollCourse signup = new SignupAndEnrollCourse(driver);
        Utils utils = new Utils();
        int i;
        for (i = 0; i < 3; i++) {
           driver.get("https://www.udemy.com/");
           if (i == 0) {
               utils.getUserDetails(i);
           }
           else if (i == 1) {
               utils.getUserDetails(i);
           }
           else if (i == 2) {
               utils.getUserDetails(i);
           }

            signup.userSignup(utils.getUserFullName(), utils.getUserEmail(), utils.getUserPassword());
            driver.get("https://www.udemy.com/topic/selenium-webdriver/");

            if (i == 0) {
                signup.enrollFreeCourse1();
            }
            else if (i == 1) {
                signup.enrollFreeCourse2();
            }
            else if (i == 2) {
                signup.enrollFreeCourse3();
            }

            signup.logout();

        }
    }
}
