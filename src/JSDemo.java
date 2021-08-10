import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-700)");
		 */
		/*
		 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * Thread.sleep(2000);
		 * js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 */
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Java Tutorial - W3Schools']"));
		js.executeAsyncScript("arguments[0].scrollIntoView()", ele);

	}

}
