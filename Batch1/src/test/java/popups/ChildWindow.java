package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on facebook
		driver.findElement(By.linkText("Facebook")).click();
		
		//capture the session id/window id for parent window
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		
		//capture all windowids
		Set<String> allIds = driver.getWindowHandles();
		
		//remore parent id from allids
		allIds.remove(parentID);//now only one id will be there
		
		for (String Windowids : allIds) {
			driver.switchTo().window(Windowids);
			driver.close();
			
		}
		
		
		
		
		
		
	}

}
