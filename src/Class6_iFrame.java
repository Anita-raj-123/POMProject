import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6_iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();

		
		/*-----------------------------------------------------------------------------------------------------
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
		//Get The frame 1
	
		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			
		driver.switchTo().frame(Frame1);
		
		System.out.println(driver.findElement(By.xpath("//h5[normalize-space()='Nested iFrames']")).getText());
		
		//Swtich to from  1 to inner frame by using defaultcontent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anita Raj");
		driver.switchTo().defaultContent();
		
		
		
		--------------------------------------------------------------------------------------------------------*/
		
		
		/*--------------------------------------------------------------------------------------------------------------------------------
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		//System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		String Text =  driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		if(Text.equals("This is a sample page")) {
			System.out.println("Yes, This is correct");
		}
		
		else {
			System.out.println("No, This is not correct");
			
		}
		-----------------------------------------------------------------------------------------------------------*/
	} 

}
