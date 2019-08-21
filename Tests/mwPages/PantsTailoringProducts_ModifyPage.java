package mwPages;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class PantsTailoringProducts_ModifyPage extends PopupWindows {

	public PantsTailoringProducts_ModifyPage(BaseClass obj) {
		super(obj);
	}

	//Sangeetha - N - PantsTailoringProductsTest_ModifyPage
	//Navigate Pants
	public void searchToProduct(String SearchItem)
	{
		try
		{
			clickOn("Back-to-top-trigger#xpath=//a[@id='back-to-top-trigger']");
			if(isElementDisplayed("Search#xpath=//span[@class='search-toggle-label']"))
				{
					waitForElementToDisplay("Search#xpath=//span[@class='search-toggle-label']", elementLoadWaitTime);
					mouseOver("Search#xpath=//span[@class='search-toggle-label']");
					waitTime(2);
					typeIn("Search Textbox#xpath=//input[@name='searchTerm']", SearchItem);
					driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys(Keys.ENTER);
					waitForElementToDisplay("Product#xpath=//li[@class='new-arrival gtm-data-collected']/a[@title='"+SearchItem+"']/following::a[@title='"+SearchItem+"']", elementLoadWaitTime);
				}else
				{
					testStepFailed("Search Menu not display");
				}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
			


	//click pants image
	public void clickonNavigatePants(String SearchItem)
	{
		if(isElementDisplayed("Product#xpath=//li[@class='new-arrival gtm-data-collected']/a[@title='"+SearchItem+"']/following::a[@title='"+SearchItem+"']"))
		{
			testStepPassed("Navigate pants are displayed");
			clickOn("Product image#xpath=//li[@class='new-arrival gtm-data-collected']/a[@title='"+SearchItem+"']/following::a[@title='"+SearchItem+"']/img");
			waitForElementToDisplay("Add To Shopping Bag#xpath=//a[contains(text(),'Add to Shopping Bag')]", elementLoadWaitTime);
			if(isElementDisplayed("Add To Shopping Bag#xpath=//a[contains(text(),'Add to Shopping Bag')]"))
			{
				testStepPassed("Add To Shoppign Bag Page is displayed");
			}else
			{
				testStepFailed("Add To Shopping Bag Page not displayed");
			}
		}else
		{
			testStepFailed("Navigate pants not displayed");
		}
	}

	//Select size into add to shopping bag page

	public void selectSize(String size)
	{
		if(isElementDisplayed("Select Regular Size#xpath=//div[contains(text(),'Select Regular Size')]"))
		{
			clickOn("Select Regular Size#xpath=//div[contains(text(),'Select Regular Size')]");
			clickOn("Select size#xpath=//div[@class='size-scroll']/../..//li[@role='option']/a[contains(text(),'"+size+"')]");
			waitTime(2);
		}
	}

	//select creaset and tailor checkbox
	public void selectCheckBoxes()
	{
		if(isElementDisplayed("CREASET#xpath=//div[@id='mods']/div[@dyn-template='supercrease']/descendant::input[@id='s-crease-chk']"))
		{	
			waitTime(2);
			clickOnSpecialElement("CREASET#xpath=//div[@id='mods']/div[@dyn-template='supercrease']/descendant::input[@id='s-crease-chk']");
			if(isElementDisplayed("TAILOR & HEM#xpath=//div[@id='mods']/div[@dyn-template='tailorHem']/descendant::input[@id='tailoring-checkbox']"))
			{
				waitTime(2);
				clickOnSpecialElement("TAILOR & HEM#xpath=//div[@id='mods']/div[@dyn-template='tailorHem']/descendant::input[@id='tailoring-checkbox']");
				WebElement creaset = driver.findElement(By.xpath("//div[@id='mods']/div[@dyn-template='supercrease']/descendant::input[@id='s-crease-chk']"));
				WebElement TAILOR = driver.findElement(By.xpath("//div[@id='mods']/div[@dyn-template='tailorHem']/descendant::input[@id='tailoring-checkbox']"));
				if(creaset.isSelected()&&TAILOR.isSelected())
				{
					testStepPassed("CREASET and TAILOR & HEM checkboxes are checked");
				}else
				{
					testStepFailed("CREASET and TAILOR & HEM checkboxes not checked");
				}
			}else
			{
				testStepFailed("Tailor checkbox not displayed");
			}
		}else
		{
			testStepFailed("Creaset checkbox not displayed");
		}
	}

	//Choose FINISH

	public void chooseFinish(String chooseFinish)
	{
		if(isElementDisplayed("Choose FINISH#xpath=//label[contains(text(),'Choose Finish')]"))
		{
			if(isElementDisplayed("CUFF#xpath=//label/span[contains(text(),'Cuff')]")||
					isElementDisplayed("PLAIN#xpath=//label/span[contains(text(),'Plain')]"))
			{
				clickOnSpecialElement("CUFF#xpath=//label/span[contains(text(),'"+chooseFinish+"')]");
				testStepPassed("'"+chooseFinish+"' choose FINISH is selected");
			}else
			{
				testStepFailed("Choose FINISH not choosen");
			}
		}else
		{
			testStepFailed("Choose finish options not display");
		}
	}

	//Choose INSEAM

	public void chooseInseam(String chooseINSEAM)
	{
		if(isElementDisplayed("Choose INSEAM#xpath=//select[@id='choose-inseam']"))
		{
			selectFromDropdown("Choose INSEAM#xpath=//select[@id='choose-inseam']", chooseINSEAM);
			testStepPassed("'"+chooseINSEAM+"' choose INSEAM selected");
		}else
		{
			testStepFailed("choose INSEAM not display");
		}
	}

	//Click on Add To Shopping Bag
	public void addToShoppingBag()
	{
		if(isElementDisplayed("Add To Shopping Bag#xpath=//a[contains(text(),'Add to shopping bag')]"))
		{
			clickOn("Add To Shopping Bag#xpath=//a[contains(text(),'Add to shopping bag')]");
			testStepPassed("Add To Shoppign Bag Page is displayed");
			if(isElementDisplayed("Checkout#xpath=//a[contains(text(),'checkout')]"))
			{
				testStepPassed("Products added on successfully");
			}else
			{
				testStepFailed("Products not added");
			}

		}else
		{
			testStepFailed("Add To Shopping Bag Page not displayed");
		}
	}


	//Click on Checkout

	public void clickonCheckoutPage()
	{
		if(isElementDisplayed("Checkout#xpath=//a[contains(text(),'checkout')]"))
		{
			clickOn("Checkout#xpath=//a[contains(text(),'checkout')]");
			if(isElementDisplayed("Checkout Guest#xpath=//a[@id='checkoutGuestToggle']/span[contains(text(),'Checkout')]"))
			{
				testStepPassed("Checkout page is displayed");
			}else
			{
				testStepFailed("Checkout page not display");
			}
		}else
		{
			testStepFailed("Checkout option not display");
		}
	}

	//verify product title
	public void verifyProductPantsTitle(String searchitem)
	{
		if(isElementDisplayed("Product Title#xpath=//h3[@class='product-name']/a[contains(text(),'"+searchitem+"')]"))
		{
			testStepPassed("Selected Pants item is displayed");
		}else
		{
			testStepFailed("Selected Pants item not displayed");
		}
	}

	//Get creaset price and tailoring price
	public void checkTotalCostwithTailorPrice() throws ParseException
	{
		try
		{
			if(isElementDisplayed("Subtotal Price#xpath=//li[@class='hide-for-small-only'][1]/..//span[@class='value product-price']"))
			{
				final String SubTotal = getText("Subtotal Price#xpath=//li[@class='hide-for-small-only'][1]/..//span[@class='value product-price']"); 
				testStepPassed("Subtotal Price  :" + "\""+SubTotal+"\"");
				System.out.println("Subtotal Price   :" +SubTotal);
				/*BigDecimal subtot = parse(SubTotalpricebeforedigit, Locale.US);
			System.out.println("Subtotal Price without dollar  :" +subtot);*/

				if(isElementDisplayed("Product Price#xpath=//span[@class='product-price']"))
				{
					final String Product =getText("Product Price#xpath=//span[@class='product-price']"); 
					testStepPassed("Product Price  :" + "\""+Product+"\"");
					BigDecimal ProductPrice = parse(Product, Locale.US);
					System.out.println("Product Price without dollar  :" +ProductPrice);

					if(isElementDisplayed("CREASET Price#xpath=//span[@data-gtm='creaset-price']"))
					{
						final String CREASET =getText("CREASET Price#xpath=//span[@data-gtm='creaset-price']"); 
						testStepPassed("CREASET Price  :" + "\""+CREASET+"\"");
						BigDecimal CREASETPrice = parse(CREASET, Locale.US);
						System.out.println("CREASET Price without dollar  :" +CREASETPrice);

						if(isElementDisplayed("Finish Price#xpath=//span[@data-gtm='finish-price']"))
						{
							final String Finish =getText("Finish Price#xpath=//span[@data-gtm='finish-price']"); 
							testStepPassed("Finish Price  :" + "\""+Finish+"\"");
							BigDecimal FinishPrice = parse(Finish, Locale.US);
							System.out.println("CREASET Price without dollar  :" +FinishPrice);

							BigDecimal calculateProductTotal= ProductPrice.add(CREASETPrice).add(FinishPrice);
							System.out.println("Calculated Product Total Price without dollar is : " +calculateProductTotal);

							//Convert Calculated order total value to currency
							NumberFormat CalOrderTotal = NumberFormat.getCurrencyInstance();
							String CalOrderTot = CalOrderTotal.format(calculateProductTotal);
							testStepPassed("Calculated Product Total Price(Product Price + CREASET Price + Finish Price) is : " + "\""+CalOrderTot+"\"");
							waitTime(3);
							
							//Match Product Total Price with calculated product Total Price with tailor and creaset price
							if(SubTotal.equals(CalOrderTot))
							{
								testStepPassed("Calculated Product Total Price : " + "\""+CalOrderTot+"\"" + " and displayed SubTotal Value "
										+ "\"" +SubTotal+"\"" + " are equals");
								if(isElementDisplayed("Place Order#xpath=//button[contains(text(),'Place Order')]"))
								{
									clickOn("Place Order#xpath=//button[contains(text(),'Place Order')]");
								}
								else
								{
									testStepFailed("Place order not display");
								}	
								}else
								{
									testStepFailed("Calculated Product total Price and displayed SubTotal Value not equal");
								}
								}else{
									testStepFailed("Finish Price not display");
								}	
								}
								else{
									testStepFailed("CREASET Price not display");
								}	
								}else{
									testStepFailed("Product Price not display");
								}	
								}else{
									testStepFailed("SubTotal Price not display");
								}
			waitForElementToDisplay("Order ID#xpath=//div[@class='confirmation-message text-center']/h2", elementLoadWaitTime);
			waitTime(3);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}


	/***
	 *** To convert from dollar price to double value for calculation order total***
	 ***/
	public static BigDecimal parse(final String amount, final Locale locale) throws ParseException {
		final NumberFormat format = NumberFormat.getNumberInstance(locale);
		if (format instanceof DecimalFormat) {
			((DecimalFormat) format).setParseBigDecimal(true);
		}
		return (BigDecimal) format.parse(amount.replaceAll("[^\\d.,]",""));
	}
}