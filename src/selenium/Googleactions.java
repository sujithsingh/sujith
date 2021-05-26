package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googleactions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		WebElement path=driver.findElement(By.xpath("//div[@data-ogsr-fb=\"true\"]"));
		a.contextClick(path).perform();
		
		WebElement gmail = driver.findElement(By.xpath("//span[text()='Gmail']"));
		a.moveToElement(gmail).perform();
		
		
		
		

	}

}
