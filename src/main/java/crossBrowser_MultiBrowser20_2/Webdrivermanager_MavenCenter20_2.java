package crossBrowser_MultiBrowser20_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager_MavenCenter20_2 {
	
	@Test
	public void multiBrowser() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
		// Chrome
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println(driver.getTitle());*/
		
		//FireFox
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println(driver.getTitle());
		//Enter facebook login in google search box
		driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/");
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		
		driver.close();*/
		
		//EdgeDriver		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println(driver.getTitle());
		//Enter facebook login in google search box
		driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/");
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		/*//Internet explorer
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.getTitle();
		System.out.println(driver.getTitle());
		//Enter facebook login in google search box
		driver.findElement(By.name("q")).sendKeys("https://www.facebook.com/");
		//driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		
		driver.close();*/
		
	
		

	}

}
