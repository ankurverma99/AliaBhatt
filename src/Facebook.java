import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("9");
		WebElement mon = driver.findElement(By.id("month"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText("Sep");
		List<WebElement> months = s1.getOptions();
		for (WebElement val : months) {
			System.out.println(val.getText());
		}

	}
}
