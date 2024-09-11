package _07_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_05 extends BaseDriver {

    @Test
    public void Ques_05(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.cssSelector("#fakealerttest"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showAlert = driver.findElement(By.cssSelector("#fakealert"));
        showAlert.click();
        MyFunc.Bekle(2);

        WebElement alertBox = driver.findElement(By.cssSelector("#dialog > div.dialog.active"));

        WebElement okButton = driver.findElement(By.cssSelector("#dialog-ok"));
        okButton.click();
        MyFunc.Bekle(2);

        Assert.assertFalse("Alarm kapatilamadi" , alertBox.isDisplayed());

        BekleKapat();

    }
}
