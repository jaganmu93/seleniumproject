	package seleniumproject;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;import io.github.bonigarcia.wdm.WebDriverManager;
	//import org.openqa.selenium.firefox.FirefoxDriver;public class Example 
	public class First{
	//public static void main (String[] args) throws InterruptedException {
	@Test
	public void selenium() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\phanikrs\\eclipse-workspace-learning\\New_selenium\\seleniumProject\\Drivers\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\phanikrs\\eclipse-workspace-learning\\New_selenium\\seleniumProject\\Drivers\\geckodriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.name("Submit"));
	login.click();
	Thread.sleep(3000);
	driver.quit();
	}
	}
	//}


	