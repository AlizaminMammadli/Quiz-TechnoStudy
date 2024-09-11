package _06_XPath;

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

        WebElement fakeAlerts = driver.findElement(By.xpath("//*[@id=\"fakealerttest\"]"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement showAlert = driver.findElement(By.xpath("//*[@id=\"fakealert\"]"));
        showAlert.click();
        MyFunc.Bekle(2);

        WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"dialog\"]/div[2]"));

        WebElement okButton = driver.findElement(By.xpath("//*[@id=\"dialog-ok\"]"));
        okButton.click();
        MyFunc.Bekle(2);

        Assert.assertFalse("Alarm kapatilamadi" , alertBox.isDisplayed());

        BekleKapat();

    }
}
