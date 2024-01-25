package Kayak;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListPriceBelow20K_Flights {

	public static void main(String[] args) throws Throwable {
		

	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.kayak.co.in/");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@aria-label='Flight origin input']")).sendKeys("Bengaluru");
	
	driver.findElement(By.xpath("//input[@aria-label='Flight destination input']")).sendKeys("Delhi");
	driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
	
	Thread.sleep(2000);
	driver.close();
	}

}
