package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(4000);
		//open a parent window
		String pwindow = driver.getWindowHandle();
		WebElement bu = driver.findElement(By.cssSelector("#openwindow"));
		boolean b = bu.isDisplayed();
		if(b) {
			System.out.println(b);
		}
		String tet = bu.getText();
		System.out.println(tet);
		if(tet.equals(tet)) {
			System.out.println("the window is clicked");
		}else {
			System.out.println("the window is not clicked");
		}
		
		bu.click();
		Thread.sleep(4000);
		Set<String> window = driver.getWindowHandles();
		// open a child window
		for(String cwindow:window) {
			if(!cwindow.equals(pwindow)) {
				driver.switchTo().window(cwindow);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				WebElement test = driver.findElement(By.xpath("//*[text()='Access all our Courses']"));
				String tee = test.getText();
				System.out.println(tee);
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(pwindow);
		WebElement aa = driver.findElement(By.xpath("/html/body/h1"));
		String text = aa.getText();
		System.out.println(text);
	}
  
}
