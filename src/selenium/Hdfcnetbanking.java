package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcnetbanking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujithphoton\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		WebElement usrnam = driver.findElement(By.name("fldLoginUserId"));
		
		usrnam.sendKeys("5677");
		Thread.sleep(2000);
		
		
		
		
		
		
		

	}

}
