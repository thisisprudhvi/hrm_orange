package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_arrays {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		
		Thread.sleep(2000);
		WebElement send = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		String[] values = {"Manoj","Subbu","Prudhvi","2000"};
		for(String value:values) {
			
			send.clear();
			send.sendKeys(value);
			Thread.sleep(2000);
			System.out.println("okok");
		}
}
}