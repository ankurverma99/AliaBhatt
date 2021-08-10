import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide -mobile']")).click();
		Thread.sleep(2000);
		WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Actions a = new Actions(driver);
		a.moveToElement(sale).perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@class='topnav_item saleunit']/descendant::span[contains(.,'Wooden Sofa Sets')]"))
				.click();
		driver.findElement(By
				.xpath("//div[@class='MacadamiaBrown selected variations']/descendant::button[text()='View Product']"))
				.click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logo")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cart-badge")).click();

	}

}
