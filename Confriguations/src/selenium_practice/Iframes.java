package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement frame0 = driver.findElement(By.name("mytext1"));
		frame0.sendKeys("Prudhvi");
		driver.switchTo().defaultContent();
	// frame2
		driver.switchTo().frame(1);
		WebElement frame1 = driver.findElement(By.name("mytext2"));
		frame1.sendKeys("subbu");
		driver.switchTo().defaultContent();
	//  frame3
		driver.switchTo().frame(2);
		WebElement frame2 = driver.findElement(By.name("mytext3"));
		frame2.sendKeys("manoj");
		driver.switchTo().defaultContent();
	// frame4 
		driver.switchTo().frame(3);
		WebElement frame3 = driver.findElement(By.name("mytext4"));
		frame3.sendKeys("phani");
		driver.switchTo().defaultContent();
		System.out.println("done");
				
	}

}

