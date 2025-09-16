package Object_Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class A1_object_Class {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		

		Properties prop = new Properties();
		FileInputStream IP = new FileInputStream("C:\\Users\\anshu\\eclipse-workspace\\Class1\\src\\Object_Repository\\Object.Properties");
		prop.load(IP);
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("URL"));
		
		System.out.println("********************");
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browser = prop.getProperty("Browser");
		System.out.println(browser);
		
		
		if(browser.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
			driver = new ChromeDriver();
			//driver = new ChromeDriver();
		}
		
		else {
			
			System.out.println("Don't run the url");
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys("admin");
		driver.findElement(By.xpath(prop.getProperty("pasword_xpath"))).sendKeys("Admin123");
		driver.findElement(By.xpath(prop.getProperty("Location_Path"))).click();
		driver.findElement(By.xpath(prop.getProperty("Login_xpath"))).click();
		
		System.out.println("HTMLUNITDRIVER IS WORKING FINE");
	}

	
}
