package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Navigate to app
			driver.get("https://demowebshop.tricentis.com/");
			
			//click on search bttn
			driver.findElement(By.cssSelector("input[value='Search']")).click();
			Thread.sleep(3000);
			
			//switch the control to pop up
			org.openqa.selenium.Alert popup = driver.switchTo().alert();
			System.out.println(popup.getText());
			//click on Ok button
			//popup.accept();
			
			popup.dismiss();
			
	}

}
