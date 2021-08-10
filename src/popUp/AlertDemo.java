package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.id("alertButton")).click(); Alert a =
		 * driver.switchTo().alert(); System.out.println(a.getText()); a.accept();
		 */
		/*
		 * driver.findElement(By.id("confirmButton")).click(); Alert a =
		 * driver.switchTo().alert(); System.out.println(a.getText()); a.dismiss();
		 * System.out.println(driver.findElement(By.id("confirmResult")).getText());
		 */
		driver.findElement(By.id("promtButton")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("ankur");
		a.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
