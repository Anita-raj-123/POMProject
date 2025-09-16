package Mouse_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		WebElement options = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		Actions act = new Actions(driver);
		act.contextClick(options).click().build().perform();
		System.out.println("This is correct");
	}

}
