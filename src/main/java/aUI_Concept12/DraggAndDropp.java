package aUI_Concept12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggAndDropp {

	public static void main(String[] args) throws InterruptedException {
       
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//a[text()='Demos']").click();
		driver.findElementByXPath("//a[text()='Droppable']").click();
		
		driver.switchTo().frame(0);
		System.out.println("Successfully intered into the frame");
		
		WebElement src = driver.findElementById("draggable");
		WebElement dest = driver.findElementById("droppable");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		System.out.println("Successfully intered in to the ParentFrame");
		
		driver.findElementByXPath("//a[text()='Selectable']").click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
