package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to app
		driver.get("https://smallpdf.com/png-to-pdf");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\QSP\\Pictures\\Screenshots\\13.png");
		
		
	}

}
