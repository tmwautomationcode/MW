package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class MyAccountMySizePage extends  PopupWindows
{
	public MyAccountMySizePage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	
	public static final String lnk_my_sizes="my size option #xpath=//span[contains(@data-sizetitle,'L 32/33')]";
	public static final String btn_changeStore="change store option#xpath=//*[@id='main']//a[text()='Change Store']";
	
	public void clickOnDeleteMySizes(String sizes)
	{
		
		//clickOnSpecialElement("Delete My Size#xpath=//span[contains(@data-sizetitle,'"+sizes+"')]");
		clickOnSpecialElement("Delete My Size#xpath=//span[@data-size='"+sizes+"']");
	}
	public void changeOptionInFindStore()
	{
		clickOn(btn_changeStore);
	}

}
