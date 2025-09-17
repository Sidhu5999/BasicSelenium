package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Confirmation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to app
		driver.get("https://demoqa.com/alerts");

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();

		// click on the button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		System.out.println(popup.getText());

		popup.dismiss();

	}

}
