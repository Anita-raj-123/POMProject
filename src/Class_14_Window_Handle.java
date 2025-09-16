import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_14_Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	
		Set <String> obj = driver.getWindowHandles();
		
		Iterator <String> it = obj.iterator();
		
		String parent_window = it.next();
		Thread.sleep(3000);
		
		System.out.println(parent_window);
		
		String CHild_window = it.next();
		
		System.out.println(CHild_window);
		
		driver.switchTo().window(CHild_window);
		Thread.sleep(3000);
		
	
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		//driver.close();
	}

}
