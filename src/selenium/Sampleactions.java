package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sampleactions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.className("button button-orange"));
		WebElement dest = driver.findElement(By.xpath("(//li[@data-id=\"5\"])[2]"));
		a.dragAndDrop(src, dest).perform();

	}

}
