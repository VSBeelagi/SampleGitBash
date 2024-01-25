package practice_package;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon_DataproviderTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		// launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the appln
		driver.navigate().to("https://www.flipkart.com/");
		
		//wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
		Thread.sleep(2000);
		
		
		System.out.println(driver.getTitle());
//		Set<String> wid = driver.getWindowHandles();
//		for (String str : wid) 
//		{
//			String title = driver.getTitle();
//			if(title.equalsIgnoreCase("Mobile Phones Online at Best Prices in India"))
//			{
//				driver.switchTo().window(str);
//				break;
//			}
//		}
		
	//	WebElement	price = driver.findElement(By.xpath("//h2[text()='Under  ₹10,000']/ancestor::div[@class='Nyt1vx']/descendant::span[text()='VIEW ALL']"));
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Under  ₹10,000']/../following-sibling::div//span"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		int y = price.getLocation().getY();
//		js.executeScript("window.scrollBy(0,"+y+")", price);
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		
		Thread.sleep(1000);
//	
//		List<WebElement> allMobiles = driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']/descendant::div[@class='_4rR01T']"));
//	
//		
//		for (WebElement eachMob:allMobiles)
//		{
//			String MobName = eachMob.getText();
//			System.out.println(MobName);
//		}
//		//	close browser
		driver.close();
	}

}








