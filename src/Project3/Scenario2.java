package Project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.WEmbeddedFrame;

import java.util.List;

public class Scenario2 {

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

        WebElement addPromo = driver.findElement(By.xpath("//button[text()='Add Promo Code']"));
        addPromo.click();

        WebElement inputPromo = driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
        inputPromo.sendKeys("123456789");

        WebElement applyButton = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        applyButton.click();

        WebElement applyPromoButton = driver.findElement(By.cssSelector("button[class='Promo-Apply']"));
        applyPromoButton.click();

        Thread.sleep(2000);

        WebElement invalidPromo = driver.findElement(By.cssSelector("div[id='SnackBar']>span"));

        Thread.sleep(1500);

        String invalidPromoText = invalidPromo.getText();
        Thread.sleep(1500);
        System.out.println(invalidPromoText);






    }
}
