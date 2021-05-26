package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactinpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujith photon\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("sujithsingh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("63WWE8");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);

		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		loc.click();

		Select s = new Select(loc);
		s.selectByIndex(6);

		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		hot.click();
		Select s1 = new Select(hot);
		s1.selectByIndex(3);

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		room.click();
		Select s2 = new Select(room);
		s2.selectByIndex(2);

		WebElement noofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		noofrooms.click();

		Select s3 = new Select(noofrooms);
		s3.selectByIndex(1);

		WebElement adultrooms = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adultrooms.click();

		Select s4 = new Select(adultrooms);
		s4.selectByIndex(2);

		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		childroom.click();

		Select s5 = new Select(childroom);
		s5.selectByIndex(1);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@name='continue']")).click();

		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("sujith");

		driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("singh");

		driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("Chennai - 600 100");

		driver.findElement(By.xpath("//input[@name=\"cc_num\"]")).sendKeys("4589785697854156");

		WebElement creditcard = driver.findElement(By.xpath("//select[@name='cc_type']"));
		creditcard.click();
		Thread.sleep(1000);

		Select s6 = new Select(creditcard);
		s6.selectByVisibleText("VISA");

		WebElement expdate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		expdate.click();

		Select s7 = new Select(expdate);
		s7.selectByIndex(5);

		WebElement selyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		expdate.click();

		Select s8 = new Select(selyear);
		s8.selectByIndex(11);

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("333");

		driver.findElement(By.xpath("//input[@name='book_now']")).click();

		Thread.sleep(6000);
	Actions a = new Actions(driver);
		WebElement refnum = driver.findElement(By.xpath("//input[@name='order_no']"));
		a.moveToElement(refnum).perform();
      
		String output = refnum.getAttribute("value");
		System.out.println(output);
	}

}
