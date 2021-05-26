package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujithphoton\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class=\"nav-search-field \"]//following-sibling:: input"))
				.sendKeys("iphone");

		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> ipone = driver.findElements(By.xpath("//div[@class=\"sg-col-inner\"]"));
		
		
		int size = ipone.size();
		System.out.println(size);
		
	}

}
