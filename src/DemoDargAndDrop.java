import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDargAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		System.out.println(dropable.getCssValue("background-color"));
		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, dropable).perform();
		Thread.sleep(2000);
		System.out.println(dropable.getText());
		System.out.println(dropable.getCssValue("background-color"));
		System.out.println(dropable.getCssValue("border"));
		System.out.println(dropable.getCssValue("font"));
		

	}
}
