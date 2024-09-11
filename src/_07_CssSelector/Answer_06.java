package _07_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_06 extends BaseDriver {

    @Test
    public void Ques_06(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.cssSelector("#fakealerttest"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement modalAlert = driver.findElement(By.cssSelector("#modaldialog"));
        modalAlert.click();
        MyFunc.Bekle(2);

        WebElement dialogBox = driver.findElement(By.cssSelector("#dialog > div.dialog.active"));

        WebElement okButton = driver.findElement(By.cssSelector("#dialog-ok"));
        okButton.click();
        MyFunc.Bekle(2);

        Assert.assertFalse("Dialog kapatilamadi" , dialogBox.isDisplayed());

        BekleKapat();
    }
}
