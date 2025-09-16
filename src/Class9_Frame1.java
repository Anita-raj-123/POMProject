import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9_Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		
		//Frame 1
		
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='https://vinothqaacademy.com/alert-and-popup/']"));
		driver.switchTo().frame(Frame1);
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Alert and PopUp']")).getText());
		
		//----------------------------------------------------------------------------------------------
		//driver.switchTo().frame("popuppage");
		WebElement alertbutton = driver.findElement(By.xpath("//button[normalize-space()='Alert Box']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", alertbutton);
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	    Thread.sleep(3000);
	        
        
        //Inner Frame , confirmation alert ok/cancel
        
        WebElement confirmbutton = driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", confirmbutton);
	    Alert alert1 = driver.switchTo().alert();
	    System.out.println(alert1.getText());
	    alert1.accept();
	    System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
	    
	 //   ---------------------------------------------------------------------------------------------------       
	   /* // Inner frame , promt alert
	        WebElement promtbutton = driver.findElement(By.xpath("//button[normalize-space()='Prompt Alert Box']"));
	  		JavascriptExecutor js2 = (JavascriptExecutor)driver;
	  		js2.executeScript("arguments[0].click();",promtbutton);*/
	  		
	  		
	  	
	  driver.switchTo().defaultContent();	 
	  
	  WebElement Frame2 = driver.findElement(By.xpath("//iframe[@src='https://vinothqaacademy.com/demo-site/']"));
		driver.switchTo().frame(Frame2);
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Verification']")).getText());
		
		/*driver.findElement(By.xpath("(//fieldset[@id='item-vfb-2'])"));
		//driver.findElement(By.xpath("(//li[@id='item-vfb-4'])']"));
		driver.findElement(By.xpath("//input[@id='vfb-4']")).click();*/
		
		 WebElement submittbutton = driver.findElement(By.xpath("//input[@id='vfb-4']"));
	  		JavascriptExecutor obj1 = (JavascriptExecutor)driver;
	  		obj1.executeScript("arguments[0].click();",submittbutton);
	  		
	  		System.out.println("Submit button is working fine");
	  		
	  	//Moving first frame from 3 frame	
	  		
	  		driver.switchTo().defaultContent();
	  		WebElement Frame0 = driver.findElement(By.xpath("//iframe[@src='https://vinothqaacademy.com/webtable/']"));
	  		driver.switchTo().frame(Frame0);
	  		
	  		System.out.println("on frame0");
	  
	  		//get alert for add button
	  		//driver.findElement(By.xpath("//button[@id='addBtn']")).click();
	  		
	  		WebElement Addrow = driver.findElement(By.xpath("//button[@id='addBtn']"));
	  		JavascriptExecutor obj2 = (JavascriptExecutor)driver;
	  		obj2.executeScript("arguments[0].click();", Addrow);
	  		
	  	//	driver.switchTo().alert().accept();
	  		
	  		Alert alert11 = driver.switchTo().alert();
	  		
	  		System.out.println(alert11.getText());
	  		
	  		alert.accept();
	  		
	  		System.out.println("Frame 0 successfully  open the add row alert");
	  		
	  		
	  		
	  		
	  		
	
		
		
	}

}
