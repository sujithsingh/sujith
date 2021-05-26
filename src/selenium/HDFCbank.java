package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCbank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/ ");

		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("sujithsingh");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456789");

		WebElement login = driver.findElement(By.id("login"));
		//login.click();
	}

}
