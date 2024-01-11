package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    // page object modelim
    @FindBy(css = "input[formcontrolname=username]")
    private WebElement username;

    @FindBy(css = "input[formcontrolname=password]")
    private WebElement password;


    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;


    @FindBy(css ="span[class='mat-mdc-tooltip-trigger logo-text']")
    private WebElement internshipElement;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    // dynamic-view[class='ng-star-inserted']
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;






    WebElement myElement;

    public void findAndSend(String strElement , String value)
    {

        // element get set yapıldı
        switch (strElement)
        {
            case "username" : myElement=username;break;
            case "password":myElement=password;break;
            case "nameInput":myElement=nameInput;break;
            case "codeInput":myElement=codeInput;break;


        }

        sendKeysFunction(myElement, value);
    }


    public void findAndClick(String strElement)
    {
        // element get set yapıldı
        switch (strElement)
        {
            case "loginButton" : myElement=loginButton;break;
            case "addButton":myElement=addButton;break;
            case "saveButton":myElement=saveButton;break;
        }

        clickFunction(myElement);
    }


    public void findAndContainsText(String strElement , String text)
    {
        // element get set yapıldı
        switch (strElement)
        {
            case "internshipElement" : myElement=internshipElement;break;
            case "successMessage" : myElement=successMessage;break;
        }

        verifyContainsTextFunction(myElement , text);
    }



}
