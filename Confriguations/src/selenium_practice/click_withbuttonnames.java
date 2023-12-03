package selenium_practice;

import java.awt.Button;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_withbuttonnames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(2000);
		// type one
	//	List<WebElement> button = driver.findElements(By.xpath("//*[@id=\"button1\"]"));
	//	int size = button.size();
	//	System.out.println(size);
	//	for(int i=0; i<size; i++) {
		//	button.get(0).click();
		//}
		
		// type two
		String text = new String();
		List<WebElement> button = driver.findElements(By.xpath("//*[@id=\"button1\"]"));
		int size = button.size();
		System.out.println(size);
		for(int i=0; i<size; i++) {
			String text1 = button.get(i).getText();
			System.out.println(text1);
			String buttonName = "New Message Window";
			if(text1.equals(buttonName)){
				button.get(i).click();
				text = text1.toString();
				System.out.println("button clicked as...."+text);
			}
			
		}
		
	}

}
