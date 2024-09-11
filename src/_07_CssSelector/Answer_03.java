package _07_CssSelector;

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

        WebElement winSearch = driver.findElement(By.cssSelector("#inputValEnter"));
        winSearch.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement search = driver.findElement(By.cssSelector("#sdHeader > div.headerBar.reset-padding > div.topBar.top-bar-homepage.top-freeze-reference-point > div > div.col-xs-14.search-box-wrapper > button"));
        search.click();
        MyFunc.Bekle(3);

        WebElement textFind = driver.findElement(By.cssSelector("#searchMessageContainer > div"));

        Assert.assertTrue("Bu yazi ekranda goruntulenmedi", textFind.isDisplayed());

        BekleKapat();
    }

}
