package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleandgreens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Greenstechenology");
		

	}

}
