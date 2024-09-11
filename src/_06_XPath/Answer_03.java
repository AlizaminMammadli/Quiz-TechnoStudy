package _06_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_03 extends BaseDriver {

    @Test
    public void Ques_03(){

        driver.get("https://www.snapdeal.com/");

        WebElement winSearch = driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
        winSearch.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement search = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button"));
        search.click();
        MyFunc.Bekle(3);

        WebElement textFind = driver.findElement(By.xpath("//*[@id=\"searchMessageContainer\"]/div/span"));

        Assert.assertTrue("Bu yazi ekranda goruntulenmedi", textFind.isDisplayed());

        BekleKapat();
    }

}
