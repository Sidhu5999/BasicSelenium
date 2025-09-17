package jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigate to app
		driver.get("https://demowebshop.tricentis.com/");
		
		//locate the webelement
		WebElement element = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView(true)",element);
		
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].scrollIntoView(false)",element);
	}

}
