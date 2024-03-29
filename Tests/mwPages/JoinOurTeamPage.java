package mwPages;

import org.openqa.selenium.By;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class JoinOurTeamPage extends PopupWindows
{
	public JoinOurTeamPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		
	}
	public static final String lbl_JoinOurTeam = "Join Our Team #xpath=//*[text()='Join Our Team']";	
	 
	public void verifyJoinOurTeamPage(){
		try{

			switchToWindow("Tailored Brands Careers - Jobs");
			//waitForElement(lbl_JoinOurTeam);
			//verifyElement(lbl_JoinOurTeam); //h2[text() = 'Join Our Team!']
			//if(driver.getCurrentUrl().toLowerCase().contains(prefix+".careers.tailoredbrands.com")||driver.findElement(By.xpath("//*[text()='Join Our Team']")).isDisplayed()) testStepPassed("Join Our Team Link is navigated to careers page");
			if(driver.getCurrentUrl().toLowerCase().contains(prefix+".careers.tailoredbrands.com")||driver.findElement(By.xpath("//h2[text() = 'Join Our Team!']")).isDisplayed()) testStepPassed("Join Our Team Link is navigated to careers page");
			else testStepFailed("Join Our Team Link is not navigated to careers page");
			driver.close();
		}
		catch(Exception e){
			testStepFailed(e.toString());                                                 
		}
	}
	
	public void verifyJoinOurTeamPage_new(){
		try{
			switchToWindow("    Careers |    Men�s Wearhouse");
			//waitForElement(lbl_JoinOurTeam);
			//verifyElement(lbl_JoinOurTeam);
			if(driver.getCurrentUrl().toLowerCase().contains(prefix+".menswearhouse.com/careers")||driver.findElement(By.xpath("//*[text()='Join Our Team']")).isDisplayed()) testStepPassed("Join Our Team Link is navigated to careers page");			
			else testStepFailed("Join Our Team Link is not navigated to careers page");
			driver.close();
		}
		catch(Exception e){
			testStepFailed(e.toString());                                                 
		}
	}
}
