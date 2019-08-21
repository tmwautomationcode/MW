package mwPages;

import java.math.BigDecimal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class UnionTerritoryCheckoutPage extends PopupWindows{

	public UnionTerritoryCheckoutPage(BaseClass obj) {
		super(obj);

	}

	public static final String lnk_Header_SignIn = "Header Link - SignIn#xpath=//a[contains(@id,'sign-in-link-header')]";
	public static final String Img_Shirtimg = "Select shirt Image#xpath=//ul[@id='products']/li[1]/div/a/img";
	public static final String ItemPrice = "Selected item price#xpath=//h3[contains(@id,'regOfferPrice')]";
	public static final String txt_ShirtPrice = "Shirt Price#xpath=//h3[contains(@id,'regOfferPrice')]";
	public static final String drp_SelectedSize = "Selected size dropdown#xpath=//a[contains(text(),'Select Size')]";
	public static final String txt_SubtotalPrice = "Subtotal Price#xpath=//span[contains(text(),'Subtotal')]/following::span";
	public static final String txt_SubtotalAfterdigitprice = "After digit subtotal price#xpath=//span[contains(text(),'Subtotal')]/following::span/sup";
	public static final String Lbl_CheckoutGuest = "Checkout Guest#xpath=//a[@id='checkoutGuestToggle']/span[contains(text(),'Checkout')]";
	public static final String txt_CheckoutGuestEmailID = "Checkout Guest EmailID#xpath=//input[@id='logonIDGuest']";
	public static final String Btn_CheckoutGuest = "Checkout guest button#xpath=//button[@id='checkoutGuest']/span[contains(text(),'Checkout')]";
	public static final String Lbl_ShippingAddress = "Shipping Address page#xpath=//a[contains(text(),'Ship to Address')]";
	public static final String txt_shipaddress_firstName = "TextBox: FirstName#xpath=//input[@id='ship-firstname']";
	public static final String txt_shippingaddress_lastName = "TextBox:LastName#xpath=//input[@id='ship-lastname']";
	public static final String txt_shippingaddress_StreetaddressOne = "TextBox: Street Address 1#xpath=//input[@id='ship-street1']";
	public static final String txt_shippingaddress_city = "TextBox: City#xpath=//input[@id='ship-city']";
	public static final String drp_shippingaddress_state = "DropDown: State#xpath=//select[@id='ship-state']";
	public static final String txt_shippingaddress_zipcode = "TextBox: ZipCode#xpath=//input[@id='ship-zip']";
	public static final String txt_shippingAddressTelephone = "TextBox: Phone1 #xpath=//input[@id='ship-tel']";
	public static final String Btn_Continue = "Continue button on shipping Address#xpath=//button[contains(text(),'Continue')]";
	public static final String Msg_StandardUSTerritory = "Standard US Terriotry Message#xpath=//div[@id='shipModeUsterr']";
	public static final String Lbl_CreditCard = "Credit Card Page#xpath=//a[contains(text(),'Credit Card')]";
	public static final String txt_Billing_CreditCard_Number="credit Card Number#xpath=//input[contains(@id,'pay-ccnum')]";
	public static final String txt_Billing_CreditCard_CVV="CVV#xpath=//input[contains(@id,'pay-cvv')]";
	public static final String drp_Billing_CreditCard_ExpiryMonth="Expiry Month#xpath=//select[contains(@id,'exp-date-mo')]";
	public static final String drp_Billing_CreditCard_ExpiryYear="Expire Year#xpath=//select[contains(@id,'exp-date-yr')]";
	public static final String Chk_ShippingAddressAsBillingAddress = "Use shipping address as my billing address#xpath=//input[@id='billingSameAsShipping']";
	public static final String Btn_PlaceOrder = "Place Order#xpath=//button[contains(text(),'Place Order')]";
	public static final String Msg_OrderID = "Order ID#xpath=//h2[@class='sub-title']";
	public static final String txt_GuestUserPassword = "Guest user password#xpath=//input[@id='logonPassword']";
	public static final String txt_GuestUserConfirmPassword = "Guest user confirm password#xpath=//input[@id='confirmPassword']";
	public static final String Btn_SignUpNow = "SignUp Now#xpath=//button[contains(text(),'Sign Up Now')]";
	public static final String OrderID_AccountDashBoard = "Account Dashboard order ID#xpath=//td[contains(text(),'Order Number')]/following::tbody/descendant::td[@class='order-num']/a";
	public static final String Address_ReviewPage = "Address on review page#xpath=//p[contains(text(),'Address')]/following::div[@class='value']";
	public static final String Lbl_CheckoutRegisteredUser = "Registered User Checkout#xpath=//a[contains(text(),'Checkout')]";
	public static final String but_AddToCart = "Add To Cart#xpath=//a[contains(@id,'add-to-cart')]";


	public void signInHeaderLinks()
	{
		waitTime(3);
		clickOn(lnk_Header_SignIn);
	}


	/***
	 *** Select price on price link***
	 ***/
	public void selectPrice(String priceRange)
	{
		try{
			List<WebElement> priceLevelList;
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.xpath("//span[contains(@id,'price') or contains(text(),'Price')]"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on price");
				}
			}else{
				waitForElementToDisplay("price#xpath=//span[contains(@id,'price') or contains(text(),'Price')]", elementLoadWaitTime);
				mouseOver("Price#xpath=//span[contains(@id,'price') or contains(text(),'Price')]");	

			}

			waitTime(7);
			waitForElementToDisplay("price range#xpath=//li[contains(text(),'"+priceRange+"')]", elementLoadWaitTime);
			priceLevelList=driver.findElements(By.xpath("//li[contains(text(),'"+priceRange+"')]"));
			for(WebElement ele: priceLevelList){
				String priceRangeList=ele.getText().trim();
				if(priceRangeList.equalsIgnoreCase(priceRange.trim())){
					ele.click();
					waitTime(5);
					testStepPassed("click on: " +"\""+priceRangeList+"\"" + " price dropdown");
					break;
				}
			}
			waitForElementToDisplay(Img_Shirtimg,elementLoadWaitTime);
			if(isElementDisplayed(Img_Shirtimg))
			{
				clickOn(Img_Shirtimg);
				String getSelectedItemPrice = getText("Selected item price#xpath=//h3[contains(@id,'regOfferPrice') or contains(@id,'regPromoPrice')]"); //$39.99
				BigDecimal selectedPrice = parse(getSelectedItemPrice, Locale.US);
				System.out.println("Item price is :" +selectedPrice);
				NumberFormat item = new DecimalFormat();
				String ItemPrice = item.format(selectedPrice);
				double ItemPricechk = Double.parseDouble(ItemPrice);
				System.out.println("Item price check :" +ItemPricechk);
				double range = 99;
				if(ItemPricechk < range )
				{
					testStepPassed("Selected item Price is : " + "\""+selectedPrice+"\"" + " below 99 (< 99)");
				}else if(ItemPricechk > range)
				{
					testStepPassed("Selected item Price is : " + "\""+selectedPrice+"\"" + " above 99 (> 99)");
				}else{
					testStepFailed("Price Range not (>),(<) 99");
				}
				waitTime(3);
			}
			else
			{
				testStepFailed("Clothing item not displayed");
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}

	}

	/***
	 ******Select Size from DropDown on AddToCart Page***
	 ***/
	public void selectSizeOnAddToCart(String selectSize)
	{
		try{
			if(isElementDisplayed(drp_SelectedSize))
			{
				clickOn(drp_SelectedSize);
				waitTime(3);
				clickOnSpecialElement("Select size from dropdown#xpath=//div[@class='col-wrap']/../..//li[@role='option']/a[@data-size='"+selectSize+"']");
				testStepPassed("Size is selected on selected size dropdown");
			}else
			{
				testStepFailed("Size not selected on selected size dropdown");
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/***
	 ***Select Size from DropDown on AddToCart Page for > 99 ***
	 ***/
	/*public void selectSizeAbove99()
	{
		try{
			waitForElementToDisplay(drp_SelectedSize,elementLoadWaitTime);
			clickOn(drp_SelectedSize);
			waitTime(3);
			clickOnSpecialElement("Select size from dropdown#xpath=//div[@class='col-wrap']/ul[@class='stndrd']/li[@role='option'][3]/a");
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}*/


	/***
	 **** Checkout for Guest User***
	 ***/

	public void clickonCheckoutGuest()
	{
		try{

			if(isElementDisplayed(Lbl_CheckoutGuest))
			{
				clickOn(Lbl_CheckoutGuest);
				waitForElementToDisplay(txt_CheckoutGuestEmailID, elementLoadWaitTime);
				if(isElementDisplayed(txt_CheckoutGuestEmailID))
				{	
					getRandomGuestEmailID();
					testStepPassed("Checkout guest user email id is entered successfully");
				}else
				{
					testStepFailed("Checkout guest user email id not entered");
				}
			}else
			{
				testStepFailed("Checkout guest user email id textbox not display");
			}

		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/***
	 ****Generate Random Email ID for checkout guest user ***
	 ***/
	public void getRandomGuestEmailID()
	{
		Random randomtext = new Random();
		String Name = "IndiumGuest";
		int randomNo = Integer.valueOf(randomtext.nextInt(222));
		String GuestEmailID = Name + randomNo + "@gmail.com";
		typeIn(txt_CheckoutGuestEmailID, GuestEmailID);
		clickOn(Btn_CheckoutGuest);
		waitTime(3);
		if(isElementDisplayed(Lbl_ShippingAddress))
		{
			testStepPassed("The Shipping Address page is displayed");
		}else
		{
			testStepFailed("The Shipping address page not displayed");
		}

	}

	/***
	 ****Fill shipping address on checkout***
	 ***/
	public void fillCheckoutShippingAddress(String firstName, String lastName, String addressOne,String city,String state,String zipcode, String dayPhone){

		typeIn(txt_shipaddress_firstName, firstName);
		typeIn(txt_shippingaddress_lastName, lastName);
		typeIn(txt_shippingaddress_StreetaddressOne, addressOne);
		typeIn(txt_shippingaddress_city, city);
		try
		{
			Select dropdown =  new Select(driver.findElement(By.xpath("//select[@id='ship-state']")));
			dropdown.selectByVisibleText("GU - Guam");
			System.out.println("Select GU - Guam from:state dropdown");
		}
		catch(Exception e)
		{
			System.out.println("GU - Guam Element not found 45 sec");
		}
		typeIn(txt_shippingaddress_zipcode, zipcode);
		typeIn(txt_shippingAddressTelephone, dayPhone);
		waitTime(3);
			
	}
	
	public static final String Val_SubTotal = "Subtotal Price#xpath=//li[@class='hide-for-small-only'][1]/..//span[@class='value product-price']";
	public static final String Val_Esttax = "Est Taxes Price#xpath=//li[contains(@aria-label,'Estimated Taxes')]/../..//span[@class='value product-price total_figures']";
	public static final String Val_EstShipping = "Est Taxes Price#xpath=//li/span[contains(@aria-label,'Estimated Shipping')]/../..//span[@class='value product-price total_figures js-shipping-tax']";
	public static final String Val_OrderTot = "OrderTotal Price#xpath=//li/span[contains(@aria-label,'Order Total')]/../..//span[@class='value product-price total_figures js-order-total']";
	

	/***
	 ****Check order total calculation whether its equals with displaying order total***
	 ***/
	public void getOrderTotal() throws ParseException
	{
		//SubTotal Price
		final String SubTotalpricebeforedigit = getText(Val_SubTotal); // $39.99
		testStepPassed("Subtotal Price  :" + "\""+SubTotalpricebeforedigit+"\"");
		BigDecimal subtot = parse(SubTotalpricebeforedigit, Locale.US);
		System.out.println("Subtotal Price without dollar  :" +subtot);

		//Estimated Taxes Price
		final String EstTaxesPrice = getText(Val_Esttax); // $39.99
		testStepPassed("EstTaxes Price:" + "\""+EstTaxesPrice+"\"");
		BigDecimal EstTaxes = parse(EstTaxesPrice, Locale.US);
		System.out.println("EstTaxes Price without dollar  :" +EstTaxes);

		//Estimated Shipping Price
		final String EstShippingPrice = getText(Val_EstShipping); // $39.99
		testStepPassed("EstShipping Price :" + "\""+EstShippingPrice+"\"");
		BigDecimal EstShipping = parse(EstShippingPrice, Locale.US);
		System.out.println("EstShipping Price without dollar  :" +EstShipping);

		//Order Total price
		final String OrderTotal = getText(Val_OrderTot); // $39.99
		testStepPassed("Displaying Order Total Value is :" + "\""+OrderTotal+"\"");

		//Calculate Sub total,Estimated Tax and Estimated Shipping price
		BigDecimal calculateOrderTotal = subtot.add(EstTaxes).add(EstShipping);
		System.out.println("Calculated Order Total Value without dollar is : " +calculateOrderTotal);

		//Convert Calculated order total value to currency
		NumberFormat CalOrderTotal = NumberFormat.getCurrencyInstance();
		String CalOrderTot = CalOrderTotal.format(calculateOrderTotal);
		testStepPassed("Calculated Order Total Value is : " + "\""+CalOrderTot+"\"");
		waitTime(3);
		//Match Order Total Price with calculated Total Price
		if(OrderTotal.equalsIgnoreCase(CalOrderTot))
		{
			testStepPassed("Calculated Order Total Value : " + "\""+CalOrderTot+"\"" + " and displayed order total value "
					+ "\"" +OrderTotal+"\"" + " are equals");
		}else
		{
			testStepFailed("Calculated order total value and displayed order total value not equal");
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

	/***
	 *** Getting $8 - STANDARD US TERRITORIES: 2-3 WEEKS message***
	 ***/
	public void getStandardUSTerritoryMessage()
	{
		try{
			if(isElementDisplayed(Msg_StandardUSTerritory))
			{
				testStepPassed("Shipping Method Defaults to " + "\""+getText(Msg_StandardUSTerritory)+"\"" + " displayed");
			}else
			{
				testStepFailed("Default Shipping Method not displayed");
			}}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}

	}

	public static final String Pge_CreditCard = "Credit Card Page#xpath=//h3[contains(text(),'Credit card info')]";
	
	/***
	 *** Continue on shipping address page***
	 ***/
	public void clickOnContinueShippingAddress(){
		try{
			waitTime(3);
			clickOn(Btn_Continue);
			waitForElementToDisplay(Pge_CreditCard, elementLoadWaitTime);
			if(isElementDisplayed(Pge_CreditCard))
			{
				testStepPassed("Shipping Address is filled up successfully");
				testStepPassed("The Payment Page is displayed");}else
				{
					testStepFailed("The Payment Page not displayed");
				}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}

	}

	/***
	 *** Fill Credit Card Details***
	 ***/
	/*private String strCardNumber;
	private String strCardExpiryMonth;
	private String strCardExpiryYear;
	private String strCardCvv;*/
	//private String strGiftCardNumber;
	//private String strPIN;

	public void fillCreditCardDetails(String cardNumber, String cvv, String expireMonth, String expireyear){

		try{
			/*if(cardNumber.isEmpty()||expireMonth.isEmpty()||expireyear.isEmpty()||cvv.isEmpty()){
			setPaymentData(cardType);
		}else{
			strCardNumber=cardNumber;
			strCardCvv=cvv;
			strCardExpiryMonth=expireMonth;
			strCardExpiryYear=expireyear;
		}*/
			typeIn(txt_Billing_CreditCard_Number,cardNumber);
			typeIn(txt_Billing_CreditCard_CVV,cvv);
			selectFromDropdown(drp_Billing_CreditCard_ExpiryMonth,expireMonth);
			selectFromDropdown(drp_Billing_CreditCard_ExpiryYear,expireyear);
			selectCheckBox(Chk_ShippingAddressAsBillingAddress);
			waitTime(3);
			clickOn("Continue#xpath=//button[contains(@id,'continue-payment')]");
			if(isElementDisplayed(Btn_PlaceOrder))
			{
				testStepPassed("Cards Details filled up successfully");
				testStepPassed("Review Page is displayed");
			}else
			{
				testStepFailed("Review page not displayed");
			}
			waitTime(3);
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/*public void setPaymentData(String cardType){
		switch (cardType.toLowerCase().trim()) {
		case "master card credit card":
			strCardNumber=getConfigProperty("Master Card Credit Card");
			strCardCvv=getConfigProperty("CardCVV");
			break;

		case "discover":
			strCardNumber=getConfigProperty("Discover");
			strCardCvv=getConfigProperty("CardCVV");
			break;

		case "diners club":
			strCardNumber=getConfigProperty("Diners Club");
			strCardCvv=getConfigProperty("CardCVV");
			break;

		case "american express credit card one":
			strCardNumber=getConfigProperty("American Express Credit Card One");
			strCardCvv=getConfigProperty("CardCVV2");
			break;

		case "american express credit card two":
			strCardNumber=getConfigProperty("American Express Credit Card Two");
			strCardCvv=getConfigProperty("CardCVV2");
			break;

		case "visa credit card":
			strCardNumber=getConfigProperty("VISA Credit Card");
			strCardCvv=getConfigProperty("CardCVV");
			break;

		default:
			strCardNumber=getConfigProperty("Master Card Credit Card");
			strCardCvv=getConfigProperty("CardCVV");
			break;
		}
		strCardExpiryMonth=getConfigProperty("CardExpiryMonth");
		strCardExpiryYear=getConfigProperty("CardExpiryYear");


	}*/

	public static final String Val_OrderID = "Order ID#xpath=//div[@class='confirmation-message text-center']/h2";
	/***
	 *** Verify the address on reviewPage***
	 ***/
	public void clickonPlaceOrder()
	{

		try{

			String[] address = {"Street","City,State and Zipcode","TelePhone"};
			String Street = "111 Chalan Santo Papa Juan Pablo Dos";
			String City = "Hagatna, GU 96910";
			String GuestUserTelephone = "(236) 234-6234";
			String RegisterUserTelePhone = "(236) 252-5245";
			List<WebElement> ele = driver.findElements(By.xpath("//p[contains(text(),'Address')]/..//div[@class='value']/p"));
			for(int i=0;i<ele.size();i++)
			{
				if(ele.get(0).getText().equals(Street)||(ele.get(1).getText().equals(City)
						||(ele.get(2).getText().equals(GuestUserTelephone))))
				{
					testStepPassed(address[i] + " \""+ele.get(i).getText()+"\"");
					driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
				}else if(ele.get(0).getText().equals(Street)||(ele.get(1).getText().equals(City)
						||(ele.get(2).getText().equals(RegisterUserTelePhone))))
				{
					testStepPassed(address[i] + " \""+ele.get(i).getText()+"\"");
					driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
				}else
					testStepFailed("Expected Address not displayed");
			}
			waitForElementToDisplay(Val_OrderID, elementLoadWaitTime);
			waitTime(3);
		
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}

	}

	/***
	 *** Get order id on confirmation message page***
	 ***/
	public static String OrderIDVal = null;
	public void getOrderID()
	{
		String OrderID = getText(Val_OrderID);
		String splitOrderId[] = OrderID.split("#");
		String OrderLbl = splitOrderId[0];
		OrderIDVal = splitOrderId[1];
		System.out.println("Order ID Label :" +OrderLbl);
		System.out.println("Order ID Value : " +OrderIDVal);
		System.out.println("Order ID :" +OrderID);
		if(isElementDisplayed(Val_OrderID))
		{
			testStepPassed("Order ID is : " + "\""+OrderID+"\"" + " displayed");
		}else
		{
			testStepFailed("Order ID not displayed");
		}
		waitTime(3);
	}

	/***
	 *** Give user name and Password for checkout guest user***
	 ***/
	public void givePasswordForGuestUser(String GuestUserPassword,String GuestUserConfirmPassword)
	{
		typeIn(txt_GuestUserPassword, GuestUserPassword);
		typeIn(txt_GuestUserConfirmPassword, GuestUserConfirmPassword);
		clickOn(Btn_SignUpNow);
		if(isElementDisplayed(OrderID_AccountDashBoard))
		{
			testStepPassed("Username and Password is filled up on guest user signupNow page");
		}else
		{
			testStepFailed("Username and Password not given to guest user");
		}
	}

	/***
	 *** Verify the Order id on Account dash board page whether it is equals with review page order id***
	 ***/
	public void verifyOrderIDonAccountDashBoardPage(){
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String AccountDashBoardOrderID = getText(OrderID_AccountDashBoard);
			if(AccountDashBoardOrderID.equals(OrderIDVal))
			{
				testStepPassed("The Place Order ID " + "\""+AccountDashBoardOrderID+"\"" + " displayed on Account Dashboard page");	
				waitTime(3);
				
			}else
			{
				testStepFailed("The Place Order Id and Account dashboard page order id not matched");
			}

		}
		catch(Exception e)
		{
		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}

	/***
	 *** Checkout for registered user***
	 ***/
	public void clickonCheckoutRegisteredUser()
	{
		try{

			if(isElementDisplayed(Lbl_CheckoutRegisteredUser))
			{
				clickOn(Lbl_CheckoutRegisteredUser);
				if(isElementDisplayed(Lbl_ShippingAddress))
				{
					testStepPassed("The Shipping Address page is displayed");
				}else
				{
					testStepFailed("The Shipping address page not displayed");
				}

			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/***
	 *** Verify the Saved address is displayed on Shipping Address Page***
	 ***/
	public void getSavedAddressCheckoutRegisteredUser()
	{
		try{
			if(isElementDisplayed("Saved Address#xpath=//div[@aria-label='Choose from saved addresses']/span[@class='selected-item dropdown-placeholder']"))
			{
				testStepPassed("Saved Address is  : "
								+ "\""+getText("Saved Address#xpath=//div[@aria-label='Choose from saved addresses']/span[@class='selected-item dropdown-placeholder']")+"\"" + 
								" displayed on shipping address page");
			}else
			{
				testStepFailed("Choose from Saved Address not displayed");
			}}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/***
	 *** Verify the saved cards details are displayed on payment page***
	 ***/
	public void getSavedCardsCheckoutRegisteredUser(String cvv)
	{
		try{
			if(isElementDisplayed("Saved Cards#xpath=//div[@aria-label='Choose from saved cards']/span[@class='selected-item dropdown-placeholder']"))
			{
				testStepPassed("Card Details is " + "\""+getText("Saved Cards#xpath=//div[@aria-label='Choose from saved cards']/span[@class='selected-item dropdown-placeholder']")+"\"" + 
								" displayed on payement page ");
				typeIn("Saved Cards CVV#xpath=//input[@id='savedCardCVV']",cvv);
				clickOn("Continue#xpath=//button[contains(@id,'continue-payment')]");
				waitForElementToDisplay(Btn_PlaceOrder, elementLoadWaitTime);
				if(isElementDisplayed(Btn_PlaceOrder))
				{	testStepPassed("CVV is filled up on cards page to registered user page");
					testStepPassed("Review Page is displayed");
				}else
				{
					testStepFailed("Review page not displayed");
				}
			}else
			{
				testStepFailed("Choose from Saved Cards not displayed");
			}}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}

	}

	/***
	 *** Click Logo for verifying the Order Id on confirmation message page***
	 ***/
	public void clickonLogo()
	{
		try{
			waitForElementToDisplay("Logo#xpath=//img[@class='logo']", elementLoadWaitTime);
			clickOnSpecialElement("Logo#xpath=//img[@class='logo']");
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}

	/***
	 ***Verify the order id on order history page whether it is equals with confirmation message page order id***
	 ***/
	public void clickOnOrderHistory(){
		try{
			waitTime(3);
			if(currentBrowser.equalsIgnoreCase("safari")){
				WebElement element=driver.findElement(By.id("header-user-greeting"));
				if(onMouseOverSafari(element)){
					testStepPassed("Mouse hover on 'Header Link - Greeting'");
				}
			}else{
				mouseOver(lnk_Header_Greeting);
			}

			waitTime(1);
			clickOn("Order History#xpath=//a[contains(text(),'Order History')]");
			String OrderHistoryPageOrderID = getText(OrderID_AccountDashBoard);
			waitForElementToDisplay("Order History Page#xpath=//h2[contains(text(),'Order History')]", elementLoadWaitTime);
			if(isElementDisplayed("Order History Page#xpath=//h2[contains(text(),'Order History')]"))
			{
				testStepPassed("Order ID is " +"\""+OrderHistoryPageOrderID+"\"" + "displayed on order history page");
			}else
			{
				testStepFailed("The Place Order Id and Order history page order id not matched");
			}

		}catch(Exception e){
			testStepFailed("Order History not click");
		}
	}
	
	
	/***
	 ***Get Perfect Fit ID to register PF User***
	 *****/
	
	public void getPerfectFitID()
	{
		String PerfectFitID = getText("Perfect Fit ID#xpath=//p[@id='perfectFitSection']/b");
		if(isElementDisplayed("Perfect Fit ID#xpath=//p[@id='perfectFitSection']/b"))
		{
			testStepPassed("Your Perfect Fit Rewards number " + "\""+PerfectFitID+"\"" + " is linked to this order!");
		}else
		{
			testStepFailed("Perfect fit id not displayed");
		}
		
	}
	
	public void typeInCertificateNumber(String certificateNumber)
	{
		if(isElementDisplayed("Certificate No#xpath=//input[@name='pfCode']"))
		{
			typeIn("Certificate No#xpath=//input[@name='pfCode']", certificateNumber);
			clickOn("Apply#xpath=//button[@id='applyPFBtn']");
		}
	}
	
	public void getRewardPointsMessage()
	{
		if(isElementDisplayed("Reward Points#xpath=//div[@class='promotion-callout checkout-review-promo']"))
		{
			String RewardPoints = getText("Reward Points#xpath=//div[@class='promotion-callout checkout-review-promo']");
			testStepPassed("\""+RewardPoints+"\"");
		}else
		{
			testStepFailed("Reward points message not displayed");
		}
	}
	
	/**
	 ***Guest user with PF***
	 ****/
	
	public void typeInPerfectFitRewardsNumber(String PerfectFitID)
	{
		try
		{
			if(isElementDisplayed("Perfect Fit Rewards#xpath=//a[contains(text(),'Perfect Fit Rewards')]"))
			{
				clickOn("Perfect Fit Rewards#xpath=//a[contains(text(),'Perfect Fit Rewards')]");
				if(isElementDisplayed("Perfect Fit ID#xpath=//input[@id='js-reward-pf-linkup-input']"))
				{
					typeIn("Perfect Fit ID#xpath=//input[@id='js-reward-pf-linkup-input']", PerfectFitID);
					clickOn("Save#xpath=//button[contains(text(),'Save')]");
					if(isElementDisplayed("Perfect Fit ID#xpath=//p[@id='perfectFitSection']/b"))
					{
						testStepPassed("Your Perfect Fit Rewards number " + "\""+PerfectFitID+"\"" + " is linked to this order!");
					}else
					{
						testStepFailed("Perfect fit id not displayed");
					}
				}

			}else
			{
				testStepFailed("Perfect Fit Rewards not displayed");
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
}
