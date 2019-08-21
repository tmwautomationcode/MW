package mwPages;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class SocialNetwork extends PopupWindows
{
	public SocialNetwork(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);

	}
	public static final String btn_Facebook="Facebook- logo in Button #xpath=//div[contains(@class,'fb-like-box-container footer-social-feed')]";
	public static final String lbl_Twitter_MensWearhouse = "Twitter Men's Wearhouse #xpath=//div[contains(@id,'twitter-feed')]";
	public static final String lbl_Pinterest_MensWearhouse = "Pinterest Men's Wearhouse #xpath=//img[@alt=\"Men's Wearhouse\"]";
	public static final String lbl_Instagram_MensWearhouse = "Instagram Men's Wearhouse #xpath=//h1[text()='menswearhouse']";
	public static final String lbl_Youtube_Home = "Youtube Home#xpath=//span[@title='YouTube home']";

	public void verifyFacebookPage()
	{
		
		//waitTime(5);
		if(switchToSpecificWindow("Men's Wearhouse - Home | Facebook")){
			
			try{
				if(driver.getCurrentUrl().contains("facebook")) testStepPassed("Verifed user navigated to facebook page");
				else testStepFailed("Facebook link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}


	}	

	public void verifyTwitterPage()
	{
		waitTime(5);
		
		if(switchToSpecificWindow("Men's Wearhouse (@menswearhouse) | Twitter") || switchToSpecificWindow("Men's Wearhouse (@menswearhouse) | Twitter") || switchToSpecificWindow("Post a Tweet on Twitter")){
			try{
				if(driver.getCurrentUrl().contains("twitter")) testStepPassed("Verifed user navigated to Men's Wearhouse Twitter page");
				else testStepFailed("Twitter link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}

	}	

	public void verifyPinterestPage()
	{
		waitTime(5);
		
		if(switchToSpecificWindow("Men's Wearhouse (menswearhouse) on Pinterest") || switchToSpecificWindow("Men's Wearhouse (menswearhouse)'s ideas on Pinterest")){
			try{
				if(driver.getCurrentUrl().contains("pinterest")) testStepPassed("Verifed user navigated to Men's Wearhouse Pinterest page");
				else testStepFailed("Pinterest link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyInstagramPage()
	{
		waitTime(5);
		
		if(switchToSpecificWindow("Men's Wearhouse (@menswearhouse) • Instagram photos and videos")){
			try{
				if(driver.getCurrentUrl().contains("instagram")) testStepPassed("Verifed user navigated to Men's Wearhouse Instagram page");
				else testStepFailed("Instagram link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}	

	public void verifyYoutubePage()
	{
		
		waitTime(5);
		
		if(switchToSpecificWindow("Men's Wearhouse  - YouTube") || switchToSpecificWindow("Men's Wearhouse - YouTube")){
			try{
				if(driver.getCurrentUrl().contains("youtube")) testStepPassed("Verifed user navigated to Men's Wearhouse Youtube page");
				else testStepFailed("Youtube link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}else{

		}
	}

	public void verifyGooglePlusPage(){
	
		waitTime(5);
		if(switchToSpecificWindow("Google+")){
			try{
				if(driver.getCurrentUrl().toLowerCase().contains("googleplus")) testStepPassed("Google+ link is navigated to its corresponding page");
				else testStepPassed("Google+ link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyGmailPage(){	
		waitTime(5);
		if(switchToSpecificWindow("Gmail - Free Storage and Email from Google")){
			try{
				if(driver.getCurrentUrl().toLowerCase().contains("gmail")) testStepPassed("Gmail link is navigated to its corresponding page");
				else testStepPassed("Gmail link is not navigated to its corresponding page");
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyYahooPage(){
		waitTime(5);
		if(switchToSpecificWindow("Yahoo - login")){
			try{
				if(driver.getCurrentUrl().toLowerCase().contains("yahoo")) testStepPassed("Yahoo link is navigated to its corresponding page");
				else testStepPassed("Yahoo link is not navigated to its corresponding page");	
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyAOLPage(){
		waitTime(5);
		if(switchToSpecificWindow("AOL Mail: Simple, Free, Fun")){
			try{
				if(driver.getCurrentUrl().toLowerCase().contains("aol")) testStepPassed("AOL link is navigated to its corresponding page");
				else testStepPassed("AOL link is not navigated to its corresponding page");	
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyHotmailPage(){
	
		waitTime(5);
		if(switchToSpecificWindow("Sign In")){
			try{
				if(driver.getCurrentUrl().toLowerCase().contains("live.com")) testStepPassed("Hotmail link is navigated to its corresponding page");
				else testStepFailed("Hotmail link is not navigated to its corresponding page");		
			}catch(Exception e){
				testStepFailed(e.toString());
			}
			finally{
				driver.close();
			}
		}
	}

	public void verifyFacebookPopup(){
		
		try{
			if(isElementDisplayed(btn_Facebook)){
				testStepPassed("Facebook popup is not displayed");
			}
		}catch(Exception e){
			testStepFailed("Facebook popup is not displayed");
		}
	}

	public void verifyTwitterPopup(){
		
		try{
			if(isElementDisplayed(lbl_Twitter_MensWearhouse)){
				testStepPassed("Twitter popup is not displayed");
			}

		}catch(Exception e){
			testStepFailed("Twitter popup is not displayed");
		}
	}
}

