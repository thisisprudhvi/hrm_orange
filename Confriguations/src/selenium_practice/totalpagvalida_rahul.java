package selenium_practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class totalpagvalida_rahul {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	// Radio button
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
	
	// sendkeys
	driver.findElement(By.id("autocomplete"));
	WebElement send = driver.findElement(By.id("autocomplete"));
	boolean b = send.isDisplayed();
	if(b) {
		System.out.println(b);
	}
	Thread.sleep(2000);
	send.click();
	send.sendKeys("Friends");
	System.out.println(send.getAttribute("value"));
	System.out.println(send.getAttribute("type"));		
	
	// dropdown
	WebElement drop = driver.findElement(By.id("dropdown-class-example"));
	drop.click();
	Select drop1 = new Select(drop);
	drop1.selectByValue("option2");
	
	//checkbox
	
	Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,400)","");
	
	List<WebElement> checks = driver.findElements(By.name("checkBoxOption1"));
	int pru = checks.size();
	System.out.println(pru);
	for(int i=0; i<pru; i++) {
		checks.get(i).click();
	}
	System.out.println("the boxs are clicked");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,400)","");

	
	// open window 
	String pwindow = driver.getWindowHandle();
	WebElement bu = driver.findElement(By.cssSelector("#openwindow"));
	boolean o = bu.isDisplayed();
	if(o) {
		System.out.println(o);
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
	
	// open tab
	Thread.sleep(2000);
	String p1window = driver.getWindowHandle();
	WebElement button = driver.findElement(By.id("opentab"));
	boolean l = button.isDisplayed();
	if(l) {
		System.out.println(l);
	}
	String tt = button.getText();
	System.out.println(tt);
	if(tt.equals(tt)) {
		System.out.println("the window tab is clicked");
	}else {
		System.out.println("the window tab is not clicked");
	}
	button.click();
	Thread.sleep(4000);
	Set<String> tab = driver.getWindowHandles();
	for(String ctab:tab) {
		if(!ctab.equals(pwindow)) {
			driver.switchTo().window(ctab);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement test2 = driver.findElement(By.cssSelector("#header-part > div.header-logo-support.pt-30.pb-30 > div > div > div.col-lg-8.col-md-8 > div > div.button.float-left > a"));
			String tee = test2.getText();
			System.out.println(tee);
			Thread.sleep(4000);
			driver.close();
		}
	}
	driver.switchTo().window(p1window);
	WebElement bb = driver.findElement(By.xpath("/html/body/h1"));
	String text3 = aa.getText();
	System.out.println(text3);
	
	// sendkeys
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"name\"]"));
	WebElement send0 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
	boolean p = send0.isDisplayed();
	if(p) {
		System.out.println(p);
	}
	Thread.sleep(2000);
	send0.click();
	send0.sendKeys("Prudhvi.G");
	System.out.println(send0.getAttribute("value"));
	System.out.println(send0.getAttribute("type"));	
	
	// table valiadation
	Thread.sleep(3000);
	WebElement table = driver.findElement(By.id("product"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	// using for each 
	for(WebElement row:rows) {
		List<WebElement> cells = row.findElements(By.tagName("td"));
		for(WebElement cell:cells) {
			String text0 = cell.getText();
		System.out.println(text0);	
		System.out.println(cell.getText());
		}
	}
	
	// textvaliadtion
	Thread.sleep(2000);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> lists = driver.findElements(By.xpath("/html/body"));
	for(WebElement list:lists) {
		String text1 = list.getText();
		System.out.println(text1);
	}   
	System.out.println("ok");
	
}
}
