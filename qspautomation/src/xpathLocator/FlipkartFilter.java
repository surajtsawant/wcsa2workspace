package xpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilter {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='HP' and @class='_3879cV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();
		Thread.sleep(2000);
		String priceOfTheFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println("price of the first suggestion "+priceOfTheFirstSuggestion);
	
	}

}
