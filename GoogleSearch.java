package SeleniumSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(2000);
			
			driver.findElement(By.name("q")).sendKeys("java");
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		List <WebElement> list=driver.findElements(By.xpath("//ul[role='listbox']//li/descendant::div[@class='sbl1]"));
		
        System.out.println(list.size());
	}

}
