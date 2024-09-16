package _08_Actions_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Answer_02 extends BaseDriver {

    @Test
    public void Ques_02(){


        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        MyFunc.Bekle(5);

        WebElement allItems = driver.findElement(By.xpath("//*[@id=\"allItems\"]"));
        List<WebElement> childAll = allItems.findElements(By.xpath("./*"));


        WebElement box1 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
        WebElement box2 = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
        WebElement box3 = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
        WebElement box4 = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
        WebElement box5 = driver.findElement(By.xpath("//*[@id=\"box5\"]"));

        Actions drag = new Actions(driver);

        int counter = 1;

        for (WebElement child : childAll){

            drag.clickAndHold(child).perform();
            drag.moveToElement(box1).perform();
            drag.release(box1).perform();
            counter++;
            if (counter>8){
                box1=box3;
            }
            if (counter>12){
                box1=box4;
            }
        }

        System.out.println(" Basariyla Tamamlandi :)");

        BekleKapat();
    }
}
