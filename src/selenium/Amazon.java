package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch browser
		driver.get("http://www.greenstechnologys.com/");
		// get title
		driver.findElement(By.xpath(""));
	}

}
