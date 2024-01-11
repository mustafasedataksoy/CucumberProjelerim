package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{


    public LeftNav()
    {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//*[text()='Countries']")
    private WebElement countries;

    WebElement myElement;


    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "setupOne" : myElement=setupOne;break;
            case "parameters" :myElement=parameters;break;
            case "countries" : myElement=countries;break;
        }

        clickFunction(myElement);
    }


}
