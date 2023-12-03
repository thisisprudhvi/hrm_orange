package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {
	
	
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.driver.chrome","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://nxtgenaiacademy.com/");
	 
	 Thread.sleep(2000);
	 WebElement demo = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
	 boolean b = demo.isDisplayed();
	 if (b) {
		    System.out.println(b);
		
	}
	 String tet =demo.getText();
	 System.out.println(tet);
	 if (tet.equals("Demo Sites")) {
		 System.out.println("yes");
	 } else {
			System.out.println("no");
			
		}	
	 Thread.sleep(3000);
	 WebElement autom = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a"));
	 Thread.sleep(3000);
	 WebElement alerts = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[4]/a"));
	 Thread.sleep(2000);
	 // mouse action sysntax
	 Actions mouse = new Actions(driver);
	 mouse
	 .moveToElement(demo).moveToElement(autom).moveToElement(alerts).click().perform();
	 
	 
	 
	 
 }
	 
	 
}
