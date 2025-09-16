package Object_Repository;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
	
		
		//Sarita@123   Sarita@321  101791476991
		//Switch to Frame
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='popuppage']"));
		driver.switchTo().frame(iframe);
		
		//Flash on Element
		WebElement alert_js = driver.findElement(By.xpath("//button[normalize-space()='Alert Box']"));
		flash(alert_js,driver);
		
	    //getAlert pop-up on screen
		getAlert(driver,"This is alert on clicking alert button");
		Alert alert = driver.switchTo().alert();
		
		//get the text of alert pop_up
		System.out.println(alert.getText());
		
		//accept the alert 
		alert.accept();
		
		Thread.sleep(3000);
		
	    // draw the boarder on the element
		drawboarder(alert_js,driver);
				
		//Take the screenshot of the browser
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\anshu\\eclipse-workspace\\Class1\\screenshot\\image4.png"));
		
		Thread.sleep(3000);
	
		//Refresh the browser
		reFreshBrowser(driver);
		System.out.println("Browser refreshed");
		
		//click on element 
		clickElement(alert_js,driver);   
		System.out.println("alert box clicking is working fine and alert pop_up is showing");
		
		//Get Title of browser
		System.out.println("*************************************************************************************");
		System.out.println(getTitleByJse(driver));
		
		//Get the Inner text 
		System.out.println("*************************************************************************************");
		System.out.println(innerTextByJse(driver));
		
		//scroll page
		Thread.sleep(3000);
		scrollPageByJse(driver);
		
		//Scroll down the get the element
		WebElement bottomText = driver.findElement(By.xpath("//div[@class='copyright_text']"));
		scrollintoview(bottomText,driver);
		
		
	}

	//Step 1 : GetAlert by use JavaScriptExecutor
	public static void getAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	//Step 2 : DrawBoarder on alert box by use JavaScriptExecutor
	
	public  static void drawboarder(WebElement element,WebDriver driver) {
	JavascriptExecutor js = ( (JavascriptExecutor) driver);
	js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

    //Step 3 : Refresh browser by use JavaScriptExecutor
	public  static void reFreshBrowser(WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
		
	//Step 4 : CLick on particular element by use JavaScriptExecutor
		public  static void clickElement(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()",element);
	}
	
	//Step 5 : GetTitle by use JavaScriptExecutor

	public  static String getTitleByJse(WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	
	//Step 6 : GetInnerText by use JavaScriptExecutor
	
	public  static String innerTextByJse(WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		String innerTextPage = js.executeScript("return document.documentElement.innerText;").toString();
		return innerTextPage;
		
	}
	
	//Step 7 : Scroll the browser page by use JavaScriptExecutor
	public  static void scrollPageByJse(WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//Step 8 : Get the element on scrolldown page by use JavaScriptExecutor
	public  static void scrollintoview(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ( (JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	//Step 9 : Get Flash on element by use JavaScriptExecutor
	public  static void flash(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i =0 ; i<200;i++) {
			
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
			
	}
		
		public static void changeColor(String color,WebElement element,WebDriver driver) {
			JavascriptExecutor js = ( (JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor ='"+color+"'",element);
			
			try {
				Thread.sleep(20);
			}
					catch(InterruptedException e) {
					}
			}
}
