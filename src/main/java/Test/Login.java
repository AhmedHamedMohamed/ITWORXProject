package Test;

import Pages.WinjObj;
import Utilities.TestBase;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Utilities.TestBase.driver;

public class Login {
    WinjObj winjObj;

    @Given("Open Winjgo Website")
    public void OpenWinjgoWebsite() {
       TestBase.Brawser("chrome");
       // driver.navigate().to("https://swinji.azurewebsites.net/account/login");
        winjObj = new WinjObj(driver);
    }

    @When("Insert Email")
    public void InsertEmail() {
        winjObj.getWinjLoginPage().loginUserName("testregister@aaa.com");
    }

    @And("Insert Password")
    public void InsertPassword() {
        winjObj.getWinjLoginPage().loginPassword("Wakram_123");
    }

    @And("click On Login Button")
    public void clickOnLoginButton() throws InterruptedException {
        winjObj.getWinjLoginPage().loginButton();


    }

    @And("Click On Courses Icon")
    public void clickOnCoursesIcon() {
        winjObj.getWinjHomePage().clickOnCoursesIcon(driver);

    }

    @And("Click On Create New Course Icon")
    public void clickOnCreateNewCourseIcon() {
        winjObj.getWinjHomePage().clickOnCreateCourseButton();
    }

    @And("Insert Course Name")
    public void insertCourseName() {
        winjObj.getWinjHomePage().createCourseName("Selenium");
    }

    @And("Click To Select Subject")
    public void clickToSelectSubject() {
        winjObj.getWinjHomePage().selectSubject();
    }

    @And("Click To Choose Subject")
    public void clickToChooseSubject() throws InterruptedException {
        winjObj.getWinjHomePage().chooseSubject(driver);
    }

    @And("Click To Select Grade Year")
    public void clickToSelectGradeYear() {
        winjObj.getWinjHomePage().selectCourseGrade();
    }

    @And("Click To Choose Grade Year")
    public void clickToChooseGradeYear() {
        winjObj.getWinjHomePage().chooseGradeYear();

    }

    @And("Click To Select Course Teacher")
    public void clickToSelectCourseTeacher() {
        winjObj.getWinjHomePage().selectCourseTeacher();
    }

    @And("Click To Choose Course Teacher")
    public void clickToChooseCourseTeacher() {
        winjObj.getWinjHomePage().chooseCourseTeacher();
    }

    @And("Scroll Down")
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
    }

    @And("Click To Choose Final Assessment")
    public void clickToChooseFinalAssessment() {
            winjObj.getWinjHomePage().chooseFinalAssessment();
        }

    @And("Click To Select Course Setting")
    public void clickToSelectCourseSetting() {
        winjObj.getWinjHomePage().selectCourseSetting(driver);
    }

    @And("Insert Course Capacity")
    public void InsertCourseCapacity() throws InterruptedException {
        winjObj.getWinjHomePage().chooseCourseCapacity("20");
    }

    @And("Insert Course Location")
    public void insertCourseLocation() {
        winjObj.getWinjHomePage().setCourseLocation("Cairo");
    }


    @And("Click On Check Enable Learning Path")
    public void clickOnCheckEnableLearningPath() {
        winjObj.getWinjHomePage().chkEnableLearningPath(driver);
    }

    @And("Click On Check Student Learning Objective Achievement Settings")
    public void clickOnCheckStudentLearningObjectiveAchievementSettings() {
        winjObj.getWinjHomePage().studentLearningObjectiveAchievementSettings(driver);
    }

    @And("Click On Save Course Button")
    public void clickOnSaveCourseButton() {
        winjObj.getWinjHomePage().saveCourseButton(driver);
    }

    @Then("Assert On Course Created Successfully")
    public void assertOnCourseCreatedSuccessfully() throws InterruptedException {
        winjObj.getWinjHomePage().assertCourseCreatedSuccessfully();
    }
}


