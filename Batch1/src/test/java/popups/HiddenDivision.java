package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to app
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
//		driver.findElement(By.cssSelector("div[aria-label='Thu Mar 26 2026']")).click();
		
		for(;;) {
			
			try {
				
				//element march 26 2026
				driver.findElement(By.cssSelector("div[aria-label='Thu Mar 26 2026']")).click();
				break;
				
			}
			catch (Exception e) {
				//arrow click
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
		}
	}

}
