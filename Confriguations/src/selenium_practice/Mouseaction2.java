package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2 {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.driver.chrome","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("https://nxtgenaiacademy.com/");

     Thread.sleep(2000);
     
     // mouse action sysntax
     Actions mouse = new Actions(driver);
     mouse
     .moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]")))
     .moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a")))
     .moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[4]/a")))
     .click()
     .perform();
     System.out.println("okok");
     
     
     
     
     
}

}
