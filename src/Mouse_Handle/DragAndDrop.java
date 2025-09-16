package Mouse_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement accept = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		accept.click();
		
		driver.manage().window().minimize();
		
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//div[@id='acceptDropContainer']"));
		
		WebElement Drag = driver.findElement(By.xpath("//div[@id='acceptable']"));
		
		act.doubleClick(Drag).click().perform();
		
		WebElement Drop = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
		act.dragAndDrop(Drag,Drop).build().perform();
		//
	
		//act.dragAndDrop(Drag, Drop).build().perform();
		
	
		
		Thread.sleep(3000);
		
		//driver.close();
		//act.clickAndHold(Drag).moveToElement(Drop).release().perform();
		
	}

}
