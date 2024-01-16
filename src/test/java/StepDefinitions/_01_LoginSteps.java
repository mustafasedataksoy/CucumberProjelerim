package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
public class _01_LoginSteps {

    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        // username : turkeyts
        // password : TechnoStudy123


        dc.findAndSend("username","turkeyts");
        dc.findAndSend("password","TechnoStudy123");
        dc.findAndClick("loginButton");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

        dc.findAndContainsText("internshipElement","Internship");


    }
}
