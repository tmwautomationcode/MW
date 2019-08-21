package mwPages;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import baseClass.PopupWindows;




public class CreateAccountPage extends PopupWindows
{
	public CreateAccountPage(BaseClass obj) {
		
		super(obj);

	}
	public static final String txt_FirstName = "FirstName #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'firstName')]";
	public static final String txt_LastName = "LastName	#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'lastName')]";
	public static final String txt_EmailId = "Email-id #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'email')]";
	public static final String txt_Password = "Password #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'logonPassword')]";
	public static final String txt_PasswordAgain = "PasswordAgain #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'confirmPassword')]";
	public static final String rdo_DontSignUpForPF = "I don't want to sign up for Perfect Fit Rewards #xpath=//form[contains(@id,'registrationForm')]//div[contains(@class,'dont-sign-up')]/input";
	//	public static final String rdo_DontSignUpForPF = "I don't want to sign up for Perfect Fit Rewards #xpath=//form[@id='registrationForm']//label[contains(text(),'want to sign up for Perfect Fit Rewards')]/../input";
	public static final String btn_CreateAccountInRegistrationPage = "Create Account Button #xpath=//*[@id='submitRegister']";
	public static final String rdo_perfectfitRewards="perfect fit radio button #xpath=//input[@id='newRewardsCustomer']";
	public static final String txt_perfectfit_Address="perfect fit address #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'address1')]";
	public static final String txt_City = "City #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'city')]";
	public static final String drp_State = "State #xpath=//form[contains(@id,'registrationForm')]//select[contains(@id,'state')]";
	public static final String drp_Zip="Zip code#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'zipCode')]";
	public static final String txt_Telephone= "Telephone #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'newacct-tel')]";
	public static final String txt_MonthofBirth= "Month of Birth #xpath=//form[contains(@id,'registrationForm')]//select[contains(@id,'monthDOB')]";
	public static final String txt_DateofBirth= "Date of Birth #xpath=//form[contains(@id,'registrationForm')]//select[contains(@id,'dayDOB')]";
	public static final String txt_YearofBirth= "Year of Birth #xpath=//form[contains(@id,'registrationForm')]//select[contains(@id,'yearDOB')]";

	
	public static final String txt_FirstName_new = "FirstName #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'create-fname')]";
	public static final String txt_LastName_new = "LastName	#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'create-lname')]";
	public static final String txt_EmailId_new = "Email-id #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'create-email')]";
	public static final String txt_Password_new = "Password #xpath=//form[contains(@id,'registrationForm')]//input[@id='create-pw']";
	public static final String txt_PasswordAgain_new = "PasswordAgain #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'create-pw2')]";
	public static final String rdo_DontSignUpForPF_new = "I don't want to sign up for Perfect Fit Rewards #xpath=//form[contains(@id,'registrationForm')]//div[contains(@class,'dont-sign-up')]/input";
	//	public static final String rdo_DontSignUpForPF = "I don't want to sign up for Perfect Fit Rewards #xpath=//form[@id='registrationForm']//label[contains(text(),'want to sign up for Perfect Fit Rewards')]/../input";
	public static final String btn_CreateAccountInRegistrationPage_new = "Create Account Button #xpath=//*[@id='submitRegister']";
	public static final String rdo_perfectfitRewards_new="perfect fit radio button #xpath=//input[@id='newRewardsCustomer']";
	public static final String txt_perfectfit_Address_new="perfect fit address #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'address1')]";
	public static final String txt_City_new = "City #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'city')]";
	public static final String drp_State_new = "State #xpath=//form[contains(@id,'registrationForm')]//select[contains(@id,'state')]";
	public static final String drp_Zip_new="Zip code#xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'zipCode')]";
	public static final String txt_Telephone_new= "Telephone #xpath=//form[contains(@id,'registrationForm')]//input[contains(@id,'newacct-tel')]";
	
	
	
	public void fillSignUpForm(String FirstName, String LastName, String EmailId, String Password, String PasswordAgain){
		try{
			waitTime(2);
			String createaccountheading = driver.findElement(By.xpath("//h2[contains(text(),'Create Your Online Account')]")).getText();
			//System.out.println("Create acccount heading"+createaccountheading);
			if (createaccountheading.equalsIgnoreCase("CREATE YOUR ONLINE ACCOUNT")) {
				testStepPassed("The Create Account Page is Opened");
			} else {
				testStepFailed("Create accountpage is not opened");
			}
			typeIn(txt_FirstName,FirstName);
			typeIn(txt_LastName,LastName);
			typeIn(txt_EmailId,EmailId);
			typeIn(txt_Password,Password);
			typeIn(txt_PasswordAgain,PasswordAgain);
		}catch(Exception e){
			testStepFailed("Signup Registration Fails: "+e.toString());
		}
	}
	
	public void fillSignUpForm_new(String FirstName, String LastName, String EmailId, String Password, String PasswordAgain){
		try{
			waitTime(5);
			String createaccountheading = driver.findElement(By.xpath("//h2[contains(text(),'Create Your Online Account')]")).getText();
			System.out.println("Create acccount heading"+createaccountheading);
			if (createaccountheading.equalsIgnoreCase("CREATE YOUR ONLINE ACCOUNT")) {
				testStepPassed("The Create Account Page is Opened");
			} else {
				testStepFailed("Create accountpage is not opened");
			}
			typeIn(txt_FirstName_new,FirstName);
			typeIn(txt_LastName_new,LastName);
			typeIn(txt_EmailId_new,EmailId);
			typeIn(txt_Password_new,Password);
			typeIn(txt_PasswordAgain_new,PasswordAgain);
		}catch(Exception e){
			testStepFailed("Signup Registration Fails: "+e.toString());
		}
	}

	public void clickOnCreateAccountButtonInRegistrationPage(){
		clickOn(btn_CreateAccountInRegistrationPage);
	}

	public void clickOnDontSignupForPfInCreateAccountPage(){
		clickOn(rdo_DontSignUpForPF);
	}

	public void clickOnPerfectFitRewardRadioButtonFromCreateAccountPage()
	{
		waitForElementToDisplay(rdo_perfectfitRewards,elementLoadWaitTime);
		clickOn(rdo_perfectfitRewards);
	}


	public void fillPerfectFitDetailsFromCreateAccountPage(String address,String city,String state,String zipcode,String telephone, String Month, String Date, String Year)
	{
		System.out.println(Month);
		System.out.println(Date);
		System.out.println(Year);
		typeIn(txt_perfectfit_Address,address);
		try{

			driver.findElement(By.xpath("//input[@id='newRewardsCustomer']")).click();

		}catch(Exception e){

		//	testStepFailed("Clicking out of address text box to minimize the options - failed ");

		}

		typeIn(txt_City,city);
		selectFromDropdown(drp_State, state);
		//typeIn(drp_State,state);
		/*try
		{
			new Select(driver.findElement(By.xpath("//form[contains(@id,'registrationForm')]//select[contains(@id,'state')]"))).selectByValue(state);
			testStepPassed("Select "+state+" from:state dropdown");
		}
		catch(Exception e)
		{
			testStepFailed("Select "+state+" from:state dropdown");
		}*/
		typeIn(drp_Zip,zipcode);	
		typeIn(txt_Telephone,telephone);
		selectFromDropdown(txt_MonthofBirth, Month);
		selectFromDropdown(txt_DateofBirth, Date);
		selectFromDropdown(txt_YearofBirth, Year);
	}


}
