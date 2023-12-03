package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_valwithchecks {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0,400)", "");
		
		List<WebElement> ch = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		int si = ch.size();
		System.out.println(si);
		for(int i=0; i<si; i++) {
			ch.get(i).click();
		}
// identify the table
		WebElement table = driver.findElement(By.id("countries"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
// using for each
		for(WebElement row: rows) {
// verfiy the cells
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell: cells) {
				String text = cell.getText();
				System.out.println(text);
				System.out.println(cell.getText());
			}
		}	
		
	}

}
