package amazon.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("rachanaprakash2001@gmail.com");
		Thread.sleep(3);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password@123456");
		driver.findElement(By.id("signInSubmit")).click();	
		Thread.sleep(3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();	
		Thread.sleep(3);
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		driver.close();

		}
		
}
