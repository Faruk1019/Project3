package Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Scenario1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\faruk\\OneDrive\\Masaüstü\\selenium-java-4.3.0\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");

        Thread.sleep(1500);

        List<WebElement> addToCarButtonList = driver.findElements(By.xpath("//button[@class='view_product']"));
        addToCarButtonList.get(1).click();

        Thread.sleep(1500);

        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe1);

        WebElement number1 = driver.findElement(By.xpath("//div[@class='Fixed-Actions Desktop-Only']//span"));
        String validation1 = number1.getText();
        System.out.println(validation1);

        Thread.sleep(1500);

        WebElement removeButton = driver.findElement(By.xpath("//button[@class='Product-Remove']"));
        removeButton.click();

        Thread.sleep(1500);

        WebElement validation2 = driver.findElement(By.xpath("//h3[@class='Title']"));
        String cartIsEmpty = validation2.getText();
        System.out.println(cartIsEmpty);

        WebElement continueShopping = driver.findElement(By.xpath("//button[@class='Continue-Button Close-Cart']"));
        continueShopping.click();

        driver.switchTo().defaultContent();

        WebElement number0 = driver.findElement(By.id("cart_item_nos"));
        String cartIsZero = number0.getText();
        System.out.println(cartIsZero);






    }
}
