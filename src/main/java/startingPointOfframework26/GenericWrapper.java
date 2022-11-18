package startingPointOfframework26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{
	
	public ChromeDriver driver;
	
	public void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Chrome browser is successfully launced");
	}

	public void enterById(String locatorValue, String data) {
    driver.findElementById(locatorValue).sendKeys(data);		
	}

	public void enterByName(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);		
	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterBYClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);
	}

	public void enterByCssSelector(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);		
	}
	
    public void enterByLinkText(String locatorValue, String data) {
    	driver.findElementByLinkText(locatorValue).sendKeys(data);
    	
    }
	
	public void enterBYPertialLinktext(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}
	


	public void clickById(String locator) {
		driver.findElementById(locator).click();
		
	}

	public void clickByClassName(String locator) {
		driver.findElementByClassName(locator).click();
		
	}

	public void clickBYLinkText(String locator) {
		driver.findElementByLinkText(locator).click();
		
	}
	public void clickByXpath(String locator) {
		driver.findElementByXPath(locator).click();
		
	}

	public void clickByPartialLinkText(String locator) {
		driver.findElementByPartialLinkText(locator).click();		
	}

	
    public void clickByCssSelector(String locator) {
		driver.findElementByCssSelector(locator).click();
		
	}

	public void selectVesebleTextById(String Id, String Value) {
		WebElement ele = driver.findElementById(Id);
		Select dd=new Select(ele);
		dd.selectByVisibleText(Value);
	}
	public void selectVesebleTextByName(String Name, String Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd=new Select(ele);
		dd.selectByVisibleText(Name);
	}

	public void selectIndexById(String Id, int Value) {
		WebElement ele = driver.findElementById(Id);
		Select dd=new Select(ele);
		dd.selectByIndex(Value);
	}
	public void selectIndexByName(String Name, int Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd=new Select(ele);
		dd.selectByIndex(Value);
	}
	public void selectValueByName(String Name, String Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd=new Select(ele);
		dd.selectByValue(Value);
	}

	public void getTextById(String Id) {
		WebElement text = driver.findElementById(Id);
		System.out.println(text);
	}
	public void verifyTextById(String id,String text) {
		String txt = driver.findElementById(id).getText();
		if(txt.equals(text)) {
			System.out.println("Text is matched");
		}
		else {
			System.out.println("Text isn't matched");
		}
			
	}

	public void closeBrowser() {
		driver.close();
	}
public void clickByName(String locatorValue) {
	
	
		driver.findElementByClassName(locatorValue);
		
	}

public void enterByClassName(String locatorValue, String data) {
	// TODO Auto-generated method stub
	
}

}
