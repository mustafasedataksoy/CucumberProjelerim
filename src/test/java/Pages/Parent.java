package Pages;

import Utulities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));


    public void sendKeysFunction(WebElement element , String value)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element); // elemente kadar scroll kaydır sayfayı
        element.clear(); // elementi temizle
        element.sendKeys(value); // değeri gönder

    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element); // gözükene kadar bekle
        scrollToElement(element); // elemente kadar scroll kaydır sayfayı
        element.click(); // elemente tıkla

    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js =(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

    public void verifyContainsTextFunction(WebElement element , String value)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text  you searched could'nt be find ");

    }




}
