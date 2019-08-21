package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;


public class ReserveInStorePage extends  PopupWindows
{
	public ReserveInStorePage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_Reserve_in_Store="RESERVE ONLINE PICK UP IN STORE label #xpath=//span[text()='RESERVE ONLINE PICK UP IN STORE']";
	
	public void verifyReservationStorePage()
	{
		try
		{
			waitForElement(lbl_Reserve_in_Store);
			verifyElement(lbl_Reserve_in_Store);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		
	}
}
