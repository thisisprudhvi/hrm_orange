package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshoot {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.out.println("lets go");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	
	Thread.sleep(2000);
    TakesScreenshot take = (TakesScreenshot)driver;
    File src = take.getScreenshotAs(OutputType.FILE);
    File dest = new File("D:\\photo.jpg");
    FileUtils.copyFile(src,dest);
    System.out.println("done");
	
	
	
	
	}

}
