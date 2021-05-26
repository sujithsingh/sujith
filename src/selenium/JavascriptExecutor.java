package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		// search.sendKeys("HP LAPTOP");
		// sendkeys.e
		js.executeScript("arguments[0].setAttribute('value','HPLAPTOP')", search);

		WebElement h = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		// h.click();
		js.executeScript("arguments[0].click()", h);

		Thread.sleep(4000);
		
		WebElement y = driver.findElement(By.xpath("(//div[@class=\"middle-heading\"])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", y);
		
		WebElement y1 = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(false)",y1);
		
		
		
		
		
		

	}

}
