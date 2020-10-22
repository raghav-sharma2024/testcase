package testproj;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
		public WebDriver driver;
		
	
		@BeforeClass
		private void launchBrowser() {
			 	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\eclipse-workspace\\ProjectClass\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		}

		@AfterClass
			private void quitebrowser() {
				driver.close();
			}
		
//		@BeforeMethod
//		private void starttime() {
//			Date d=new Date();
//			System.out.println(d);
//		}
//		
//		@AfterMethod
//		private void endtime() {
//			Date d= new Date();
//			System.out.println(d);
//		}
//		
		@Test
		
		private void product() {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			driver.findElement(By.xpath("(//input[@type= \"submit\"])[1]")).click();
		}
		
		@Test
		private void totalno() throws InterruptedException {
		List<WebElement> totalphone = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		System.out.println("Total number of phones  " +  totalphone.size());
		Thread.sleep(3000);
		}
		
		@Test
		
		private void pricesort() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@id=\"low-price\"]")).sendKeys("50000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[@class=\"a-button-inner\"])[2]")).click();
			
		}
		
		@Test
		private void topmobprice() {
			WebElement detailprice = driver.findElement(By.xpath("//span[contains(text(),\"Apple iPhone\")]"));
			detailprice.getAttribute("value");
			
			
		}
		
}
