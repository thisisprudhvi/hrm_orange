package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys("Friends");
		WebElement send = driver.findElement(By.id("autocomplete"));
		boolean b = send.isDisplayed();
		if(b) {
			System.out.println(b);
		}
		Thread.sleep(2000);
		send.click();
		send.clear();
		send.sendKeys("2564");
		System.out.println(send.getAttribute("value"));
		System.out.println(send.getAttribute("type"));		
		
	}

}
