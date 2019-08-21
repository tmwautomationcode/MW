package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class AddToCart extends PopupWindows {

	public AddToCart(BaseClass obj) {
		super(obj);
		
	}

	public static final String but_AddToCart = "Add To Cart#xpath=//a[contains(@id,'add-to-cart')]";
	
	public void clickonAddToCart()
	{
		waitForElement(but_AddToCart);
		if(isElementDisplayed(but_AddToCart))
		{
			clickOn(but_AddToCart);
			testStepPassed("The selected item is added on add to cart");
		}else
		{
			testStepFailed("The selected item not added on add to cart");
		}
	}
	
	
}
