package TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.BlueStone;

public class TestBluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BlueStone b = new BlueStone(driver);
		b.ringHover(driver);
		b.diamondClick();
		b.fRingClick();
		b.switchTab(driver);
		b.buyNowClick();
		System.out.println(b.fetchErrT());
	}
}
