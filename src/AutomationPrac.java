import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
 		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']")).click();
		Actions a = new Actions(driver);
		WebElement prd = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li"));
		a.moveToElement(prd).perform();
		driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		driver.findElement(By.xpath("//span[@title='Close window']")).click();
		WebElement cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		a.moveToElement(cart).perform();
		System.out.println(driver.findElement(By.xpath("//dl[@class='products']/dt")).getText());
	}

}
