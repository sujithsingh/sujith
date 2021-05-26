package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.Select;

public class Iphone {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujithphoton\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class=\"nav-search-field \"]//following-sibling:: input"))
				.sendKeys("iphone");

		driver.findElement(By.id("nav-search-submit-button")).click();

		List<WebElement> ipone = driver.findElements(By.xpath("//div[@class=\"sg-col-inner\"]"));
		
		int size = ipone.size();
		System.out.println(size);
		
		//WebElement sortby = driver.findElement(By.tagName("//select[@name='s']"));
		
//		Select s=new Select(sortby);
//		s.selectByValue("Price: Low to High");
		
//		for (int i = 0; i<ipone.size(); i++) {
//			
//			System.out.println(ipone.get(i).getText());
//			
//			
//			
//		}
		
		for (WebElement x : ipone) {
			
			String text = x.getText();
			//System.out.println(text);
			
			if (text.contains("iphone")) {
				
				System.out.println(x.getText());
					
								
			} else if (text.contains("price")) {
				
				System.out.println(x.getText());
				
			}
			
			int length = text.length();
			System.out.println(length);
			
			int [] arr= new int[length];
			
			Arrays.sort(arr);
			
			
			
			
		
			
			
			
			
}

		
		
}
}