package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sujithsingh");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("123456789");
		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}

}
