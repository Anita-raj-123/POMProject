import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\anshu\\Downloads.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/iframe");
		driver.manage().window().maximize();

	}

}
