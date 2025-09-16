import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_13_Link_FInd {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		
		//Task 1 : Get the total  counts of link on the webpage
          
	List <WebElement> Linklist = driver.findElements(By.tagName("a"));
	
	System.out.println(Linklist.size());
	
	
	//Task 2 : Get the Text of each link on the webpage
	for(int i=0;i<Linklist.size(); i++) {
		
	String liniText = Linklist.get(i).getText();
	
	System.out.println(liniText);
	}
	
	driver.close();
	}

}
