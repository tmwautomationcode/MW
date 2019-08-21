package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class MyAccountMwRecommendationsPage extends PopupWindows{

	public MyAccountMwRecommendationsPage(BaseClass obj) {
		// TODO Auto-generated constructor stub
		super(obj);
	}

	private List<WebElement> mWRecommendationsSubcategory, mWRecommendationsSubcategoryProductList;
	private String mWRecommendationsSubcategoryName;

	public int mWRecommendationsSubcategoryCount(){
		try{
			mWRecommendationsSubcategory = driver.findElements(By.xpath("//*[contains(@id,'mwrec_zone')]//h3"));
		}catch(Exception e){
			testStepFailed("");
		}
		return(mWRecommendationsSubcategory.size());
	}

	public void verifyMwRecommendationsProductCountInEachSubcategory(int mWRecommendationsSubcategoryCount){
		for(int i= 1; i <= mWRecommendationsSubcategoryCount; i++){
			try{ 
				mWRecommendationsSubcategoryName = driver.findElement(By.xpath("//*[contains(@id,'mwrec')]//div["+i+"]//h3")).getText().trim();
			}catch(Exception e){
				testStepFailed("MW Recommendations Subcategory Name is not dispalyed");
			}
			try{ 
				mWRecommendationsSubcategoryProductList = driver.findElements(By.xpath("//*[contains(@id,'mwrec')]//div[contains(@id,'mwrec_zone')]["+i+"]//div[contains(@class,'owl-item')]"));
				if(mWRecommendationsSubcategoryProductList.size()>0){
					if(mWRecommendationsSubcategoryProductList.size()>=4) testStepPassed("The MWRecommendationsSubcategory"+mWRecommendationsSubcategoryName+": lists minimum of 4 products.");
					else testStepFailed("The MWRecommendationsSubcategory"+mWRecommendationsSubcategoryName+": does not list 4 products.");
				}else testStepFailed("The MWRecommendationsSubcategory"+mWRecommendationsSubcategoryName+": does not list any product.");
			}catch(Exception e){
				testStepFailed("The MWRecommendationsSubcategory"+mWRecommendationsSubcategoryName+": does not list any product.");  }
		}
	}
}