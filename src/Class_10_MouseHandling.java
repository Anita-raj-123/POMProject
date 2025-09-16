import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_10_MouseHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		
		//Handle Mouse Movement
		
		Actions action = new Actions(driver);
		
		//build and perform is method used to perform the action of mouse hover.
		action.moveToElement(driver.findElement(By.linkText("Self Paced Video Course"))).build().perform();
		
		//click on sub-menu
		
		driver.findElement(By.linkText("Selenium Course Curriculum")).click();
		System.out.println(driver.getTitle());
	}

}
