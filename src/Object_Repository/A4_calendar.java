package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_calendar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		WebElement frame_new = driver.findElement(By.xpath("//iframe[@name='registeruser']"));
		driver.switchTo().frame(frame_new);

		// Handle the Calender

		String Calendar_Date = "09/01/2025";
		String DateArr[] = Calendar_Date.split("/");
		String day = DateArr[0];
		String month = DateArr[1];
		String year = DateArr[2];

		WebElement Date_picup_Field = driver.findElement(By.xpath("//fieldset[@id='item-vfb-1']"));

		scroll(driver);

		WebElement clic = driver.findElement(By.xpath("//input[@id='vfb-18']"));
		clic.sendKeys(" ");

		// tbody/tr[2]/td[1]

//		// *************************************************************************************************************

		String B_xpath = "//tbody/tr[";
		String A_xpath = "]/td[";
		final int totalweekdays = 7;
		boolean flag = false;
		String dayVal = null;

		for (int row1 = 2; row1 <= 6; row1++) {
			for (int col = 1; col <= totalweekdays; col++) {

				try {
					dayVal = driver.findElement(By.xpath(B_xpath + row1 + A_xpath + col + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("please enter correct value");
					flag = false;
					break;
				}

				System.out.println(dayVal);

				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(B_xpath + row1 + A_xpath + col + "]")).click();
					flag = true;

				}

			}

			if (flag) {
				break;
			}
		}

	}

	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
