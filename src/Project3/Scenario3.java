package Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Scenario3 {

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

        WebElement debitCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        debitCard.click();

        Thread.sleep(1500);

        WebElement payButton = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payButton.click();

        Thread.sleep(1500);

        WebElement invalidTexts = driver.findElement(By.xpath("//div[@id='SnackBar']//span"));
        Thread.sleep(1500);
        String texts = invalidTexts.getText();
        Thread.sleep(1500);
        System.out.println(texts);

        driver.quit();


    }
}
