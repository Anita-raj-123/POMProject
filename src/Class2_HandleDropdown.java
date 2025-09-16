import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2_HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		   driver.findElement(By.xpath("//li[@id='Registration Desk']")).click();
			driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		WebElement	Opendropdown = driver.findElement(By.xpath("//span[@id='selected-location']"));
		Opendropdown.click();
		WebElement ClickOnOption = driver.findElement(By.xpath("//div[@id='session-location']"));
		ClickOnOption.click();
		
		WebElement ClickOnOption1 = driver.findElement(By.xpath("//li[normalize-space()='Isolation Ward']"));
		ClickOnOption1.click();
		
	}

}
