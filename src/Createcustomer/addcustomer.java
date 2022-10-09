package Createcustomer;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class addcustomer {
	
	public static WebDriver d ;
	@BeforeMethod
	public void lanchbrowser() {
		d = new FirefoxDriver();
		d.get("https://demo.guru99.com/v4/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
	}
	@Test(description="gettitle testcase pass")
	public void gettitle() {
		String exp_title="Guru99 Bank\n"  ;
		String act_title=d.getTitle();
		System.out.println(exp_title);
		if (exp_title.equals(exp_title)) {
			
			System.out.println("Guru99 Bank\\n");
		}
		else	{
			System.out.println("test case fail");
		}

	}
	
	@Test(description="login Test")
	public void login() {
		d.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr444825");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("dubajyj");
		d.findElement(By.xpath("//input[@name='btnLogin']")).click();

	//}
	//@Test(description="Newcustomer")
	//public void newcustomer() {
		
		d.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("subbaiah");
	
		d.findElement(By.xpath("//input[@name='rad1']")).click();
		d.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("10-6-2009");
		//d.findElement(By.)
		d.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("vankamarricolani,sakn mandal");
		d.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
		d.findElement(By.xpath("//input[@name='state']")).sendKeys("karnataka");
		d.findElement(By.xpath("//input[@name='pinno']")).sendKeys("93451");
		d.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9876543210");
		d.findElement(By.xpath("//input[@name='emailid']")).sendKeys("subbaiah555@gmail.com");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("87654321901");
		d.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
	}

}
