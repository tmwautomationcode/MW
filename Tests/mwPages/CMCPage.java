package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class CMCPage extends PopupWindows
{
	
	public CMCPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	
	public static final String txt_UserName = "UserName #xpath=(//div[contains(text(), 'Username')])[1]/..//input[contains(@type,'text')]";
	public static final String txt_password = "Password #xpath=(//div[contains(text(), 'Password')])[1]/..//input[contains(@type,'password')]";
	public static final String btn_Login = "Login #xpath=(//div[contains(text(), 'Log in')])[1]";
	public static final String btn_WorkOnApprovedContent = "Work on approved content #xpath=//div[contains(@modulename, 'cmc/foundation/Toolbar')]//div[contains(@style, 'normal/work_on_base.png')]";
	public static final String btn_StorePreview = "Store preview #xpath=//div[contains(@modulename, 'cmc/foundation/Toolbar')]//div[contains(@style, 'normal/store_preview.png')]";
	public static final String btn_HamburgerMenu = "Application Menu #xpath=//div[contains(@style, '/appmenu/mc_logo.png')]";
	public static final String btn_PromotionsMenu = "Promotions Menu #xpath=//div[contains(@modulename, 'cmc/shell/ApplicationMenu')]//div[contains(text(), 'Promotions')]";
	
	public void signInToCMC(String username, String password) {
		typeIn(txt_UserName, username);
		typeIn(txt_password, password);
		clickOn(btn_Login);
			}
	
	public void approveContent() {
		waitForElement(btn_WorkOnApprovedContent);
		waitTime(3);
		clickOnSpecialElement(btn_WorkOnApprovedContent);
	}
	
	public void clickOnStorePreview() {
		waitForElement(btn_StorePreview);
		clickOnSpecialElement(btn_StorePreview);
		
	}
	
	public void clickOnPromotionsMenu() {
		waitForElement(btn_HamburgerMenu);
		clickOnSpecialElement(btn_HamburgerMenu);
		waitForElement(btn_PromotionsMenu);
		clickOnSpecialElement(btn_PromotionsMenu);
		
		
	}
}
