package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class MyAccountPerfectRewardsPage extends PopupWindows
{
	public MyAccountPerfectRewardsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);

	}


	public static final String rdo_SignUpForPF = "Sign me up For Perfect Fit Rewards #xpath=//label[contains(text(),'sign me up')]//preceding-sibling::input[contains(@name,'rewardsType')]";
	public static final String txt_FirstName = "First Name #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[contains(@name,'firstName')]";
	public static final String txt_LastName = "Last Name #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[contains(@name,'lastName')]";
	public static final String txt_Address1 = "ddress1 #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[contains(@name,'address1')]";
	public static final String txt_City = "City #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[contains(@name,'city')]";
	public static final String drp_State = "State #xpath=//div[contains(@id,'NewPFDivWrapper')]//select[contains(@name,'state')]";
	public static final String txt_ZipCode = "ZipCode #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[contains(@name,'zipCode')]";
	public static final String txt_Phone1 =  "Phone1 #xpath=//div[contains(@id,'NewPFDivWrapper')]//input[@name='phone1']";
	public static final String btn_SubmitPFForm = "Submit #xpath=//a[contains(@id,'submitPFRegister')]";
	public static final String txt_PerfectFitID = "Perfect Fit ID #xpath=//*[contains(text(),'Perfect Fit ID')]//following-sibling::p";
	public static final String txt_perfectfitdetail="detail information #xpath=//div[@id='perfectFitMainDiv']//div[@class='clearfix']";

	public void clickOnSignUpForPfInPerfectFitRewardsPage(){
		clickOn(rdo_SignUpForPF);
	}

	/*public void fillPfFormInPerfectFitRewardsPage(String firstName, String lastName, String address1, String city, String state, String zipCode, String phone1){
		typeIn(txt_FirstName, firstName);
		typeIn(txt_LastName, lastName);
		typeIn(txt_Address1, address1);
		typeIn(txt_City, city);
		typeIn(drp_State, state);
		typeIn(txt_ZipCode, zipCode);
		typeIn(txt_Phone1, phone1);
	}*/

	public void clickOnSaveFormInPerfectFitRewardsPage(){
		clickOn(btn_SubmitPFForm);
	}


	public void verifyPerfectFitDetailElementDisplay()
	{
		if(isElementDisplayed(txt_perfectfitdetail))
		{
			testStepPassed("PerfectFit details are displayed");
		}
		else
		{
			testStepFailed("PerfectFit details are displayed");
		}
	}

	public void fillPfFormInPerfectFitRewardsPage(String firstName, String lastName, String address1, String city, String state, String zipCode, String phone1){
		typeIn(txt_FirstName, firstName);
		typeIn(txt_LastName, lastName);
		typeIn(txt_Address1, address1);
		typeIn(txt_City, city);
		clickOn(drp_State);
		clickOn("State: #xpath=//select[contains(@id,'pfr')]//option[contains(@value,'"+state+"')]");
		typeIn(txt_ZipCode, zipCode);
		typeIn(txt_Phone1, phone1);
	}

	public String getPerfectFitIDInPerfectFitRewardsPage(){
		String perfectFitID = null;
		try{
			if(driver.findElement(By.xpath("//*[contains(text(),'Perfect Fit ID')]//following-sibling::p")).isDisplayed()){
				perfectFitID = driver.findElement(By.xpath("//*[contains(text(),'Perfect Fit ID')]//following-sibling::p")).getText();
			}else{}
		}
		catch(Exception e){
			testStepFailed("Perfect Fit ID is not present");
		}
		return perfectFitID;   
	}

}
