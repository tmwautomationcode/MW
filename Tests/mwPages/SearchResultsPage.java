
package mwPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class SearchResultsPage extends PopupWindows
{
	public SearchResultsPage(BaseClass obj) {
		
		super(obj);

	}
	public static final String drp_OrderBy="Products Order By Filter Dropdown #xpath=//li[contains(@id,'sort-by-tab')]//span[contains(text(), 'Sort:')]";

	public void verifySearchResultsPageisDisplayedwithProducts()
	{
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb')]")).isDisplayed()) 
			{
				String SearchResultsBreadCrumb = driver.findElement(By.xpath("//div[contains(@id,'widget_breadcrumb')]//h1//span[contains(@class,'breadcrumb')]")).getText();
				if (SearchResultsBreadCrumb.contains("SEARCH RESULTS: PRODUCTS")) {
					testStepPassed("Search Results Page is displayed");
					if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li")).isDisplayed()) {
						testStepPassed("Products are listed in Search Results Page");
					}
				}
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Search Results page is not displayed or Products are not displayed in Search Results page");
		}
	}	


	public static final String drop_Sortby="Sort by Low to High drop #xpath=//li[contains(@id,'sort-by-tab')]//div[contains(@class,'box-drop-down__container')]//span[contains(text(),'Price: Low-High')]";
	public void SelectProductsSortByDropdownValue(String ProductsSortBy)
	{
		try {
			waitTime(3);
			if (driver.findElement(By.xpath("//li[contains(@id,'sort-by-tab')]//span[contains(text(), 'Sort:')]")).isDisplayed()) 
			{
				//selectFromDropdown(drp_OrderBy, ProductsSortBy);
				clickOn(drp_OrderBy);
				waitTime(2);
				WebElement element = driver.findElement(By.xpath("//*[@id='sort-by-tab']//div[contains(@class, 'box-drop-down__container')]"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				waitTime(1);
				clickOnSpecialElement(drop_Sortby);
				//driver.findElement(By.xpath("//li[contains(@id,'sort-by-tab')]//div[contains(@class,'box-drop-down__container')]//span[contains(text(),'"+ProductsSortBy+"')]")).click();
				
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Products Sort By Filter Dropdown is not displayed");
		}
	}	




	public void CheckProductPriceisDisplayedorPricePendingTextisDisplayed()
	{
		try {
			waitTime(5);
			ClickonLoadMore();
			List<WebElement> Products = driver.findElements(By.xpath("//ul[contains(@id,'products')]//li"));
			int ProductsCount = Products.size();
			System.out.println(ProductsCount);
			testStepPassed("Total Products Count : "+ProductsCount);
			for (int i = 1; i <= ProductsCount; i++) {
				if (driver.findElement(By.xpath("//ul[contains(@id,'products')]//li//div[contains(@id,'product_price')]//p[contains(@id,'offerPrice')]")).isDisplayed()) 
				{
					String Price = driver.findElement(By.xpath("//ul[contains(@id,'products')]//li//div[contains(@id,'product_price')]//p[contains(@id,'offerPrice')]")).getText();
					System.out.println("Price : "+Price);
					if (!Price.contains("Price pending")) 
					{
						WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'prod-info')]/a)["+i+"]")); 
						Actions action = new Actions(driver);
						action.moveToElement(ele).build().perform();
		                String ProductName = driver.findElement(By.xpath("(//div[contains(@class,'prod-info')]/a)["+i+"]")).getText();
						testStepPassed("Product Price '"+Price +"' is displayed for the product : "+ProductName);
						
					}
					else if (Price.contains("Price pending")) 
					{
						WebElement ele = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")); 
						Actions action = new Actions(driver);
						action.moveToElement(ele).build().perform();
		                String ProductName = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")).getText();
						testStepWarning("Warning : Price Pending is displayed for the product : "+ProductName);
					}
					else if (Price.equalsIgnoreCase("$0.00"))  
					{
						WebElement ele = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")); 
						Actions action = new Actions(driver);
						action.moveToElement(ele).build().perform();
		                String ProductName = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")).getText();
						testStepWarning("Warning : Price Pending is displayed for the product : "+ProductName);
					}
				}
				else 
				{
					WebElement ele = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")); 
					Actions action = new Actions(driver);
					action.moveToElement(ele).build().perform();
	                String ProductName = driver.findElement(By.xpath("(//ul[contains(@id,'products')]//li//div[contains(@class,'prod-info')]/a[contains(@class,'product-name')])["+i+"]")).getText();
					testStepWarning("Warning : Product Price is not displayed for the product : "+ProductName);
				}
			}

		} 
		catch (Exception e) 
		{
			testStepFailed("Product price is not displayed");
		}
		
		
	}	
	
	
	public static final String lnk_PGPLoadmore="PGP load more link #xpath=//div[(@class='pgp-load-more text-center')]//span[contains(text(),'Load more')]";
	public void ClickonLoadMore(){
		waitTime(3);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-650)", "");
		if(elementPresent("#xpath=//div[(@class='pgp-load-more text-center')]//span[contains(text(),'Load more')]")){
		
		WebElement element = driver.findElement(By.xpath("//div[(@class='pgp-load-more text-center')]//span[contains(text(),'Load more')]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		clickOn(lnk_PGPLoadmore);
		//driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]/a/i")).click();
		waitTime(3);
		}
	}












}
