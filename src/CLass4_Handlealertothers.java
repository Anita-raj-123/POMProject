import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLass4_Handlealertothers {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		Threadsleep(5000);
		//driver.switchTo().alert().accept();
		
		Alert alert = driver.switchTo().alert();
	
	 
	System.out.println(alert.getText());
	
	String Text = alert.getText();
    
	   if (Text.equals("Please contact your System Administrator.")) {
		   
		   System.out.println("Yes, This is correct text message on alert Pop_up");
		  	   
	   }
	   
	   else {
		   System.out.println("NO,This is no correct text message on alert Pop_up");
	   }
	
	 alert.dismiss();
	 
	
		
	
		
		
		
	}

	private static void Threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
