package _06_XPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Answer_04 extends BaseDriver {

    @Test
    public void Ques_04(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement calculator = driver.findElement(By.xpath("//*[@id=\"calculatetest\"]"));
        calculator.click();
        MyFunc.Bekle(2);

        WebElement number1 = driver.findElement(By.xpath("//*[@id=\"number1\"]"));
        number1.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement number2 = driver.findElement(By.xpath("//*[@id=\"number2\"]"));
        number2.sendKeys("10");
        MyFunc.Bekle(2);

        WebElement calculate = driver.findElement(By.xpath("//*[@id=\"calculate\"]"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement printEle = driver.findElement(By.xpath("/html/body/div/div[3]/div"));
        System.out.println(printEle.getText());

        BekleKapat();
    }
}
