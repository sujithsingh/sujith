package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//downcasting  - 
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File x= tk.getScreenshotAs(OutputType.FILE);
		
		File x1=new File("C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\src\\selenium\\Screenshot\\facebook.png");
		
		FileUtils.copyFile(x, x1);
		
		
		
	}

}
