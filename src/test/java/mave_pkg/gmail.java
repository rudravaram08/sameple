package mave_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail {
	
	@Test
	public void gc() {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	driver.findElement(By.xpath("mailid")).sendKeys("pramod9408");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}
