package mave_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic_mvnclass {
	
	WebDriver driver;
	//ChromeOptions options;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Select s = new Select (driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		s.selectByVisibleText("ESS");
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("asdfgtrews");
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("sderfdsdfd");
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='systemUser_status']")));
		s1.selectByVisibleText("Enabled");
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("123456");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("role_created");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("login done");
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_nationality']")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@id='nationality_name']")).sendKeys("kkkk");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
  }

  @BeforeSuite
  public void beforeSuite() {
	 // options = new ChromeOptions();
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println("app_opened");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
		System.out.println("app_closed");

}
}
