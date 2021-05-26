package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\BRINDHA\\Desktop\\project day 3\\task 3\\Finalinterview\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// launch browser
		driver.get("http://www.greenstechnologys.com/");
		// get title
		String y = driver.getTitle();
		System.out.println(y);
		// current url
		String y1 = driver.getCurrentUrl();
		System.out.println(y1);

		// close
		driver.close();

	}

}
