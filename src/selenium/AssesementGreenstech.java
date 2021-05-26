package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssesementGreenstech {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement para = driver.findElement(By.xpath("//p[@class='course-desc']"));
		
		String x=para.getText();
		System.out.println(x);
		
	
		String y=x.substring(2);
		System.out.println(y);
				
		
		
		
		
		
		
		

	}

}
