package practice_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Goibibo {

	public static void main(String[] args) {
 
		
		String MonthAndYear = "October 2023";
		int date = 26;
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		String actual = "//div[.='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextArrow = "//span[@aria-label='Next Month']";
		
			for(;;)
			{
				try{
			
				driver.findElement(By.xpath(actual)).click();
				break;
			}
		
		catch (Exception e) {
			driver.findElement(By.xpath(nextArrow)).click();
		}
				
			}
			
			driver.findElement(By.xpath("//span[.='Done']")).click();	
			
		
		
		
	
		
	}	
}
