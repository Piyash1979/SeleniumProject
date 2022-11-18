package exceptionHandling25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept_exceptionHandling {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click Selectable (outside frame)
		
		try {
		driver.findElementByLinkText("Selectable1").click();
		//System.out.println("The element is clickable");
		
		} 
		catch (Exception e) {
		//System.err.println("The element is not clickable");
			
			//Create RunTime exception by using throw keyword
			//throw new RuntimeException();
		}	
		
		
	
	finally { 
		System.out.println("The element is found");
			}
		//Using index number- if your iframe has no Id or Name locator then go to Index number


	}

}
