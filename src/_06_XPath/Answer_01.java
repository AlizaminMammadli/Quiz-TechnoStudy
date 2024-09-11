package _06_XPath;

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

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement adress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        adress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement perAdress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        perAdress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();
        MyFunc.Bekle(3);


        Assert.assertTrue("Full name eslesmiyor", fullName.getAttribute("value").contains("Automation"));
        Assert.assertTrue("E-posta eslesmiyor", email.getAttribute("value").contains("Testing"));

        BekleKapat();
    }
}
