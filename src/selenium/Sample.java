package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujithphoton\\task 3\\Samplenewproject\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/");

		driver.manage().window().maximize();

		List<WebElement> pop = driver.findElements(By.xpath("//span[@class=\"rts-counter\"][1]"));

		 System.out.println(pop.size());
		 
		 for (int i = 0; i < pop.size(); i++) {
			 
			 System.out.println(pop.get(i).getText());
			
		}
		 
		 
		}
		 

		
		}

	


