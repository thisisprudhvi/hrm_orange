package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowselaunch {
	public static void main(String[] args) {
		System.out.println("hello");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		System.out.println("opened");
		
	}

}
