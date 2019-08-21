package mwPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.HeaderLinks;

public class ReserveOnlinePayInStorePage extends HeaderLinks {

	public ReserveOnlinePayInStorePage(BaseClass obj) {
		super(obj);

	}

public static final String txt_Ropis = "ROPIS text#xpath=//div[@class='reserve-online-section']/h1[contains(text(), 'Reserve Online, Try On In-Store')]";
	
	
	public void verifyReserveOnlinePayInStorePage(){
		if(isElementDisplayed(txt_Ropis)){
			testStepPassed("Reserve Online, Try On In-Store text is navigated to its corresponding page");			
		}else{
			testStepFailed("Reserve Online, Try On In-Store text is not navigated to its corresponding page");
		}
	}
	
	
public void getCategoryNameandCount() {
	
	List<WebElement> Subcategories = driver.findElements(By.xpath("//a[contains(@class, 'store-category-link')]//div[@class='category-details']"));
 	int SubCategoriesCount = Subcategories.size();
	for (int k = 1; k < SubCategoriesCount; k++) {
		//k=k+1;
		//String Subcategory = driver.findElement(By.xpath("(//a[contains(@class, 'store-category-link')])["+k+"]//div[@class='category-details']")).getAttribute("innerText");
		String Subcategory = driver.findElement(By.xpath("(//div[contains(@class, 'my-store-categories')]//a[contains(@class, 'store-category-link')])["+k+"]")).getAttribute("data-cname");

		String SubCategoriesLinksCount = driver.findElement(By.xpath("(//a[contains(@class, 'store-category-link')])["+k+"]//div[@class='category-details']/span")).getText();
			testStepPassed(""+k+". "+"SubCategories Count in "+Subcategory+" : "+ SubCategoriesLinksCount+"");
		}
}


public void selectCategory(String CategoryName) {

	String SubCategoriesLinksCount = driver.findElement(By.xpath("//a[contains(@class, 'store-category-link')]//div[contains(text(),'"+CategoryName+"')]/span")).getText();
	SubCategoriesLinksCount = SubCategoriesLinksCount.substring(SubCategoriesLinksCount.lastIndexOf('(')+1, SubCategoriesLinksCount.lastIndexOf(')'));
	int SubCategoryCount = Integer.parseInt(SubCategoriesLinksCount);
	if(SubCategoryCount>0) {
		clickOn(CategoryName+" category name#xpath=//a[contains(@class, 'store-category-link')]//div[contains(text(),'"+CategoryName+"')]");
	
	}
	
	
}
}