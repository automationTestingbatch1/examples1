package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		//m1();
	//	m2();
		m3();
	}

	public static void m1() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Document\\Examp_1\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// two types of waits-->selenium webdriver waits-->implicit wait and explicit
		// wait
		// implicit wait-->default wait for every object of web page
		// explicit wait-->conditional based wait
		// what is difference between java(Thread.sleep(5000)) wait and selenium
		// webdriver waits
		// java wait will wait un tile the complete time , but selenium webdriver wait
		// untile the object visible

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("file:///F:/Automation_Document/HTML%20And%20CSS%20Programs/index.html");

		//if id-->#
		WebElement enterUserName = driver.findElement(By.cssSelector("#uid"));
		enterUserName.sendKeys("Hello");
		
		//if id-->.
		WebElement enterPassword = driver.findElement(By.cssSelector(".pclass"));
		enterPassword.sendKeys("Hello123");
		enterPassword.clear();
		
		//for any attribute-->tagname[attribute='attribute value']
		WebElement clickLogin = driver.findElement(By.cssSelector("input[type='button']"));
		clickLogin.click();
		

	}
	
	public static void m2() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Document\\Examp_1\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// two types of waits-->selenium webdriver waits-->implicit wait and explicit
		// wait
		// implicit wait-->default wait for every object of web page
		// explicit wait-->conditional based wait
		// what is difference between java(Thread.sleep(5000)) wait and selenium
		// webdriver waits
		// java wait will wait un tile the complete time , but selenium webdriver wait
		// untile the object visible

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("file:///F:/Automation_Document/HTML%20And%20CSS%20Programs/index.html");

		WebElement enterUserName = driver.findElement(By.id("uid"));
		enterUserName.sendKeys("Hello");
		
		WebElement enterPassword = driver.findElement(By.className("pclass"));
		enterPassword.sendKeys("Hello123");
		enterPassword.clear();
		
		WebElement clickLogin = driver.findElement(By.name("lname"));
		clickLogin.click();
		

	}
	
	public static void m3() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Document\\Examp_1\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// two types of waits-->selenium webdriver waits-->implicit wait and explicit
		// wait
		// implicit wait-->default wait for every object of web page
		// explicit wait-->conditional based wait
		// what is difference between java(Thread.sleep(5000)) wait and selenium
		// webdriver waits
		// java wait will wait un tile the complete time , but selenium webdriver wait
		// untile the object visible

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("file:///F:/Automation_Document/HTML%20And%20CSS%20Programs/index.html");

		//link text
		/*WebElement clickHelloSelenium=driver.findElement(By.linkText("Hello Selenium"));
		clickHelloSelenium.click();*/
		
		//partial link text
				/*WebElement clickHelloSelenium=driver.findElement(By.partialLinkText("Hello"));
				clickHelloSelenium.click();*/
		
		//xpath-->//tagname[@attribute='']
		//xpath-->//a[@href='http://www.seleniumhq.org']
		
		//css-->a[href='http://www.seleniumhq.org']
		/*WebElement clickHelloSelenium=driver.findElement(By.xpath("//a[@href='http://www.seleniumhq.org']"));
		clickHelloSelenium.click();*/
		
		

		//tagname
				WebElement clickHelloSelenium=driver.findElement(By.tagName("a"));
				clickHelloSelenium.click();
		
		
		
				
		
		
		

	}
	
}
