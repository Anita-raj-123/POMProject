package Mouse_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://docs.telerik.com/teststudio/automated-tests/recording/recording-dialogs");
		driver.manage().window().maximize();
		
		
		//A. MouseHover
		//Method - act.movetoElement(element path)
		
		
		WebElement Solution_Tab = driver.findElement(By.xpath("//button[normalize-space()='Solutions']"));
		WebElement UI_Testing = driver.findElement(By.xpath("//a[normalize-space()='Responsive UI Testing']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Solution_Tab).moveToElement(UI_Testing).click().build().perform();
		
		//B. Right Click
		
		
		
		
		
		
	}

}
