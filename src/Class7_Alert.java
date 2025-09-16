import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7_Alert {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		
		//Frame2
        driver.switchTo().frame("popuppage");
       System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Alert and PopUp']")).getText());
      driver.findElement(By.xpath("//button[normalize-space()='Alert Box']")).click();
    
      Alert alert = driver.switchTo().alert();
       //alert.accept();
    System.out.println(alert.getText());
  

    String Text =  alert.getText();
    if(Text.equals("I am an alert box!")) {
    	
    	System.out.println("Yes correct");
    }
    
    else {
    	System.out.println("this is not correct");
    }
    
    alert.accept(); 
	}

}
