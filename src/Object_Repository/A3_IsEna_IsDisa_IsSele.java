package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_IsEna_IsDisa_IsSele {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://vinothqaacademy.com/iframe/");

		driver.manage().window().maximize();

		WebElement i_frame = driver.findElement(By.xpath("//iframe[@name='employeetable']"));
		
		//Handle the dynamic webtable>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..

		driver.switchTo().frame(i_frame);
        WebElement Text = driver.findElement(By.xpath("//h2[normalize-space()='Project Details']"));
		System.out.println(Text.isDisplayed());

		// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]
		// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[2]/td[1]
		// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[3]/td[1]
		// driver.findElement(By.xpath("//div[@class='elementor-widget-container']"));
		driver.findElement(By.xpath("//table[@id='myTable']"));

		String before_xpath = "//body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[";
		String After_xpath = "]/td[2]";

		Thread.sleep(2000);

		// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/input[1]

		for (int row = 1; row <= 10; row++) {
			String name = driver.findElement(By.xpath(before_xpath + row + After_xpath)).getText();
			System.out.println(name);

			if (name.equals("John Doe")) {
				// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]

				// body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/input[1]
				Thread.sleep(3000);
				WebElement chk = driver.findElement(By.xpath(
						"//body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr["
								+ row + "]/td[1]/input[1]"));

				checkelement2(chk, driver);
			}
			break;

		}

		
		//Handle submit button visible >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		driver.switchTo().defaultContent();
		
		System.out.println("Frame Switched successfully");
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@name='registeruser']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//fieldset[@id='item-vfb-2']"));
	    boolean sb= driver.findElement(By.xpath("//input[@id='vfb-4']")).isEnabled();
		System.out.println(sb + "Submit button is enabled");
		
		
		 boolean sb1= driver.findElement(By.xpath("//input[@id='vfb-4']")).isDisplayed();
			System.out.println(sb1 + "Submit button is Disabled");
			
			driver.findElement(By.xpath("//fieldset[@id='item-vfb-2']"));
		    WebElement sub_button2 = driver.findElement(By.xpath("//input[@id='vfb-4']"));
			submitbutton_frame2(sub_button2,driver);
			System.out.println("Submit button clickable");
			
			//tbody/tr[1]/td[1]
		
			
		//*************************************************************************************************************
			
		
	}
	public static void checkelement2(WebElement checkbox, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].checked = true;", checkbox);
	}  

	
	public static void submitbutton_frame2(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()",element);
	}
}
