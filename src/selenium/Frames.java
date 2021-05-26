package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		driver.manage().window().maximize();

		WebElement framer = driver.findElement(By.tagName("//frame[@name='login_page']"));

		driver.switchTo().frame(framer);
		

		WebElement userid = driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]"));

		userid.sendKeys("1234567890");

	}

}
