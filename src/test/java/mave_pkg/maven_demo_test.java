package mave_pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class maven_demo_test {
	
	int a =10;
	int b=20;
	@Test
	public void add() {
	
		int c=a+b;
		System.out.println(c);
			
	}
	@Test
	public void sub() {
		int d=a-b;
		System.out.println(d);
	}
	@Test
	public void mul() {
		int e=a*b;
		System.out.println(e);
	}
	@Test
	public void div() {
		int f=a/b;
		System.out.println(f);
		}
}
