package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Demooo {
	//handle captcha
	public static void main(String[] args) throws IOException, TesseractException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to demowebshop
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		driver.findElement(By.partialLinkText("LOGIN")).click();
	WebElement img = driver.findElement(By.cssSelector("img[class='captcha-img']"));
	File temp = img.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot1/ss.png");
	FileHandler.copy(temp, dest);
	
	
	Tesseract tess = new Tesseract();
	tess.setDatapath("C:\\Users\\QSP\\eclipse-workspace\\Batch1\\src\\test\\resources\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
	String imgh2 = tess.doOCR(dest);
	String finalText = imgh2.replace(" ","");
	
	System.out.println(finalText);
	
	driver.findElement(By.id("captcha")).sendKeys(finalText);
	
	
	}

}
