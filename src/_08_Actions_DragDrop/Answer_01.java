package _08_Actions_DragDrop;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Answer_01 extends BaseDriver {

    @Test
    public void ques_01(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        MyFunc.Bekle(5);

        Actions drag = new Actions(driver);

        List<WebElement> answerBox = driver.findElements(By.xpath("//*[@id='answerDiv']/div[contains(@class, 'dragDropSmallBox')]"));
        List<WebElement> targetBox = driver.findElements(By.xpath("//*[@id='questionDiv']/div[contains(@class, 'dragDropSmallBox')]"));

        for (WebElement answer : answerBox) {
            boolean isPlacedCorrectly = false;

            for (WebElement target : targetBox) {

                drag.clickAndHold(answer).perform();
                drag.moveToElement(target).perform();
                drag.release(target).perform();


                WebElement nextDestination = target.findElement(By.xpath("./following-sibling::div[contains(@class, 'destinationBox')]"));

                List<WebElement> childElements = nextDestination.findElements(By.xpath("./*"));
                for (WebElement child : childElements) {
                    if (child.getAttribute("class").contains("correctAnswer")) {
                        isPlacedCorrectly = true;
                        System.out.println(target.getText() + " : " + answer.getText());
                        targetBox.remove(target);
                        break;
                    }
                }

                if (isPlacedCorrectly) {
                    break;
                }
            }
        }

        BekleKapat();

    }
}
