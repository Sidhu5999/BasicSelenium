package jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigate to app
		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		
		//locate the webelement
		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();
		
		WebElement ele = driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()",ele);
}
}
