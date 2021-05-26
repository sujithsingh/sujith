package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/info/OfferTerms#FIRST");
		
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.className("db"));
		from.sendKeys("chennai");

		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("kerala");

		WebElement date = driver.findElement(By.className("onward_cal"));
		date.sendKeys("10/07/2021");

		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();

	}

}
