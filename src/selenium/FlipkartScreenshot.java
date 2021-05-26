package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		text.sendKeys("oneplus");
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		TakesScreenshot tk = (TakesScreenshot) driver;

		File x = tk.getScreenshotAs(OutputType.FILE);

		File x1 = new File(
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\src\\selenium\\Screenshot\\flipkart.png");

		FileUtils.copyDirectory(x, x1);

	}

}
