package _06_XPath;

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

        WebElement fakeAlerts = driver.findElement(By.xpath("//*[@id=\"fakealerttest\"]"));
        fakeAlerts.click();
        MyFunc.Bekle(2);

        WebElement modalAlert = driver.findElement(By.xpath("//*[@id=\"modaldialog\"]"));
        modalAlert.click();
        MyFunc.Bekle(2);

        WebElement dialogBox = driver.findElement(By.xpath("//*[@id=\"dialog\"]/div[2]"));

        WebElement okButton = driver.findElement(By.xpath("//*[@id=\"dialog-ok\"]"));
        okButton.click();
        MyFunc.Bekle(2);

        Assert.assertFalse("Dialog kapatilamadi" , dialogBox.isDisplayed());

        BekleKapat();
    }
}
