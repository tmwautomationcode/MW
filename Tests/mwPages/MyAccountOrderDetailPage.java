package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class MyAccountOrderDetailPage extends PopupWindows
{
	public MyAccountOrderDetailPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	public static final String img_Product = "Product Image #xpath = //ul[contains(@id,'cart-items')]//a/img";
	
	public void verifyNameAndSizeInOrderDetailPage(String name, String size){

		
		if(getText("Product Name#xpath=//span[contains(text(),'Size :')]/parent::p//preceding-sibling::a").trim().contains(name)){
			testStepPassed("Verified the Name of the product in order history product detail page");
		}else{
			testStepFailed("'"+name+"' Name of the product is not matching with the color mentioned in order history product detail page");
		}
		
		if(getText("Product Size#xpath=//span[contains(text(),'Size :')]/parent::p").split(":")[1].trim().contains(size)){
			//*[contains(text(),'Size :')]
			testStepPassed("Verified the Size of the product in order history product detail page");
		}else{
			testStepFailed("'"+size+"' Size of the product is not matching with the size mentioned in order history product detail page");
		}

		
	}
	
	
	public void clickOnProductImageInOrderDetailPage(){
	
		clickOn(img_Product);
	
	}
	
	
	
}

