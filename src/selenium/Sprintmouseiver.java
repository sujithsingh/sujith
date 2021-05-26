package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprintmouseiver {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");

		driver.manage().window().maximize();
		
		Alert c=driver.switchTo().alert();
		c.dismiss();

		Actions a = new Actions(driver);
		
		WebElement text = driver.findElement(By.xpath(" //a[contains(text(),'Plans')][1] "));
		
		a.moveToElement(text).perform();
		
		
		
		
	}

}
