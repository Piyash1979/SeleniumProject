package aUI_Concept12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//a[text()='Demos']").click();
		
		driver.findElementByXPath("//a[text()='Selectable']").click();		

		
		driver.switchTo().frame(0);
		

		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		//Thread.sleep(3000);

		WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
		//Thread.sleep(3000);

		WebElement item3=driver.findElementByXPath("//li[text()='Item 3']");
		//Thread.sleep(3000);

		WebElement item4 =driver.findElementByXPath("//li[text()='Item 4']");
		//Thread.sleep(3000);

		WebElement item5=driver.findElementByXPath("//li[text()='Item 5']");
		//Thread.sleep(3000);

		WebElement item6 =driver.findElementByXPath("//li[text()='Item 6']");
		//WebElement item7 =driver.findElementByXPath("//li[text()='Item 7']");
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).click(item5).click(item6).release().perform();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		System.out.println("Switch to parentFrame");
		Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
