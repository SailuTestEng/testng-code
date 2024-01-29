package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assretion {

	public static void main(String[] args) {

		
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedvalue="Dashboard";
		String actualvalue=driver.findElement(By.xpath("//h1[contains(test(),'Dashboard')]")).getText();
		org.testng.Assert.assertEquals(expectedvalue,actualvalue);
		
		
		
		
		
		
	}

}
