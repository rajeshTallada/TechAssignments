

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationAnywhereDemoTest {
@Test
    @SuppressWarnings("deprecation")
	public static void autoDemoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.automationanywhere.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 50);");
        try {
            WebElement requestDemoButton = driver.findElement(By.xpath("//a[text()='Request Demo']"));
            requestDemoButton.click();
            Thread.sleep(2000);
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "https://www.automationanywhere.com/request-live-demo-2");
            WebElement firstNameLabel = driver.findElement(By.id("LblFirstName"));
            WebElement lastNameLabel = driver.findElement(By.id("LblLastName"));
            Assert.assertTrue(firstNameLabel.isDisplayed());
            Assert.assertTrue(lastNameLabel.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
