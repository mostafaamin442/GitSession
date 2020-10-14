package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mostafa\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
	}

}
	