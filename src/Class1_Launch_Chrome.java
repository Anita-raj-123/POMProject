import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_Launch_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
	    System.out.println(driver.getTitle());
	    //driver.quit();
  /* driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
   driver.findElement(By.xpath("//li[@id='Registration Desk']")).click();
	driver.findElement(By.xpath("//input[@id='loginButton']")).click(); */
	    
	    driver.findElement(By.cssSelector("#cantLogin")).click();
	
	}

}
