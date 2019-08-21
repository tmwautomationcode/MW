package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class GiftsPage extends PopupWindows
{
	public GiftsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_MenWearhouse_Engraved_Personalized_Gifts="Men's Wearhouse - Engraved and Personalized Gifts label #xpath=//h1//span[contains(text(),\"Men's Wearhouse - Engraved and Personalized Gifts\")]";
	
	public void verifyGiftsPage()
	{
		try
		{
			waitForElement(lbl_MenWearhouse_Engraved_Personalized_Gifts);
			verifyElement(lbl_MenWearhouse_Engraved_Personalized_Gifts);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}

}
