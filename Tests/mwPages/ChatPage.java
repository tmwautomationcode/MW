package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class ChatPage extends PopupWindows
{
	public ChatPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}

	public static final String lbl_Chat = "Chat Label#xpath=//h3[contains(text(),'Chat with a member of our team')]";

	//public static final String lbl_Chat = "Chat Label#xpath=//div[contains(text(),'Chat with a member of our support team.')]";

	public void verifyChatPage()
	{
		try
		{
			waitTime(10);
			switchToWindow("Live Chat");
			waitForElement(lbl_Chat);
			verifyElement(lbl_Chat);
			//driver.close();
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}	
}