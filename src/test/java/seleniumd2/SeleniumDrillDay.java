package seleniumd2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDrillDay {
	public static void main(String[]args) throws InterruptedException {
	//System.setProperty("webdriver.firefox.driver","C:\\Users\\jaganmu\\eclipse-workspace-learning\\SeleniumProject\\drivers\\geckodriver.exe");
	WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	Thread.sleep(3000);
	
	WebElement logo = driver.findElement(By.className("app_logo"));
	if(logo.isDisplayed()) {
		System.out.println("The logo is verified");
	}
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.className("shopping_cart_link")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	
	WebElement firstName = driver.findElement(By.id("first-name"));
	
	WebElement lastName = driver.findElement(By.id("last-name"));
	
	WebElement pinCode = driver.findElement(By.id("postal-code"));
	
	firstName.sendKeys("Jagan");
	
	lastName.sendKeys("M");
	
	pinCode.sendKeys("624301");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
	
	driver.findElement(By.id("continue")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("finish")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("back-to-products")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(3000);
	
	}
}