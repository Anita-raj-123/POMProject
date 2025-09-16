import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_12_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\anshu\\\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		
		//screenshot method
		/* TakesScreenshot Ts = (TakesScreenshot) driver;
		File src = Ts.getScreenshotAs(OutputType.FILE);
		File Target = new File("C:\\Users\\anshu\\eclipse-workspace\\Class1\\screenshot\\Image1.png");
		FileUtils.copyFile(src,Target);
		*/
		
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:\\Users\\anshu\\eclipse-workspace\\Class1\\screenshot\\Image2.png"));
		driver.close();
	}

}
