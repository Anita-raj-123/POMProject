import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
	   // System.out.println(driver.getTitle());
	    
	    driver.findElement(By.xpath("//a[@id='cantLogin']")).click();
	    Threadsleep(5000);
	// System.out.println(driver.findElement(By.xpath("//p[@class='dialog-instructions']")).getText());
	  
	 String Text = driver.findElement(By.xpath("//p[@class='dialog-instructions']")).getText();
	        
	   if (Text.equals("Please contact your System Administrator.")) {
		   
		   System.out.println("Yes, This is correct text message on alert Pop_up");
		  	   
	   }
	   
	   else {
		   System.out.println("NO,This is no correct text message on alert Pop_up");
	   }
	  /*   Alert alert = driver.switchTo().alert();
	    alert.accept();*/
	    
	   // driver.switchTo().alert().dismiss();
	    
	    WebElement openalert = driver.findElement(By.xpath("//button[normalize-space()='Okay']"));
		   openalert.click();
		   
		  // System.out.println(openalert.getText());
		    
	   
	  
	//   driver.findElement(By.xpath("//p[@class='dialog-instructions']")).getText();
	
	  /*WebElement openalert = driver.findElement(By.xpath("//button[normalize-space()='Okay']"));
	   openalert.click();*/
	   
	}

	private static void Threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
