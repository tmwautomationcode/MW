package mwPages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import baseClass.PopupWindows;

public class ShoppingCartPage extends PopupWindows
{
	public ShoppingCartPage(BaseClass obj) {
		super(obj);
	}

	public static final String lnk_EditProduct = "search for a store link#xpath=//a[contains(@id,'change-store-pop')]"; 

	public static final String lnk_EditItem = "EditItem link#xpath=//div[contains(@id,'ShopCartPagingDisplay')]//a[contains(text(),'Edit')]";
	//public static final String txt_EditQuantity = "EditItem Quantity Textbox#xpath=//div[contains(@class,'qv-wrap edit-item-modal')]//input[contains(@id,'quantity')]";
	public static final String txt_EditQuantity = "EditItem Quantity Textbox#xpath=//div[contains(@class,'qv-wrap')]//input[contains(@id,'quantity')]";
	//public static final String btn_Update = "Update Button#xpath=//div[contains(@class,'qv-wrap edit-item-modal')]//a[contains(@id,'update')]";
	public static final String btn_Update = "Update Button#xpath=//div[contains(@class,'qv-wrap')]//a[contains(@id,'update')]";

	public static final String lnk_SavedItems="Saved Items Link#xpath=//h2[contains(text(),'Saved Items')]";//*[@id='js-shoppingBagSaved']/div";
	public static final String btn_cart_checkout="check out button#xpath=//a[contains(@id,'checkoutRegistered') or @id='checkout']";
	public static final String lbl_Shopping_cart="Shopping Cart items #xpath=//div[@id='ShopCartDisplay']";
	//	public static final String lbl_SavedItem="Saved Item#xpath=//h2/a[text()='Saved Items']";
	public static final String lbl_EmyptyCartProduct="Empyt Cart Product item#xpath=//section[contains(@class,'cart-cart')]//h2[text()='Your Shopping Cart Is Empty.']";
	//public static final String lnk_SavedItems="Saved Items Link#xpath=//section[@id='cart-saved']/header/h2/a";
	//public static final String lbl_EmyptySavedItemList="Empyt Saved Item List#xpath=//h3[@class='cart-saved-message']";
	public static final String lbl_EmyptySavedItemList= "Empyt Saved Item List#xpath=//*[contains(text(),'Your shopping cart is empty.')]";
	public static final String drp_ShippingMethod = "Shipping Method dropdown #xpath=//select[contains(@name,'singleShipmentShippingMode')]";
	public static final String lnk_searchforastore = "search for a store link#xpath=//a[contains(@id,'change-store-pop')]"; 
	public static final String txt_zipcode = " Zip Code for store#xpath=//section[contains(@id,'shipPanelSection')]//input[contains(@id,'myZipCode')]";
	public static final String btn_findAStore = "Find a Store button#xpath=//section[contains(@id,'shipPanelSection')]//input[contains(@id,'findAStoreBtn')]";
	public static final String btn_Paypay_checkout="Paypay check out button#xpath=//*[@id='paypal_express']/a/img";
	public static final String btn_Paypay_checkout_new="Paypay check out button#xpath=//div[contains(@class,'shopping-bag')]//div[contains(@id,'paypal_express')]//a";
	public static final String txt_shoppingcareempty="text #xpath=//*[contains(text(),'Your shopping cart is empty.')]";
	public static final String ele_savedlinkempty="link#xpath=//h3[contains(text(),'Your saved items list is empty')]";
	public static final String btn_Addtobag="Add to bag #xpath=//*[text()='Add to Bag']";
	public static final String close_saved="closed the saved message#xpath=//div[@id='InterestItemSuccess']//a[.='Close']";
	////
	public static final String txt_Username="Username#xpath=//div[contains(@id,'signIn')]//input[contains(@type,'email')]";
	public static final String txt_Password="Password#xpath=//div[contains(@id,'signIn')]//input[contains(@type,'password')]";
	public static final String btn_SignInToCheckout="Sign In To Checkout Button#xpath=//*[@id='continue-signin-checkout']";
	//public static final String btn_Checkout="Checkout Button#xpath=//*[contains(@id,'checkoutRegistered')]";
	public static final String btn_Checkout="Checkout Button#xpath=//*[contains(@id,'checkoutRegistered') or contains(@id,'checkout')]";
	public static final String lnk_view_shoppingbag = "View Shopping Bag Link#xpath=//div[contains(@class,'mini-bag')]//div[contains(@class,'text')]//a[contains(text(),'view shopping bag')]";
	public static final String txt_shoppingcartempty="Shopping Cart Empty Text#xpath=.//h1[@class='empty-cart-title']";
	public static final String lnk_shoppingbagremove="Shopping Bag Remove Link#xpath=//div[@id='order_details']//a[contains(text(),'Remove')]";
	public static final String txt_shoppingbagheading="Shopping Bag Page Heading#xpath=//div[contains(@class,'shopping-bag-header')]//h2[contains(text(),'Shopping Bag')]";
	public static final String lnk_shoppingbag_saveditems_delete="Shopping Bag Saved Item Delete Link#xpath=//li[contains(@id,'js-gtm-saved-item')]//span[contains(@class,'remove-cta')]//span[contains(@class,'fa fa-times')]";
	public static final String btn_addtoshoppingbag_fromsaveditems="Add to Shopping Bag from Saved Items Button#xpath=//div[contains(@class,'rw shopping-bag-recommendations')]//ul[contains(@id,'js-shoppingBagSaved')]//li[contains(@id,'js-gtm-saved-item')]//button[contains(text(),'Add to Bag')]";
	public static final String lnk_applicationlogo="Application Logo Link#xpath=//section[contains(@class,'logo-bar')]/a";
	public static final String btn_checkoutnew="Checkout Button#xpath=//a[contains(text(),'Checkout')]";
	public static final String btn_checkout_registereduser="Checkout Button#xpath=//div[contains(@class,'shopping-bag')]//div[contains(@id,'LogonCheckoutWidgetArea')]//a[contains(text(),'Checkout')]";
	public static final String lnk_my_bag="Shopping bag#xpath=//a[@id='header-cart-nocount']";//a[@class='js-toggle-minicart js-checkout-link']/img";
	//

	public static final String txt_CheckoutasRegisteredEmail="Checkout as Registered User Email Textbox#xpath=//div[contains(@id,'signInCheckoutCTALarge')]//input[contains(@id,'logonID2')]";
	public static final String txt_CheckoutasRegisteredPassword="Checkout as Registered User Password Textbox#xpath=//div[contains(@id,'signInCheckoutCTALarge')]//input[contains(@id,'password2')]";
	public static final String btn_SignInToCheckOut="Sign In to Checkout Button#xpath=//div[contains(@id,'signInCheckoutCTALarge')]//a[@id='continue-signin-checkout']";


	//public static final String btn_CheckoutasGuestToggle="Checkout as Guest Toggle Button#xpath=//div[contains(@id,'guestCheckoutCTALarge')]//a[contains(@id,'checkoutGuestToggle')]";
	public static final String btn_CheckoutasGuestToggle="Checkout as Guest Toggle Button#xpath=//div[@id='guestCheckoutCTALarge']//button[@id='checkoutGuest']";
	public static final String txt_CheckoutasGuestEmail="Checkout as Guest Email Textbox#xpath=//div[contains(@id,'guestCheckoutCTALarge')]//input[contains(@id,'logonIDGuest')]";
	public static final String btn_CheckoutasGuestUser="Checkout as Guest User Button#xpath=//div[contains(@id,'guestCheckoutCTALarge')]//button[contains(@id,'checkoutGuest')]";

	public static final String txt_ShoppingBag_ItemsCount="Shopping Bag Items Count Heading Text#xpath=//div[contains(@class,'shopping-bag-header')]//span";
	public static final String btn_ShoppingBag_CheckoutRegistered_AfterReducingItem="Shopping Bag Checkout Registered After Reducing Item Button#xpath=//div[contains(@id,'ShopCartDisplay')]//a[contains(@id,'checkoutRegistered')]";
	public static final String btn_ShoppingBagPage_BackToTopButton="Shopping Bag Back To Top Button#xpath=//footer[contains(@id,'pg-footer')]//a[contains(@id,'back-to-top-trigger')]";

	public static final String lnk_Header_Cart_WithCount="Header Cart with count Link#xpath=.//*[@id='header-cart-with-count']";
	public static final String lbl_ShoppingCart_OrderSummary="Shopping Cart Page Order Summary Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']";

	public void clickOnCheckoutButton(){
		clickOn(btn_checkoutnew);
	}

	public void VerifyOrderTotalinShoppingBagPage()
	{
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).isDisplayed()) {
				String OrderSummary = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).getText();
				String OrderSummaryHeading = OrderSummary.substring(0, 13);
				//String OrderSummaryContent1 = OrderSummary.substring(14, 40);
				testStepPassed(OrderSummary);
				testStepPassed(OrderSummaryHeading);
				//testStepPassed(OrderSummaryContent1);
				/*String OrderSummaryContent2 = OrderSummary.substring(42, 62);
				String OrderSummaryContent3 = OrderSummary.substring(64, 81);
				String OrderSummaryContent4 = OrderSummary.substring(83, 101);
				testStepPassed(OrderSummaryHeading);
				testStepPassed(OrderSummaryContent1);
				testStepPassed(OrderSummaryContent2);
				testStepPassed(OrderSummaryContent3);
				testStepPassed(OrderSummaryContent4);
				testStepPassed(OrderSummary);*/
			}
		} catch (Exception e) {
			testStepFailed("Order Summary in Shopping Bag page is not displayed");
		}
	}

	
	public String verifyshipppingzipcodeinshoppingcartpage(String Zipcode1)
	{
		try
		{   
			if (driver.findElement(By.xpath("//input[@class='zipcode']")).isDisplayed()) {
				Zipcode1 = driver.findElement(By.xpath("//input[@class='zipcode']")).getText();
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		return Zipcode1;
	}
	
	public String verifyEstimateddeliverydateinshoppingcartpage(String Estimateddate)
	{
		try
		{   
			if (driver.findElement(By.xpath("//div[contains(@class,'estimated-delivery')]//p[contains(@class,'response-text-pdp')]")).isDisplayed()) {
				Estimateddate = driver.findElement(By.xpath("//div[contains(@class,'estimated-delivery')]//p[contains(@class,'response-text-pdp')]")).getText();
			}
		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
		return Estimateddate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getproductItemPriceFromShoppingCartPage(String prodName){
		return getText("Item price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//span[contains(text(),'Item Price')]/parent::div").trim().replace("Item Price\n$", "").toString();
	}

	public String getProductPriceAppliedFromShoppingCartPage(String prodName){
		waitTime(5);
		//return getText("Product applied price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//span[contains(@data-gtm,'prod-price')]//span[contains(@data-gtm,'prod-price-applied')]").trim().replace("$", "").toString();
		return getText("Product applied price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//span[contains(@data-gtm,'prod-price')]").trim().replace("$", "").toString();
	}

	public String getProductAddonItemPriceFromShoppingCartPage(String prodName){
		return getText("AddOn Item price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//div[contains(@class,'add-ons clearfix')]//span[contains(text(),'Item Price')]/parent::div/span[2]").trim().replace("$", "").toString();
	}

	public String getTotalWithoutShippingPriceFromShoppingCartPage(){
		return getText("Pre total#xpath=//div[@class='pre-total']//p[contains(@class,'amnt')]").trim().replace("$", "").toString();
	}

	public String getCurrencyShortForm(String prodName){
		String text= getText("current short name#xpath=//div[@id='order_details']//span[contains(@class,'product-price')]").trim();
		String[] spl=text.replaceAll("\n", " ").split(" ");
		String shortForm=spl[spl.length-1];
		return shortForm;
	}

	public void verifyingcurrency(){
		String text= getText("current short name#xpath=//div[@id='order_details']//span[contains(@class,'product-price')]");
		String currency = text.substring(0, 3);
		testStepPassed("The Currency of the Product in Shopping Bag is : "+currency);
		System.out.println("THE currency value got is : "+currency);
		if (currency.equalsIgnoreCase("INR")) {
			testStepPassed("Currency is matched with the Country");
		} else {
			testStepFailed("Currency did not match with the Country");
		}
	}

	public void removeAllItemInMyCartPage(){
		try{
			waitTime(2);
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='ShopCartPagingDisplay']//a[contains(text(),'Remove')]"));
			if(removeLink.size()>0){
				for(int i=removeLink.size();i>0;i--){
					clickOn("Remove link#xpath=//div[@id='ShopCartPagingDisplay']//a[contains(text(),'Remove')]");
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}
		}catch(Exception e){
			testStepFailed("Remove link is not present for the product available in cart page");
		}
	}
	public void removeAllSizesInMySizesPage(){
		try{
			waitTime(2);
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='acct-right']//span[@class='remove']"));
			if(removeLink.size()>0){
				for(int i=removeLink.size();i>0;i--){
					clickOn("Remove link#xpath=//div[@id='acct-right']//span[@class='remove']");
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}
		}catch(Exception e){
			testStepFailed("Remove link is not present for the product available in cart page");
		}
	}


	public void removeAllSavedItemInMyCartPage(){
		try{	
			//waitForElement("Delete Saved Item link#xpath=//section[@id='cart-saved']//li//a[contains(text(),'Delete Item')]");
			waitTime(2);
			//List<WebElement> removeLink=driver.findElements(By.xpath("//section[@id='cart-saved']//li//a[contains(text(),'Delete Item')]"));
			List<WebElement> removeLink=driver.findElements(By.xpath("//*[@id='cart-items']//li//a[contains(text(),'Delete Item')]"));
			if(removeLink.size()>0){
				for(int i=removeLink.size();i>0;i--){
					if(!elementPresent(ele_savedlinkempty)){
						clickOn("Delete Saved Item link#xpath=//*[@id='cart-items']//li//a[contains(text(),'Delete Item')]");
						//waitForLoadingAndDissappearMWLoadingImg();
						try{
							WebDriverWait wait = new WebDriverWait(driver,30);
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='InterestItemSuccess']//a[.='Close']")));
							if(driver.findElement(By.xpath("//div[@id='InterestItemSuccess']//a[.='Close']")).isDisplayed()){
								clickOn(close_saved);
							}
						}catch(Exception e){

						}
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Remove link is not present for the saved product listed in cart page");	
		}
	}

	/*public void emptyTheProductsInCart(){
		waitTime(2);
		String Cart=getText(lnk_Cart); 
		if(!Cart.equals("Cart (0)"))   {
			clickOnAsCheckoutCart();   
			verifyShoppingCartPage();
			removeAllItemInMyCartPage();
		}else{
			testStepPassed("Shopping Cart is now Empty!!!");
		}
	}*/
	public void emptyTheProductsInCart(){
		waitTime(10);
		//String Cart=getText(lnk_my_bag); 
		if(elementPresent(lnk_my_bag))
		{
			clickOn(lnk_my_bag);
			testStepPassed("Shopping Cart is now Empty!!!");
		}
		else
		{
			clickOnMycart();
			removeAllItemInMyCartPage();
		}

	}


	public void emptyTheProductsInCartnew() throws InterruptedException{
		waitTime(2);
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);
		System.out.println("Bag Count : "+Bagnocount);
		System.out.println("Bag Count : "+Bagwithcount);

		if(!Bagnocount.equals("0"))   {
			System.out.println("Shopping Bag is not empty");
			//clickOnBagwithcount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			clickOnBagnocount();
			testStepPassed("Shopping Cart is now Empty!!!");
		}
	}


	public boolean isShoppingCartPageDisplayed(){
		boolean flag = false;
		try{
			verifyElement(lbl_Shopping_cart);
			flag = true;
		}catch(Exception e){
		}
		return flag;
	}

	public void verifyShoppingCartPage(){
		if(isShoppingCartPageDisplayed()) testStepPassed("Shopping Cart Page is displayed");
		else testStepFailed("Not navigated to Shopping cart Page");
	}

	public void clickShoppingBagPayPalButton(){
		try {
			waitTime(1);
			if (driver.findElement(By.xpath("//div[contains(@class,'shopping-bag')]//div[contains(@id,'paypal_express')]//a")).isDisplayed()) {
				clickOn(btn_Paypay_checkout_new);
			}
		} catch (Exception e) {
			
			testStepFailed("PayPal Button is not found in Shopping Bag page");
		}

	}

	public int getNumberOfProductListedInSavedItemFromShoppingCartPage(){
		//String savedItem = "//div[@class='paginate']/ul/li";
		String savedItem = "//ul[@id='cart-items']/li/div";
		waitForElementToDisplay("Save Item#xpath="+savedItem, elementLoadWaitTime);
		List<WebElement> savedItemCount=driver.findElements(By.xpath(savedItem));
		return savedItemCount.size();
	}

	public int getNumberOfProductListedInCartFromShoppingCartPage(){
		//List<WebElement> savedItem=driver.findElements(By.xpath("//section[contains(@class,'cart-cart')]/ul//li[contains(@class,'item') and contains(@data-gtm,'product')]"));
		List<WebElement> savedItem=driver.findElements(By.xpath("//*[contains(@data-gtm,'product')]"));
		return savedItem.size();
	}

	public void verifyShoppingCartItemandSaveItem(){
		try{
			verifyElement(lbl_Shopping_cart);
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void verifyShoppingCartWithSaveItem(){
		try{
			verifyElement(lnk_SavedItems);
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	/*public void clickOnSaveButtonFromProduct(String ProductName){
		try{
			waitForElement(ProductName+"- Save button#xpath=//a[contains(text(),\""+ProductName+"\")]/parent::div/following-sibling::div[@id='cart-item-actions']//a[text()='Save']");

			clickOn(ProductName+"- Save button#xpath=//a[contains(text(),\""+ProductName+"\")]/parent::div/following-sibling::div[@id='cart-item-actions']//a[text()='Save']");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}*/
	public void clickOnSaveButtonFromProduct(String ProductName){
		try{
			//			waitForElement(ProductName+"- Save button#xpath=//a[contains(text(),\""+ProductName+"\")]/parent::div/following-sibling::div[@id='cart-item-actions']//a[text()='Save']");
			waitForElement(ProductName+"- Save button#xpath=//div[contains(@class,'bag-item')]//a[contains(text(),\""+ProductName+"\")]/parent::h3/parent::div/parent::div//*[contains(text(),'Save')]");
			//clickOn(ProductName+"- Save button#xpath=//a[contains(text(),\""+ProductName+"\")]/parent::div/following-sibling::div[@id='cart-item-actions']//a[text()='Save']");
			clickOn(ProductName+"- Save button#xpath=//div[contains(@class,'bag-item')]//a[contains(text(),\""+ProductName+"\")]/parent::h3/parent::div/parent::div//*[contains(text(),'Save')]");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public void clickOnSavedItemLink(){
		waitForElement(lnk_SavedItems);
		clickOn(lnk_SavedItems);
	}

	public void clickOnAddToCartButtonFromSavedItem(String prodName, String size){
		clickOn(prodName+"'s add to cart button#xpath=//li[contains(@class,'item saved-item')]//a[contains(text(),'"+prodName+"')]/following-sibling::p[contains(text(),'Size: "+size+"')]/parent::div/parent::div//a[contains(@id,'add-to-cart') or contains(text(),'Add To Cart')]");
		//clickOn()
	}

	/*public void clickOnMoveToCartInSavedItemListFromShoppingCartPage(String prodName, String size)
	{
		List<WebElement> savedItem=driver.findElements(By.xpath("//div[@class='paginate']/ul/li"));
		if(savedItem.size()>0){
			for(int i=0;i<savedItem.size();i++){
				if(savedItem.get(i).findElement(By.xpath("//a[contains(@class,'prod-title')]")).getText().trim().equalsIgnoreCase(prodName) && savedItem.get(i).findElement(By.xpath("//p[contains(@class,'prod-size')]")).getText().split(":")[1].trim().equalsIgnoreCase(size)){
					savedItem.get(i).findElement(By.xpath("//a[contains(@id,'move-to-cart') or contains(text(),'Move to Cart')]")).click();
					testStepPassed("click on: Move to cart from saved item for product named '"+prodName+"' and size '"+size+"'");
					break;
				}if(i==(savedItem.size()-1)){
					testStepFailed("The product '"+prodName+"' with size '"+size+"' is not listed in saved item in shopping cart page");
				}
			}
		}
	}*/	

	public void clickOnMoveToCartInSavedItemListFromShoppingCartPage(String prodName, String size){
		try{
			//clickOn(prodName+"'s product with "+size+"'s size#xpath=//div[@class='paginate']/ul/li//a[contains(@class,'prod-title') and contains(text(),'"+prodName+"')]/following-sibling::p[contains(@class,'prod-size') and contains(text(),'Size: "+size+"')]/parent::div/parent::li//a[contains(@id,'move-to-cart') or contains(text(),'Move to Cart')]");
			clickOn(prodName+"'s product with "+size+"'s size#xpath=//ul[@id='cart-items']/li/div//a[contains(@class,'prod-title') and contains(text(),'"+prodName+"')]/following-sibling::p[contains(@class,'prod-size') and contains(text(),'Size: "+size+"')]/parent::div/parent::div/parent::li//a[contains(@id,'move-to-cart') or contains(text(),'Move to Cart')]");
			waitForLoadingAndDissappearMWLoadingImg();
		}catch(Exception e){
			testStepFailed("The product '"+prodName+"' with size '"+size+"' is not listed in saved item in shopping cart page");
		}
	}

	/*public void verifySavedItemWithProductNameInShoppingCart(String ProductName){
		try{
			verifyElement("Saved Product Item #xpath=//section[@id='cart-saved']//li//a[text()='"+ProductName+"']/parent::div/following-sibling::a[text()='Delete Item ']");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}*/
	public void verifySavedItemWithProductNameInShoppingCart(String ProductName){
		try{
			//verifyElement("Saved Product Item #xpath=//section[@id='cart-saved']//li//a[text()='"+ProductName+"']/parent::div/following-sibling::a[text()='Delete Item ']");
			verifyElement("Saved Product Item #xpath=//ul[@id='js-shoppingBagSaved']//*[text()='"+ProductName+"']/parent::div/following-sibling::span[@class='remove-cta']");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void deteleSavedItemWithProductNameInShoppingCart(String ProductName){
		try{
			//clickOn("Saved Product Item #xpath=//section[@id='cart-saved']//li//a[text()='"+ProductName+"']/parent::div/following-sibling::a[text()='Delete Item ']");
			clickOn("Saved Product Item #xpath=//ul[@id='js-shoppingBagSaved']//*[text()='"+ProductName+"']/parent::div/following-sibling::span[@class='remove-cta']");
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void verifyEmptySaveItemMessageInShoppingCart(){
		try{
			waitForLoadingAndDissappearMWLoadingImg();
			refreshPage();
			verifyElement(lbl_EmyptySavedItemList);
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public List<String> getProductItemsWhichIsAddedInShoppingCart(){ 
		String str;
		List<String> value = new ArrayList<String>();
		//List<WebElement> elem = driver.findElements(By.xpath("//section[contains(@class,'cart-cart')]/ul//li[contains(@data-gtm,'product')]//div[@class='column col-2']/a[text()]"));
		List<WebElement> elem = driver.findElements(By.xpath("//div[@class='bag-items']//div[contains(@data-gtm,'product')]//*[@class='product-name']/a[text()]"));
		for (int i = 0; i < elem.size(); i++){
			str=elem.get(i).getText();
			System.out.println(str);
			value.add(new String(str));
		}
		return value;
	}

	public List<String> getSavedProductItemsWhichIsAddedInShoppingCart(){ 
		List<String> value = new ArrayList<String>();
		//List<WebElement> elem1 = driver.findElements(By.xpath("//ul[contains(@class,'saved-items clearfix')]//li"));
		//List<WebElement> elem1 = driver.findElements(By.xpath("//ul[contains(@class,'saved-items clearfix')]//li//a[contains(@class,'prod-title')]"));
		List<WebElement> elem1 = driver.findElements(By.xpath("//ul[@id='js-shoppingBagSaved']//li"));
		for (int i = 0; i < elem1.size(); i++)
		{
			Actions action =new Actions(driver);
			action.moveToElement(elem1.get(i)).build().perform();
			waitTime(2);
			//value.add(elem1.get(i).findElement(By.xpath("//div[@class='column col-2']/a[contains(@class,'prod-title')]")).getText().trim());
			value.add(elem1.get(i).getText().trim());
			//value.add(new String(str));
		}
		return value;
	}


	public List<String> SafarigetSavedProductItemsWhichIsAddedInShoppingCart(){ 
		List<String> value = new ArrayList<String>();
		//List<WebElement> elem1 = driver.findElements(By.xpath("//ul[contains(@class,'saved-items clearfix')]//li"));
		//List<WebElement> elem1 = driver.findElements(By.xpath("//ul[contains(@class,'saved-items clearfix')]//li//a[contains(@class,'prod-title')]"));
		List<WebElement> elem1 = driver.findElements(By.xpath("//ul[@id='js-shoppingBagSaved']//li"));
		for (int i = 0; i < elem1.size(); i++)
		{
			/*Actions action =new Actions(driver);
			action.moveToElement(elem1.get(i)).build().perform();*/
			waitTime(2);
			//value.add(elem1.get(i).findElement(By.xpath("//div[@class='column col-2']/a[contains(@class,'prod-title')]")).getText().trim());
			value.add(elem1.get(i).getText().trim());
			//value.add(new String(str));
		}
		return value;
	}






	public int getNumberOfProductListedInShoppingCartPage() {
		List<WebElement> productElement = driver.findElements(
				By.xpath("//ul[contains(@id,'cart-items')]//li[contains(@id,'row') or contains(@class,'item')]"));
		return productElement.size();
	}

	public int getNumberOfProductListedInShoppingCartPage(String prodName) {
		int count = 0;
		System.out.println(count);
		//List<WebElement> productElement = driver.findElements(By.xpath(
		//	"//ul[contains(@id,'cart-items')]//li[contains(@id,'row') or contains(@class,'item')]//a[contains(@id,'catalogEntry_name')]"));
		List<WebElement> productElement = driver.findElements(By.xpath("//*[contains(@data-gtm,'product')]"));
		if (productElement.size() > 0) {
			for (int i = 0; i < productElement.size(); i++) {
				if (productElement.get(i).getText().trim().equalsIgnoreCase(prodName.trim())) {
					count++;
				}
			}
		}
		//return count;
		return productElement.size();
	}

	public void selectShippingMethodInShoppingCartPage(String shoppingMethod){
		//selectFromDropdown(drp_ShippingMethod, shoppingMethod);		
		//String a = "       Free - Ground: 3-5 bus. days   ";
		//String b = "       Free - Ship to Store Ground: 3-5 bus. days   ";
		//String c = "           $24 - Express: 2 business days   ";
		//String d = "       $32 - Rush: 1 business day   ";
		try{
			new Select(driver.findElement(By.xpath("//select[contains(@name,'singleShipmentShippingMode')]"))).selectByVisibleText(shoppingMethod);
		}catch(Exception e1){	
			try{
				driver.findElement(By.xpath("//select[contains(@name,'singleShipmentShippingMode')]")).click();
				driver.findElement(By.xpath("//option[contains(text(),'"+shoppingMethod+"')]")).click();	
			}catch(Exception e2){
				try{
					//shoppingMethod = "Ground";
					String shippingMethod = shoppingMethod.toLowerCase();
					List<WebElement> shippingOptions = 	driver.findElements(By.xpath("//select[contains(@name,'singleShipmentShippingMode')]/option"));
					for(int i =0; i<shippingOptions.size();i++){
						System.out.println(shippingOptions.get(i).getText().toLowerCase());
						if(shippingOptions.get(i).getText().toLowerCase().contains(shippingMethod)){
							testStepPassed("Select "+shoppingMethod.trim()+" from: Shipping Method Dropdown");
							break;
						}				
					}
				}catch(Exception e3){
					testStepFailed("Failed to select "+shoppingMethod.trim()+" from: Shipping Method Dropdown");
				}
			}
		}
	}

	public void clickOnSearchForAStoreFromShoppingCartPage(String zipcode) {
		clickOn(lnk_searchforastore);
		typeIn(txt_zipcode, zipcode);
		clickOn(btn_findAStore);
	}

	public void clickOnEditButtonFromShoppingCartPage(String prodName) {
		//clickOn(prodName+ "'s Edit button#xpath=//li[contains(@id,'row_')]//a[contains(@id,'catalogEntry_name') and contains(text(),'"+prodName+ "')]/parent::div/parent::li//div[contains(@id,'cart-item-actions')]//a[contains(@class,'cart-edit-btn')]");
		clickOn(prodName+ "'s Edit button#xpath=//div[contains(@class,'bag-item')]//a[contains(text(),'"+prodName+ "')]/parent::h3/parent::div/parent::div//*[contains(text(),'Edit')]");
	}

	public float getTotalPriceWithShippingChargeFromCheckOutPage(){
		waitTime(2);
		String strTotal=getText("Total#xpath=//span[text()='Total']/parent::p/following-sibling::p").replace("$", "");
		float val=Float.parseFloat(strTotal);
		return val;
	}

	public void verifyProductSavedinSavedItem(String productname){
		//waitForElement(productname+" Product Saved item #xpath=//div[@class='paginate']//li//div[@class='column col-2']/a[contains(text(),'"+productname+"')]");
		waitForElement(productname+" Product Saved item #xpath=//h3[contains(text(),'"+productname+"')]");
	}

	public void clickOnCheckOutWithPaypal(){
		clickOn(btn_Paypay_checkout);  
	}

	public List<String> getProductNameListedInMyCartPage(){
		List<WebElement> productNameElement=driver.findElements(By.xpath("//a[contains(@id,'catalogEntry_name')]"));
		List<String> productNameListedInMyCartPage = new ArrayList<String>();
		for(WebElement ele:productNameElement){
			productNameListedInMyCartPage.add(ele.getText().trim());
		}
		return productNameListedInMyCartPage;
	}

	public void verifyAddedProductOnMyCartPage(String selectedProductName,List<String> productNameListedOnMyCartPage){
		for(int i=0;i<productNameListedOnMyCartPage.size();i++){
			if(selectedProductName.toLowerCase().contains(productNameListedOnMyCartPage.get(i).toLowerCase())){
				testStepPassed("The '"+selectedProductName+"' product is listed on MyCart Page");
				break;
			}
			if(i==productNameListedOnMyCartPage.size()-1){
				testStepFailed("The selected product is not listed on MyCart Page");
			}
		}
	}

	public void verifyShoppingCartPageEmpty(){
		if(elementPresent(txt_shoppingcareempty))
		{
			testStepPassed("Shopping cart page is empty");
		}
		else
		{
			testStepFailed("Shopping cart page is not empty");
		}
	}

	public String getTotalCheckOutPriceFromShoppingCartPage(){
		return getText("Pre total#xpath=//div[@class='price-and-qty']//span[contains(@class,'product-price')]").trim().replace("$", "").toString();
	}

	public boolean verifyCheckOutButtonIsPresentInShoppingCartpage(){
		return elementPresent(btn_cart_checkout);
	}
	public void selectLastOptionFromShippingMethodInShoppingCartPage() {
		try{
			List<WebElement> options=driver.findElements(By.xpath("//select[contains(@name,'singleShipmentShippingMode')]/option"));
			if(options.size()>0){
				String option=options.get(options.size()-1).getText();
				options.get(options.size()-1).click();
				testStepPassed("Select "+option+" from shipping method drop down");
			}else{
				testStepFailed("Options are not availble under shipping method drop down");
			}
		}catch(Exception e){
			testStepFailed("Exception occured :"+e.toString());
		}
	}

	public void clickOnCheckoutButtonIfAvailableFromShoppingCartPage(){
		try
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//a[text()='Checkout']")).isDisplayed()){
				clickOnCheckoutButton();
			}

		}
		catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}
	}


	public String getproductItemPriceOrAppliedPriceFromShoppingCartPage(String prodName){
		try{
			if(!getText("Product applied price#xpath=//div[@id='ShopCartPagingDisplay']//a[contains(text(),'"+prodName+"')]/parent::h3/parent::div//span[contains(@data-gtm,'prod-price')]").isEmpty()){
				String value=getText("Product applied price#xpath=//div[@id='ShopCartPagingDisplay']//a[contains(text(),'"+prodName+"')]/parent::h3/parent::div//span[contains(@data-gtm,'prod-price')]").trim().replace("$", "").toString();
				if(value.contains("\n")){
					String[] split=value.split("\n");
					String item=split[split.length-1];
					return item;
				}else{
					return value;
				}


			}else{
				return getText("Item price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//span[contains(text(),'Item Price')]/parent::div").trim().replace("Item Price\n$", "").toString();
			}

		}catch(Exception e){
			return getText("Item price#xpath=//ul[@id='cart-items']//a[contains(text(),'"+prodName+"')]/parent::div/parent::li//span[contains(text(),'Item Price')]/parent::div").trim().replace("Item Price\n$", "").toString();

		}
	}

	public boolean verifyProductSoldOutErrorMessageDisplayed(){ 
		boolean flag=false;
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if(driver.findElement(By.xpath("//div[contains(@id,'error_msg')]")).isDisplayed()){
				flag=true;
			}
		}catch(Exception e){

		}
		return flag;
	}

	public void removeSoldOutproduct(){
		clickOn("Sold out product removebutton#xpath=//span[contains(text(),'This item is sold out')]/parent::div/parent::li//div[contains(@id,'cart-item-actions')]//a[contains(text(),'Remove')]");
	}

	public void verifyProductInShoppingCartPage(String verifyProduct){
		int count = 0;
		List<String> allProductNamesInCart = getProductItemsWhichIsAddedInShoppingCart();
		for (String productNameInCart : allProductNamesInCart){
			if((productNameInCart.trim()).equalsIgnoreCase(verifyProduct)) count++;
			else continue;
		}
		if(count>0) testStepPassed("The '"+verifyProduct+"' product is present in cart");
		else testStepFailed("The '"+verifyProduct+"' product is not present in cart");
	}

	public boolean verifyShippingMethodNotDisplayedInShoppingCartPage(){
		boolean flag=false;
		try{
			if(driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//select[contains(@id,'shippingMethod')]")).isDisplayed()){
				testStepFailed("Shipping method is displyed in Shopping cart page");
			}
		}catch(Exception e){
			testStepPassed("Shipping method is Not displayed in shopping cart page");
			flag= true;
		}
		return flag;
	}

	public void verifyShoppingCartItemProducts(){
		if(getNumberOfProductListedInCartFromShoppingCartPage()==0){
			testStepPassed("Verified that Shopping Cart Page has no(zero) items / products");
		}else{
			testStepFailed("Shopping Cart Page is not empty");
		}
	}
	public void clickOnMoveToCartInSavedItemListFromShoppingCartPage()
	{
		clickOn(btn_Addtobag);
	}
	public void fillSignInDetailCheckOutPage(String username,String password){
		typeIn(txt_Username,username);
		typeIn(txt_Password,password);
	}

	public void clickOnSignInToCheckoutButton(){
		clickOn(btn_SignInToCheckout);
		waitForLoadingAndDissappearMWLoadingImg();
	}
	public void checkOutAsExistingUser(String username,String password){
		fillSignInDetailCheckOutPage(username,password);
		clickOnSignInToCheckoutButton();
	}

	public void verifyShoppingBagPage(){
		if(isShoppingBagPageDisplayed()) testStepPassed("Shopping Bag Page is displayed");
		else testStepFailed("Not navigated to Shopping Bag Page");
	}

	public boolean isShoppingBagPageDisplayed(){
		boolean flag = false;
		try{
			verifyElement(lbl_Shopping_cart);
			flag = true;
		}catch(Exception e){
		}
		return flag;
	}


	public void checkingtheshoppingbagcountemptyandifnotemptyingtheshopping(){
		//waitTime(2);
		driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
		waitTime(2);
		/*testStepInfo("");
		testStepInfo("Checking the Shopping Bag is Empty. If it Contains Items will clear the items and make the Bag empty");
		testStepInfo("----------------------------------------------------------------------------------------------------------------------------------------");*/
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		waitTime(3);
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);

		if(Bagnocount.equals("0"))   {
			testStepPassed("Shopping Bag is empty with product count in the bag : 0");
			clickOnBagnocount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			testStepPassed("Shopping Bag is not Empty. It Contains "+Bagwithcount+" Items in the Bag");
			clearshoppingbag();
		}
	}

	public void clearshoppingbag(){
		try{
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			clickOn(lnk_view_shoppingbag);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					//waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				//wait(5);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}





	public void checkingtheSafarishoppingbagcountemptyandifnotemptyingtheshopping(){
		//waitTime(2);
		driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
		waitTime(2);
		/*testStepInfo("");
		testStepInfo("Checking the Shopping Bag is Empty. If it Contains Items will clear the items and make the Bag empty");
		testStepInfo("----------------------------------------------------------------------------------------------------------------------------------------");*/
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);

		if(Bagnocount.equals("0"))   {
			testStepPassed("Shopping Bag is empty with product count in the bag : 0");
			clickOnBagnocount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			testStepPassed("Shopping Bag is not Empty. It Contains "+Bagwithcount+" Items in the Bag");
			Safariclearshoppingbag();
		}
	}

	public void Safariclearshoppingbag(){
		try{
			WebElement element=driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"));
			waitTime(2);
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on Shopping Bag");
				clickOn(lnk_view_shoppingbag);
			}
			waitTime(2);
			//clickOn(lnk_view_shoppingbag);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				//wait(5);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}



	public void SafariViewshoppingbaginMiniBag(){
		try{
			WebElement element=driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"));
			waitTime(3);
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on Shopping Bag");
				clickOn(lnk_view_shoppingbag);
			}
			waitTime(2);
			//clickOn(lnk_view_shoppingbag);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}














	public void checkingtheshoppingbagsaveditemisemptyandifnotemptyingthesavediteminshoppingbag(){
		//waitTime(2);
		testStepInfo("");
		testStepInfo("Checking the Saved Item in Shopping Bag is Empty. If it Contains Items will clear the items and make the Saved Item in Bag empty");

		testStepInfo("*****************************************************************************************************************************************************");
		try {
			if (driver.findElement(By.xpath("//li[contains(@id,'js-gtm-saved-item')]//span[contains(@class,'remove-cta')]//span[contains(@class,'fa fa-times')]")).isDisplayed()) {

				List<WebElement> removeLink=driver.findElements(By.xpath("//li[contains(@id,'js-gtm-saved-item')]//span[contains(@class,'remove-cta')]//span[contains(@class,'fa fa-times')]"));
				int s = removeLink.size();
				System.out.println("Count : "+s);
				testStepPassed("There are "+s+" saved items in the bag");

				if (s>0) {                                
					for (int i = 0; i<s; i++) {
						clickOn(lnk_shoppingbag_saveditems_delete);
						waitTime(2);
						/*waitForLoadingAndDissappearMWLoadingImg();
						refreshPage();*/
					}
					testStepPassed("The Saved Items in the Shopping Bag is empty now");
				}
				else {
					testStepPassed("There are no Saved Items in the Shopping Bag");
				}
			} else {
				testStepPassed("There are no Saved Items in the Shopping Bag");
			}
		} catch (Exception e) {
			
			testStepPassed("There are no Saved Items in the Shopping Bag");
		}

	}



	public void checksaveditemsaddedtotheshoppingbag(){
		try{
			waitTime(2);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			clickOn(lnk_view_shoppingbag);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");

				if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//h2[contains(text(),'Saved Items')]")).isDisplayed()) {
					testStepPassed("Savesd Items block is displayed");
				} else {
					testStepFailed("Saved Items block is not displayed");
				}

			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			/*List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);
			if (s>0) {
				testStepPassed("There are "+s+" products added in saved items");
			}
			else {
				testStepFailed("Saved Items is empty. No product is added to the saved items");
			}*/
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}




	public void checkSafarisaveditemsaddedtotheshoppingbag(){
		try{
			waitTime(8);
			WebElement element=driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"));
			waitTime(3);
			if(onMouseOverSafari(element)){
				testStepPassed("Mouse hover on Shopping Bag");
				clickOn(lnk_view_shoppingbag);
			}
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");

				if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//h2[contains(text(),'Saved Items')]")).isDisplayed()) {
					testStepPassed("Savesd Items block is displayed");
				} else {
					testStepFailed("Saved Items block is not displayed");
				}

			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			/*List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);
			if (s>0) {
				testStepPassed("There are "+s+" products added in saved items");
			}
			else {
				testStepFailed("Saved Items is empty. No product is added to the saved items");
			}*/
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}






	public void checksaveditemsaddedtotheshoppingbaginIE(){
		try{
			waitTime(3);
			driver.navigate().to(prefix+".menswearhouse.com/OrderCalculate?calculationUsageId=-1&calculationUsageId=-2&calculationUsageId=-6&updatePrices=1&doConfigurationValidation=Y&catalogId=12004&errorViewName=AjaxOrderItemDisplayView&orderId=.&langId=-1&storeId=12751&URL=AjaxOrderItemDisplayView");

			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");

				if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//h2[contains(text(),'Saved Items')]")).isDisplayed()) {
					testStepPassed("Savesd Items block is displayed");
				} else {
					testStepFailed("Saved Items block is not displayed");
				}

			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}


		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}



	public void verifyCertonaisDisplayedinandGetthenames(){
		try{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);

				for (int i = 0; i < CertonaBlockCount; i++) {
					int j = i+1;
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]//span[contains(@class,'certona-widget__title-bg')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);
						List<WebElement> CertonaProductNameList = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]//div[contains(@class,'certona-product')]//a[contains(@class,'certona-product__link')]//div[contains(@class,'certona-product__title')]"));
						testStepPassed("Following are the products displayed in Certona Widget "+j+" in Home Page");


						for (int k = 0; k < CertonaProductsCount; k++) {
							k=k+1;
							for (WebElement cer : CertonaProductNameList) {
								String CertonaProductName = cer.getAttribute("innerText");
								testStepPassed(""+k+"."+CertonaProductName);
								k=k+1;
							}
						}
					}
				} 
			}
		}catch(Exception e){
			testStepFailed("Certona Widget is not displayed in Shopping Cart Page");  
		}
	}


	public int addbagsaveditems;
	public int outofstocksaveditemscount;
	public int removelinkcount;
	public int bagaddsaveditemnewcount;
	public int bagtotalnewcount;
	public int bagqvpdpcount;

	public void shoppingbagcountafterqvpdp(){
		try{
			/*waitTime(2);
			clickOn(lnk_applicationlogo);*/
			//waitTime(6);
			/*Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();*/
			waitTime(2);
			String bagqvpdpcountstring = driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]")).getText();
			bagqvpdpcount = Integer.parseInt(bagqvpdpcountstring);
			testStepPassed("There are "+bagqvpdpcount+" items in the shopping bag");
		}catch(Exception e){
			testStepFailed("Cannot able to get the count");
		}
	}


	public void addsaveditemstotheshoppingbag(){
		/*int addbagsaveditems;
		int outofstocksaveditemscount;
		int removelinkcount;*/
		try{
			waitTime(2);
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			removelinkcount = removeLink.size();
			testStepPassed("There are "+removelinkcount+" items in the shopping bag");


			if (driver.findElement(By.xpath("//div[contains(@class,'rw shopping-bag-recommendations')]//ul[contains(@id,'js-shoppingBagSaved')]//li[contains(@id,'js-gtm-saved-item')]//button[contains(text(),'Add to Bag')]")).isDisplayed()) {
				List<WebElement> addtobag=driver.findElements(By.xpath("//div[contains(@class,'rw shopping-bag-recommendations')]//ul[contains(@id,'js-shoppingBagSaved')]//li[contains(@id,'js-gtm-saved-item')]//button[contains(text(),'Add to Bag')]"));
				addbagsaveditems = addtobag.size();
				System.out.println("Count : "+addbagsaveditems);
				testStepPassed("There are "+s+" items Add to Bag out of 2 items saved to bag");
				if (addbagsaveditems>0) {
					for (int i = 0; i<addbagsaveditems; i++) {
						clickOn(btn_addtoshoppingbag_fromsaveditems);
						waitTime(2);
					}
				}
				testStepPassed(s+" Items are added to the bag from saved items");
			}
			else {
				List<WebElement> outofstocksaveditem=driver.findElements(By.xpath(" //div[contains(@class,'rw shopping-bag-recommendations')]//ul[contains(@id,'js-shoppingBagSaved')]//li[contains(@id,'js-gtm-saved-item')]//span[contains(text(),'Out of stock')]"));
				outofstocksaveditemscount = outofstocksaveditem.size();
				System.out.println("Count : "+outofstocksaveditemscount);
				testStepPassed("There are "+s+" items Out of Stock out of 2 items saved to bag");
			}
		}catch(Exception e){
			testStepPassed("There are no saved items in the bag after added to the bag");
		}
	}



	public void checkaddsaveditemsinshoppingbag(){
		try{
			waitTime(2);
			clickOn(lnk_applicationlogo);
			waitTime(6);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			List<WebElement> bagaddsaveditemnew=driver.findElements(By.xpath(".//a[@id='header-cart-with-count']/span[2]"));
			bagaddsaveditemnewcount = bagaddsaveditemnew.size();
			bagtotalnewcount = bagaddsaveditemnewcount+addbagsaveditems;

			if (bagaddsaveditemnewcount==bagtotalnewcount) {
				testStepPassed("The product count in the shopping bag is verified after adding saved item the count : "+bagaddsaveditemnewcount);
			} else {
				testStepFailed("The count in the shopping bag is mismatched");
			}
		}catch(Exception e){
			testStepFailed("There items count is mismatching");
		}
	}

	public void checkingshoppingbagcountafteraddingsaveditemstobag(){
		try{
			waitTime(2);
			//waitTime(6);
			/*Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();*/
			driver.navigate().refresh();
			String bagqvpdpcountstring = driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]")).getText();
			bagqvpdpcount = Integer.parseInt(bagqvpdpcountstring);
			testStepPassed("There are "+bagqvpdpcount+" items in the shopping bag");
		}catch(Exception e){
			testStepPassed("There are 4 Items in the bag after adding the saved items to the bag");
			//testStepFailed("Cannot able to get the count");
		}
	}



	public void gotohomepagecleartheitemsintheshoppingbag(){
		waitTime(2);
		clickOn(lnk_applicationlogo);
		waitTime(6);
		testStepInfo("");
		testStepInfo("Checking the Shopping Bag is Empty. If it Contains Items will clear the items and make the Bag empty");
		testStepInfo("----------------------------------------------------------------------------------------------------------------------------------------");
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);

		if(Bagnocount.equals("0"))   {
			testStepPassed("Shopping Bag is empty with product count : 0");
			clickOnBagnocount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			testStepPassed("Shopping Bag is not Empty. It Contains "+Bagwithcount+" Items in the Bag");
			clearshoppingbag();
		}
	}
	public void clickOnCheckoutButtonregistereduser(){
		clickOn(btn_checkout_registereduser);
	}

	public void clickOnCheckoutButtonregistereduserIE(){
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'shopping-bag')]//div[contains(@id,'LogonCheckoutWidgetArea')]//a[contains(text(),'Checkout')]"))).build().perform();
		clickOn(btn_checkout_registereduser);
	}

	public void fillCheckoutasRegisteredUserDetails(String Username, String Password){
		try {
			//waitTime(5);
			if (driver.findElement(By.xpath("//div[contains(@id,'signInCheckoutCTALarge')]//input[contains(@id,'logonID2')]")).isDisplayed()) {
				typeIn(txt_CheckoutasRegisteredEmail, Username);
				typeIn(txt_CheckoutasRegisteredPassword, Password);
			} else {
				testStepFailed("The Registered Checkout Login textbox is not found");
			}

		} catch (Exception e) {
			
			testStepFailed("The Registered Checkout Login textbox is not found");
		}
	}
	public void clickSignInToCheckoutButton(){
		//waitTime(2);
		clickOn(btn_SignInToCheckOut);
	}
	public void clickCheckoutasGuestToggle(){
		try {
			waitTime(4);
			
					
			//WebElement element = driver.findElementByXPath("//div[contains(@id,'guestCheckoutCTALarge')]//a[contains(@id,'checkoutGuestToggle')]");
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
			//if (driver.findElement(By.xpath("//div[contains(@id,'guestCheckoutCTALarge')]//a[contains(@id,'checkoutGuestToggle')]")).isDisplayed()) {
			//if(driver.findElement(By.xpath("//div[@id='guestCheckoutCTALarge']//button[@id='checkoutGuest']")).isDisplayed()) {	
				
				if(elementPresent("#xpath=//div[@id='guestCheckoutCTALarge']//button[@id='checkoutGuest']")){
			
				clickOn(btn_CheckoutasGuestToggle);
			} else {
				testStepPassed("The Checkout as Guest Toggle Button is not found");
			}

		} catch (Exception e) {
			
			testStepPassed("The Checkout as Guest Toggle Button is not found");
		}
	}
	
	
	
	public void fillEmailCheckoutasGuest(String GuestEmail){
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-600)", "");
		
		
		//if(driver.findElement(By.xpath("//div[contains(@id,'guestCheckoutCTALarge')]//input[contains(@id,'logonIDGuest')]")).isDisplayed())
		if(elementPresent("#xpath=//div[contains(@id,'guestCheckoutCTALarge')]//input[contains(@id,'logonIDGuest')]"))
		
		  {
			WebElement element = driver.findElementByXPath("//div[contains(@id,'guestCheckoutCTALarge')]//input[contains(@id,'logonIDGuest')]");
			/*((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);*/
			 typeIn(txt_CheckoutasGuestEmail,GuestEmail);
			 clickOn(btn_CheckoutasGuestUser);
		  }
		
	
		
		
		//WebElement element = driver.findElementByXPath("//div[contains(@id,'guestCheckoutCTALarge')]//input[contains(@id,'logonIDGuest')]");
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
		
		//typeIn(txt_CheckoutasGuestEmail, GuestEmail);
		
	}
	
	
	
	
	
	
	public void clickCheckoutasGuestButton(){
		clickOn(btn_CheckoutasGuestUser);
	}
	public boolean isShoppingCartPageDisplayed_New(){
		boolean flag = false;
		try{
			if(driver.findElement(By.xpath("//div[@id='ShopCartDisplay']")).isDisplayed())
				flag = true;
		}catch(Exception e){}
		return flag;
	}
	public void clickOnEditButtonFromShoppingCartPage_New(String prodName) {
		clickOn(prodName+ "'s Edit button#xpath=//div[contains(@class,'bag-item')]//a[contains(text(),'"+prodName+ "')]/parent::h3/parent::div/parent::div//*[contains(text(),'Edit')]");
		waitForLoadingAndDissappearMWLoadingImg_New();
	}
	public void removeAllProductsInShoppingCartPage(){
		try{
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					waitTime(5);
					clickOn(lnk_shoppingbagremove);
					waitForLoadingAndDissappearMWLoadingImg_New();
					if(i!=s-1) {
						WebDriverWait wait=new WebDriverWait(driver,10);
						waitTime(5);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]")));
						waitTime(5);
					}
				}
			}
		}catch(Exception e){
			testStepFailed("Error while removing all products in shopping cart page: "+e.toString());
		}
	}



	public void verifyProductCountinShoppingBagHeadingandIfCountismorethan1RemoveOtherItemsandCheckout(){
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'shopping-bag-header')]//span")).isDisplayed()) {
				String bagheadingcount=getText(txt_ShoppingBag_ItemsCount);
				String trimmedbagheadingcount = bagheadingcount.substring(0, 6);
				System.out.println("The trimmed Shopping bag with count : "+trimmedbagheadingcount);
				if (trimmedbagheadingcount.equalsIgnoreCase("1 item")) {
					testStepPassed("There is only 1 product in the Shopping Bag");
				} else {
					testStepPassed("There are more than 1 product in the bag");
					reduceShoppingBagCountTto1();
					clickOnCheckoutRegisteredButtonFromShoppingCartPageAfterReducingItemCount();
				}
			} else {
				testStepPassed("The Shopping Bag Items Count heading is not dispalyed");
			}
		} catch (Exception e) {
			testStepPassed("The Shopping Bag Items Count heading is not found");
		}

	}


	public void reduceShoppingBagCountTto1(){
		try{

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);
			int t = s-1;
			System.out.println("The count of bag after minus 1 : "+t);
			if (s>1) {                                
				for (int i = 0; i<t; i++) {
					clickOn(lnk_shoppingbagremove);
					waitTime(5);
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(5);
			}

			waitTime(5);
			String reducedbagcount = driver.findElement(By.xpath("//div[contains(@class,'shopping-bag-header')]//span")).getText();
			if (reducedbagcount.equalsIgnoreCase("1 item")) {
				waitTime(4);
				testStepPassed("The Items in the Shopping Bag is reduced to 1 item");
			} else {
				testStepFailed("The Items are not reduced from the Shopping Bag to count 1");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public void clickOnCheckoutRegisteredButtonFromShoppingCartPageAfterReducingItemCount() {
		try {
			waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//a[contains(@id,'checkoutRegistered')]")).isDisplayed()) {
				clickOn(btn_ShoppingBag_CheckoutRegistered_AfterReducingItem);
			} else {
				testStepPassed("The Checkout Registered Button is Not Displayed");
			}

		} catch (Exception e) {
			testStepPassed("The Checkout Registered Button is Not Found");
		}
	}


	public void checkingtheshoppingbagcountemptyandifnotemptyingtheshoppinginIE(){
		//waitTime(2);
		driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
		waitTime(2);
		/*testStepInfo("");
		testStepInfo("Checking the Shopping Bag is Empty. If it Contains Items will clear the items and make the Bag empty");
		testStepInfo("----------------------------------------------------------------------------------------------------------------------------------------");*/
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);

		if(Bagnocount.equals("0"))   {
			testStepPassed("Shopping Bag is empty with product count in the bag : 0");
			clickOnBagnocount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			testStepPassed("Shopping Bag is not Empty. It Contains "+Bagwithcount+" Items in the Bag");
			clearshoppingbaginIE();
		}
	}

	public void clearshoppingbaginIE(){
		try{
			//clickOn(lnk_Header_Cart_WithCount);

			navigateTo(prefix+".menswearhouse.com/OrderCalculate?calculationUsageId=-1&calculationUsageId=-2&calculationUsageId=-6&updatePrices=1&doConfigurationValidation=Y&catalogId=12004&errorViewName=AjaxOrderItemDisplayView&orderId=.&langId=-1&storeId=12751&URL=AjaxOrderItemDisplayView");

			waitTime(2);
			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				//wait(5);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public void clickBackToTopButton(){
		try {
			if (driver.findElement(By.xpath("//footer[contains(@id,'pg-footer')]//a[contains(@id,'back-to-top-trigger')]")).isDisplayed()) {
				clickOn(btn_ShoppingBagPage_BackToTopButton);
			}
		} catch (Exception e) {
			testStepFailed("The BAck To Top Button is not found");
		}
	}

	public void VerifyGiftCardShippingChargeFreeinShoppingCartOrderTotalWidget(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(text(),'Est. Shipping')]")).isDisplayed()) {
				String ESTShipping = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(@class,'js-shipping-tax')]")).getText();
				if (ESTShipping.equalsIgnoreCase("FREE")) {
					testStepPassed("Gift card Shipping Charges is free");
				}
				else {
					testStepFailed("Est.Shipping charges is not free for Gift Card. Est.Shipping Tax value : "+ESTShipping);
				}
			}
		} catch (Exception e) {
			testStepFailed("Estimated Shipping in Order total Widget in Shopping Cart page is not displayed or the charges may be applied");
		}
	}


	public void checkingtheshoppingbagcountemptyandifnotemptyingtheshoppingDifferentCloneId(){
		/*waitTime(2);
	driver.findElement(By.xpath("//section[@class='logo-bar']/a")).click();
	waitTime(2);*/
		/*testStepInfo("");
	testStepInfo("Checking the Shopping Bag is Empty. If it Contains Items will clear the items and make the Bag empty");
	testStepInfo("----------------------------------------------------------------------------------------------------------------------------------------");*/
		String Bag=null;
		System.out.println(Bag);
		String Bagnocount;
		String Bagwithcount;
		Bagnocount=driver.findElement(By.xpath(".//*[@id='header-cart-nocount']/span[2]")).getText();
		Bagnocount = getText(lnk_Bagnocount);
		Bagwithcount = getText(lnk_Bagwithcount);

		if(Bagnocount.equals("0"))   {
			testStepPassed("Shopping Bag is empty with product count in the bag : 0");
			clickOnBagnocount();   
			//verifyShoppingBagPage();
			//removeAllItemInMyCartPage();

		}else{
			testStepPassed("Shopping Bag is not Empty. It Contains "+Bagwithcount+" Items in the Bag");
			clearshoppingbagDifferentCloneId();
		}
	}

	public void clearshoppingbagDifferentCloneId(){
		try{
			/*Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(".//a[@id='header-cart-with-count']/span[2]"))).build().perform();
			clickOn(lnk_view_shoppingbag);*/

			if (driver.findElement(By.xpath(".//*[@id='header-cart-with-count']")).isDisplayed()) {
				clickOn(lnk_Bag);
			}

			String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					clickOn(lnk_shoppingbagremove);
					waitTime(1);
					waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(1);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public void clickEditIteminShoppingCart(){
		try {
			waitTime(2);
			clickOn(lnk_EditItem);
		} catch (Exception e) {
			testStepFailed("Edit Item is not displayed");
		}
	}

	public static final String lnk_QVPopupClose = "QuickViewPopupClose Link#xpath=//div[contains(@id,'quickInfoPopup')]//a[contains(@id,'WC_QuickInfo_Link_close')]"; 
	
	public void entereditproductvalues(String ProdcyQuantity){
		try {
			
				            waitTime(2);
							WebElement clear = driver.findElement(By.xpath("//div[contains(@class,'qv-wrap')]//input[contains(@id,'quantity')]"));
							//clearEditBox("Clear quantity field #xpath=//div[contains(@class,'qv-wrap')]//input[contains(@id,'quantity')]");
							clear.sendKeys(Keys.CONTROL + "a");
							clear.sendKeys(Keys.DELETE);
							//mouseOver(lnk_QVPopupClose);
							//typeIn(txt_EditQuantity, ProdcyQuantity);
							driver.findElement(By.xpath("//div[contains(@class,'qv-wrap')]//input[contains(@id,'quantity')]")).sendKeys("2");

		} catch (Exception e) {
			testStepFailed("Edit Quantity is not displayed");
		}
	}


	public void clickUpdateButton(){
		try {
			//waitTime(2);
			clickOn(btn_Update);
			waitTime(2);
			String ProductCount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//h2//span")).getText();
			System.out.println("ProductCount : "+ProductCount);
			testStepPassed("ProductCount : "+ProductCount);
			if (ProductCount.equalsIgnoreCase("2 ITEM(S)")) {
				testStepPassed("Product quantity is increased");
			} else {
				testStepFailed("Product count is not increased");
			}

		} catch (Exception e) {
			testStepFailed("Update Button is not displayed");
		}
	}


	//div[contains(@id,'ShopCartDisplay')]//h2//span

	public void checktheprductcount(){
		try {
			waitTime(2);
			clickOn(btn_Update);
		} catch (Exception e) {
			testStepFailed("Update Button is not displayed");
		}
	}


	public String getProductNameFromShoppingCartPage(String Productname){
		try {
			waitTime(2);
			//String Productprice=null;
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//h3//a")).isDisplayed()) {
				Productname = driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//h3//a")).getText();
			}
		} catch (Exception e) {
			testStepFailed("Product name is not displayed in Shopping Cart");
		}
		return Productname;
	}






	public String getProductPriceFromShoppingCartPage(String Productprice){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//span[@class='product-price']")).isDisplayed()) {
				Productprice = driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//span[@class='product-price']")).getText();
				Productprice = StringUtils.substringAfter(Productprice, "$");
			}
		} catch (Exception e) {
			testStepFailed("Product price is not displayed for product in Shopping Cart");
		}
		return Productprice;
	}



	public void removeAllItemsfromShoppingCart(){
		try{
			/*String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}
*/

			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					waitTime(2);
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					//waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(2);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}




	public void removeAllItemsfromShoppingCart2(){
		try{
			/*String bag=getText(txt_shoppingbagheading);
			String trimmedbagtext = bag.substring(0, 12);
			if (trimmedbagtext.equalsIgnoreCase("Shopping Bag")) {
				testStepPassed("It is navigated to the Shopping Bag Page");
			} else {
				testStepFailed("It is not navigated to the Shopping Bag Page");
			}*/


			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);

			if (s>0) {                                
				for (int i = 0; i<s; i++) {
					waitTime(2);
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					//waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(2);
			}

			String bagempty = driver.findElement(By.xpath(".//h1[@class='empty-cart-title']")).getText();
			if (bagempty.equals("Your shopping cart is empty.")) {
				testStepPassed("The Items in the Shopping Bag are removed. Now the Shopping Bag is Empty");
			} else {
				testStepFailed("The Items are not removed from the Shopping Bag. The Shopping Cart is not Empty");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}







	public void removeItemsfromShoppingCarttoCountOne(){
		try{
			waitTime(1);			
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);
			int t=s-1; 
			System.out.println("t : "+t);
			if (s>0) {                                
				for (int i = 0; i<=t; i++) {
					waitTime(2);
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					//waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(2);
			}

			String Bagcount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@class,'shopping-bag-header')]//span]")).getText();
			if (Bagcount.equals("1 ITEM(S)")) {
				testStepPassed("The Items count in the Shopping Bag is reduced to 1");
			} else {
				testStepFailed("The Items count in the Shopping Bag is not reduced to 1");
			}
		}catch(Exception e){
			testStepFailed(e.toString());
		}
	}


	public void removeItemsfromShoppingCarttoCountOne_New(){
		try{
			waitTime(1);			
			List<WebElement> removeLink=driver.findElements(By.xpath("//div[@id='order_details']//a[contains(text(),'Remove')]"));
			int s = removeLink.size();
			System.out.println("Count : "+s);
			int t=s-1; 
			System.out.println("t : "+t);
			if (s>0) {                                
				for (int i = 0; i<t; i++) {
					waitTime(2);
					clickOn(lnk_shoppingbagremove);
					waitTime(2);
					//waitForLoadingAndDissappearMWLoadingImg();
				}
			}

			synchronized (this) {
				wait(2);
			}

			/*		String Bagcount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@class,'shopping-bag-header')]//span]")).getText();
			if (Bagcount.equals("1 item(s)")) {
				testStepPassed("The Items count in the Shopping Bag is reduced to 1");
			} else {
				testStepFailed("The Items count in the Shopping Bag is not reduced to 1");
			}
			 */		}catch(Exception e){
				 testStepFailed(e.toString());
			 }
	}








	public void verifyCertonaisDisplayedandAddProductthroughQVandPDP(String Size){
		try
		{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]")).isDisplayed()) {
				testStepPassed("Certona Widget is displayed");
				List<WebElement> CertonaBlock = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]//section[contains(@class,'certona-widget')]"));
				int CertonaBlockCount = CertonaBlock.size();
				testStepPassed("Certona Block Count : "+CertonaBlockCount);

				for (int i = 0; i < CertonaBlockCount; i++) {
					int j = i+1;
					int k=1;
					System.out.println(k);
					if (driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).isDisplayed()) {
						String CertonaTitle = driver.findElement(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]/div[contains(@class,'certona-widget__title')]")).getText();
						//testStepPassed("");
						testStepPassed("Certona Widget "+j+" Title : "+CertonaTitle);
						List<WebElement> CertonaProducts = driver.findElements(By.xpath("//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'certona-slide js-prod-item slick-slide')]"));
						int CertonaProductsCount = CertonaProducts.size();
						testStepPassed("Certona products Count in Widget "+j+" : "+CertonaProductsCount);


						/*testStepPassed("Adding Product from QV of Certona Widget : "+j);
						String ProductName = driver.findElement(By.xpath("(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a//div[contains(@class,'certona-product__title')])["+k+"]")).getText(); 
						mouseOver(ProductName+"Product image#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//div[@class='certona-product__image-wrap quick-view-wrapper'])["+k+"]");
						final String CertonaQVLink="Certona QV Link#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//div[contains(@class,'certona-product')]//div[@class='certona-product__image-wrap quick-view-wrapper'])["+k+"]//a[contains(@class,'js-qv-link')]";
						clickOn(CertonaQVLink);
						if (verifyQVisDisplayed()) {
							selectSizeFromQVPopup(Size);
							clickOnAddToShoppingBagFromQVPopup();
						}
						else {
							testStepFailed("QV Popup is not displayed");
						}
						getProductCountinMinicart();


						testStepPassed("Adding Product from PDP of Certona Widget : "+j);
						final String CertonaProductLink="Certona Product Link#xpath=(//div[contains(@class,'js-crt-widget')]["+j+"]//section[contains(@class,'certona-widget')]//div[contains(@class,'slick-active')]//a[@class='certona-product__link js-prod-link'])["+j+"]";
						clickOn(CertonaProductLink);
						if (verifyPDPisDisplayed()) {
							selectSizeFromProductDescriptionPagenew(Size);
							clickPDPAddtoShoppingBagButton();
						}
						else {
							testStepFailed("PDP is not displayed");
						}
						getProductCountinMinicart();

						waitTime(1);
						URLNavigateBack();*/
					}
				}
			} 

		}catch(Exception e){
			testStepFailed("Certona Widget is not displayed in Product Grid Page");  
		}
	}


	public String selectSizeFromProductDescriptionPagenew(String size)
	{

		try {
			//waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'rw')]//div[contains(@class,'size-dropdown js-size-dropdown')]//div[@id='ada-qv-curr-size']")).isDisplayed()) {
				clickOn(drp_size_item);
				//waitTime(2);
				List<WebElement> sizeOptions=driver.findElements(By.xpath("//div[contains(@class,'sizes-wrap')]//li[contains(@class,'size-item')]//a[contains(@href,'#')]"));
				if(sizeOptions.size()>0){
					if(!size.isEmpty()){
						for(WebElement ele:sizeOptions){
							if(ele.getText().equalsIgnoreCase(size)){
								ele.click();
								testStepPassed("click on '"+size+"' size");
								break;
							}
						}
					}else{
						size=sizeOptions.get(0).getText();
						sizeOptions.get(0).click();
						testStepPassed("click on '"+size+"' size");
					}
				}else{
					testStepFailed("Size options are not listed");
				}
				//return size;
			} else {
				testStepPassed("The Size dropdown is not displayed");
			}

		} catch (Exception e) {
			
			testStepPassed("The Size dropdown is not displayed");
		}
		return size;

	}


	public static final String btn_PDP_AddToShoppingBag_new="PDP Add to Shopping Bag Button#xpath=//section[contains(@id,'prod-info')]//a[contains(@id,'add-to-cart')]";

	public void clickPDPAddtoShoppingBagButton(){
		try{
			//waitTime(2);
			if (driver.findElement(By.xpath("//section[contains(@id,'prod-info')]//a[contains(@id,'add-to-cart')]")).isDisplayed()) {
				clickOn(btn_PDP_AddToShoppingBag_new);
			} else {
				testStepFailed("Add to Shopping Button is not found");
			}

		}catch(Exception e){
			testStepFailed("Add to Shopping Button is not found");
		}
	}


	public void clickOnAddToShoppingBagFromQVPopup(){
		clickOnSpecialElement(btn_qv_add_to_shoppingbag);
	}



	public boolean verifyQVisDisplayed(){

		boolean flag=false;
		try{
			waitTime(2);
			if(driver.findElement(By.xpath("//div[contains(@id,'quickInfoPopup')]//div[contains(@class,'widget_quick_info_popup')]")).isDisplayed()){
				testStepPassed("QV Popup is displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("QV Popup is not displayed");
		}
		return flag;
	}


	public boolean verifyPDPisDisplayed(){

		boolean flag=false;
		try{
			waitTime(2);
			if(driver.findElement(By.xpath("(//section[contains(@id,'pdp')]//section[contains(@id,'prod-info')]) | //div[contains(@class,'js-bundle pdp-container')]")).isDisplayed()){
				testStepPassed("PDP is Displayed");
				flag= true;
			}
		}catch(Exception e){
			testStepFailed("PDP is not displayed");
		}
		return flag;
	}

	public void getProductCountinMinicart(){
		String ProductCount = driver.findElement(By.xpath("//li[contains(@class,'mini-cart-holder')]//a[contains(@id,'header-cart-with-count')]//span[contains(@class,'js-cart-counter')]")).getText();
		testStepPassed("Product Count in Bag : "+ProductCount);
	}



	public void verifyShopTelligenceisDisplayedinPDPandTitle(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]")).isDisplayed()) {
				testStepPassed("ShopTelligence section is displayed in PDP");
				String ShopTelligenceTitle = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//h3")).getText();
				testStepPassed("ShopTelligence section title : "+ShopTelligenceTitle);
			}
		} catch (Exception e) {
			testStepFailed("ShopTelligence section is not displayed in PDP");
		}
	}



	public void verifyShopTelligenceOuterCarouselisDisplayedandCheckingBuutonsaredisplayed(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]")).isDisplayed()) {
				testStepPassed("Carousel is displayed in ShopTelligence section");

				testStepInfo("");
				List <WebElement> ShopTelligenceCarouselSection = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li"));
				int ShopTelligenceCarouselSectionCount = ShopTelligenceCarouselSection.size();
				testStepPassed("ShopTelligence Carousel Blocks Count : "+ShopTelligenceCarouselSectionCount);
				testStepPassed("ShopTelligence Carousel Block Names");
				for (int i = 1; i <=ShopTelligenceCarouselSectionCount; i++) {
					String ShopTelligenceCarouselBlockName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li//span[contains(@class,'ensemble-name')])["+i+"]")).getText();
					testStepPassed(i+"."+ShopTelligenceCarouselBlockName);
				}
				String ShopTelligenceActiveCarouselName = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li[contains(@class,'main-pos')]")).getText();
				testStepPassed("Default ShopTelligence Active Carousel Name : "+ShopTelligenceActiveCarouselName);




				testStepInfo("");
				List <WebElement> ShopTelligenceCarouselButtons = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button"));
				int ShopTelligenceCarouselButtonsCount = ShopTelligenceCarouselButtons.size();
				testStepPassed("ShopTelligence Carousel Buttons Count : "+ShopTelligenceCarouselButtonsCount);
				testStepPassed("ShopTelligence Carousel Buttons Names");
				for (int i = 1; i <=ShopTelligenceCarouselButtonsCount ; i++) {
					String ShopTelligenceCarouselButtonsName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).getText();
					testStepPassed(+i+"."+ShopTelligenceCarouselButtonsName);
				}



				String ShopTelligenceCarouselActiveButtonsName = driver.findElement(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button[contains(@class,'active')]")).getText();
				testStepPassed("Default ShopTelligence Active Carousel Button : "+ShopTelligenceCarouselActiveButtonsName);
			}
		} catch (Exception e) {
			testStepFailed("Carousel is not displayed in ShopTelligence section");
		}
	}




	public void verifyCorrespondingCarouselisDisplayedinShopTelligence(){
		try {
			testStepInfo("");
			List <WebElement> ShopTelligenceCarouselButtons = driver.findElements(By.xpath("//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button"));
			int ShopTelligenceCarouselButtonsCount = ShopTelligenceCarouselButtons.size();

			for (int i = 1; i <=ShopTelligenceCarouselButtonsCount ; i++) {
				String ShopTelligenceCarouselButtonName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).getText();
				driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//span[contains(@class,'shoptelligence-carousel-buttons')]/button)["+i+"]")).click();
				testStepPassed("Clicked Carousel button : "+ShopTelligenceCarouselButtonName);
				String ShopTelligenceCarouselName = driver.findElement(By.xpath("(//div[contains(@id,'shoptelligence-section')]//section[contains(@class,'shoptelligence-carousel')]//li//span[contains(@class,'ensemble-name')])["+i+"]")).getText();
				if (ShopTelligenceCarouselName.equalsIgnoreCase(ShopTelligenceCarouselButtonName)) {
					testStepPassed("Correct "+ShopTelligenceCarouselName+" Carousel block is displayed while clicking "+ShopTelligenceCarouselButtonName);
				}
				else {
					testStepFailed("Incorrect Carousel is displayed while clicking "+ShopTelligenceCarouselButtonName);
				}
			}


		} 
		catch (Exception e) {

			testStepFailed("Carousel is not displayed in ShopTelligence section");

		}
	}



	public String getProductCountinShoppingCartPage(String ProductCount){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@class,'shopping-bag-header')]//span")).isDisplayed()) {
				ProductCount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@class,'shopping-bag-header')]//span")).getText();
			}
		} catch (Exception e) {
			testStepFailed("Shopping Cart Items Title is not displayed");
		}
		return ProductCount;
	}


	public static final String btn_ShoppingBag_CheckoutRegistered="Shopping Bag Checkout Registered Button#xpath=//div[contains(@id,'ShopCartDisplay')]//a[contains(@id,'checkoutRegistered')]";


	public void clickRegisteredUserChekoutButton(){
		try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//a[contains(@id,'checkoutRegistered')]")).isDisplayed()) {
				clickOn(btn_ShoppingBag_CheckoutRegistered);
			}
		} catch (Exception e) {
			testStepFailed("Shopping Cart Registered User Checkout Button is not displayed");
		}

	}




	public static final String lnk_PromoCode_Expand = "Promo Code Expand Link#xpath=//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//a[contains(text(),'Promo Code')]";
	public static final String txt_PromoCode_Value = "Promo Code Value Textbox#xpath=//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//input[contains(@id,'promoCode')]";
	public static final String lnk_PromoCode_Apply = "Promo Code Apply Link#xpath=//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//a[contains(text(),'Apply')]";


	public void clickPromoCodeExpandLink()
	{
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//a[contains(text(),'Promo Code')]")).isDisplayed()) 
			{
				clickOn(lnk_PromoCode_Expand);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Promo Code Section is not displayed");
		}
	}


	public void enterPromoCodedetailsandClickApply(String PromoCode)
	{
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//input[contains(@id,'promoCode')]")).isDisplayed()) 
			{
				typeIn(txt_PromoCode_Value, PromoCode);
				clickOn(lnk_PromoCode_Apply);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Promo Code textbox is not displayed");
		}
	}




	public void verifyPromoCodeisApplied()
	{
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]")).isDisplayed()) 
			{
				testStepPassed("Promo Code is applied");
				
				String AppliedPromnoCode = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]//div[contains(@class,'promotion_used')]//a")).getText();
				
				testStepInfo("Applied Promo Code : "+AppliedPromnoCode);
				
				String AppliedPromnoCodeAmount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]/span[contains(@data-gtm,'order-promo-off-price')]")).getText();
				
				testStepInfo("Applied Promo Code Amount : "+AppliedPromnoCodeAmount);
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Promo Code is not applied");
		}
	}

	
	
	public static final String lnk_DeleteAppliedPromoCode = "Applied Promo Code Delete Link#xpath=//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]//div[contains(@id,'appliedPromotionCodes')]//a";

	public void deleteAppliedPromoCode()
	{
		try 
		{
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartDisplay')]//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]//div[contains(@id,'appliedPromotionCodes')]//a")).isDisplayed()) 
			{
				clickOn(lnk_DeleteAppliedPromoCode);
				
			}
		} 
		catch (Exception e) 
		{
			testStepFailed("Delete Promo Code is not displayed");
		}
	}
	

	
	  public boolean verifyTailoringOptionisAddedtoProductandDisplayedinShoppingCartPage()
	  {
		  boolean flag=false;
		  
		  if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//div[contains(@class,'tailoring-line')]")).isDisplayed()) 
		  {
			 testStepPassed("Tailoring Option is Added to the Product and displayed in Shopping Cart Page");
			 
			 flag= true;
		  }
		  else 
		  {
			  testStepFailed("Tailoring Option is Added to the Product and displayed in Shopping Cart Page");
		  }
		return flag;

	  } 
	  
	  
	  public void verifyTailoringOptionisRemovedtoProductandNotDisplayedinShoppingCartPage()
	  {
		 
		  
		  try {
			if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//div[contains(@class,'tailoring-line')]")).isDisplayed()) 
			  {
				 
				 testStepFailed("Tailoring Option is not Removed from the Product and displayed in Shopping Cart Page");

			  }
			  else 
			  {
				  testStepPassed("Tailoring Option is Removed from the Product and not displayed in Shopping Cart Page");
				  
				  
			  }
		} catch (Exception e) {
			testStepPassed("Tailoring Option is Removed from the Product and not displayed in Shopping Cart Page");
		}
		

	  } 
	
	
	
	  public String getTailoringAmountAddedtoProductinShoppingCartPage()
	  {
		  String TailoringAmount = null;
		  
		  if (driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//div[contains(@class,'tailoring-line')]//div[contains(@class,'tailoring-price')]//span[contains(@data-gtm,'finish-price')]")).isDisplayed()) 
		  {
			  TailoringAmount = driver.findElement(By.xpath("//div[contains(@id,'ShopCartPagingDisplay')]//div[contains(@class,'tailoring-line')]//div[contains(@class,'tailoring-price')]//span[contains(@data-gtm,'finish-price')]")).getText();
			  
			  System.out.println("Tailoring Amount : "+TailoringAmount);
		  }
		  else 
		  {
			  testStepFailed("Tailoring Option is not Added to the Product and displayed in Shopping Cart Page");
		  }
		  return TailoringAmount;

	  }  
	
	
	
	  public static final String chk_TailorAndHem="Tailor & Hem Checkbox#xpath=//input[@id='tailoring-checkbox']";
	
		public void UnCheckTailorAndHemOption()
		{
			try 
			{
				waitTime(3);
				if (driver.findElement(By.xpath("//input[(@id='tailoring-checkbox')]")).isDisplayed()) 
				{
					
					System.out.println("Tailoring Check box is found");
					
					clickOnSpecialElement(chk_TailorAndHem);
					
				}
			} 
			catch (Exception e) 
			{
				testStepFailed("Tailor & Hem Checkbox is not displayed");
			}
		}
		
		public String getProductPromotionNameInShoppingCartPage(String promotionName) {
			String locator="first product listed#xpath=//div[@class='bag-item-detail']//p[@class='promotion-callout']";
			promotionName=getText(locator);
			clickOn(promotionName+" promotion name#xpath=//div[@class='bag-item-detail']//p[contains(text(),'"+promotionName+"')]");
			return promotionName;
		}
		
}
