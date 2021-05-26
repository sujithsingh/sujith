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

public class SnapdealScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search.sendKeys("HP LAPTOP");
		WebElement h = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		h.click();
		Thread.sleep(4000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);

		File dest = new File(
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\src\\selenium\\Screenshot\\snapdeal.png");

		FileUtils.copyFile(source, dest);
	}

}
