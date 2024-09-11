package _07_CssSelector;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_02 extends BaseDriver {

    @Test
    public void Ques_02(){

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement pass = driver.findElement(By.cssSelector("#password"));
        pass.sendKeys("techno123");
        MyFunc.Bekle(2);

        WebElement signin = driver.findElement(By.cssSelector("#log-in"));
        signin.click();
        MyFunc.Bekle(3);

        WebElement textFind = driver.findElement(By.cssSelector("#time"));

        String text = textFind.getText();

        Assert.assertTrue("Oge bulunamadi", text.contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();
    }
}
