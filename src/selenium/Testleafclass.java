package selenium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleafclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BRINDHA\\sujithphoton\\task 3\\Finalinterview\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();

		List<WebElement> header = driver.findElements(By.tagName("th"));

		System.out.println(header.size());

		List<WebElement> rows = driver.findElements(By.tagName("tr"));

		System.out.println(rows.size());

		WebElement column = driver
				.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following-sibling::td[1]"));
		System.out.println(column.getText());

		List<Integer> li = new LinkedList<Integer>();

		List<WebElement> data = driver.findElements(By.xpath("//td[2]"));

		for (WebElement x : data) {

			String txt = x.getText().replace("%", "");

			li.add(Integer.parseInt(txt));

		}

		Integer max = Collections.min(li);

		String value = Integer.toString(max);
		

		String xpath = "//td[text()='" + value + "%']//following-sibling::td//input";

		driver.findElement(By.xpath(xpath)).click();

	}

}
