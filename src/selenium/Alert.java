package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		// driver.switchTo().frame(1);

		WebElement btn = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
		btn.click();

		WebElement anotherbtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		anotherbtn.click();

		Thread.sleep(1000);
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		a.dismiss();

	}

}
