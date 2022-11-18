package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_TagName13 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    
	    //Find how many a tag in this page
	    List<WebElement> linkList = driver.findElements(By.tagName("a"));
	    System.out.println(linkList.size());
	    
	    List<WebElement> elements = driver.findElements(By.tagName("div"));
	    int total = elements.size();
	    
	    List<WebElement> elements2 = driver.findElements(By.tagName("ul"));
	    int total2 = elements2.size();
	    
	    List<WebElement> elements3 = driver.findElements(By.tagName("li"));
	    
	    int total3 = elements3.size();
	    
	    System.out.println(total);
	    System.out.println("Total webElements start with tagName:" + total);
	    System.out.println("Total webElements start with tagName2:" + total2);
	    System.out.println("Total webElements start with tagName3:" + total3);
	    
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
