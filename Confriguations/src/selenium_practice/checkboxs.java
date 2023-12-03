package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxs {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		 Thread.sleep(2000);
		 List<WebElement> checks = driver.findElements(By.id("englishchbx"));
		 int ab = checks.size();
		 System.out.println(ab);
		 for(int i = 0; i<ab; i++) {
			 checks.get(i).click();
		 }
		 System.out.println("clicked");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(400,-300)","");
		
	}

}
