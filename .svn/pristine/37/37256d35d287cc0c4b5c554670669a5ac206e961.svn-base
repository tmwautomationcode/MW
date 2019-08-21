package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;





public class MyAccountOrderHistoryPage extends PopupWindows
{
	public MyAccountOrderHistoryPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	
	public void clickOnViewOrderInOrderHistoryPage(String orderNumber){
	
		clickOn("view order link of order number '"+orderNumber+"'#xpath=//td[contains(@class,'order-num')]/a[contains(text(),'"+orderNumber+"')]");
		waitForText("Order Details");
	
	}


	public void verifyOrderNumberDispayedOnOrderHistory(String orderNumber){
	
		List<WebElement> orderlist=driver.findElements(By.xpath("//*[contains(@class,'even')]"));
																
		if(orderlist.size()>0){
			for(int i=0;i<orderlist.size();i++){
				if(orderlist.get(i).getText().trim().equalsIgnoreCase(orderNumber)){
					testStepPassed("Verified order number "+orderNumber+" is listed in order History page");
					break;
				}
				if(i==orderlist.size()-1){
					testStepFailed("'"+orderNumber+" order number is NOT listed in order History page");
				}
			}
		}
	}



}
