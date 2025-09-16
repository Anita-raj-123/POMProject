import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class8_CofirmationALert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		
		//Frame 2
		
		driver.switchTo().frame("popuppage");
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Alert and PopUp']")).getText());
	  
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']")).click();
	  	    
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.dismiss();
        System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
       
        driver.switchTo().defaultContent();
        
        driver.get("https://vinothqaacademy.com/iframe/");
       
        
        //Frame 3 Switching to frame 3 from frame 2
        driver.switchTo().frame("registeruser");
        
        
        driver.findElement(By.xpath("//fieldset[@id='item-vfb-2']"));
        driver.findElement(By.xpath("//input[@id='vfb-4']")).click();
        
        
	    
 
	}

}
