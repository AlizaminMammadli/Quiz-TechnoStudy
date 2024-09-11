package _07_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_01 extends BaseDriver {

    @Test
    public void Ques_01(){

        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement adress = driver.findElement(By.cssSelector("#currentAddress"));
        adress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement perAdress = driver.findElement(By.cssSelector("#permanentAddress"));
        perAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.click();
        MyFunc.Bekle(3);


        Assert.assertTrue("Full name eslesmiyor", fullName.getAttribute("value").contains("Automation"));
        Assert.assertTrue("E-posta eslesmiyor", email.getAttribute("value").contains("Testing"));

        BekleKapat();
    }

}
