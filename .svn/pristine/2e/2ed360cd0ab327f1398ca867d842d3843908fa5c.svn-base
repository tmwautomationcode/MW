package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class SavedItemPage extends PopupWindows
{
	public SavedItemPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	
	
	public static final String btn_savedItems_Addtocart="saved items in add to cart#xpath=//a[contains(@id,'CatalogEntryDBThumbnailDisplayJSPF')]/parent::div/parent::div//a[contains(@id,'add-to-cart') or contains(text(),'Add To Cart')]";
	public static final String txt_saved_Empty="saved item empty#xpath=//div[contains(text(),'Your saved items list is empty')]";
	
	
	public void clickOnAddToCartButtonFromSavedItem(String prodName, String size)
	{
		clickOn(prodName+"'s add to cart button#xpath=//li[contains(@class,'item saved-item')]//a[contains(text(),'"+prodName+"')]/following-sibling::p[contains(text(),'Size: "+size+"')]/parent::div/parent::div//a[contains(@id,'add-to-cart') or contains(text(),'Add To Cart')]");
	}
	public boolean verifySavedItemPageEmptyMessage()
	{
		if(isElementDisplayed(txt_saved_Empty))
		{
			testStepPassed("your saved Item list is empty");
			return true;
		}
		else
		{
			testStepFailed("your saved Item list is not empty");
			return false;
		}
	}
	
}
