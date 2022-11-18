package cssselector_Locator16_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		//only for ID and Class(#IdValue)=#email
		driver.findElement(By.cssSelector("#email")).sendKeys("piyash.bd@gmail.com");
		
		//For all other attributes ex:Name,Value,type etc we use tagName[AttributeName='AttributeValue']
		
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pari$a23072009");
		
		//Starts with :tagName[attribute^='startValue of attribute']
		driver.findElement(By.cssSelector("button[name^='lo']")).click();
		
		//Ends with:tagName[attribute$='EndValue of attribute']
		driver.findElement(By.cssSelector("a[rel$='nc']")).click();
		
		driver.close();
	}

}
