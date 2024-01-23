

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AutomationAnywhereTest {
	@Test
	    @SuppressWarnings("deprecation")
		public static void anywhereTest() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.get("https://www.automationanywhere.com/");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[2]")).click();
	        try {

	            Actions actions = new Actions(driver);
	            WebElement productsMenu = driver.findElement(By.xpath("//a[text()='Products']"));
	            actions.moveToElement(productsMenu).perform();
	            WebElement processDiscoveryLink = driver.findElement(By.xpath("//a[text()='Process Discovery']"));
	            processDiscoveryLink.click();
	            Thread.sleep(2000);
	            String currentUrl = driver.getCurrentUrl();
	            Assert.assertEquals(currentUrl, "https://www.automationanywhere.com/products/process-discovery");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}
