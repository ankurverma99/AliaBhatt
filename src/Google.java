import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		System.out.println(search.isEnabled());
		System.out.println(search.getAttribute("id"));
		Point loc = search.getLocation();
		System.out.println(loc.getX() + "   " + loc.getY());
		search.sendKeys("java", Keys.ENTER);

	}
 
}
