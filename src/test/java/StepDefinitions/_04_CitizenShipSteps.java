package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;


public class _04_CitizenShipSteps {
    LeftNav ln= new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("saveButton");

    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {

        dc.findAndContainsText("alreadyExist","already");

    }

    @When("User delete the {string}")
    public void userDeleteThe(String arananKelime) {
        dc.findAndDelete(arananKelime);

    }
}
