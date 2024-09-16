package _08_Actions_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Answer_03 extends BaseDriver {

    @Test
    public void Ques_03(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        MyFunc.Bekle(5);

        WebElement allItems = driver.findElement(By.xpath("//*[@id=\"allItems\"]"));
        List<WebElement> childAll = allItems.findElements(By.xpath("./*"));

        WebElement container = driver.findElement(By.xpath("//*[@id=\"dhtmlgoodies_mainContainer\"]"));
        List<WebElement> allBox = container.findElements(By.xpath(".//*[contains(@id, 'box')]"));

        Actions drag = new Actions(driver);

        int processCount = 1;

        Map<WebElement, Integer> boxCorrectCount = new HashMap<>();

        int correctAnswerCount=0;
        for (WebElement box : allBox) {
            boxCorrectCount.put(box, correctAnswerCount);
        }


        for (WebElement child : childAll) {

            boolean isPlacedCorrectly = false;

            for (WebElement box : allBox) {

                drag.clickAndHold(child).perform();
                drag.moveToElement(box).perform();
                drag.release(box).perform();

                try {
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                    System.out.println("Test Basari ile Tamamlandi");
                }
                catch (NoAlertPresentException e) {
                    processCount++;
                }

                List<WebElement> correctBox = box.findElements(By.xpath("./*"));
                int countPrev = 0;
                for (WebElement c : correctBox) {
                    if (c.getAttribute("class").contains("correctAnswer")) {
                        countPrev++;
                    }
                }

                int currentCount = boxCorrectCount.get(box);
                if (countPrev > currentCount) {
                    isPlacedCorrectly = true;
                    boxCorrectCount.put(box, countPrev);

                    if (countPrev == 3) {
                        allBox.remove(box);
                        break;
                    }
                }

                if (isPlacedCorrectly) {
                    break;
                }
            }
        }

        System.out.println("Islem sayisi " + processCount);
        BekleKapat();
    }
}
