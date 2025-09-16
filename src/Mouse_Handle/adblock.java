package Mouse_Handle;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class adblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeOptions opt = new ChromeOptions();
      opt.addExtensions(new File("C:\\Users\\anshu\\Downloads\\adblock.crx"));
      
      System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Open url
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//CLick on accept tab
		WebElement accept = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		accept.click();
		
		//Click on drag button
		WebElement Drag = driver.findElement(By.xpath("//div[@id='acceptable']"));
		act.doubleClick(Drag).click().perform();
		
		//drop case
		WebElement Drop = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
		act.dragAndDrop(Drag,Drop).build().perform();
		
		driver.close();
		
		
	}

}
