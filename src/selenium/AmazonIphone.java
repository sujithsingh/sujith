package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement c = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		c.sendKeys("ihone12");

		WebElement btnlog = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnlog.click();

		Thread.sleep(1000);
		List<WebElement> x = driver
				.findElements(By.xpath("//div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]"));

		System.out.println(x.size());

		for (WebElement z : x) {
			System.out.println(z.getText());

		}

	}

}
