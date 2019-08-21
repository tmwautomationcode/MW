package mwPages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class AccountDashBoardTest_ModifyPage extends PopupWindows {

	public AccountDashBoardTest_ModifyPage(BaseClass obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	public static final String Img_Shirtimg = "Select shirt Image#xpath=//ul[@id='products']/li[1]/div/a/img";
	public static final String OrderID_AccountDashBoard = "Account Dashboard order ID#xpath=//td[contains(text(),'Order Number')]/following::tbody/descendant::td[@class='order-num']/a";


	/***
	 *** Get order id on confirmation message page***
	 ***/
	public static String OrderIDVal = null;
	public void getOrderID()
	{
		String OrderID = getText("Order ID#xpath=//div[@class='confirmation-message text-center']/h2");
		String splitOrderId[] = OrderID.split("#");
		String OrderLbl = splitOrderId[0];
		OrderIDVal = splitOrderId[1];
		System.out.println("Order ID Label :" +OrderLbl);
		System.out.println("Order ID Value : " +OrderIDVal);
		System.out.println("Order ID :" +OrderID);
		if(isElementDisplayed("Order ID#xpath=//div[@class='confirmation-message text-center']/h2"))
		{
			testStepPassed("Order ID is : " + "\""+OrderID+"\"" + " displayed");
		}else
		{
			testStepFailed("Order ID not displayed");
		}
		waitTime(3);
	}

	public void verifyOrderIDonAccountDashBoardPage(){
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String AccountDashBoardOrderID = getText(OrderID_AccountDashBoard);
			if(AccountDashBoardOrderID.equals(OrderIDVal))
			{
				testStepPassed("Order details are displayed");	
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
	
	//click product image
	public void clickonProduct()
	{
		waitForElementToDisplay(Img_Shirtimg,elementLoadWaitTime);
		if(isElementDisplayed(Img_Shirtimg))
		{
			waitTime(2);
			clickOn(Img_Shirtimg);
		}

	}

	//click order id 
	public void clickonOrderID()
	{
		if(isElementDisplayed(OrderID_AccountDashBoard))
		{
			clickOn(OrderID_AccountDashBoard);
			testStepPassed("Click on order number ");			
		}else
		{
			testStepFailed("order id not click");
		}

	}

	//verify order details after click order id
	public void getOrderDetails()
	{
		if(isElementDisplayed("Order Details#xpath=//header/h3"))
		{
			testStepPassed("\""+getText("Order Details#xapth=//header/h3")+"\"" + " is displayed");
		}else
		{
			testStepFailed("Order Details not display");
		}
	}

	//click product image
	public void clickonProductImage()
	{
		if(isElementDisplayed("Product Image#xpath=//li[@class='item']/div/..//a/img"))
		{
			clickOn("Product Iamge#xpath=//li[@class='item']/div/..//a/img");
			testStepPassed("Click on the product image");
		}
	}

	//check PDP Page
	public void checkPDPPage()
	{
		if(isElementDisplayed("Add To Shopping Bag#xpath=//a[contains(text(),'Add to shopping bag')]"))
		{
			testStepPassed("PDP Page is displayed");
		}else
		{
			testStepFailed("PDP Page not display");
		}
	}

	//check account-info page
	public void checkAccountInfoPage()
	{
		if(isElementDisplayed("Account DashBaord#xpath=//div[@id='acct-right']/h2")&&
				isElementDisplayed(OrderID_AccountDashBoard))
		{
			testStepPassed("Account Info page is displayed");
		}else
		{
			testStepFailed("Account DashBaord oage not display");
		}
	}

	//click Sign-Info
	public void clickOnSignInfo(String username,String password)
	{

		Random randomtext = new Random();
		String Name = "IndiumUser";
		int randomNo = Integer.valueOf(randomtext.nextInt(222));
		String ConfirmNewEmail = Name + randomNo + "@gmail.com";
		String ConfirmPwd = Name + randomNo;

		if(isElementDisplayed("Account Info#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'Account Info')]"))
		{
			clickOn("Account Info#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'Account Info')]");
			testStepPassed("Click on Account info section");
			if(isElementDisplayed("Sign-Info#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'Sign In Info')]"))
			{
				clickOn("Sign-Info#xpath=//ul[@id='my-acc-subnav']//a[contains(text(),'Sign In Info')]");
				testStepPassed("Click on 'sign in ' info");
				if(isElementDisplayed("New Email#xpath=//input[@id='sign-in-email1']"))
				{
					typeIn("New Email#xpath=//input[@id='sign-in-email1']", ConfirmNewEmail);

					if(isElementDisplayed("Confirm New Email#xpath=//input[@name='emailConfirm']"))
					{
						typeIn("Confirm New Email#xpath=//input[@name='emailConfirm']", ConfirmNewEmail);

						if(isElementDisplayed("New Password#xpath=//input[@name='logonPassword']"))
						{
							typeIn("New Password#xpath=//input[@name='logonPassword']", ConfirmPwd);

							if(isElementDisplayed("ReType-Password#xpath=//input[@name='logonPasswordVerify']"))
							{
								typeIn("ReType-Password#xpath=//input[@name='logonPasswordVerify']", ConfirmPwd);

								if(isElementDisplayed("Save Changes#xpath=//a[contains(text(),'Save Changes')]"))
								{
									clickOn("Save Changes#xpath=//a[contains(text(),'Save Changes')]");
									testStepPassed("change the email address and password and click on 'save changes'");

									if(isElementDisplayed("Confirmation Message#xpatgh=//div[@id='infoModal_message']"))
									{
										testStepPassed("confirmation message " +
												"\""+getText("Confirmation Message#xpatgh=//div[@id='infoModal_message']")+"\"" + 
												" displayed");

										if(isElementDisplayed("Close#xpath=//div[@id='infoModal']/a[@class='close']"))
										{
											clickOn("Close#xpath=//div[@id='infoModal']/a[@class='close']");
											testStepPassed("Close the message");
											
											if(!isElementDisplayed("Close#xpath=//div[@id='infoModal']/a[@class='close']"))
											{
												ChangeToOldEmailPassword(username,password);
												writeToLogFile("INFO", "Email id change to old from new mail id");
											}else{
												testStepFailed("Email id change to old from new mail id");
											}		}else					{
												testStepFailed("Confirmation message not close");
											}			}else{
												testStepFailed("Confirmation message not display");
											}					}else{
												testStepFailed("Save changes button not display");
											}						}else{
												testStepFailed("ReType - Password not display");
											}				}else{
												testStepFailed("New Password not display");
											}				}else{
												testStepFailed("Confirm New Email not display");
											}			}else{
												testStepFailed("New Email not display");
											}		}else{
												testStepFailed("Sign info not display");
											}	}else{
												testStepFailed("Account info not dispaly");
											}

	}
	
	//Change to old Email ID and Password from New Email ID,Password
	public void ChangeToOldEmailPassword(String username,String password)
	{
		typeIn("New Email#xpath=//input[@id='sign-in-email1']", username);
		typeIn("Confirm New Email#xpath=//input[@name='emailConfirm']", username);
		typeIn("New Password#xpath=//input[@name='logonPassword']", password);
		typeIn("ReType-Password#xpath=//input[@name='logonPasswordVerify']", password);
		clickOn("Save Changes#xpath=//a[contains(text(),'Save Changes')]");
		if(isElementDisplayed("Confirmation Message#xpatgh=//div[@id='infoModal_message']"))
		{
			writeToLogFile("INFO","confirmation message " +
					"\""+getText("Confirmation Message#xpatgh=//div[@id='infoModal_message']")+"\"" + 
					" displayed");

			if(isElementDisplayed("Close#xpath=//div[@id='infoModal']/a[@class='close']"))
			{
				clickOn("Close#xpath=//div[@id='infoModal']/a[@class='close']");
				writeToLogFile("INFO","Close the message");
			}else{
				writeToLogFile("INFO", "Confirmation message not close");
			}}else	{
				writeToLogFile("INFO", "Confirmation message not display");
			}
	}
	
	//Click Payment Info
	public void clickOnPaymentInfo()
	{
		if(isElementDisplayed("Payment Methods#xpath=//ul[@id='personalInfoSubMenu']//a[contains(text(),'Payment Methods')]"))
		{
			clickOn("Payment Methods#xpath=//ul[@id='personalInfoSubMenu']//a[contains(text(),'Payment Methods')]");
			if(isElementDisplayed("Payment Method Page#xpath=//li[@class='payment-method-headers ']//span[@class='card-type']/following::span[@class='card-type']"))
			{
				testStepPassed("click on 'payment info'");
				if(isElementDisplayed("Add new payment method#xpath=//a[@class='flat-btn add-new']"))
				{
					clickOn("Add new payment method#xpath=//a[@class='flat-btn add-new']");
					
					if(isElementDisplayed("Add new payment method form#xpath=//form[@id='PaymentDetailsForm']"))
					{
						testStepPassed("Add new payment page is displayed");
					}
			}
		}
		}
	}
	
	//Add new payment method
	public void addNewPayment(String cardType,String CardNumber,String ExpireMonth,String ExpireYear,String Address)
	{
		if(isElementDisplayed("Add new payment method form#xpath=//form[@id='PaymentDetailsForm']"))
		{
			selectFromDropdown("Card Type#xpath=//select[@id='payMethodId']", cardType);
			typeIn("Card Number#xpath=//input[@name='cardNumber']", CardNumber);
			selectFromDropdown("Expire Month#xpath=//select[@id='expire_month']", ExpireMonth);
			selectFromDropdown("Expire Year#xpath=//select[@id='expire_year']", ExpireYear);
			selectFromDropdown("Address#xpath=//select[@name='addressId']", Address);
			
			if(isElementDisplayed("Address#xpath=//div[@id='PaymentDetailsFormExistingAddrDiv']"))
			{
				clickOn("Save#xpath=//div[@class='submit-actions']//a[contains(text(),'Save')]");
				if(isElementDisplayed("Card-Type#xpath=//li[@class='payment-method-headers']/following::span[@class='card-type']"))
				{
					testStepPassed("Payment added successfully");
				}else
				{
					testStepFailed("Payment not added");
				}}else
				{
					testStepFailed("Existing address not display");
				}}else
				{
					testStepFailed("Add new payment page not display");
				}
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

