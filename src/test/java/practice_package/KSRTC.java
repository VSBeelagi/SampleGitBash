package practice_package;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {

	public static void main(String[] args) throws AWTException, Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.ksrtc.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("bengaluru");
		WebElement frm = driver.findElement(By.xpath("//a[text()='BENGALURU']"));
	frm.click();
	driver.findElement(By.id("toPlaceName")).sendKeys("hubli");
	WebElement dst = driver.findElement(By.xpath("//a[text()='HUBLI']"));
	dst.click();
	}
}
