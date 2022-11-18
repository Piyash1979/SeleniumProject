package startingPointOfframework26;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public interface WrapperMethods {
	
	//100% abstract method
	//Method declaration/Method signature
	//No method body/implementation
	
	public void launchBrowser(String url);
	
	public void enterById(String locatorValue, String data);
	
	public void enterByName(String locatorValue, String data);
	public void enterByClassName(String locatorValue, String data);	
	
    public void enterByLinkText(String locatorValue, String data);
	
	public void enterBYPertialLinktext(String locatorValue, String data);

	public void enterByXpath(String locatorValue, String data);
	
	public void enterByCssSelector(String locatorValue, String data);
	
	public void clickById(String locator);

	public void clickByClassName(String locator); 

	public void clickBYLinkText(String locator); 

	
	public void clickByXpath(String locator); 
	
	public void clickByPartialLinkText(String locator); 

	
    public void clickByCssSelector(String locator); 
    
    
    public void selectVesebleTextById(String Id, String Value); 
	public void selectVesebleTextByName(String Name, String Value);
	public void selectIndexById(String Id, int Value); 
	
	public void selectIndexByName(String Name, int Value);
	public void selectValueByName(String Name, String Value);
	public void getTextById(String Id);
	
	public void verifyTextById(String Id,String text);
	
	public void closeBrowser();
	
	public void clickByName(String locatorValue);
		
	
	
	

}
