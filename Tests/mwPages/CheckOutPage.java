package mwPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;
import baseClass.PopupWindows;


public class CheckOutPage extends PopupWindows
{
	public CheckOutPage(BaseClass obj) {
		super(obj);
	}



	public static final String lnk_PaymentinReviewTab_PerfectFit_Expand="Perfect Fit Panel Expand Link#xpath=//div[contains(@class,'payment-info')]//li//a[contains(text(),'Perfect Fit Rewards')]";
	public static final String txt_PaymentinReviewTab_PerfectFitId="Perfect Fit Id Textbox#xpath=//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//input[contains(@id,'reward-pf-linkup-input')]";
	public static final String btn_PaymentinReviewTab_PerfectFitId_Save="Perfect Fit Id Save Button#xpath=//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//button[contains(@id,'js-reward-pf-linkup')]";
	public static final String txt_PaymentinReviewTab_PerfectFitId_Certificate="Perfect Fit Certificate Textbox#xpath=//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//input[contains(@id,'pfCode')]";
	public static final String btn_PaymentinReviewTab_PerfectFitId_Certificate_Apply="Perfect Fit Certificate Apply#xpath=//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//button[contains(@id,'applyPFBtn')]";


	public static final String lnk_PaymentinReviewTab_GiftCard_Expand="Gift Card Panel Expand Link#xpath=//div[contains(@class,'payment-info')]//li//a[contains(text(),'Gift Card')]";
	public static final String txt_PaymentinReviewTab_GiftCardNo="Gift Card No Textbox#xpath=//div[contains(@class,'payment-info')]//li//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]";
	public static final String txt_PaymentinReviewTab_GiftCardPinNo="Gift Card Pin No Textbox#xpath=//div[contains(@class,'payment-info')]//li//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardPin')]";
	public static final String btn_PaymentinReviewTab_GiftCard_Apply="Gift Card Apply Button#xpath=//div[contains(@class,'payment-info')]//li//form[contains(@id,'giftCardForm')]//button[contains(@id,'applyGiftcard')]";


	public static final String lnk_PaymentinReviewTab_Promocode_Expand="Promocode Panel Expand Link#xpath=//div[contains(@class,'payment-info')]//li//a[contains(text(),'Promo Code')]";
	public static final String txt_PaymentinReviewTab_Promocode="Promocode Textbox#xpath=//div[contains(@class,'payment-info')]//li//form[contains(@id,'PromotionCodeForm')]//input[contains(@id,'promoCodeCheckoutInput')]";
	public static final String btn_PaymentinReviewTab_Promocode_Apply="Promocode Apply Button#xpath=//div[contains(@class,'payment-info')]//li//form[contains(@id,'PromotionCodeForm')]//button[contains(@id,'applyPromoBtn')]";





	public static final String lnk_checkout_perfectfitreward="perfect fit reward link #xpath=//*[contains(@id,'panel-payment')]//*[contains(text(),'Perfect Fit Rewards')]";
	public static final String txt_checkout_perfectfitreward_accountidnumber="the account id number #xpath=//*[contains(@id,'panel-payment')]//*[@id='js-reward-pf-linkup-input']";
	public static final String btn_checkout_perfectfitreward_save="perfectfitreward save button #xpath=//*[contains(@id,'panel-payment')]//*[@id='js-reward-pf-linkup']";
	public static final String txt_checkout_perfectfitreward_certificatenumber="the certificate number #xpath=//*[contains(@id,'panel-payment')]//*[@id='pfCode']";
	public static final String btn_checkout_perfectfitreward_certificatenumber_apply="the save button #xpath=//*[contains(@id,'panel-payment')]//*[@id='applyPFBtn']";
	public static final String lnk_pickdifferentstore=" pick different store link#xpath=//*[@id='differentStore']";
	public static final String drp_shipping_Rush="Choose Rush Option #xpath=//form[@id='ShipToStoreAddressForm' or @id='ChangeAddressForm']//*[@id='Rush']";
	public static final String drp_shipping_Express="Choose Express Option #xpath=//form[@id='ShipToStoreAddressForm' or @id='ChangeAddressForm']//*[@id='Express']";
	public static final String txt_FindStore ="Find Store#xpath=//*[@id='storeFinderAddress']";
	public static final String drp_Shipping_ShipToStore="Choose Shipping Method Address #xpath=//form[@id='ShipToStoreAddressForm' or @id='ChangeAddressForm']//div[@id='js-regularShippingDropDown']";
	public static final String txt_FindStoreButton ="Find Store#xpath=//input[@id='storeFinderBtn']";
	public static final String txt_EstimatedShippingCharge_Eight="value 8 #xpath=//*[@id='orderTotalsSummaryWidget']//*[contains(@class,'hide-for-small-only')]//*[contains(text(),'Est. Shipping')]/parent::li//*[contains(text(),'8')]";
	public static final String txt_checkout_promecode_value="verify the amount #xpath=//*[@id='discountDetailsSection']/span";
	public static final String rdo_btn_paypal="paypal radio button#xpath=//*[contains(@id,'tab-payment-paypal')]";
	public static final String lnk_checkout_promocode="promo code link #xpath=//*[contains(@id,'panel-payment')]//*[text()='Promo Code']";
	public static final String txt_checkout_promocode="the promo code #xpath=//*[contains(@id,'panel-payment')]//*[@id='promoCodeCheckoutInput']";
	public static final String btn_checkout_promocode_apply="apply button #xpath=//*[contains(@id,'panel-payment')]//*[@id='applyPromoBtn']";
	public static final String txt_Payment_Billing_FirstName1_new = "Payment Billing First Name Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-firstname']";
	public static final String txt_Payment_Billing_LastName1_new = "Payment Billing Last Name Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-lastname']";
	public static final String txt_Payment_Billing_Address1_new = "Payment Billing Address1 Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-street1']";
	public static final String txt_Payment_Billing_City1_new = "Payment Billing City Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-city']";
	public static final String drp_Payment_Billing_State1_new = "Payment Billing State#xpath=//section[contains(@class,'payment-cc-section')]//select[@id='bill-state']";
	public static final String txt_Payment_Billing_Zip1_new = "Payment Billing Zip Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-zip']";
	public static final String drp_Payment_Billing_Country1_new = "Payment Billing Country#xpath=//section[contains(@class,'payment-cc-section')]//select[@id='bill-country']";
	public static final String txt_Payment_Billing_Telephone1_new = "Payment Billing Telephone Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[@id='bill-tel']";
	public static final String txt_Payment_Continue_new = "Payment Continue Button#xpath=//div[contains(@class,'checkout-order-main')]//button[contains(@id,'js-continue-payment')]";
	public static final String txt_ShippingTab = "Shipping Tab Button#xpath=//a[text()='Shipping']";
	public static final String txt_checkout_perfectfitreward_certificate_amount="certificate amount #xpath=//*[@id='orderTotalsSummaryWidget']//*[contains(text(),'Certificates Applied')]/parent::li";



	private String id_PerfectFitRewardsCertificateErrorMessage =  "billingErrorMessageText";

	public static final String txt_CvvinReviewTab="Review Tab Cvv Textbox#xpath=//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='cvvPayMethodId']";
	public static final String txt_Saved_CvvinReviewTab="Review Tab Saved Cvv Textbox#xpath=//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']";
	public static final String btn_FindAddress_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab="Find Addresss in Different Store in Ship to Store in Shipping Tab Edit in Review Tab Button#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderBtn')]";
	public static final String lnk_ShoppingCartEdit="review Tab Shopping Cart Edit Link#xpath=//div[@id='orderReviewDisplay']//div[contains(@class,'shopping-bag-header')]//a[contains(text(),'Edit')]";

	public static final String drp_ShippingMethod_EditShipping_ReviewTab="Add New Address Shipping Method in Edit Shipping Overlay in Review Tab Link#xpath=//div[contains(@id,'js-regularShippingDropDown')]//ul[contains(@class,'custom-dropdown')]//li";
	public static final String lnk_Express_ShippingMethod_EditShipping_ReviewTab="Add New Address Express Shipping Method in Edit Shipping Overlay in Review Tab Link#xpath=//div[contains(@id,'js-regularShippingDropDown')]//ul[contains(@class,'custom-dropdown')]//li[contains(@id,'Express')]";





	public static final String lnk_AddNewAddress_EditShipping_ReviewTab="Add New Address in Edit Shipping Overlay in Review Tab Link#xpath=//form[contains(@id,'ChangeAddressForm')]//a[contains(@id,'ada-createNewShipAddr')]";
	public static final String btn_Continue_edit_shipping_info_overlay="continue button#xpath=//div[@id='shippingEditModal']/div/button[text()='Continue']";
	public static final String lnk_change_address="change address link#xpath=//div[@id='js-selectedAddress']//a[text()='Change Address']";
	public static final String lnk_ShippingTabEditinReviewTab="Shipping Tab Edit in Review Tab Link#xpath=//div[@id='orderReviewDisplay']//div[contains(@class,'shipping-info')]//a[contains(text(),'Edit')]";
	public static final String lnk_Edit_EditBilling_BillingTabEditinReviewTab="Edit Billing in Billing Tab Edit in Review Tab Link#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//a[contains(@id,'ada-edit-cc')]";
	public static final String lnk_AddNewBilling_BillingTabEditinReviewTab="Add New Billing Details in Edit Billing in Billing Tab Edit in Review Tab Link#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//a[@id='ada-add-new-cc']";
	public static final String chk_BillingSameasShippingAddress_EditBilling_BillingTabEditinReviewTab="Same as Shipping Address in Edit Billing in Billing Tab Edit in Review Tab Checkbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'billingSameAsShipping')]";
	public static final String chk_MakeCardDeafult_EditBilling_BillingTabEditinReviewTab="Make Default Address in Edit Billing in Billing Tab Edit in Review Tab Checkbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'billingSetPrimary')]";
	public static final String txt_FirstName_EditBilling_BillingTabEditinReviewTab="First Name in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-firstname']";
	public static final String txt_LastName_EditBilling_BillingTabEditinReviewTab="Last Name in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-lastname']";
	public static final String txt_Address1_EditBilling_BillingTabEditinReviewTab="Address 1 in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-street1']";
	public static final String txt_City_EditBilling_BillingTabEditinReviewTab="City in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-city']";
	public static final String drp_State_EditBilling_BillingTabEditinReviewTab="State in Edit/Add Billing in Billing Tab Edit in Review Tab Dropdown#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//select[@id='bill-state']";
	public static final String txt_Zip_EditBilling_BillingTabEditinReviewTab="Zip in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-zip']";
	public static final String txt_Phone_EditBilling_BillingTabEditinReviewTab="Phone in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-tel']";
	public static final String txt_CreditCardNo_EditBilling_BillingTabEditinReviewTab="Card No in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-ccnum')]";
	public static final String txt_CreditCardCvv_EditBilling_BillingTabEditinReviewTab="Card Cvv in Edit/Add Billing in Billing Tab Edit in Review Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-cvv')]";
	public static final String drp_CreditCardExpiryMonth_EditBilling_BillingTabEditinReviewTab="Card Expiry Month in Edit/Add Billing in Billing Tab Edit in Review Tab Dropdown#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-mo')]";
	public static final String drp_CreditCardExpiryYear_EditBilling_BillingTabEditinReviewTab="Card Expiry Year Edit/Add Billing in Billing Tab Edit in Review Tab Dropdown#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-yr')]";
	public static final String btn_Continue_EditBilling_BillingTabEditinReviewTab="Continue Button in Edit/Add Billing in Billing Tab Edit in Review Tab Button#xpath=//div[contains(@id,'billingEditModal')]//button[contains(@id,'js-continue-payment')]";
	public static final String txt_SavedCardCvv_EditBilling_BillingTabEditinReviewTab="Saved Card Cvv in Edit Billing Tab Textbox#xpath=//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]";
	public static final String lnk_Paypal_EditBillinginReviewTab="Paypal in Edit Billing in Review Tab Link#xpath=//div[contains(@id,'billingEditModal')]//li[contains(@id,'tab-payment-paypal')]";
	public static final String btn_PaypalContinue_EditBillinginReviewTab="Paypal Continue in Edit Billing in Review Tab Button#xpath=//div[contains(@id,'billingEditModal')]//button[contains(@class,'js-continue-with-paypal')]";










	public static final String txt_NewCardCVV="CVV#xpath=//input[contains(@id,'pay-cvv')]";
	public static final String txt_SavedCardCVV="CVV#xpath=//input[contains(@id,'savedCardCVV')]";
	public static final String btn_CheckoutPlaceOrder="Place order button#xpath=//a[contains(@id,'placeOrderBtn') and contains(text(),'Place Order')]"; 
	public static final String btn_PlaceOrder="Place order button#xpath=//*[contains(text(),'Place Order')]"; 
	public static final String lnk_EditBillinginReviewTab="Edit Billing in Review Tab Link#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//a[contains(text(),'Edit')]";

	public static final String tab_Shipping_ShipToAddress="Ship To Address Tab#xpath=//a[contains(text(),'Ship to Address')]";
	public static final String tab_Shipping_ShipToStore = "Ship To Store Tab#xpath=//a[contains(text(),'Ship to Store')]";
	public static final String lnk_PickDifferentStore="Pick a different store link#xpath=//*[@id='differentStore']";
	public static final String txt_Zipcode = "Zip Code for store#xpath=//input[contains(@id,'storeFinderAddress')]";
	public static final String btn_FindAStore = "Find a Store button#xpath=//input[contains(@id,'storeFinderBtn')]";
	public static final String ele_FirstListedStore = "First Store#xpath=//ul[contains(@id,'storeFinderResults')]/li[1]";
	public static final String lnk_SelectFirstAddress_StoreAddressSearchResultsinFindAddress_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab="select First Store in Store Search Results in Find Addresss in Different Store in Ship to Store in Shipping Tab Edit in Review Tab Button#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]//li[1]//a";
	public static final String btn_Continue_ShiptoStore_ShippingTabEditinReviewTab="Ship to Store Continue in Shipping Tab Edit in Review Tab Button#xpath=//div[contains(@id,'shippingEditModal')]//button[contains(@class,'js-proceed-to-payment button')]";

	public static final String txt_Shipping_SavedAddress="Saved Address#xpath=";
	public static final String txt_Shipping_FirstName="First Name#xpath=//input[contains(@id,'ship-firstname')]"; 
	public static final String txt_Shipping_LastName="Last Name#xpath=//input[contains(@id,'ship-lastname')]"; 
	public static final String txt_Shipping_Address_Line1="Address Line1#xpath=//input[contains(@id,'ship-street1')]"; 
	public static final String txt_Shipping_Address_Line2="Address Line2#xpath=//input[contains(@id,'ship-street2')]";
	public static final String txt_Shipping_City="City#xpath=//input[contains(@id,'ship-city')]"; 
	public static final String drp_Shipping_State="State#xpath=//*[@id='ship-to-address-panel']//select[@id='ship-state']"; 
	public static final String txt_Shipping_ZipCode="Zipcode#xpath=//input[contains(@id,'ship-zip')]";
	public static final String drp_Shipping_PhoneNumber="Phone Number#xpath=//input[contains(@id,'ship-tel')]";
	public static final String drp_Shipping_ShippingMethod="Shipping Method #xpath=//div[contains(@id,'regularShippingDropDown')]";
	public static final String btn_Shipping_Continue="continue shipping button#xpath=//div[@id='panel-shipping']//*[text()='Continue']";
	public static final String lnk_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab="Different Store in Ship to Store in Shipping Tab Edit in Review Tab Link#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//a[contains(@id,'differentStore')]";
	public static final String txt_ZipCode_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab="Zip Code in Different Store in Ship to Store in Shipping Tab Edit in Review Tab Link#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderAddress')]";
	public static final String ele_Billing_AddPromoCode="Add Promo Code#xpath=//*[contains(@id,'promo-code-anchor')]";
	public static final String txt_Billing_PromoCode="Promo Code#xpath=//*[contains(@id,'promoCodeCheckoutInput')]";
	public static final String btn_Billing_ApplyPromoCode="Apply Promo Code#xpath=//*[contains(@id,'applyPromoBtn')]";
	public static final String txt_Billing_CreditCard_Number="credit card number textbox#xpath=//input[contains(@id,'pay-ccnum')]";
	public static final String txt_Billing_CreditCard_CVV="cvv textbox#xpath=//input[contains(@id,'pay-cvv')]";
	public static final String drp_Billing_CreditCard_ExpiryMonth="expiry month dropdown#xpath=//select[contains(@id,'exp-date-mo')]";
	public static final String drp_Billing_CreditCard_ExpiryYear="expire year dropdown#xpath=//select[contains(@id,'exp-date-yr')]";
	public static final String chk_Billing_UseShippingAddressAsMyBillingAddress="Use Shipping Address As My Billing Address#xpath=//input[contains(@id,'billingSameAsShipping')]";
	public static final String btn_Billing_Continue="continue billing button#xpath=//button[contains(@id,'continue-payment')]";
	public static final String tab_PayPal = "Payapal tab in Billing section#xpath=//a[contains(text(),'Paypal')]";
	public static final String tab_PayPal_shoppingbag = "Payapal tab in Billing section#xpath=//*[@class='paypal-button']";
	public static final String btn_Billing_ContinueWithPaypal="continue billing button#xpath=//button[contains(text(),'Continue with Paypal')]";

	public static final String btn_Billing_ContinueWithPaypal_New="continue billing button#xpath=//button[contains(@class,'js-continue-with-paypal button')]";
	public static final String lnk_Perfect_Fit_Rewards_Review_tab="PerfectFit Rewards link in Review tab#xpath=//div[@id='orderReviewDisplay']/div[contains(@class, 'payment-info clearfix')]//ul[contains(@class, 'accordion')]/li/a[contains(text(), 'Perfect Fit Rewards')]";
	public static final String txt_Billing_FirstName="first name#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'firstName')]"; 
	public static final String txt_Billing_LastName="last name#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'lastName')]"; 
	public static final String txt_Billing_Address="the adress#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'address1')]"; 
	public static final String txt_Billing_City="the city option#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'city')]"; 
	public static final String drp_Billing_State="the state option#xpath=//*[contains(@id,'BillingAddressForm')]//select[contains(@name,'state')]"; 
	public static final String txt_Billing_Zip="the zipcode#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'zipCode')]";
	public static final String txt_Billing_PhoneNo="the phone number#xpath=//*[contains(@id,'BillingAddressForm')]//input[contains(@name,'phone')]";

	public static final String btn_UsethisAddress_AddressVerificationOverlay_NewAddress_EditShipping_ReviewTab="Use this Address in Address Verification in Add New Address Shipping Method in Edit Shipping Overlay in Review Tab Button#xpath=//div[contains(@id,'js-addressVerificationWithoutRecommendation')]//button[contains(@class,'js-av-continue')]";
	public static final String drp_Address_EditShipping="Address dropdown in Edit Shipping Overlay#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'dropdown-ship-address-1')]";
	public static final String lnk_NewAddress_EditShipping="New Address dropdown in Edit Shipping Overlay#xpath=//div[contains(@id,'shippingEditModal')]//div[contains(@id,'dropdown-ship-address-1')]//ul[contains(@id,'dropdown-ship-address-dropdown-1')]//li[2]";



	public static final String lnk_GiftCard_Review_tab="PerfectFit Rewards link in Review tab#xpath=//div[@id='orderReviewDisplay']/div[contains(@class, 'payment-info clearfix')]//ul[contains(@class, 'accordion')]/li/a[contains(text(), 'Gift Card')]";

	//-------------------------------------

	public static final String btn_cart_checkout="check out button#xpath=//div[contains(@id,'LogonCheckoutWidgetArea')]//a[@id='checkoutRegistered']";
	public static final String lbl_Shopping_cart="Shopping Cart items #xpath=//div[@id='ShopCartDisplay']";
	public static final String lbl_SavedItem="Saved Item#xpath=//h2[text()='Saved Items']";
	public static final String lnk_SavedItems="Saved Items Link#xpath=//div[contains(@class,'rw shopping-bag-recommendations')]//ul";
	public static final String drp_ChooseFromSavedAddress = "Choose from Shipping address #xpath=//span[contains(text(),'Choose from saved addresses')]";
	public static final String drp_ChooseShippingMethodToAddress = "Choose Shipping Method dropdown in address #xpath=//div[contains(@id,'js-regularShippingDropDown')]";
	public static final String lnk_ShippingMethodToStore = "Shipping Method to store #xpath=//a[contains(text(),'Ship to Store')]";
	public static final String lnk_ShippingMethodToAddress = "Shipping Method to store #xpath=//a[contains(text(),'	Ship to Address')]";
	public static final String lnk_ChangeAddress = "Change Shipping Address #xpath=//span[contains(@id,'ada-editNewShipAddr')]";
	public static final String lnk_CreateNewAddress = "Create New Address #xpath=//*[contains(@id,'ada-createNewShipAddr')]";
	public static final String lnk_ThisOrderIsaGift = "link This Order Is a Gift #xpath=//form[@id='ChangeAddressForm']//a[contains(text(),'This order is a gift')]";
	public static final String txt_Gift_Message="The Gift message #xpath=//form[@id='ChangeAddressForm']//textarea[@name='giftMessage']";
	public static final String lnk_ShipToAnotherCountry="//a[contains(text(),'Ship to another country?')]"; 
	public static final String drp_SelectYourShippingDestinationCountry="//select[contains(@id,'country')]";
	public static final String drp_SelectYourPreferredCurrency="//div[@id='ship-to-another-country']//select[contains(@id,'currencyCode')]";
	public static final String btn_ProceedAsUSCustomer="//button[contains(text(),'Proceed as U.S. Customer')]";
	public static final String btn_UpdateCountryCurrency="//button[contains(text(),'Update Country & Currency')]";
	public static final String btn_Continue="//div[@id='panel-shipping']//button[contains(text(),'Continue')]";
	public static final String btn_Payment="//a[text()='Payment']";
	public static final String lnk_PerfectFitRewards = "link Perfect fit rewards #xpath=//a[contains(text(),'Perfect Fit Rewards')]";
	public static final String txt_PerfectFitAccountIdNumber = "Enter Perfect fit Account Id Number #xpath=//input[contains(@id,'js-reward-pf-linkup-input')]";
	public static final String lnk_ForgotPerfectFitNumber = "link to forgot perfect Id NumberId #xpath=";
	public static final String lnk_GiftCard = "link This Order Is a Gift #xpath=//a[contains(text(),'Perfect Fit Rewards')]";
	//-------------------------------------------




	public static final String btn_CheckoutAsGuest_Button="Checkout as guest  button#xpath=//*[@id='checkoutGuestToggle']";
	public static final String txt_eamilId_textbox_guest="email id text box#xpath=//input[@name='logonIDGuest']";
	public static final String btn_CheckoutAsGuest="checkout as guest#xpath=//*[@id='checkoutGuest']";


	public static final String lnk_checkout_add_a_giftcard="add a gift card #xpath=//*[text()='Gift Card']";
	public static final String txt_cardnumber="the card number #xpath=//*[@id='giftCardForm']//*[@id='giftCardNumber']";
	public static final String txt_pinnumber="the pin number #xpath=//*[@id='giftCardForm']//*[@id='giftCardPin']";
	public static final String btn_apply="the apply button #xpath=//*[@id='giftCardForm']//*[@id='applyGiftcard']";





	public static final String rdo_continueAsGuest_radioButton="Continue as guest radio button#xpath=//input[@id='checkoutLogonStep-continueAsGuest']";
	public static final String rdo_registeruser_radioButton="register user radio button#xpath=//input[@id='checkoutLogonStep-continueAsRegistered']";
	public static final String txt_eamilId_textbox="email id text box#xpath=//input[@name='logonId']";
	public static final String txt_password_textbox="password textbox#xpath=//input[contains(@id,'password')]";
	public static final String btn_signincheckout="sign in check out #xpath=//a[@id='continue-signin-checkout']";
	//public static final String txt_cvv="cvv textbox#xpath=//*[@id='creditCardFormBox']//*[@id='pay-cvv']";
	public static final String btn_continue_sigin="continue sigin button#xpath=//div[contains(@class,'continue-signin')]/a";
	//	public static final String btn_continue_shipping_button="continue shipping button#xpath=//a[contains(text(),'Continue')]";
	public static final String btn_continue_shipping_button="continue shipping button#xpath=//div[@id='panel-shipping']//*[text()='Continue']";

	public static final String chk_sameAsShipping="same as billing checkbox#xpath=//input[@id='ship-as-bill' or @id='billingSameAsShipping']";
	//public static final String txt_credit_card_number="credit card number textbox#xpath=//input[contains(@id,'pay-ccnum') or contains(@name,'account1')]";

	//	public static final String txt_SavedCardCVV="cvv textbox#xpath=//li[contains(@id,'savedCardPair')]//input[contains(@id,'savedCard') or contains(@name,'cc_cvc')]";
	//public static final String drp_expire_month="expiry month dropdown#xpath=//select[contains(@id,'exp-date-mo') or contains(@name,'expire_month')]";
	//public static final String drp_expire_year="expire year dropdown#xpath=//select[contains(@id,'exp-date-yr') or contains(@name,'expire_year')]";
	//	public static final String btn_continue_billing="continue billing button#xpath=//*[contains(@id,'continue-payment')]";
	public static final String rdo_new_rewards_customer="sign me up perfit fit reward radio button#xpath=//input[contains(@id,'newRewardsCustomer') and contains(@name,'rewardsType')]";
	public static final String rdo_no_rewards_customer="don't want sign up radio button#xpath=//input[contains(@id,'optOutPF') and contains(@name,'rewardsType')]";
	public static final String btn_continue_reward="continue rewards button#xpath=//a[contains(@id,'continueCreateAccountBtn')]";
	//public static final String btn_placeOrder="place order button#xpath=//a[contains(@id,'placeOrderBtn') and contains(text(),'Place Order')]"; 
	public static final String txt_shipping_firstName="first name#xpath=//form[@id='shippingAddressForm']//input[@id='firstName']"; 
	public static final String txt_shipping_lastName="last name#xpath=//form[@id='shippingAddressForm']//input[@id='lastName']"; 
	public static final String txt_shipping_address="the adress#xpath=//form[@id='shippingAddressForm']//input[@id='address1']"; 
	public static final String txt_shipping_city="the city option#xpath=//form[@id='shippingAddressForm']//input[@id='city']"; 
	public static final String drp_shipping_state="the state option#xpath=//form[@id='shippingAddressForm']//select[@id='state']"; 
	public static final String txt_shipping_zip="the zipcode#xpath=//form[@id='shippingAddressForm']//input[@id='zipCode']";
	public static final String drp_shipping_PhoneNo="the phone number#xpath=//form[@id='shippingAddressForm']//input[@id='phone1']";
	public static final String drp_shipping_shippingExpress="the shipping express option #xpath=//section[@id='shipPanelSection']//select[@id='shippingMethodSelect']";
	/*public static final String lnk_checkout_add_a_giftcard="add a gift card #xpath=//label[text()='Add a Gift Card']/parent::h3";
	public static final String txt_cardnumber="the card number #xpath=//form[@id='giftCardForm']//input[@id='giftCardNumber']";
	public static final String txt_pinnumber="the pin number #xpath=//form[@id='giftCardForm']//input[@id='giftCardPin']";
	public static final String btn_apply="the apply button #xpath=//form[@id='giftCardForm']//a[@id='apply-giftcard']";
	 */public static final String btn_continueCreateAccount ="Continue Create Account Button#xpath=//a[contains(@id,'continueCreateAccountBtn')]";
	 public static final String btn_saveShippingAddress = "Shipping Address - Save Button#xpath=//a[contains(@id,'ShippingAddressFormSubmitBtnLabel')]";
	 /*public static final String txt_billing_firstName="first name#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'firstName')]"; 
	public static final String txt_billing_lastName="last name#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'lastName')]"; 
	public static final String txt_billing_address="the adress#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'address1')]"; 
	public static final String txt_billing_city="the city option#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'city')]"; 
	public static final String drp_billing_state="the state option#xpath=//ul[contains(@id,'billingAddressFieldsId')]//select[contains(@name,'state')]"; 
	public static final String txt_billing_zip="the zipcode#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'zipCode')]";
	public static final String txt_billing_PhoneNo="the phone number#xpath=//ul[contains(@id,'billingAddressFieldsId')]//input[contains(@name,'phone1')]";
	  */public static final String txt_sendTo_mailID = "Text for emailbutton#xpath=//section[contains(@id,'shipPanelSection')]//p[contains(text(),'')]";
	  //public static final String btn_PaypayShippingContinue="paypal shipping Continue button#xpath=//form[@id='continue']//a[@id='continue']";
	  //public static final String btn_PaypayPlaceOrder="paypal shipping Continue button#xpath=//form[@id='placeOrderBtn']//a[@id='placeOrderBtn']";
	  public static final String txt_PaypalEmail="Paypal Email Id#xpath=//form[@id='login_email']//input[@id='login_email']";
	  public static final String lnk_ShiptoStore_ShippingTabEditinReviewTab="Ship to Store in Shipping Tab Edit in Review Tab Link#xpath=//div[contains(@id,'shippingEditModal')]//ul[contains(@id,'js-shipToTabs')]//a[contains(text(),'Ship to Store')]";
	  public static final String txt_PaypalPassword="Paypal Password#xpath=//form[@id='login_password']//input[@id='login_password']";
	  public static final String btn_PaypayLogin="Paypal login button#xpath=//button[@id='btnLogin']";
	  public static final String btn_submitorder="submit order button#xpath=//div[contains(@class,'form-actions order-summary right-rail-btn ng-scope')]//button[contains(text(),'Submit Order')]";
	  public static final String drp_creditcardoption="select credit card option#xpath=//div[contains(@id,'panelCreditCard')]//*[contains(@id,'card-select')]";
	  public static final String ele_PayPal = "Payapal tab in Billing section#xpath=//h3[contains(text(),'PayPal')]";
	  public static final String txt_codenumber="the code number #xpath=//input[@id='promoCodeCheckoutInput']";
	  public static final String btn_rewardapply="reward apply button #xpath=//a[@id='applyPromoOrPfButton']";
	  public static final String lnk_checkout_add_a_rewardcertificate="reward certificate#xpath=//label[text()='Add a Promo Code or Rewards Certificate']/parent::h3";
	  public static final String img_Logo="Logo#xpath=//a[@id='logo']";
	  public static final String btn_PaypayShippingContinue="paypal shipping Continue button#xpath=//*[@id='confirmButtonTop']";
	  public static final String btn_PaypayPlaceOrder="paypal shipping Continue button#xpath=//a[@id='placeOrderBtn' or text()='Place Order']";
	  //public static final String btn_continue_Paypal_billing="continue billing button#xpath=//a[contains(@id,'continueFromPayPalBilling')]";
	  public static final String txt_confirmpopup="confirm popup displayed#xpath=//div[contains(@class,'wrap')]//h3[contains(text(),'Confirm your Shipping Address')]";
	  public static final String btn_confirmpopup_accept="accept button#xpath=//div[contains(@class,'wrap')]//h3[contains(text(),'Confirm your Shipping Address')]/parent::div//div[contains(@class,'content')]//div[contains(@class='address-val current')]//div[@class='address-val-content clearfix']//a[contains(text(),'Accept')]";
	  public static final String btn_confirmpopup_continue="continue button#xpath=//div[contains(@class,'wrap')]//h3[contains(text(),'Confirm your Shipping Address')]/parent::div//div[contains(@class,'content')]//div[contains(@class='address-val clearfix')]//div[@class='address-val-content']//a[contains(text(),'Continue')]";
	  //spublic static final String txt_savedCardCVV="Saved card CVV#xpath=//li[contains(@id,'savedCardPair')]//input[contains(@id,'savedCardSecCode')]";
	  public static final String lnk_WhatIsPerfectFit="What is Perfert fit#xpath=//form[contains(@id,'checkoutRegistrationForm')]//div[contains(@class,'pf-mktg-msg')]";
	  public static final String lnk_editShipping="Edit link in Shipping block#xpath=//section[contains(@id,'shipPanelSection')]//span[contains(@class,'edit')]";
	  public static final String lnk_pickadifferentstore="Picking a different store#xpath=//div[contains(@id,'findAndPickStore')]//a[contains(@id,'change-store-pop') or contains(@id,'Search for a store')]";
	  public static final String drp_ShippingAddress = "Select Saved Address#xpath=//select[contains(@id,'savedAddress')]";
	  public static final String lnk_cancelandreturn="cancel and return menswearlogo #xpath=//input[contains(@id,'cancel_return')]";
	  public static final String lnk_searchforastore = "search for a store link#xpath=//a[contains(@id,'change-store-pop')]";
	  public static final String txt_zipcode = " Zip Code for store#xpath=//section[contains(@id,'shipPanelSection')]//input[contains(@id,'myZipCode')]";
	  public static final String btn_findAStore = "Find a Store button#xpath=//section[contains(@id,'shipPanelSection')]//input[contains(@id,'findAStoreBtn')]";
	  public static final String btn_Shipping_Continue_new="Continue shipping button#xpath=//div[contains(@id,'panel-shipping')]//button[contains(text(),'Continue')]";
	  public static final String txt_Payment_CardCvv="Credit card Cvv textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]";
	  public static final String btn_Payment_Continue_new="Continue Payment button#xpath=//div[contains(@id,'panel-payment')]//button[contains(@id,'js-continue-payment')]";

	  public static final String txt_Shipping_FirstName_new="Shipping First Name Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-firstname')]";
	  public static final String txt_Shipping_LastName_new="Shipping Last Name Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-lastname')]";
	  public static final String txt_Shipping_Address_new="Shipping Address Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-street1')]";
	  public static final String txt_Shipping_City_new="Shipping City Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-city')]";
	  public static final String drp_Shipping_State_new="Shipping State Dropdown#xpath=//div[contains(@id,'panel-shipping')]//select[contains(@id,'ship-state')]";
	  public static final String txt_Shipping_Zipcode_new="Shipping Zipcode Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-zip')]";
	  public static final String txt_Shipping_Telephone_new="Shipping Telephone Textbox#xpath=//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-tel')]";
	  public static final String btn_Shipping_Continue_New="Shipping Continue Button#xpath=//div[contains(@id,'panel-shipping')]//button[contains(text(),'Continue')]";

	  public static final String lnk_Payment_Promocode="Promode Section Open Link#xpath=//div[contains(@id,'panel-payment')]//a[contains(@id,'promo-code-anchor')]";
	  public static final String txt_Payment_PromocodeNo="Promode No Textbox#xpath=//div[contains(@id,'panel-payment')]//input[contains(@id,'promoCodeCheckoutInput')]";
	  public static final String btn_Payment_PromocodeApply="Promode Apply Button#xpath=//div[contains(@id,'panel-payment')]//button[contains(@id,'applyPromoBtn')]";

	  public static final String lbl_Shiping_OrderSummary="Shipping Order Summary Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']";
	  public static final String lbl_Payment_OrderSummary="Payment Order Summary Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']";
	  public static final String lbl_Review_OrderSummary="Review Order Summary Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']";

	  public static final String txt_Payment_CreditCardNo_new="Payment Credit Card No Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-ccnum')]";
	  public static final String txt_Payment_CreditCardCvvNo_new="Payment Credit Card Cvv No Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-cvv')]";
	  public static final String txt_Payment_SavedCardCreditCardCvvNo_new="Payment Saved Card Credit Card Cvv No Textbox#xpath=//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]";
	  public static final String drp_Payment_CreditCardExpiryMonth="Payment Credit Card Expiry Month Dropdown#xpath=//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-mo')]";
	  public static final String drp_Payment_CreditCardExpiryYear="Payment Credit Card Expiry Year Dropdown#xpath=//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-yr')]";
	  public static final String txt_Payment_Billing_FirstName_new="Payment Billing First Name Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-firstname')]";
	  public static final String txt_Payment_Billing_LastName_new="Payment Billing Last Name Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-lastname')]";
	  public static final String txt_Payment_Billing_Address_new="Payment Billing Address Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-street1')]";
	  public static final String txt_Payment_Billing_City_new="Payment Billing City Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-city')]";
	  public static final String drp_Payment_Billing_State_new="Payment Billing State Dropdown#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//select[contains(@id,'bill-state')]";
	  public static final String txt_Payment_Billing_Zipcode_new="Payment Billing Zipcode Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-zip')]";
	  public static final String txt_Payment_Billing_Telephone_new="Payment Billing Telephone Textbox#xpath=//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-tel')]";
	  public static final String btn_Payment_Continue="Payment Continue Button#xpath=//div[contains(@id,'panel-payment')]//button[contains(@id,'js-continue-payment')]";

	  public static final String lnk_OrderConfirmationPage_ApplicationLogo="Order Confirmation Page Application Logo Link#xpath=//section[contains(@class,'logo-bar checkout')]//a[contains(@id,'checkout-logo')]";
	  public static final String lnk_Paymentpage_GiftCardReedem_GiftCardLink="Payment Tab Gift Card Reedem Gift Card Link#xpath=//div[contains(@id,'panel-payment')]//a[contains(text(),'Gift Card')]";
	  public static final String txt_Paymentpage_GiftCardReedem_GiftCardNo="Payment Tab Gift Card Reedem Gift Card No Textbox#xpath=//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]";
	  public static final String txt_Paymentpage_GiftCardReedem_GiftCardPin="Payment Tab Gift Card Reedem Gift Card Pin Textbox#xpath=//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardPin')]";
	  public static final String btn_Paymentpage_GiftCardReedem_GiftCardApply="Payment Tab Gift Card Reedem Gift Card Apply Button#xpath=//form[contains(@id,'giftCardForm')]//button[contains(@id,'applyGiftcard')]";



	  public static final String lnk_Paymentpage_GiftCardReedem_GiftCardLink_ReviewTab="Payment Tab Gift Card Reedem Gift Card Link#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//a[contains(text(),'Gift Card')]";
	  public static final String txt_Paymentpage_GiftCardReedem_GiftCardNo_ReviewTab="Payment Tab Gift Card Reedem Gift Card No Textbox#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]";
	  public static final String txt_Paymentpage_GiftCardReedem_GiftCardPin_ReviewTab="Payment Tab Gift Card Reedem Gift Card Pin Textbox#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardPin')]";
	  public static final String btn_Paymentpage_GiftCardReedem_GiftCardApply_ReviewTab="Payment Tab Gift Card Reedem Gift Card Apply Button#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//button[contains(@id,'applyGiftcard')]";



	  public static final String btn_International_submitorder="International Submit Order button#xpath=//button[@id='submit-order-btn-left']";

	  public static final String btn_PlaceOrder_new="Place Order button#xpath=//div[@class='clearfix']//button[contains(text(),'Place Order')]";


	  public static final String lnk_Payment_PerfectFitRewards_PerfectFitRewardsExpandLink="Payment Page PerfectFitRewards PerfectFitRewardsExpand Link#xpath=//div[contains(@id,'panel-payment')]//a[contains(text(),'Perfect Fit CERTIFICATE & REWARDS')]";
	  public static final String txt_Payment_PerfectFitRewards_AccountID="Payment Page PerfectFitRewards AccountID Textbox#xpath=//div[contains(@id,'panel-payment')]//div[contains(@id,'pfit')]//input[contains(@id,'js-reward-pf-linkup-input')]";
	  public static final String btn_Payment_PerfectFitRewards_AccountID_Save="Payment Page PerfectFitRewards AccountID Save Buton#xpath=//div[contains(@id,'panel-payment')]//div[contains(@id,'pfit')]//button[contains(@id,'js-reward-pf-linkup')]";
	  public static final String txt_Payment_PerfectFitRewards_CertificateNo="Payment Page PerfectFitRewards Certificate No Textbox#xpath=//div[contains(@id,'panel-payment')]//div[contains(@id,'pfit')]//input[contains(@id,'pfCode')]";
	  public static final String btn_Payment_PerfectFitRewards_CertificateNo_Apply="Payment Page PerfectFitRewards Certificate No Apply Button#xpath=//div[contains(@id,'panel-payment')]//div[contains(@id,'pfit')]//button[contains(@id,'applyPFBtn')]";
	  public static final String lbl_Payment_PerfectFitRewards_CertificateNo_Apply_ErrorMessage="Payment Page PerfectFitRewards Certificate No Apply Error Message Label#xpath=//p[contains(@id,'billingErrorMessageText') and contains(text(),'Reward Certificate entered is already applied.')]";
	  public static final String lbl_Payment_OrderSummaryList_CertificatesApplied="Payment Page OrderSummaryList CertificatesApplied Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(text(),'Certificates Applied')]";
	  public static final String lbl_Payment_OrderSummaryList_CertificatesApplied_Amount="Payment Page OrderSummaryList CertificatesApplied Amount Label#xpath=//div[contains(@id,'orderTotalsSummaryWidget')]//ul[@class='order-summary-list']//li[2]//span[@class='value product-price total_figures']";

	  public static final String lnk_Shipping_ShiptoStore_Tab="Ship to Store Tab#xpath=//div[contains(@id,'panel-shipping')]//a[contains(text(),'Ship to Store')]";
	  public static final String lnk_Shipping_ShiptoStore_SelectDifferentStore="Ship to Store Select Different Store LinkTab#xpath=//div[contains(@id,'ship-to-store-panel')]//a[contains(@id,'differentStore')]";
	  public static final String txt_Shipping_ShiptoStore_StoreAddress="Enter Store Pin no Textbox#xpath=//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderAddress')]";
	  public static final String btn_Shipping_ShiptoStore_StoreAddressSearch="Store Search Button#xpath=//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderBtn')]";
	  public static final String lnk_Shipping_ShiptoStore_FirstStore="FistStore Listed Link#xpath=//ul[contains(@id,'storeFinderResults')]//li[1]";


	  public static final String txt_SubTotalPrice = "SubTotal Price#xpath=//ul[@class='order-summary-list']/descendant::span[contains(text(),'Subtotal')]/..//span[@class='value product-price']";
		public static final String txt_estTaxes = "Est. Taxes#xpath=//ul[@class='order-summary-list']/descendant::span[contains(text(),'Est. Taxes')]/..//span[contains(@class, 'value product-price')]";
		public static final String txt_GiftcardPrice = "Gift card Price#xpath=//div[contains(@id, 'order_details')]//div[contains(@class, 'bag-item-detail')]//h3[contains(text(), 'Gift Card')]//parent::div/div/span[@class='product-price']";
		public static final String txt_ProductPrice = "Product Price#xpath=//div[@class='bag-item-detail']//span[@class='product-price']";
		public static final String txt_GiftcardProduct = "Gift card product#xpath=//div[contains(@id, 'order_details')]//div[contains(@class, 'bag-item-detail')]//h3[contains(text(), 'Gift Card')]";
		public static final String txt_TravelCrease = "Travel Crease#xpath=//div[contains(@class, 'tailoring-line')]//p[contains(text(), 'TravelerCrease')]";
		public static final String txt_TravelCreaseAmount = "Travel Crease Amount#xpath=//div[contains(@class, 'tailoring-line')]//div[@class='tailoring-price']";
		public static final String paymentpageemailaddress = "fill email address in payment pagee#xpath=//input[@id='bill-email']";








	  private String strCardNumber;
	  private String strCardExpiryMonth;
	  private String strCardExpiryYear;
	  private String strCardCvv;
	  private String strGiftCardNumber;
	  private String strPIN;

	  
	  
	  
	  public void fillpaymentpageemailaddress(String GuestEmail)
	  {
		  try{
			  //if(driver.findElement(By.xpath("//div[@class='billing-email-section ']//input[@id='bill-email']")).isDisplayed())
				  if(elementPresent("#xpath=//input[@id='bill-email']"))
			  { 
	             waitTime(2);
				 typeIn(paymentpageemailaddress,GuestEmail);
				 //testStepPassed("emailtab is present payment page");
				 testStepInfo("emailtab is present payment page");
			  }
		  }
		  catch(Exception e)
		  {
			testStepPassed("emailtab is not present in payment page"); 
		  }
	  }

	  private void teststeppassed() {
		// TODO Auto-generated method stub
		
	}

	public void sysout(){
		  System.out.println(strGiftCardNumber);
		  System.out.println(strPIN);
	  }


	  public void clickOnContinueAsGuestRadioButton(){
		  clickOn(rdo_continueAsGuest_radioButton);
	  }
	  public void clickOnCheckoutAsGuestButton(){
		  clickOn(btn_CheckoutAsGuest_Button);
	  }

	  public void clickOnRegisterUserradioButton(){
		  clickOn(rdo_registeruser_radioButton);
	  }

	  public void fillSignInDetailCheckOutPage(String username, String password){
		  typeIn(txt_eamilId_textbox,username);
		  typeIn(txt_password_textbox,password);
	  }

	  public void clickOnSignInContinueButtonFromCheckOutPage(){
		  clickOn(btn_continue_sigin);
	  }


	  public void clickOnContinueShippingButtonFromCheckOutPage(){
		  clickOn(btn_Shipping_Continue);
		  waitForLoadingAndDissappearMWLoadingImg();
	  }


	  public void clickOnSameAsShippingCheckBoxFromCheckOutPage(){
		  clickOn(chk_sameAsShipping);
	  }

	  public void clickOnContinueFromBillingInCheckOutPage(){
		  clickOn(btn_Billing_Continue);
		  waitForLoadingAndDissappearMWLoadingImg();
	  }

	  public void clickOnSignUpRewardRadioButtonFromCheckOutPage(){
		  clickOn(rdo_new_rewards_customer);
	  }

	  public void clickOnNoRewardRadioButtonFromCheckOutPage(){
		  clickOn(rdo_no_rewards_customer);
	  }

	  public void clickOnContinueRewardFromCheckOutPage(){
		  clickOn(btn_continue_reward);
	  }

	  public void fillCreditCardDetails(String cardType, String cardNumber, String cvv, String expireMonth, String expireyear){


		  if(cardNumber.isEmpty()||expireMonth.isEmpty()||expireyear.isEmpty()||cvv.isEmpty()){
			  setPaymentData(cardType);
		  }else{
			  strCardNumber=cardNumber;
			  strCardCvv=cvv;
			  strCardExpiryMonth=expireMonth;
			  strCardExpiryYear=expireyear;
		  }
		  waitForElementToDisplay(txt_Billing_CreditCard_Number, elementLoadWaitTime);
		  typeIn(txt_Billing_CreditCard_Number,strCardNumber);
		  typeIn(txt_Billing_CreditCard_CVV,strCardCvv);
		  selectFromDropdown(drp_Billing_CreditCard_ExpiryMonth,strCardExpiryMonth);
		  selectFromDropdown(drp_Billing_CreditCard_ExpiryYear,strCardExpiryYear);



	  }
	  public void selectAddNewCardOptionFromCreditCardOption(String newcard)
	  {
		  try
		  {
			  new Select(driver.findElement(By.xpath("//div[contains(@id,'panelCreditCard')]//*[contains(@id,'card-select')]"))).selectByValue("Master Card Credit Card");
			  testStepPassed("Add new Card:new card dropdown");
		  }
		  catch(Exception e)
		  {
			  testStepFailed("CA Element not found 45 sec");
		  }
	  }
	  public boolean clickOnPlaceOrder(){
		  if(orderPlacementFlag==true){
			  clickOn(btn_PlaceOrder);
			  return true;
		  }else{
			  testStepPassed("Order is not placed due to execution is happening in production or test environment");
			  return false;
		  }

	  }
	  public boolean clickOnSubmitOrder()
	  {
		  if(orderPlacementFlag==true)
		  {
			  driver.switchTo().frame("envoyId");
			  clickOn(btn_submitorder);
			  driver.switchTo().defaultContent();
			  return true;

		  }
		  else{
			  testStepPassed("Order is not placed due to execution is happening in production or test environment");
			  return false;
		  }
	  }

	  public void setPaymentData(String cardType){
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


	  }

	  public void setGiftCardDetails(){
		  strGiftCardNumber=getConfigProperty("Gift Card Number");
		  strPIN=getConfigProperty("Gift Card PIN");
	  }

	  public void selectSavedCardDetails(String cardType, String cvv){
		  if(cvv.isEmpty()){
			  setPaymentData(cardType);
		  }else{
			  strCardCvv=cvv;
		  }
		  //		selectFromDropdown(, strCardNumber);
		  typeIn(txt_SavedCardCVV, strCardCvv);
	  }

	  /*public void fillGiftCardDetails(String giftCardNumber, String PIN){

		if(giftCardNumber.isEmpty()||PIN.isEmpty()){
			setGiftCardDetails();
		}else{
			strGiftCardNumber=giftCardNumber;
			strPIN=PIN;
		}
		typeIn(txt_gift_card_number, strGiftCardNumber);
		typeIn(txt_PIN, strPIN);
	}*/

	  /*public void clickOnApplyGiftCard(){
		clickOn(btn_applyGiftCard);
	}*/

	  /*
	public void fillShippingDetails(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNo)
	{
		if(verifySavedAddressIsDisplayed()){
			selectFromDropdown(drp_ShippingAddress,"Enter New Address");
			if(verifyAddNewAddressPopuopIsDisplayed()){
				fillAndSaveNewShippingAddressPopUpInCheckoutPage(firstName, lastName, address, city, state, zipCode, phoneNo);
			}else{
				testStepFailed("Add New Address Popup is not displayed");
			}
		}else{
			typeIn(txt_shipping_firstName,firstName);
			typeIn(txt_shipping_lastName,lastName);
			typeIn(txt_shipping_address,address);
			typeIn(txt_shipping_city,city);
			//waitTime(10);
			//clickOn(drp_shipping_state);
			//typeIn(drp_shipping_state,State);
			try{
				new Select(driver.findElement(By.xpath("//form[@id='shippingAddressForm']//select[@id='state']"))).selectByValue(state);
				testStepPassed("Select "+state+" from:state dropdown");
			}
			catch(Exception e){
				testStepFailed("Failed to select "+state+" from:state dropdown");
			}
			typeIn(txt_shipping_zip,zipCode);
			typeIn(drp_shipping_PhoneNo,phoneNo);
		}		
	}
	   */

	  public void SelectStateEditShippingDetailsinEditBillingOverlayinReviewTab(String EditCreditCardState){
		  try {
			  waitTime(2);
			  System.out.println("State :" +EditCreditCardState);
			  if (driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']")).isDisplayed()) {
				  Select StateDropdown = new Select(driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']")));
				  //StateDropdown.selectByValue(EditCreditCardState);
				  StateDropdown.selectByValue(EditCreditCardState);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Select State in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }


	  public void SelectEditShipingAddressOptionWithIndex(int indexToSelect)
	  {
		  try {
			  if (driver.findElement(By.xpath("//body[contains(@class,'l-checkout')]//div[contains(@class,'pac-container')][2]//div[contains(@class,'pac-item')]")).isDisplayed()) {
				  List<WebElement>  optinsToSelect = driver.findElements(By.xpath("//body[contains(@class,'l-checkout')]//div[contains(@class,'pac-container')][2]//div[contains(@class,'pac-item')]"));
				  int OptionsCount = optinsToSelect.size();
				  if (indexToSelect<=OptionsCount) {
					  optinsToSelect.get(indexToSelect).click();
					  testStepPassed("Address Autocomplete option is displayed and a value selected from it");
				  }
			  }
		  } catch (Exception e) {
			  testStepPassed("The Select Autocomplete Options are not displayed");
		  }
	  }


	  public void fillEditShippingDetails_address1(String firstName,String lastName,String address,String city)
	  {
		  typeIn(txt_Shipping_FirstName,firstName);
		  typeIn(txt_Shipping_LastName,lastName);
		  typeIn(txt_Shipping_Address_Line1,address);
		  SelectEditShipingAddressOptionWithIndex(1);

		  typeIn(txt_Shipping_City,city);
	  }


	  public void fillEditShippingDetails_State(String state)
	  {
		  //selectFromDropdown(drp_Shipping_State,state);
		  SelectStateEditShippingDetailsinEditBillingOverlayinReviewTab(state);
	  }

	  public void fillEditShippingDetails_address2(String zipCode,String phoneNo)
	  {
		  typeIn(txt_Shipping_ZipCode,zipCode);
		  typeIn(drp_Shipping_PhoneNumber,phoneNo);
	  }

	  public void fillShippingDetails(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNo){
		  typeIn(txt_Shipping_FirstName,firstName);
		  typeIn(txt_Shipping_LastName,lastName);
		  typeIn(txt_Shipping_Address_Line1,address);

		  SelectEditShipingAddressOptionWithIndex(1);

		  typeIn(txt_Shipping_City,city);

		  SelectStateEditShippingDetailsinEditBillingOverlayinReviewTab(state);

		  //selectFromDropdown(drp_Shipping_State,state);

		  //SelectEditShipingAddressOptionWithIndex(1);

		  //SelectStateEditShippingDetailsinEditBillingOverlayinReviewTab(state);
		  /* try{
			  new Select(driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']"))).selectByValue(state);
			  testStepPassed("Select "+state+" from:state dropdown");
		  }
		  catch(Exception e){
			  testStepFailed("Failed to select "+state+" from:state dropdown");
		  }*/

		  typeIn(txt_Shipping_ZipCode,zipCode);
		  typeIn(drp_Shipping_PhoneNumber,phoneNo);
	  }	
	  public void createNewAddressIfAvailable()
	  {
		  try{
			  if(driver.findElement(By.xpath("//*[contains(@id,'ada-createNewShipAddr')]")).isDisplayed())
			  {
				  clickOn(lnk_CreateNewAddress);
			  }
		  }
		  catch(Exception e)
		  {

		  }
	  }

	  public void fillUserNameFromCheckOutPage(String username){
		  typeIn(txt_eamilId_textbox_guest, username);
	  }
	  public void clickOnCheckoutAsGuest()
	  {
		  clickOn(btn_CheckoutAsGuest);
	  }

	  public void chooseShippingMethodFromCheckOutPage(String option){
		  selectFromDropdown(drp_shipping_shippingExpress,option);
	  }

	  public void clickOnAddaGiftCardFromCheckOutPage(){
		  waitForElement(lnk_checkout_add_a_giftcard);
		  clickOn(lnk_checkout_add_a_giftcard);
	  }

	  public void fillAddaGiftCardDetailFromCheckOutPage(String cardnumber,String pinnumber){
		  typeIn(txt_cardnumber,cardnumber);
		  typeIn(txt_pinnumber,pinnumber);
	  }

	  public void clickOnApplyFromCheckOutPage(){
		  clickOn(btn_apply);
	  }

	  public void verifyGiftCardAmountFromBillingPage(){
		  if(isElementDisplayed("#xpath=//p[@class='amnt']//span[text()='25']/parent::p/parent::li")){
			  testStepPassed("Gift card amount is reduced");
		  }else{
			  testStepFailed("Gift card amount is not reduced");
		  }
	  }

	  public void clickOnContinueFromCreateOnlineAccountInCheckOutPage(){
		  clickOn(btn_continueCreateAccount);
	  }

	  public void clickOnSaveShippingAddressInCheckOutPage(){
		  clickOn(btn_saveShippingAddress);
	  }

	  public void fillBillingAddressDetails(String firstName,String lastName,String address,String city,String state,String zipCode,String phoneNo){
		  typeIn(txt_Billing_FirstName,firstName);
		  typeIn(txt_Billing_LastName,lastName);
		  typeIn(txt_Billing_Address,address);
		  typeIn(txt_Billing_City,city);
		  //selectFromDropdown(drp_billing_state,state);
		  try{
			  new Select(driver.findElement(By.xpath("//*[contains(@id,'BillingAddressForm')]//select[@id='bill-state']"))).selectByValue(state);
			  testStepPassed("Select "+state+" from:state dropdown");
		  }catch(Exception e){
			  testStepFailed("Select "+state+" from:state dropdown");
		  }
		  typeIn(txt_Billing_Zip,zipCode);
		  typeIn(txt_Billing_PhoneNo,phoneNo);
	  }

	  public void verifyShippingAddressForEGiftcardInShoppingCartPage() {
		  try {
			  driver.findElement(By.xpath("//section[contains(@id,'shipPanelSection')]//p[contains(text(),'Please allow up to 24 hours for your e-Gift Card to be delivered by email')]")).isDisplayed();
			  String mailId = getText(txt_sendTo_mailID);
			  String[] mail = mailId.split(":");
			  String emailaddress = mail[1];
			  System.out.println("There is no shipping options available and");
			  System.out.println("The EGift card will be sent to this email address:" +emailaddress);
		  } catch (Exception e) {
			  System.out.println("EGift card is not added to cart properly");
		  }

	  }

	  public void fillSignInFromCheckOutPage(String username, String password){
		  typeIn(txt_eamilId_textbox, username);
		  typeIn(txt_password_textbox, password);
	  }

	  public void fillSignInPaypalCheckOutPage(String paypalUserName,String paypalPassword){
		  try{
			  if((!paypalUserName.isEmpty())&&(!paypalPassword.isEmpty()))
			  {
				  WebElement paypalUsertName=driver.findElement(By.name("login_email"));
				  paypalUsertName.sendKeys(paypalUserName);
				  WebElement paypalUsertPassword=driver.findElement(By.name("login_password"));
				  paypalUsertPassword.sendKeys(paypalPassword);
				  clickOn(btn_PaypayLogin);
				  driver.switchTo().defaultContent();
			  }
		  }catch(Exception e){
			  testStepFailed(e.toString());
		  }
	  }
	  public void paypalShippingContinue(){
		  clickOn(btn_PaypayShippingContinue);
	  }
	  public void clickOnCancelAndToReturnMenswearHouseLogo()
	  {
		  clickOn(lnk_cancelandreturn);
	  }

	  public void paypalPlaceOrder(){
		  waitForElement(btn_PaypayPlaceOrder);
		  clickOn(btn_PaypayPlaceOrder);

	  }


	  public void clickOnCheckOutFromShippingInCheckOutPage(){
		  try{
			  driver.findElement(By.xpath("//a[text()='Checkout']")).click();
			  testStepPassed("click on checkout button");
		  }
		  catch(Exception e){}
	  }

	  public void clickOnPaypalTab(){
		  clickOn(tab_PayPal);
	  }
	  public void clickOnPaypalTabInShoppingBag()
	  {
		  clickOn(tab_PayPal_shoppingbag);
	  }

	  public void clickOnAddaPromoORRewardFromCheckOutPage()
	  {
		  waitForElement(lnk_checkout_add_a_rewardcertificate);
		  clickOn(lnk_checkout_add_a_rewardcertificate);
	  }

	  public void fillAddaPromoCodoORRewardsCertificateFromCheckOutPage(String codenumber)
	  {
		  typeIn(txt_codenumber,codenumber);
	  }
	  public void clickOnrewardApplyFromCheckOutPage()
	  {
		  clickOn(btn_rewardapply);
	  }

	  public void clickOnLogoFromCheckoutPage(){
		  clickOn(img_Logo);
	  }
	  public void clickOnContinueShippingButtonFromCheckOutPageIfAvailable(){
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).isDisplayed()){
				  clickOnContinueShippingButtonFromCheckOutPage();
				  waitForLoadingAndDissappearMWLoadingImg();
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }

	  }

	  public void clickOnContinueWithPayPalBillingInCheckOutPage(){
		  //clickOn(btn_Billing_ContinueWithPaypal);
		  clickOn(btn_Billing_ContinueWithPaypal_New);
		  waitForLoadingAndDissappearMWLoadingImg();
	  }
	  public void chooseLastOptionInShippingMethodFromCheckOutPage(){

		  try{
			  List<WebElement> options=driver.findElements(By.xpath("//section[@id='shipPanelSection']//select[@id='shippingMethodSelect']/option"));
			  if(options.size()>0){
				  String option=options.get(options.size()-1).getText();
				  options.get(options.size()-1).click();
				  testStepPassed("Select "+option+" from shipping method drop down");
			  }else{
				  testStepFailed("Options are not available under shipping method drop down");
			  }
		  }catch(Exception e){
			  testStepFailed("Exception occured :"+e.toString());
		  }
	  }


	  public boolean clickOnNoRewardPointRadioButtonIfAvailable(){
		  boolean flag=false;
		  try
		  {
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//input[contains(@id,'optOutPF') and contains(@name,'rewardsType')]")).isDisplayed()){
				  clickOnNoRewardRadioButtonFromCheckOutPage();
				  flag=true;
			  }
		  }
		  catch(Exception e)
		  {
		  }
		  return flag;
	  }
	  public boolean verifyAcceptOrContinueShippingAddressPopupDisplayed(){
		  boolean flag=false;
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(isElementDisplayed(txt_confirmpopup)){
				  flag=true;
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
		  return flag;

	  }
	  public void clickOnAcceptFromConfirmShippingAddress()
	  {
		  clickOn(btn_confirmpopup_accept);
	  }

	  public void clickOnContinueFromConfirmShippingAddress(){
		  clickOnSpecialElement(btn_confirmpopup_continue);
		  //	clickOn(btn_confirmpopup_continue);
	  }

	  public boolean verifyCvvTextBoxIsDisplayed(){
		  boolean flag=false;
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//*[@id='pay-cvv']")).isDisplayed()){
				  flag= true;
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
		  return flag;
	  }

	  public boolean isContinueShippingButtonDisplayed(){
		  boolean flag=false;
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//*[contains(@*,'ship')]//a[contains(text(),'Continue')]")).isDisplayed()){
				  flag= true;
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
		  return flag;
	  }

	  public void selectAddNewCardOptionIfAvailableFromCheckoutPage(){
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//*[contains(@id,'ada-add-new-cc')]")).isDisplayed()){
				  clickOn("Select your credit card dropdown#xpath=//*[contains(@id,'ada-add-new-cc')]");
				  List<WebElement> options=driver.findElements(By.xpath("//*[contains(@id,'ada-add-new-cc')]"));
				  if(options.size()>0){
					  for(int i=0;i<options.size();i++){
						  if(options.get(i).getText().contains("Add New Card")){
							  String opt=options.get(i).getText();
							  options.get(i).click();
							  testStepPassed("click on "+opt+" option");
							  break;
						  }
					  }
				  }
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
	  }
	  public void newCardOptionIfAvailableFromCheckoutPage()
	  {
		  try
		  {
			  driver.findElement(By.xpath("//*[@id='ada-add-new-cc']")).click();
		  }
		  catch(Exception e)
		  {

		  }
	  }

	  public void fillCVV(String cvv){
		  typeIn(txt_SavedCardCVV,cvv);
	  }

	  public void fillCVVIfAvailable(String cvv){
		  try{
			  if(driver.findElement(By.xpath("//li[contains(@id,'savedCardPair')]//input[contains(@id,'savedCardSecCode')]")).isDisplayed()){
				  typeIn(txt_SavedCardCVV,cvv);
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
	  }


	  public boolean verifyWhatIsPerfectFitLinkPresentInCheckOutPage(){
		  return elementPresent(lnk_WhatIsPerfectFit);
	  }

	  public boolean verifyShippingEditButtonPresent(){
		  return elementPresent(lnk_editShipping);
	  }

	  public void editShippingInShoppingCartPage(){
		  clickOn(lnk_editShipping);
	  }

	  public boolean clickOnPickADifferentStoreInCheckOutPage(){
		  return elementPresent(lnk_pickadifferentstore);
	  }

	  public void pickADifferentStoreInCheckOutPage(){
		  clickOn(lnk_pickadifferentstore);
	  }

	  public boolean verifySavedAddressIsDisplayed(){
		  boolean flag=false;
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//div[contains(@id,'savedAddressDetail1')]")).isDisplayed()){
				  flag= true;
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
		  return flag;
	  }


	  public void fillSavedCardCVV(String cvv){
		  typeIn(txt_SavedCardCVV,cvv);
	  }


	  public void clickonShipToStore(){
		  clickOn(tab_Shipping_ShipToStore);
	  }

	  public boolean verifyPickADifferentStoreLinkIsDisplayed(){
		  return isElementDisplayed(lnk_PickDifferentStore);
	  }

	  public void clickOnPickADifferentStoreLink(){
		  clickOn(lnk_PickDifferentStore);
	  }
	  public void findAStore(String zipcode){
		  typeIn(txt_Zipcode, zipcode);
		  clickOn(btn_FindAStore);
		  waitForLoadingAndDissappearMWLoadingImg();
	  }

	  public void selectFirstListedStoreInCheckOutpage(){
		  clickOn(ele_FirstListedStore);
	  }

	  public void clickOnSignInCheckOutFromCartPage(){
		  clickOn(btn_signincheckout);
	  }

	  public void clickOnUseShippingAddressAsMyBillingAddress(){
		  clickOn(chk_Billing_UseShippingAddressAsMyBillingAddress);
	  }
	  public boolean verifyCheckBUttonIsDisplayed(){
		  boolean flag=false;
		  try{
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  if(driver.findElement(By.xpath("//a[contains(@id,'checkoutRegistered') or @id='checkout']")).isDisplayed()){
				  flag= true;
			  }
		  }catch(Exception e){

		  }finally{
			  driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		  }
		  return flag;
	  }

	  public void clickOnAddPromoCode(){
		  clickOn(ele_Billing_AddPromoCode);
	  }

	  public void enterPromoCode(String promoCode){
		  typeIn(txt_Billing_PromoCode,promoCode);
	  }

	  public void clickOnApplyPromoCode(){
		  clickOn(btn_Billing_ApplyPromoCode);
		  waitForLoadingAndDissappearMWLoadingImg();
	  }

	  public boolean isPerfectFitRewardsCertificateApplied(){
		  boolean flag=true;
		  if(isPerfectFitRewardsCertificateErrorMessageDisplayed()) flag = false;
		  return flag;
	  }

	  public boolean isPerfectFitRewardsCertificateErrorMessageDisplayed(){
		  boolean flag=false;
		  try{
			  if(driver.findElement(By.id(id_PerfectFitRewardsCertificateErrorMessage)).isDisplayed())
				  flag = true;
		  }catch(Exception e){

		  }
		  return flag;  
	  }

	  public boolean verifyCheckoutPage(){
		  boolean flag = false;
		  try{
			  if(driver.getTitle().toLowerCase().contains("checkout")){
				  testStepPassed("Checkout Page is Displayed");
				  flag = true;
			  }
			  else testStepFailed("Checkout Page Is Not Displayed");
		  }catch(Exception e){
			  testStepFailed("Checkout Page Is Not Displayed");
		  }
		  return flag;
	  }
	  public void clickOnShippingContinueButtonnew(){
		  clickOn(btn_Shipping_Continue_new);
	  }



	  public void fillPaymentCCreditcardCvvnew(String Cvv){
		  typeIn(txt_Payment_CardCvv, Cvv);
	  }


	  public void clickOnPaymentContinueButtonnew(){
		  clickOn(btn_Payment_Continue_new);
	  }
	  public void fillShippingTabDetails(String ShippingFirstName, String ShippingLastName, String ShippingAddress, String ShippingCity, String ShippingState, String ShippingZipcode, String ShippingTelephone){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-shipping')]//input[contains(@id,'ship-firstname')]")).isDisplayed()) {
				  typeIn(txt_Shipping_FirstName_new, ShippingFirstName);
				  typeIn(txt_Shipping_LastName_new, ShippingLastName);
				  typeIn(txt_Shipping_Address_new, ShippingAddress);
				  typeIn(txt_Shipping_City_new, ShippingCity);
				  selectFromDropdown(drp_Shipping_State_new, ShippingState);
				  typeIn(txt_Shipping_Zipcode_new, ShippingZipcode);
				  typeIn(txt_Shipping_Telephone_new, ShippingTelephone);
			  } else {
				  testStepPassed("Shipping Tab is not found");
			  }
		  } catch (Exception e) {
			  testStepPassed("Shipping Tab is not found");
		  }
	  }
	  public void clickShippingContinue(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-shipping')]//button[contains(text(),'Continue')]")).isDisplayed()) {
				  clickOn(btn_Shipping_Continue_New);
			  } else {
				  testStepPassed("The Shipping Continue Button is not Found");
			  } 
		  } catch (Exception e) {
			  testStepPassed("The Shipping Continue Button is not Found");
		  }
	  }






	  public void fillPromocodeandApply(String PromocodeNo){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-payment')]//input[contains(@id,'promoCodeCheckoutInput')]")).isDisplayed()) {
				  testStepPassed("Promocode section is already opened");
				  typeIn(txt_Payment_PromocodeNo, PromocodeNo);
				  clickOn(btn_Payment_PromocodeApply);
			  } else {
				  testStepPassed("Promocode section is not opened");
				  clickOn(lnk_Payment_Promocode);
				  typeIn(txt_Payment_PromocodeNo, PromocodeNo);
				  clickOn(btn_Payment_PromocodeApply);
			  }
		  } catch (Exception e) {
			  testStepPassed("Promocode section is not found");
		  }
	  }

	  public void fillPaymentCreditCardNo(String CreditCardNo){
		  try {
			  waitTime(3);
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-ccnum')]")).isDisplayed()) {
				  typeIn(txt_Payment_CreditCardNo_new, CreditCardNo);
			  } else {
				  testStepPassed("Credit Card No TextBox is not found");
			  }
		  } catch (Exception e) {
			  testStepPassed("Credit Card No TextBox is not found");
		  }
	  }
	  public void fillPaymentCreditCardCvv(String CreditCardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-cvv')]")).isDisplayed()) {
				  typeIn(txt_Payment_CreditCardCvvNo_new, CreditCardCvv);
			  } else {
				  testStepPassed("Credit Card Cvv TextBox is not found");
			  }

		  } catch (Exception e) {
			  testStepPassed("Credit Card Cvv TextBox is not found");
		  }
	  }
	  public void fillPaymentSavedCardCreditCardCvv(String CreditCardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]")).isDisplayed()) {
				  typeIn(txt_Payment_SavedCardCreditCardCvvNo_new, CreditCardCvv);
			  } else {
				  testStepPassed("Saved Credit Card Cvv TextBox is not found");
			  }

		  } catch (Exception e) {
			  testStepPassed("Saved Credit Card Cvv TextBox is not found");
		  }
	  }
	  public void selectPaymentCreditCardExpityMonth(String CreditCardExpiryMonth){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-mo')]")).isDisplayed()) {
				  selectFromDropdown(drp_Payment_CreditCardExpiryMonth, CreditCardExpiryMonth);
			  } else {
				  testStepPassed("Credit Card Expiry Month Dropdown is not displayed");
			  }

		  } catch (Exception e) {
			  testStepPassed("Credit Card Expiry Month Dropdown is not displayed");
		  }
	  }
	  public void selectPaymentCreditCardExpityYear(String CreditCardExpiryYear){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//select[contains(@id,'exp-date-yr')]")).isDisplayed()) {
				  selectFromDropdown(drp_Payment_CreditCardExpiryYear, CreditCardExpiryYear);
			  } else {
				  testStepPassed("Credit Card Expiry Year Dropdown is not displayed");
			  }

		  } catch (Exception e) {
			  testStepPassed("Credit Card Expiry Year Dropdown is not displayed");
		  }
	  }
	  public void fillPaymentBillingDetails(String BillingFirstName, String BillingLastName, String BillingAddress, String BillingCity, String BillingState, String BillingZipCode, String BillingTelephone){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address-area')]//input[contains(@id,'bill-firstname')]")).isDisplayed()) {
				  typeIn(txt_Payment_Billing_FirstName_new, BillingFirstName);
				  typeIn(txt_Payment_Billing_LastName_new, BillingLastName);
				  typeIn(txt_Payment_Billing_Address_new, BillingAddress);
				  typeIn(txt_Payment_Billing_City_new, BillingCity);
				  selectFromDropdown(drp_Payment_Billing_State_new, BillingState);
				  typeIn(txt_Payment_Billing_Zipcode_new, BillingZipCode);
				  typeIn(txt_Payment_Billing_Telephone_new, BillingTelephone);
			  } else {
				  testStepPassed("Payment Billing Address Fields are not displayed");
			  }
		  } catch (Exception e) {
			  testStepPassed("Payment Billing Address Fields are not displayed");
		  }
	  }



	  public void clickPaymentContinue( ){
		  try {
			  
			  /*if (driver.findElement(By.xpath("//div[@class='billing-email-section ']//input[@id='bill-email']")).isDisplayed()) {
				  
				  fillpaymentpageemailaddress(retrieve("GuestEmail")); 
			  }
			  */
			  waitTime(4);
			 // if (driver.findElement(By.xpath("//div[contains(@id,'panel-payment')]//button[contains(@id,'js-continue-payment')]")).isDisplayed()){
				  if(elementPresent("xpath=//div[contains(@id,'panel-payment')]//button[contains(@id,'js-continue-payment')]")){
				  //clickOn(btn_Payment_Continue);
				  waitForElement(btn_Payment_Continue);
				  clickOnSpecialElement(btn_Payment_Continue);
			  }

		  } catch(Exception e) {
			  testStepPassed("Payment Continue Button is not displayed");
		  }
	  }

	  public void clickOrderConfirmationPageApplicationLogo(){
		  waitTime(2);
		  clickOn(lnk_OrderConfirmationPage_ApplicationLogo);
	  }
	  public void verifyReviewTabisDisplayedandactive(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//li[contains(@id,'tab-review') and contains(@class,'tab-title panel3 active')]")).isDisplayed()) {
				  testStepPassed("Review Tab is Displayed and active");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Review Tab is not found and active");
		  }
	  }

	  public void verifyPlaceOrderButtonisDisabled(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//button[contains(@class,'button primary review-cta is-active f-right disable')]")).isDisplayed()) {
				  testStepInfo("Place Order button is Disabled");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Place Order button is not disabled");
		  }
	  }

	  public void clickShoppingCartEditLinkinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//div[contains(@class,'shopping-bag-header')]//a[contains(text(),'Edit')]")).isDisplayed()) {
				  clickOn(lnk_ShoppingCartEdit);
			  } 
		  } catch (Exception e) {
			  testStepPassed("Review Tavb Shopping Cart Edit Link is not present");
		  }
	  }



	  public void verifyCvvisDisplayed(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='cvvPayMethodId']")).isDisplayed()) {
				  testStepPassed("Review Tab Payment details is displayed");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details is not displayed");
		  }
	  }



	  public void getPaymentDetailsinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath(".//*[@id='orderReviewDisplay']/div[5]/div[2]/div/ul")).isDisplayed()) {
				  testStepPassed("Review Tab Payment details is displayed");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details is not displayed");
		  }
	  }


	  public void getShippingAddressinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[4]/div[2]/div[1]")).isDisplayed()) {
				  testStepPassed("Review Tab Address is displayed");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Review Tab address is not displayed");
		  }
	  }



	  public void ClickonSelectDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//a[contains(@id,'differentStore')]")).isDisplayed()) {
				  clickOn(lnk_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab); 
			  } 
		  } catch (Exception e) {
			  testStepFailed("Edit Different Store in Shipping to Store Tab in Shipping Edit Tab Edit Overlay is not displayed");
		  }
	  }



	  public void FillZipCodeforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(String EditStoreZipCode){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderAddress')]")).isDisplayed()) {
				  typeIn(txt_ZipCode_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab, EditStoreZipCode);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Zip Code in Edit Different Store in Shipping to Store Tab in Shipping Edit Tab Edit Overlay is not displayed");
		  }
	  }


	  public void ClickOnFindAddressforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderBtn')]")).isDisplayed()) {
				  clickOn(btn_FindAddress_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab); 
			  } 
		  } catch (Exception e) {
			  testStepFailed("Find Address Button in Edit Different Store in Shipping to Store Tab in Shipping Edit Tab Edit Overlay is not displayed");
		  }
	  }


	  public void selectFirstStoreFromStoreSearchListDisplayed(){
		  try {
			  //waitTime(3);
			  //driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]//li[1]//a")).sendKeys(Keys.PAGE_UP);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]//li[1]//a")).isDisplayed()) {
				  //driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]//li[1]//a")).sendKeys(Keys.PAGE_UP);
				  //waitTime(2);
				  clickOn(lnk_SelectFirstAddress_StoreAddressSearchResultsinFindAddress_DifferentStore_ShiptoStore_ShippingTabEditinReviewTab);
			  }

		  } catch (Exception e) {
			  testStepFailed("The Store Search Results are not displayed");
		  }

	  }

	  public void ClickonContinueinShippingEditModelinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//button[contains(@class,'js-proceed-to-payment button')]")).isDisplayed()) {
				  clickOn(btn_Continue_ShiptoStore_ShippingTabEditinReviewTab);
			  }

		  } catch (Exception e) {
			  testStepFailed("Shipping Edit Model Continue Button is not displayed");
		  }

	  }





	  public boolean VerifyStoreResultsforDifferentStoreinShipttoStoreinShippingEditModelinReviewTab(){
		  boolean flag=false;
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]")).isDisplayed()) {
				  testStepPassed("Search Results for Edit Store is Displayed");
				  flag = true;
			  } 
		  } catch (Exception e) {
			  testStepFailed("Search results in Edit Different Store in Shipping to Store Tab in Shipping Edit Tab Edit Overlay is not displayed");
		  }
		  return flag;
	  }
	  public void verifyItemAddedisDisplayedinReviewtab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'bag-item last')]")).isDisplayed()) {
				  testStepPassed("Item Added in the Cart is Displayed in Review Tab Product panel");
			  } 
		  } catch (Exception e) {
			  testStepPassed("Item Added in the Cart is not Displayed in Review Tab Product panel");
		  }
	  }


	  public void GetOrderSummaryTotalBeforeGiftCardReedemtion(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]")).isDisplayed()) {
				  String OrderToatlBeforeReedemtion = driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]//following::span[contains(@data-gtm,'cart-total')]")).getText();
				  System.out.println("Order Total before Reedemtion : "+OrderToatlBeforeReedemtion);
				  testStepPassed("Order Total before Reedemtion : "+OrderToatlBeforeReedemtion);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Total is not displayed");
		  }
	  }



	  public void GetGiftCardReedemedAmount(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Gift Cards')]")).isDisplayed()) {
				  String GiftCardReedemedAmount = driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Gift Cards')]//following::span[1]")).getText();
				  System.out.println("Gift Card Reedemed Amount : "+GiftCardReedemedAmount);
				  testStepPassed("Gift Card Reedemed Amount : "+GiftCardReedemedAmount);
			  }
		  } catch (Exception e) {
			  testStepFailed("Gift Card Reedemed Amount is not displayed");
		  }
	  }



	  public void GetOrderSummaryTotalAfterGiftCardReedemtion(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]")).isDisplayed()) {
				  String OrderToatlAfterReedemtion = driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]//following::span[contains(@data-gtm,'cart-total')]")).getText();
				  System.out.println("Order Total After Reedemtion : "+OrderToatlAfterReedemtion);
				  testStepPassed("Order Total After Reedemtion : "+OrderToatlAfterReedemtion);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Total is not displayed");
		  }
	  }



	  public void GetOrderSummaryTotalBeforePromocode(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]")).isDisplayed()) {
				  String OrderToatlBeforeReedemtion = driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]//following::span[contains(@data-gtm,'cart-total')]")).getText();
				  System.out.println("Order Total before Reedemtion : "+OrderToatlBeforeReedemtion);
				  testStepPassed("Order Total before Reedemtion : "+OrderToatlBeforeReedemtion);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Total is not displayed");
		  }
	  }



	  public void GetPromodeReedemedAmount(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[contains(@id,'discountDetailsSection')]//span[contains(text(),'Code')]")).isDisplayed()) {
				  String PromocodeReedemedAmount = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(@data-gtm,'promo-off-price')]")).getText();
				  System.out.println("Promocode Reedemed Amount : "+PromocodeReedemedAmount);
				  testStepPassed("Promocode Reedemed Amount : "+PromocodeReedemedAmount);
			  }
		  } catch (Exception e) {
			  testStepFailed("Promocode Reedemed Amount is not displayed");
		  }
	  }


	  public void GetOrderSummaryTotalAfterPromocode(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]")).isDisplayed()) {
				  String OrderToatlAfterReedemtion = driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Order Total')]//following::span[contains(@data-gtm,'cart-total')]")).getText();
				  System.out.println("Order Total After Reedemtion : "+OrderToatlAfterReedemtion);
				  testStepPassed("Order Total After Reedemtion : "+OrderToatlAfterReedemtion);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Total is not displayed");
		  }
	  }

	  public void VerifyOrderTotalinCheckoutPageShippingTab(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).isDisplayed()) {
				  String OrderSummary = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).getText();
				  testStepPassed(OrderSummary);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Summary in Checkout page Shipping Tab is not displayed");
		  }
	  }

	  public void VerifyShippingTab()
	  {
		  if(driver.findElement(By.xpath("//a[contains(text(),'Ship to Address')]")).isDisplayed())
		  {
			  testStepPassed("Verified the page is navigated to shipping tab page");
		  }
	  }



	  public void VerifyReviewTab()
	  {
		  waitTime(2);
		  if(driver.findElement(By.xpath("//a[text()='Review']")).isDisplayed())
		  {
			  testStepPassed("Verified the page is navigated to Review Tab page");
		  }
		  else 
		  {
			  testStepFailed("Review Tab is not displayed");
		  }
	  }

	  public void VerifyPaymentTab()
	  {
		  if(driver.findElement(By.xpath("//a[text()='Payment']")).isDisplayed())
		  {
			  testStepPassed("Verified the page is navigated to payment tab page");
		  }
	  }

	  public void clickShipToStoreTab(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-shipping')]//a[contains(text(),'Ship to Store')]")).isDisplayed()) {
				  clickOn(lnk_Shipping_ShiptoStore_Tab);
			  }
		  } catch (Exception e) {
			  testStepFailed("Ship to Store Tab is not displayed");
		  }
	  }


	  public void fillStoreAdrressDetails(String StoreAddress){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'ship-to-store-panel')]//a[contains(@id,'differentStore')]")).isDisplayed()) {
				  clickOn(lnk_Shipping_ShiptoStore_SelectDifferentStore);
				  if (driver.findElement(By.xpath("//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderAddress')]")).isDisplayed()) {
					  typeIn(txt_Shipping_ShiptoStore_StoreAddress, StoreAddress);
				  }
			  }
			  else {
				  if (driver.findElement(By.xpath("//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderAddress')]")).isDisplayed()) {
					  typeIn(txt_Shipping_ShiptoStore_StoreAddress, StoreAddress);
				  }
			  }
		  } catch (Exception e) {
			  testStepFailed("Ship to Store Address Textbox is not displayed");
		  }
	  }



	  public void clickFindStoreButton(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'ship-to-store-panel')]//input[contains(@id,'storeFinderBtn')]")).isDisplayed()) {
				  clickOn(btn_Shipping_ShiptoStore_StoreAddressSearch);
			  }
		  } catch (Exception e) {
			  testStepFailed("Find Store Address Button is not displayed");
		  }
	  }


	  public boolean verifySearchStoreResultsDisplayed()
	  {
		  boolean flag=false;
		  try {

			  waitTime(1);

			  if (driver.findElement(By.xpath("//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]")).isDisplayed()) {
				  testStepPassed("The Search Store results are displayed");
				  flag=true;
			  }


		  } catch (Exception e) {
			  testStepFailed("The Search Store results are not displayed");
		  }	
		  return flag;
	  }


	  public void selectFirstStoreFromSearchListDisplayed(){
		  String locator="First store link listed-#xpath=//div[contains(@id,'ship-to-store-panel')]//ul[contains(@id,'storeFinderResults')]//li[1]";
		  clickOn(locator);
	  }


	  public void VerifyOrderTotalinCheckoutPagePaymentTab(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).isDisplayed()) {
				  String OrderSummary = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).getText();
				  testStepPassed(OrderSummary);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Summary in Checkout page Payment Tab is not displayed");
		  }
	  }

	  public void VerifyOrderTotalinCheckoutPageReviewTab(){
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).isDisplayed()) {
				  String OrderSummary = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//div[@class='order-summary']")).getText();
				  testStepPassed(OrderSummary);
			  }
		  } catch (Exception e) {
			  testStepFailed("Order Summary in Checkout page Review Tab is not displayed");
		  }
	  }

	  public void verifyPlaceOrderButtonIsEnabled() {

		  try {
			  if(driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//div/button[contains(@class, 'button primary review-cta is-active f-right disabled')]")).isDisplayed()) {

				  testStepInfo("Place Order button is enabled");
			  }
			  else
			  {
				  testStepFailed("Place Order button is disabled"); 	  
			  }
		  } catch (Exception e) {
			  testStepFailed("Place Order button is disabled");
		  }
	  }

	  public void verifyDefaultStandardShippingisDisplayedinReviewTab()
	  {
		  try { 
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//h3")).isDisplayed()) 
			  {
				  String ShippingMode = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).getText();
				  testStepInfo("Shipping Mode : "+ShippingMode);
				  String shippingdatefull = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//li/p[@id='est-delivery-date-TabDisp']")).getText();		  
				  String ShippingDate =  shippingdatefull.substring(shippingdatefull.lastIndexOf("by")+2, shippingdatefull.length());
				  testStepInfo("Estimated Delivery time : " +ShippingDate);
				  if(ShippingMode.contains("STANDARD SHIPPING")) {
					  testStepInfo("Standard Shipping method with estimated Shipping Date is displayed");
				  }
				  else {
					  testStepFailed("Standard Shipping method with estimated Shipping Date is not displayed");
				  }
			  }

		  } catch (Exception e) {
			  testStepFailed("Standard Shipping method with estimated Shipping Date is not displayed");

		  }
	  }


	  public String getShippingModeStandardAddressinReviewTab()
	  {
		  String ShippingMode = null;
		  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).isDisplayed()) 
		  {
			  ShippingMode = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).getText();
		  }
		  return ShippingMode;
	  } 

	  public String getShippingModeExpressAddressinReviewTab()
	  {
		  String ShippingMode = null;
		  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).isDisplayed()) 
		  {
			  ShippingMode = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).getText();
		  }
		  return ShippingMode;
	  } 


	  public void verifyShippingToStoreisDisplayedinReviewTab()
	  {
		  try { 
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).isDisplayed()) 
			  {
				  String ShippingMode = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).getText();
				  //testStepInfo("Shipping Mode : "+ShippingMode);
				  if(ShippingMode.contains("SHIP TO STORE STANDARD SHIPPING")) {
					  testStepInfo("Shipping Mode is Changed to Ship To Store");
				  }
				  else {
					  testStepFailed("Shipping Mode is not Changed to Ship To Store");
				  }
			  }

		  } catch (Exception e) {
			  testStepFailed("Ground shipping is not the default Standard Shipping mode");

		  }
	  }




	  public String getShippingModeStoreinReviewTab()
	  {
		  String ShippingMode = null;
		  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).isDisplayed()) 
		  {
			  ShippingMode = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'value')]/p[@id='js-review-shipping-mode']")).getText();
		  }
		  return ShippingMode;
	  } 



	  public void VerifyPaymentTabTitleinReviewTab(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='payment-info clearfix']//div[contains(@class, 'review-section-header')]")).isDisplayed()) {
				  String ShippingTitle = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='payment-info clearfix']//div/div/h3")).getText();
				  testStepPassed("Shipping Title in Review Tab : "+ShippingTitle);
				  if (ShippingTitle.equalsIgnoreCase("Billing and Payment Info")) {
					  testStepPassed("The Payment Info Tab Title in Review Tab is Billing and Payment Info");
				  }
				  else {
					  testStepFailed("The Payment Info Tab Title in Review Tab is not Billing and Payment Info");
				  }
			  }
		  } catch (Exception e) {
			  testStepFailed("Payment Title in Review Tab is not displayed");
		  }
	  }


	  public void verifyPerfectFitRewardsIsDisplayedInReveiwTab() {

		  try {
			  if(elementPresent(lnk_Perfect_Fit_Rewards_Review_tab)) {

				  testStepPassed("Perfect Fit Rewards Option is displayed");
				  clickOn(lnk_Perfect_Fit_Rewards_Review_tab);
				  if (driver.findElement(By.xpath("//ul[contains(@class, 'accordion')]/li/div[@id='pfit']//input[contains(@id,'js-reward-pf-linkup-input')]")).isDisplayed()) {
					  System.out.println("The Perfect Rewards ID inputbox and certificate number inputbox is displayed");
					  testStepPassed("The Perfect Rewards ID inputbox and certificate number inputbox is displayed"); }
				  else {
					  testStepFailed("the Perfect Rewards ID inputbox and certificate number inputbox is not displayed");				  }
			  }
			  else
			  {
				  testStepFailed("Perfect Fit Rewards Option is not dispalyed"); 	  
			  }
		  } catch (Exception e) {
			  testStepFailed("Perfect Fit Rewards Option is not dispalyed");
		  }
	  }


	  public void verifyEditButtonIsDisplayedForShippingAndGiftInfo() {
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//div[contains(@class, 'bag-edit-links review-edit f-right')]")).isDisplayed()) {
				  testStepPassed("Edit button is displayed in Shipping & Gift Info");
			  }
			  else {
				  testStepFailed("Edit button is not displayed in Shipping & Gift Info");
			  }

		  } catch (Exception e) {
			  testStepFailed("Edit button is not displayed in Shipping & Gift Info");
		  }
	  }

	  public void verifyGiftCardIsDisplayedInReveiwTab() {

		  try {
			  if(elementPresent(lnk_GiftCard_Review_tab)) {

				  testStepPassed("Gift card Option is displayed");
				  clickOn(lnk_GiftCard_Review_tab);
				  if (driver.findElement(By.xpath("//*[@id='giftCardForm']//*[@id='giftCardNumber']")).isDisplayed()) {
					  System.out.println("The GiftCard number inputbox and certificate number inputbox is displayed");
					  testStepPassed("The GiftCard number inputbox and certificate number inputbox is displayed"); }
				  else {
					  testStepFailed("the GiftCard number inputbox and certificate number inputbox is not displayed");				  }
			  }
			  else
			  {
				  testStepFailed("Gift card Option is not dispalyed"); 	  
			  }
		  } catch (Exception e) {
			  testStepFailed("Gift card Option is not dispalyed");
		  }
	  }

	  public void verifyPromoCodeIsDisplayedInReveiwTab() {

		  try {
			  if(elementPresent(ele_Billing_AddPromoCode)) {

				  testStepPassed("Promo code Option is displayed");
				  clickOn(ele_Billing_AddPromoCode);
				  if (driver.findElement(By.xpath("//*[contains(@id,'promoCodeCheckoutInput')]")).isDisplayed()) {
					  System.out.println("The promo code inputbox and certificate number inputbox is displayed");
					  testStepPassed("The promo code inputbox and certificate number inputbox is displayed"); }
				  else {
					  testStepFailed("the promo code inputbox and certificate number inputbox is not displayed");				  }
			  }
			  else
			  {
				  testStepFailed("Promo code Option is not dispalyed"); 	  
			  }
		  } catch (Exception e) {
			  testStepFailed("Promo code Option is not dispalyed");
		  }
	  }


	  public void fillCVVinReviewTab(String cvv){
		  driver.findElement(By.xpath("//input[contains(@id,'savedCardCVV1')]")).sendKeys(cvv);
		  //typeIn(txt_SavedCardCVV_review_tab, cvv);

	  }


	  public String verifyBillinginformationinReviewTab(){
		  String billingAddress=null;
		  try { 
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='payment-info clearfix']//div/div/h3")).isDisplayed()) {
				  testStepPassed("Billing information is displayed"); 
				  billingAddress = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='payment-info clearfix']//ul[contains(@class, 'key-value')]//p/span")).getText();
				  testStepPassed(billingAddress);
			  }
			  return billingAddress;
		  } catch (Exception e) {
			  testStepFailed("Billing information is not displayed");
			  return null;
		  }
	  }






	  public void getItemsForPurchase(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//div[contains(@class, 'shopping-bag-header')]")).isDisplayed()) {
				  String ItemsPurchase = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//div[@id='order_details']")).getText();
				  testStepPassed(ItemsPurchase);
			  }
		  } catch (Exception e) {
			  testStepFailed("Items for Purchase in review tab is not displayed");
		  }
	  }

	  public void verifyReveiwTabIsDisplayed() {

		  try {
			  if(driver.findElement(By.xpath("//ul[@class='tabs checkout-tabs']//li[contains(@class, 'tab-title panel3 active')]")).isDisplayed()) {

				  testStepPassed("Review tab is displayed");
			  }
			  else
			  {
				  testStepFailed("Review Tab is not displayed"); 	  
			  }
		  } catch (Exception e) {
			  testStepFailed("Review Tab is not dispalyed");
		  }
	  }



	  public void VerifyOrderDetailsSectionisDisplayedinReviewTab()
	  {
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]")).isDisplayed()) 
			  {
				  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shopping-bag-header')]//p")).isDisplayed()) 
				  {
					  String OrderSectionTitle = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shopping-bag-header')]//p")).getText();

					  testStepInfo("Order Section is displayed in Review Tab with Title : "+OrderSectionTitle);
				  }
				  else 
				  {
					  testStepFailed("Order section or Title is not displayed in Review Tab");
				  }
			  }
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Order section or Title is not displayed in Review Tab");
		  }
	  }



	  public void VerifyShippingDetailsSectionisDisplayedinReviewTab()
	  {
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]")).isDisplayed()) 
			  {
				  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//h3")).isDisplayed()) 
				  {
					  String ShippingSectionTitle = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//h3")).getText();

					  testStepInfo("Shipping Section is displayed in Review Tab with Title : "+ShippingSectionTitle);
				  }
				  else 
				  {
					  testStepFailed("Shipping section or Title is not displayed in Review Tab");
				  }
			  }
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Shipping section or Title is not displayed in Review Tab");
		  }
	  }





	  public void VerifyPaymentDetailsSectionisDisplayedinReviewTab()
	  {
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]")).isDisplayed()) 
			  {
				  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//h3")).isDisplayed()) 
				  {
					  String PaymentSectionTitle = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//h3")).getText();

					  testStepInfo("Payment Section is displayed in Review Tab with Title : "+PaymentSectionTitle);
				  }
				  else 
				  {
					  testStepFailed("Payment section or Title is not displayed in Review Tab");
				  }
			  }
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Payment section or Title is not displayed in Review Tab");
		  }
	  }




	  public void VerifyOrderSummaryDetailsSectionisDisplayedinReviewTab()
	  {
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[@id='orderTotalsSummaryWidget']")).isDisplayed()) 
			  {
				  if (driver.findElement(By.xpath("//div[@id='orderTotalsSummaryWidget']//h2")).isDisplayed()) 
				  {
					  String ShippingSectionTitle = driver.findElement(By.xpath("//div[@id='orderTotalsSummaryWidget']//h2")).getText();

					  testStepInfo("Order Summary Section is displayed in Review Tab with Title : "+ShippingSectionTitle);
				  }
				  else 
				  {
					  testStepFailed("Order Summary section or Title is not displayed in Review Tab");
				  }
			  }
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Order Summary section or Title is not displayed in Review Tab");
		  }
	  }





	  public String verifyShippingAddressinReviewTab(){
		  String shippingAddress=null;
		  try { 
			  waitTime(3);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//h3")).isDisplayed()) {
				  shippingAddress = driver.findElement(By.xpath("//div[@id='orderReviewDisplay']/div[@class='shipping-info']//div[contains(@class, 'md-6 cls')]//li[2]//div[contains(@class, 'value')]")).getText();
				  testStepPassed(shippingAddress);
			  }
			  return shippingAddress;
		  } catch (Exception e) {
			  testStepFailed("Shipping Address is not displayed");
			  return null;
		  }
	  }



	  public void clickShippingEditLinkinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[@id='orderReviewDisplay']//div[contains(@class,'shipping-info')]//a[contains(text(),'Edit')]")).isDisplayed()) {
				  clickOn(lnk_ShippingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Review Tab Shipping Tab Edit Link is not present");
		  }
	  }


	  public void VerifyShippingAddressOptionsisDisplayedandgetthevaluesandSelectNewlyAddedAddress() {
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'dropdown-ship-address-1')]//ul[contains(@id,'dropdown-ship-address-dropdown-1')]//li")).isDisplayed()) {
				  List<WebElement> ShippingAddress = driver.findElements(By.xpath("//div[contains(@id,'dropdown-ship-address-1')]//ul[contains(@id,'dropdown-ship-address-dropdown-1')]//li"));
				  int Count = ShippingAddress.size();
				  testStepPassed("Shipping Address in Dropdown Count : "+Count);
				  testStepPassed("Shipping Address Displayed");
				  for (WebElement sh : ShippingAddress) {
					  String Address = sh.getText();
					  testStepPassed(Address);	
				  }
				  clickOn(drp_Address_EditShipping);
				  waitTime(1);
				  clickOn(lnk_NewAddress_EditShipping);
			  }
		  } catch (Exception e) {
			  testStepFailed("Shipping Address Dropdown is not displayed");
		  }
	  }

	  public void EnterCvvinReviewTab(String CardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='cvvPayMethodId']")).isDisplayed()) {
				 
				  //if(elementPresent("xpath=//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='cvvPayMethodId']")){
				  typeIn(txt_CvvinReviewTab, CardCvv);
				  System.out.println("CardCvv : "+CardCvv);
				  testStepPassed("Credit Card Cvv is displayed and and entered "+CardCvv);
			  }

		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details Cvv is not displayed");
		  }
	  }



	  public void EnterSavedCvvinReviewTabSafari(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).isDisplayed()) {
				  System.out.println("The Saved Card CVV is Displayed");
				  //System.out.println("CardCvv : "+CardCvv);
				  driver.executeScript("document.getElementById('savedCardCVV1').setAttribute('value', '123')");
				  /* driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).click();
				  driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).sendKeys(CardCvv);
				  //typeIn(txt_Saved_CvvinReviewTab, CardCvv);
				   */			  }

		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details Saved Cvv is not displayed");
		  }
	  }


	  public void EnterSavedCvvinReviewTab(String CardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).isDisplayed()) {
				  
			//if(elementPresent("xpath=//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")){
				  System.out.println("The Saved Card CVV is Displayed");
				  //System.out.println("CardCvv : "+CardCvv);
				  driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).sendKeys(CardCvv);
				  testStepPassed("Saved Card Cvv is displayed and "+CardCvv+" is entered");
				  //typeIn(txt_Saved_CvvinReviewTab, CardCvv);
			  }

		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details Saved Cvv is not displayed");
		  }
	  }



	  public void EnterSavedCvvinReviewTab_new(String CardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).isDisplayed()) {
				  System.out.println("The Saved Card CVV is Displayed");
				  System.out.println("CardCvv : "+CardCvv);
				  // driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//form[contains(@id,'cvvValidation')]//input[@id='savedCardCVV1']")).sendKeys(CardCvv);
				  typeIn(txt_Saved_CvvinReviewTab, CardCvv);
			  }

		  } catch (Exception e) {
			  testStepPassed("Review Tab payment details Saved Cvv is not displayed");
		  }
	  }



	  public void VerifyShippingAddressOptionsisDisplayedandgetthevalues() {
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'dropdown-ship-address-1')]//ul[contains(@id,'dropdown-ship-address-dropdown-1')]//li")).isDisplayed()) {
				  List<WebElement> ShippingAddress = driver.findElements(By.xpath("//div[contains(@id,'dropdown-ship-address-1')]//ul[contains(@id,'dropdown-ship-address-dropdown-1')]//li"));
				  int Count = ShippingAddress.size();
				  testStepPassed("Shipping Address in Dropdown Count : "+Count);
				  testStepPassed("Shipping Address Displayed");
				  for (WebElement sh : ShippingAddress) {
					  String Address = sh.getText();
					  testStepPassed(Address);	
				  }
			  }
		  } catch (Exception e) {
			  testStepFailed("Shipping Address Dropdown is not displayed");
		  }
	  }


	  public void ClickOnAddNewAddressinEditShippingOverlayinShippingTab(){
		  try { 
			  waitTime(2);
			  if (driver.findElement(By.xpath("//form[contains(@id,'ChangeAddressForm')]//a[contains(@id,'ada-createNewShipAddr')]")).isDisplayed()) {
				  clickOn(lnk_AddNewAddress_EditShipping_ReviewTab);
			  }
		  } catch (Exception e) {
			  testStepFailed("Add New Shipping Address Link is not displayed");

		  }
	  } 


	  public void clickOnChangeAddressLinkInChangeAddressOverlay() {
		  waitTime(2);
		  clickOn(lnk_change_address);		
	  }


	  public void clickOnContinueButtonInShippingEditModalOverlay() {
		  clickOn(btn_Continue_edit_shipping_info_overlay);
	  }

	  public void SelectStateinNewAddressEditShippingDetailsinEditBillingOverlayinReviewTab(String EditCreditCardState){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']")).isDisplayed()) {
				  Select StateDropdown = new Select(driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']")));
				  StateDropdown.selectByValue(EditCreditCardState);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Select State in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }



	  public void fillNewShippingAddressDetails(String AddNewShippingfirstName,String AddNewShippinglastName,String AddNewShippingaddress,String AddNewShippingcity,String AddNewShippingstate,String AddNewShippingzipCode,String AddNewShippingphoneNo){
		  typeIn(txt_Shipping_FirstName,AddNewShippingfirstName);
		  typeIn(txt_Shipping_LastName,AddNewShippinglastName);
		  typeIn(txt_Shipping_Address_Line1,AddNewShippingaddress);
		  typeIn(txt_Shipping_City,AddNewShippingcity);
		  //selectFromDropdown(drp_Shipping_State,state);
		  /*try{
			  new Select(driver.findElement(By.xpath("//*[@id='ship-to-address-panel']//select[@id='ship-state']"))).selectByValue(AddNewShippingstate);
			  testStepPassed("Select "+AddNewShippingstate+" from:state dropdown");
		  }
		  catch(Exception e){
			  testStepFailed("Failed to select "+AddNewShippingstate+" from:state dropdown");
		  }*/
		  SelectStateinNewAddressEditShippingDetailsinEditBillingOverlayinReviewTab(AddNewShippingstate);
		  typeIn(txt_Shipping_ZipCode,AddNewShippingzipCode);
		  typeIn(drp_Shipping_PhoneNumber,AddNewShippingphoneNo);
	  }	

	  public void VerifyShippingMethosOptionsisDisplayedandgetthevaluesandSelectExpressMethod() {
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'js-regularShippingDropDown')]//ul[contains(@class,'custom-dropdown')]//li")).isDisplayed()) {
				  List<WebElement> ShippingMethods = driver.findElements(By.xpath("//div[contains(@id,'js-regularShippingDropDown')]//ul[contains(@class,'custom-dropdown')]//li"));
				  int Count = ShippingMethods.size();
				  testStepPassed("Shipping Methods Count : "+Count);
				  testStepPassed("Shipping Methods Displayed");
				  for (WebElement sh : ShippingMethods) {
					  String MethodName = sh.getText();
					  testStepPassed(MethodName);	
				  }
				  clickOn(drp_ShippingMethod_EditShipping_ReviewTab);
				  waitTime(1);
				  clickOn(lnk_Express_ShippingMethod_EditShipping_ReviewTab);
			  }
		  } catch (Exception e) {
			  testStepFailed("Shipping Method Dropdown is not displayed");
		  }
	  }

	  public void VerifyAddressRecommendationOverlayisDisplayedandSelectUsethisAddressOption(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'js-addressVerificationWithoutRecommendation')]")).isDisplayed()) {
				  clickOn(btn_UsethisAddress_AddressVerificationOverlay_NewAddress_EditShipping_ReviewTab);
			  }
		  } catch (Exception e) {
			  testStepPassed("Address recommendation Overlay is not displayed");
		  }
	  }







	  public void verifyShippingEditModelOverlayisDisplayedinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]")).isDisplayed()) {
				  testStepPassed("Shipping Tab Edit Overlay is Displayed");
			  } 
		  } catch (Exception e) {
			  testStepFailed("Shipping Tab Edit Overlay is not displayed");
		  }
	  }

	  public void ClickonShipttoStoreinShippingEditModelinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//ul[contains(@id,'js-shipToTabs')]//a[contains(text(),'Ship to Store')]")).isDisplayed()) {
				  clickOn(lnk_ShiptoStore_ShippingTabEditinReviewTab); 
			  } 
		  } catch (Exception e) {
			  testStepFailed("Shipping to Store Link in Shipping Edit Tab Edit Overlay is not displayed");
		  }
	  }

	  public void clickEditBillingLinkinReviewTab(){
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//a[contains(text(),'Edit')]")).isDisplayed()) {
				  clickOn(lnk_EditBillinginReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Edit Link of Billing Tab in Review Tab is not displayed");
		  }
	  }

	  public void verifyCreditcardTabisActiveinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//ul[contains(@class,'tabs checkout-toggle tabs-payment')]//li[contains(@id,'tab-payment-cc') and contains(@class,'tab-title active')]")).isDisplayed()) {
				  testStepPassed("Credit card Tab in Edit Billing Overlay in Review tab is Active");
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit card Tab in Edit Billing Overlay in Review tab is Not Active");
		  }
	  }

	  public void verifyCreditCardTypeComboboxisDisplayedinEditBillingOverlayinReviewTabandGetValues(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@id,'dropdown-credit-card')]")).isDisplayed()) {
				  List<WebElement> CreditCardoptions = driver.findElements(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@id,'dropdown-credit-card')]//span"));

				  for (WebElement cardoptions : CreditCardoptions) {
					  System.out.println(cardoptions.getText());
					  testStepPassed(cardoptions.getText());
				  }
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit card Type Combo box in Edit Billing Overlay in Review tab is not displayed");
		  }
	  }

	  public void verifyCreditCardCvvisDisplayedinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]")).isDisplayed()) {
				  testStepPassed("Credit Card Cvv in Edit Billing Tab is Displayed");
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit Card Cvv in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void verifyCreditCardAddressisDisplayedinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@class,'selected-address-data')]")).isDisplayed()) {
				  testStepPassed("Credit Card Address in Edit Billing Tab is Displayed");
				  String Name = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@class,'selected-address-data')]/div[1]")).getText();
				  String Address = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@class,'selected-address-data')]/div[2]")).getText();
				  String CityState = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@class,'selected-address-data')]/div[3]")).getText();
				  String Phone = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//div[contains(@class,'selected-address-data')]/div[4]")).getText();
				  System.out.println(Name);
				  System.out.println(Address);
				  System.out.println(CityState);
				  System.out.println(Phone);
				  testStepPassed(Name);
				  testStepPassed(Address);
				  testStepPassed(CityState);
				  testStepPassed(Phone);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit Card Address in Edit Billing Tab is not Displayed");
		  }
	  }


	  public void SelectEditBillingAddressOptionWithIndex(int indexToSelect)
	  {
		  try {
			  if (driver.findElement(By.xpath("//body[contains(@class,'l-checkout')]//div[contains(@class,'pac-container')][2]//div[contains(@class,'pac-item')]")).isDisplayed()) {
				  List<WebElement>  optinsToSelect = driver.findElements(By.xpath("//body[contains(@class,'l-checkout')]//div[contains(@class,'pac-container')][2]//div[contains(@class,'pac-item')]"));
				  int OptionsCount = optinsToSelect.size();
				  if (indexToSelect<=OptionsCount) {
					  optinsToSelect.get(indexToSelect).click();
					  testStepPassed("Address Autocomplete option is displayed and a value selected from it");
				  }
			  }
		  } catch (Exception e) {
			  testStepPassed("The Select Autocomplete Options are not displayed");
		  }
	  }


	  public void ClickonEditBillingDetailsinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//a[contains(@id,'ada-edit-cc')]")).isDisplayed()) {
				  clickOn(lnk_Edit_EditBilling_BillingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }


	  public void FillEditPaymentDetailsinoEditBillingDetailsinEditBillingOverlayinReviewTab(String EditCreditCardNo, String EditCreditCardCvv, String EditCreditCardExpiryMonth, String EditCreditCardExpiryYear, String EditCreditCardFirstName, String EditCreditCardLastName, String EditCreditCardAddress1, String EditCreditCardCity, String EditCreditCardState, String EditCreditCardZip, String EditCreditCardPhoneno){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-ccnum')]")).isDisplayed()) {
				  typeIn(txt_CreditCardNo_EditBilling_BillingTabEditinReviewTab, EditCreditCardNo);
				  typeIn(txt_CreditCardCvv_EditBilling_BillingTabEditinReviewTab, EditCreditCardCvv);
				  selectFromDropdown(drp_CreditCardExpiryMonth_EditBilling_BillingTabEditinReviewTab, EditCreditCardExpiryMonth);
				  selectFromDropdown(drp_CreditCardExpiryYear_EditBilling_BillingTabEditinReviewTab, EditCreditCardExpiryYear);
				  typeIn(txt_FirstName_EditBilling_BillingTabEditinReviewTab, EditCreditCardFirstName);
				  typeIn(txt_LastName_EditBilling_BillingTabEditinReviewTab, EditCreditCardLastName);
				  typeIn(txt_Address1_EditBilling_BillingTabEditinReviewTab, EditCreditCardAddress1);

				  SelectEditBillingAddressOptionWithIndex(1);

				  typeIn(txt_City_EditBilling_BillingTabEditinReviewTab, EditCreditCardCity);
				  SelectStateEditBillingDetailsinEditBillingOverlayinReviewTab(EditCreditCardState);



				  //selectFromDropdown(drp_State_EditBilling_BillingTabEditinReviewTab, EditCreditCardState);
				  typeIn(txt_Zip_EditBilling_BillingTabEditinReviewTab, EditCreditCardZip);
				  typeIn(txt_Phone_EditBilling_BillingTabEditinReviewTab, EditCreditCardPhoneno);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit Card No Textbox in Edit Biilling in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void ClickonContinueinEditBillingDetailsinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//button[contains(@id,'js-continue-payment')]")).isDisplayed()) {
				  clickOn(btn_Continue_EditBilling_BillingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Continue Button in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void FillNewCardPaymentDetailsinoEditBillingDetailsinEditBillingOverlayinReviewTab(String AddCreditCardNo, String AddCreditCardCvv, String AddCreditCardExpiryMonth, String AddCreditCardExpiryYear, String AddCreditCardFirstName, String AddCreditCardLastName, String AddCreditCardAddress1, String AddCreditCardCity, String AddCreditCardState, String AddCreditCardZip, String AddCreditCardPhoneno){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'pay-ccnum')]")).isDisplayed()) {
				  typeIn(txt_CreditCardNo_EditBilling_BillingTabEditinReviewTab, AddCreditCardNo);
				  typeIn(txt_CreditCardCvv_EditBilling_BillingTabEditinReviewTab, AddCreditCardCvv);
				  selectFromDropdown(drp_CreditCardExpiryMonth_EditBilling_BillingTabEditinReviewTab, AddCreditCardExpiryMonth);
				  selectFromDropdown(drp_CreditCardExpiryYear_EditBilling_BillingTabEditinReviewTab, AddCreditCardExpiryYear);
				  typeIn(txt_FirstName_EditBilling_BillingTabEditinReviewTab, AddCreditCardFirstName);
				  typeIn(txt_LastName_EditBilling_BillingTabEditinReviewTab, AddCreditCardLastName);
				  typeIn(txt_Address1_EditBilling_BillingTabEditinReviewTab, AddCreditCardAddress1);

				  SelectEditBillingAddressOptionWithIndex(1);

				  typeIn(txt_City_EditBilling_BillingTabEditinReviewTab, AddCreditCardCity);
				  selectFromDropdown(drp_State_EditBilling_BillingTabEditinReviewTab, AddCreditCardState);
				  typeIn(txt_Zip_EditBilling_BillingTabEditinReviewTab, AddCreditCardZip);
				  typeIn(txt_Phone_EditBilling_BillingTabEditinReviewTab, AddCreditCardPhoneno);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit Card No Textbox in Add New Credit Card Details in Edit Biilling in Edit Billing Tab is not Displayed");
		  }
	  }





	  public void FillCreditCardCvvinEditBillingOverlayinReviewTab(String SaveCardCvv){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]")).isDisplayed()) {
				  typeIn(txt_SavedCardCvv_EditBilling_BillingTabEditinReviewTab, SaveCardCvv);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Credit Card Cvv in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void UnCheckonSameasShippingAddressinAddNewCardinEditBillingDetailsinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'billingSameAsShipping')]")).isDisplayed()) {
				  if (!driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[@id='bill-firstname']")).isDisplayed()) {
					  clickOn(chk_BillingSameasShippingAddress_EditBilling_BillingTabEditinReviewTab);
				  }  
			  } 
		  } catch (Exception e) {
			  testStepFailed("Same as Shipping Checkbox in Add New Card in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void CheckonMakeDefaultinAddNewCardinEditBillingDetailsinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//input[contains(@id,'billingSetPrimary')]")).isDisplayed()) {
				  clickOn(chk_MakeCardDeafult_EditBilling_BillingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Make Default Checkbox in Add New Card in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }


	  public void ClickonAddNewCardinEditBillingDetailsinEditBillingOverlayinReviewTab(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//a[@id='ada-add-new-cc']")).isDisplayed()) {
				  clickOn(lnk_AddNewBilling_BillingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Add New Credit card Link in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }



	  public void SelectStateEditBillingDetailsinEditBillingOverlayinReviewTab(String EditCreditCardState){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//select[@id='bill-state']")).isDisplayed()) {
				  Select StateDropdown = new Select(driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//section[contains(@class,'payment-cc-section')]//select[@id='bill-state']")));
				  StateDropdown.selectByValue(EditCreditCardState);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Select State in Edit Credit Card link in Edit Billing Tab is not Displayed");
		  }
	  }

	  public void verifyEditBillingOverlayisDisplayedinReviewTab(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]")).isDisplayed()) {
				  testStepPassed("Edit Billing Overlay is Displayed");
			  } 
		  } catch (Exception e) {
			  testStepFailed("Edit Billing Overlay is not Displayed");
		  }
	  }

	  public void clickPayPalinEditBillingOverlayinReviewTab(){
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//li[contains(@id,'tab-payment-paypal')]")).isDisplayed()) {
				  clickOn(lnk_Paypal_EditBillinginReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Paypal Link in Edit Billing Overlay is not displayed");
		  }
	  }


	  public void clickonContinuePayPalinEditBillingOverlayinReviewTab(){
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//button[contains(@class,'js-continue-with-paypal')]")).isDisplayed()) {
				  clickOn(btn_PaypalContinue_EditBillinginReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Paypal Continue Button in Edit Billing Overlay is not displayed");
		  }
	  }


	  public void checkGiftCardNumberPinNoisDisplayed(){
		  try {
			  waitTime(3);
			  if (!driver.findElement(By.xpath("//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  clickOn(lnk_Paymentpage_GiftCardReedem_GiftCardLink);
			  } else {
				  testStepPassed("The Gift Card Reedemtion is opened already");
			  }
		  } catch (Exception e) {
			  testStepPassed("The Gift Card Reedemtion is opened already");
		  }
	  }
	  public void fillGiftCardReedemtionGiftCarddetails(String GiftCardNo, String GiftCardPin){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  typeIn(txt_Paymentpage_GiftCardReedem_GiftCardNo, GiftCardNo);
				  typeIn(txt_Paymentpage_GiftCardReedem_GiftCardPin, GiftCardPin);
			  } else {
				  testStepPassed("The Gift Card Reedemtion is not opened");
			  }
		  } catch (Exception e) {
			  testStepFailed("The Gift Card Reedemtion is not opened");
		  }
	  }
	  public void clickGiftCardReedemtionGiftCardApply(){
		  try {
			  //waitTime(1);
			  if (driver.findElement(By.xpath("//form[contains(@id,'giftCardForm')]//button[contains(@id,'applyGiftcard')]")).isDisplayed()) {
				  clickOn(btn_Paymentpage_GiftCardReedem_GiftCardApply);
			  } else {
				  testStepFailed("The Gift Card Reedemtion Apply Button is not displayed");
			  }
		  } catch (Exception e) {
			  testStepFailed("The Gift Card Reedemtion Apply Button is not displayed");
		  }
	  }


	  public void checkGiftCardNumberPinNoisDisplayedinReviewTab(){
		  try {
			  waitTime(3);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  testStepPassed("Gift Card Pin No is not Opened");
			  } else {
				  clickOn(lnk_Paymentpage_GiftCardReedem_GiftCardLink_ReviewTab);
				  //testStepPassed("The Gift Card Reedemtion is opened already");
			  }
		  } catch (Exception e) {
			  testStepPassed("The Gift Card Reedemtion is not opened already");
		  }
	  }


	  public void fillGiftCardReedemtionGiftCarddetailsinReviewTab(String GiftCardNo, String GiftCardPin){
		  try {
			  waitTime(3);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  typeIn(txt_Paymentpage_GiftCardReedem_GiftCardNo_ReviewTab, GiftCardNo);
				  typeIn(txt_Paymentpage_GiftCardReedem_GiftCardPin_ReviewTab, GiftCardPin);
			  } 
		  } catch (Exception e) {
			  testStepFailed("The Gift Card Reedemtion is not opened");
		  }
	  }



	  public void clickGiftCardReedemtionGiftCardApplyinReviewTab(){
		  try {
			  waitTime(3);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//button[contains(@id,'applyGiftcard')]")).isDisplayed()) {
				  clickOn(btn_Paymentpage_GiftCardReedem_GiftCardApply_ReviewTab);
			  } else {
				  testStepFailed("The Gift Card Reedemtion Apply Button is not displayed");
			  }
		  } catch (Exception e) {
			  testStepFailed("The Gift Card Reedemtion Apply Button is not displayed");
		  }
	  }


	  public void VerifyGiftCardReedemed(){
		  try {
			  waitTime(2);
			  if (driver.findElement(By.xpath("//ul[contains(@class,'order-summary-list')]//li//span[contains(text(),'Gift Cards')]")).isDisplayed()) {
				  testStepPassed("Gift Card Reedemed");
			  } 
		  } catch (Exception e) {
			  testStepFailed("Gift Card is not Reedemed");
		  }
	  }

	  public boolean clickOnInternationalSubmitOrder()
	  {
		  testStepInfo("");
		  testStepInfo("Placing Order and getting the Order Number");
		  testStepInfo("***********************************************************");

		  if(orderPlacementFlag==true)
		  {
			  driver.switchTo().frame("envoyId");
			  clickOn(btn_International_submitorder);
			  driver.switchTo().defaultContent();
			  return true;

		  }
		  else{
			  testStepPassed("Order is not placed due to execution is happening in production environment");
			  return false;
		  }
	  }

	  String Zipcodeaddress;
	  public String verifyshipppingzipcodeinshoppingincheckoutpage(String Zipcode1)
		{
			try
			{   
				if (driver.findElement(By.xpath("(//li[@class='review-shipping-address']//div[@class='value']/p)[2]")).isDisplayed()) {
					Zipcodeaddress = driver.findElement(By.xpath("(//li[@class='review-shipping-address']//div[@class='value']/p)[2]")).getText();
					Zipcode1=Zipcodeaddress.substring(12,17);
				}
			}
			catch(Exception e)
			{
				testStepFailed(e.toString());
			}
			return Zipcode1;
		}
		
		public String verifyEstimateddeliverydateincheckoutpage(String Estimateddate)
		{
			try
			{   
				if (driver.findElement(By.xpath("//p//span[contains(@class,'js-est-delivery-date')]")).isDisplayed()) {
					Estimateddate = driver.findElement(By.xpath("//p//span[contains(@class,'js-est-delivery-date')]")).getText();
				}
			}
			catch(Exception e)
			{
				testStepFailed(e.toString());
			}
			return Estimateddate;
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  public boolean clickPlaceOrderButton()
	  {
		  if(orderPlacementFlag==true)
		  {
			  //driver.switchTo().frame("envoyId");
			  waitTime(5);
			  waitForElement(btn_PlaceOrder_new);
			 // clickOn(btn_PlaceOrder_new);
			  clickOnSpecialElement(btn_PlaceOrder_new);
			  //driver.switchTo().defaultContent();
			  return true;

		  }
		  else{
			  testStepInfo("Order is not placed due to execution is happening in production environment");
			  return false;
		  }
	  }



	  public void enterPerfectFitRewardsdetailsandVerifyPFCartificateisApplied(String PFAccountID, String PFCertificateNo){
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-payment')]//div[contains(@id,'pfit')]//input[contains(@id,'js-reward-pf-linkup-input')]")).isDisplayed()) 
		  {
			  System.out.println("The Perfect Rewards ID inputbox is already opened");
			  testStepPassed("The Perfect Rewards ID inputbox is already opened");
			  typeIn(txt_Payment_PerfectFitRewards_AccountID, PFAccountID);
			  clickOn(btn_Payment_PerfectFitRewards_AccountID_Save);
			  typeIn(txt_Payment_PerfectFitRewards_CertificateNo, PFCertificateNo);
			  clickOn(btn_Payment_PerfectFitRewards_CertificateNo_Apply);
			  waitTime(3);
			  if (driver.findElement(By.xpath("//p[contains(@id,'billingErrorMessageText')]")).isDisplayed()) {
				  System.out.println("Reward Certificate entered is already applied.");
				  testStepFailed("Reward Certificate entered is already applied.");
			  } else {
				  System.out.println("PF Reward Certificate is accepted");
				  testStepPassed("PF Reward Certificate is accepted");
			  }
			  waitTime(5);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(text(),'Certificates Applied')]")).isDisplayed()) {
				  String PFCertificateDeductedAmount = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//ul[@class='order-summary-list']//li[2]//span[@class='value product-price total_figures']")).getText();
				  System.out.println("The PF Certificate is applied & "+PFCertificateDeductedAmount+" is deducted & displayed in Order Summary List");
				  testStepPassed("The PF Certificate is applied & "+PFCertificateDeductedAmount+" is deducted & displayed in Order Summary List");
			  } else {
				  testStepFailed("The PF Certificate is not applied and amount is not deducted & not displayed in Order Summary List");
			  }
		  } else {
			  System.out.println("The Perfect Rewards ID inputbox is not opened");
			  clickOn(lnk_Payment_PerfectFitRewards_PerfectFitRewardsExpandLink);

			  typeIn(txt_Payment_PerfectFitRewards_AccountID, PFAccountID);
			  clickOn(btn_Payment_PerfectFitRewards_AccountID_Save);
			  typeIn(txt_Payment_PerfectFitRewards_CertificateNo, PFCertificateNo);
			  clickOn(btn_Payment_PerfectFitRewards_CertificateNo_Apply);
			  waitTime(3);
			  if (driver.findElement(By.xpath("//p[contains(@id,'billingErrorMessageText')]")).isDisplayed()) {
				  System.out.println("PF Reward Certificate entered is already applied.");
				  testStepFailed("PF Reward Certificate entered is already applied.");
			  } else {
				  System.out.println("Reward Certificate is accepted");
				  testStepPassed("Reward Certificate is accepted");
			  }
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//span[contains(text(),'Certificates Applied')]")).isDisplayed()) {
				  String PFCertificateDeductedAmount2 = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//ul[@class='order-summary-list']//li[2]//span[@class='value product-price total_figures']")).getText();
				  System.out.println("The PF Certificate is applied & "+PFCertificateDeductedAmount2+" is deducted & displayed in Order Summary List");
				  testStepPassed("The PF Certificate is applied & "+PFCertificateDeductedAmount2+" is deducted & displayed in Order Summary List");
			  } else {
				  testStepFailed("The PF Certificate is not applied and amount is not deducted & not displayed in Order Summary List");
			  }

		  }
	  }

	  public void clickOnShippingPage(String ShippingName){
		  switch (ShippingName){
		  case "Ship to Address":
			  clickOn(tab_Shipping_ShipToAddress);
			  break;
		  case "Ship to Store":
			  clickOn(tab_Shipping_ShipToStore);
			  break;
		  }
	  }


	  public void clickOnPickDifferentStore()
	  {
		  if(driver.findElement(By.xpath("//*[@id='differentStore']")).isDisplayed())
		  {
			  clickOn(lnk_pickdifferentstore);
			  waitForLoadingAndDissappearMWLoadingImg();
		  }
	  }
	  public void fillStoreDetais(String StoreNumber)
	  {
		  typeIn(txt_FindStore,StoreNumber);
	  }
	  public void clickOnFindStore()
	  {
		  clickOn(txt_FindStoreButton);
	  }

	  public void clickOnChooseShippingAddress()
	  {
		  clickOn(drp_Shipping_ShipToStore);
	  }
	  public void clickOnRushShipping()
	  {
		  clickOn(drp_shipping_Rush);
	  }
	  public String selectAnyOneStoreFromPaymentPage(String Store){

		  List<WebElement> sizeOptions=driver.findElements(By.xpath("//ul[@id='storeFinderResults']/li"));
		  if(sizeOptions.size()>0){
			  if(!Store.isEmpty()){
				  for(WebElement ele:sizeOptions){
					  if(ele.getText().equalsIgnoreCase(Store)){
						  ele.click();
						  testStepPassed("click on '"+Store+"' size");
						  break;
					  }
				  }
			  }else{
				  Store=sizeOptions.get(0).getText();
				  sizeOptions.get(0).click();
				  testStepPassed("click on '"+Store+"' size");
			  }
		  }else{
			  testStepFailed("Store options are not listed");
		  }
		  return Store;
	  }
	  public void clickOnShipToAddress()
	  {
		  clickOn(tab_Shipping_ShipToAddress);
	  }
	  public void VerifyTheOptionsAreDisplayedOrNot()
	  {
		  try
		  {
			  /* if(driver.findElement(By.xpath("//form[@id='ShipToStoreAddressForm']//div[@id='js-regularShippingDropDown'] && //form[@id='ShipToStoreAddressForm']//*[@id='Express'] && //form[@id='ShipToStoreAddressForm']//*[@id='Rush']")).isDisplayed())
			    {
			       testStepPassed("verified that FREE- STANDARD: 3-5 BUSINESS DAYS and EXPRESS: 2 BUSINESS DAYS and  RUSH: 1 BUSINESS DAYS are displayed");
			    }*/
			  if(isElementDisplayed(drp_Shipping_ShipToStore) && isElementDisplayed(drp_shipping_Express) && isElementDisplayed(drp_shipping_Rush))
			  {
				  testStepPassed("verified that FREE- STANDARD: 3-5 BUSINESS DAYS and EXPRESS: 2 BUSINESS DAYS and  RUSH: 1 BUSINESS DAYS are displayed");
			  }
		  }
		  catch(Exception e)
		  {
			  testStepFailed("Exception Occured:" +e);
		  }

	  }

	  public float verifyTotalOrderAmountFromShippingPage(){
		  waitTime(2);
		  String strTotal=getText("Total#xpath=//*[@id='orderTotalsSummaryWidget']//*[@class='hide-for-small-only']//*[@class='value product-price']").replace("$", "");
		  float val=Float.parseFloat(strTotal);
		  return val;
	  }
	  public void verifyEightDollarOrederSummaryfromPaymentPage()
	  {
		  if(elementPresent(txt_EstimatedShippingCharge_Eight))
		  {
			  testStepPassed("Verify estimated shipping charges are 8$ ");

		  }
		  else
		  {
			  testStepFailed("Verify estimated shipping charges are not 8$ "); 
		  }
	  }
	  public void verifySixteenDollarOrederSummaryfromPaymentPage()
	  {
		  if(elementPresent(drp_shipping_Rush))
		  {
			  testStepPassed("Verify estimated shipping charges are 16$ ");

		  }
		  else
		  {
			  testStepFailed("Verify estimated shipping charges are not 16$ "); 
		  }
	  }
	  public void clickOnPromoCodeFromPaymentPage()
	  {
		  clickOn(lnk_checkout_promocode);
	  }
	  public void fillPromocodeNumberFromPaymentPage(String promocode)
	  {
		  typeIn(txt_checkout_promocode,promocode);
	  }
	  public void clickOnApplyButtonFromPromoCodePaymentPage()
	  {
		  clickOn(btn_checkout_promocode_apply);
	  }
	  public void verifyPromoCodeFromPaymentPage()
	  {
		  if(isElementDisplayed(txt_checkout_promecode_value)){
			  testStepPassed("Coupon should applied successfully and reduce the total amount");
		  }else{
			  testStepFailed("Coupon should not applied successfully");
		  }
	  }
	  public void clickOnCreditCardOrPaypalInPaymentPage(String PaymentDetais){
		  switch (PaymentDetais){
		  case "Paypal":
			  clickOn(rdo_btn_paypal);
			  break;
		  }
	  }
	  public void fillingAddressDetailsinPaymentTab(String BillingFirstName, String BillingLastName, String BillingAddress, String BillingCity, String BillingState, String BillingZip, String BillingTelephone){
		  try {
			  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//input[@id='bill-firstname']")).isDisplayed())
			  {
				  testStepPassed("Payment Tab is Displayed");
				  typeIn(txt_Payment_Billing_FirstName1_new, BillingFirstName);
				  typeIn(txt_Payment_Billing_LastName1_new, BillingLastName);
				  typeIn(txt_Payment_Billing_Address1_new, BillingAddress);
				  typeIn(txt_Payment_Billing_City1_new, BillingCity);
				  // selectFromDropdown(drp_Payment_Billing_State_new, BillingState);
				  try{
					  new Select(driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//select[@id='bill-state']"))).selectByValue(BillingState);
					  testStepPassed("Select "+BillingState+" from:state dropdown");
				  }
				  catch(Exception e){
					  testStepFailed("Failed to select "+BillingState+" from:state dropdown");
				  }
				  typeIn(txt_Payment_Billing_Zip1_new, BillingZip);
				  // selectFromDropdown(drp_Payment_Billing_Country1_new, BillingCountry);
				  typeIn(txt_Payment_Billing_Telephone1_new, BillingTelephone);
			  } else {
				  testStepFailed("Payment Tab is not displayed");
			  }
		  } catch (Exception e) {

			  testStepFailed("Payment Tab is not displayed");
		  }
	  }

	  public static final String txt_EstimatedShippingCharge="Estimated Shipping Charge #xpath=//*[@id='orderTotalsSummaryWidget']//*[@class='hide-for-small-only']//span[contains(text(),'Shipping')]/parent::li//*[contains(text(),'FREE')]";

	  public void verifyFreeOrederSummaryfromPaymentPage()
	  {
		  if(elementPresent(txt_EstimatedShippingCharge))
		  {
			  testStepPassed("Verify estimated shipping charges are free ");
		  }
		  else
		  {
			  testStepFailed("Verify estimated shipping charges are not free "); 
		  }
	  }

	  public void clickOnShippingTab()
	  {
		  clickOn(txt_ShippingTab);
	  }

	  public void clickOnChooseRushOptionInShippingAddress()
	  {
		  clickOn(drp_shipping_Rush);
	  }

	  public void fillPerfectFitRewardCertificateNumberFromCheckoutPage(String certificatenumber)
	  {
		  clickOn(txt_checkout_perfectfitreward_certificatenumber);
		  typeIn(txt_checkout_perfectfitreward_certificatenumber,certificatenumber);
	  }
	  public void clickOnApplyButtonFromPerfectFitRewardCheckoutPage()
	  {
		  clickOn(btn_checkout_perfectfitreward_certificatenumber_apply);
	  }
	  public void verifyPFCertificateFromCheckoutPage()
	  {
		  if(elementPresent(txt_checkout_perfectfitreward_certificate_amount))
		  {
			  testStepPassed("PF Certificate show in the Oreder summary page and reduce the  total amount");
		  }
		  else
		  {
			  testStepFailed("PF Certificate not show in the Oreder summary page and not reduce the total amount");
		  }
	  }

	  public void clickOnPerfectFitRewardFromCheckoutPage()
	  {

		  clickOn(lnk_checkout_perfectfitreward);
	  }

	  public void fillPerfectFitRewardIDNumberFromCheckoutPage(String accountidnumber)
	  {
		  //if(driver.findElement(By.xpath("//*[contains(@id,'panel-payment')]//*[@id='js-reward-pf-linkup-input']")).isDisplayed())
		  typeIn(txt_checkout_perfectfitreward_accountidnumber,accountidnumber);
	  }

	  public void clickOnPerfectFitRewardSaveButtonFromCheckoutPage()
	  {
		  //if(driver.findElement(By.xpath("//*[contains(@id,'panel-payment')]//*[@id='js-reward-pf-linkup']")).isDisplayed())
		  clickOn(btn_checkout_perfectfitreward_save);
	  }



	  public void enterPerfectFitDetailsandVerifyitisApplied(String PerfectFitId, String PerfectFitCertificate){
		  waitTime(2);
		  if(PerfectFitId.isEmpty()){
			  testStepPassed("Perfect Fit is Empty");
		  }

		  else{
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//input[contains(@id,'reward-pf-linkup-input')]")).isDisplayed()) {
				  typeIn(txt_PaymentinReviewTab_PerfectFitId, PerfectFitId);
				  clickOn(btn_PaymentinReviewTab_PerfectFitId_Save);
				  typeIn(txt_PaymentinReviewTab_PerfectFitId_Certificate, PerfectFitCertificate);
				  clickOn(btn_PaymentinReviewTab_PerfectFitId_Certificate_Apply);
				  checkPFCertificateisApplied();
			  }
			  else {
				  clickOn(lnk_PaymentinReviewTab_PerfectFit_Expand);
				  typeIn(txt_PaymentinReviewTab_PerfectFitId, PerfectFitId);
				  clickOn(btn_PaymentinReviewTab_PerfectFitId_Save);
				  typeIn(txt_PaymentinReviewTab_PerfectFitId_Certificate, PerfectFitCertificate);
				  clickOn(btn_PaymentinReviewTab_PerfectFitId_Certificate_Apply);
				  checkPFCertificateisApplied();
			  }
		  }
	  }



	  public void enterGiftCardDetailsandVerifyitisApplied(String GiftCard, String GiftCardPinNo){
		  waitTime(2);
		  if(GiftCard.isEmpty()){
			  testStepPassed("Gift Card is Empty");
		  }

		  else{
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//li//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  typeIn(txt_PaymentinReviewTab_GiftCardNo, GiftCard);
				  typeIn(txt_PaymentinReviewTab_GiftCardPinNo, GiftCardPinNo);
				  clickOn(btn_PaymentinReviewTab_GiftCard_Apply);
				  checkGiftCardisApplied();
			  }
			  else {
				  clickOn(lnk_PaymentinReviewTab_GiftCard_Expand);
				  typeIn(txt_PaymentinReviewTab_GiftCardNo, GiftCard);
				  typeIn(txt_PaymentinReviewTab_GiftCardPinNo, GiftCardPinNo);
				  clickOn(btn_PaymentinReviewTab_GiftCard_Apply);
				  checkGiftCardisApplied();
			  }
		  }
	  }





	  public void enterCouponCodeDetailsandVerifyitisApplied(String Coupon){
		  waitTime(2);
		  if(Coupon.isEmpty()){
			  testStepPassed("Coupon Code is Empty");
		  }

		  else{
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//li//form[contains(@id,'PromotionCodeForm')]//input[contains(@id,'promoCodeCheckoutInput')]")).isDisplayed()) {
				  typeIn(txt_PaymentinReviewTab_Promocode, Coupon);
				  clickOn(btn_PaymentinReviewTab_Promocode_Apply);
				  checkCouponCodeisApplied();
			  }
			  else {
				  clickOn(lnk_PaymentinReviewTab_Promocode_Expand);
				  typeIn(txt_PaymentinReviewTab_Promocode, Coupon);
				  clickOn(btn_PaymentinReviewTab_Promocode_Apply);
				  checkCouponCodeisApplied();
			  }
		  }
	  }






	  public void checkPFCertificateisApplied(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//ul[contains(@id,'pfCertificatesList')]//span[contains(@class,'list-title')]//a")).isDisplayed()) {
				  String AppliedPFCertificate = driver.findElement(By.xpath("//div[contains(@class,'payment-info')]//div[contains(@id,'pfit')]//ul[contains(@id,'pfCertificatesList')]//span[contains(@class,'list-title')]//a")).getText();
				  testStepPassed("PF Certificate Applied : "+AppliedPFCertificate);
			  }
		  } catch (Exception e) {
			  testStepFailed("PF Certificate is not Applied");
		  }
	  }




	  public void checkCouponCodeisApplied(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]//div[contains(@id,'appliedPromotionCodes')]//a")).isDisplayed()) {
				  String AppliedCouponCode = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'promo-code-accordion')]//div[contains(@id,'appliedPromotionCodes')]//a")).getText();
				  testStepPassed("Coupon Code Applied : "+AppliedCouponCode);
			  }
		  } catch (Exception e) {
			  testStepFailed("Coupon Code is not Applied");
		  }
	  }




	  public void checkGiftCardisApplied(){
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'js-summary-gift-card')]//span[contains(text(),'Gift Cards')]")).isDisplayed()) {
				  String AppliedGiftCardAmount = driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]//li[contains(@class,'js-summary-gift-card')]//span[contains(@class,'value product-price')]")).getText();
				  testStepPassed("Gift Card Applied : "+AppliedGiftCardAmount);
			  }
		  } catch (Exception e) {
			  testStepFailed("Gift Card Applied is not Applied");
		  }
	  }



	  public String getReviewTabShipppingAddressFirstName()
	  {
		  String ShippingAddressFirstname = null;
		  ShippingAddressFirstname = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Name')]/following-sibling::div//p")).getText();
		  //testStepPassed("Default Shipping First Name : "+ShippingAddressFirstname);
		  ShippingAddressFirstname = StringUtils.substringBefore(ShippingAddressFirstname, " ");
		  return ShippingAddressFirstname;
	  }


	  public String getReviewTabShipppingAddressLastName()
	  {
		  String ShippingAddressLastname = null;
		  ShippingAddressLastname = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Name')]/following-sibling::div//p")).getText();
		  //testStepPassed("Default Shipping Last Name : "+ShippingAddressLastname);
		  ShippingAddressLastname = StringUtils.substringAfter(ShippingAddressLastname, " ");
		  return ShippingAddressLastname;
	  }


	  public String getReviewTabShipppingAddressAddress1()
	  {
		  String ShippingAddressAddress1 = null;
		  ShippingAddressAddress1 = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Address')]/following-sibling::div//p[1]")).getText();
		  //testStepPassed("Default Shipping Address 1 : "+ShippingAddressAddress1);
		  return ShippingAddressAddress1;
	  }


	  public String getReviewTabShipppingAddressCity()
	  {
		  String ShippingAddressCity = null;
		  ShippingAddressCity = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Address')]/following-sibling::div//p[2]")).getText();
		  //testStepPassed("Default Shipping City : "+ShippingAddressCity);
		  StringUtils.substringBefore(ShippingAddressCity, ",");
		  return ShippingAddressCity;
	  }


	  public String getReviewTabShipppingAddressState()
	  {
		  String ShippingAddressState = null;
		  ShippingAddressState = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Address')]/following-sibling::div//p[2]")).getText();
		  //testStepPassed("Default Shipping State : "+ShippingAddressState);
		  ShippingAddressState = StringUtils.substringAfter(ShippingAddressState, ",");
		  ShippingAddressState = StringUtils.substringBefore(ShippingAddressState, " ");
		  return ShippingAddressState;
	  }


	  public String getReviewTabShipppingAddressZip()
	  {
		  String ShippingAddressZip = null;
		  ShippingAddressZip = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Address')]/following-sibling::div//p[2]")).getText();
		  //testStepPassed("Default Shipping Zip : "+ShippingAddressZip);
		  ShippingAddressZip = StringUtils.substringAfter(ShippingAddressZip, ",");
		  ShippingAddressZip = StringUtils.substringBefore(ShippingAddressZip, " ");
		  ShippingAddressZip = StringUtils.substringAfter(ShippingAddressZip, " ");
		  return ShippingAddressZip;
	  }

	  public String getReviewTabShipppingAddressPhone()
	  {
		  String ShippingAddressPhone = null;
		  ShippingAddressPhone = driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shipping-info')]//ul//li//p[contains(text(),'Address')]/following-sibling::div//p[3]")).getText();
		  //testStepPassed("Default Shipping Phone : "+ShippingAddressPhone);
		  return ShippingAddressPhone;
	  }


	  public static final String lnk_SAPAddressPopupSuggestedAddress="SAP Address Popup Suggested Address Link#xpath=//div[contains(@id,'addressVerificationWithRecommendation')]//div[contains(@id,'ada-av-with-suggested')]";
	  public static final String btn_SAPAddressPopupUsethisAddress="SAP Address Popup Use this Address Button#xpath=//div[contains(@id,'addressVerificationWithRecommendation')]//button[contains(@class,'js-av-continue')]";

	  public void SAPAddressValidationPopupisdispalyedandSelecttheAddressandContinue()
	  {
		  try {
			  waitTime(1);
			  if (driver.findElement(By.xpath("//div[contains(@id,'addressVerificationWithRecommendation')]")).isDisplayed()) 
			  {
				  testStepPassed("SAP Address Validation popup is displayed");

				  clickOn(lnk_SAPAddressPopupSuggestedAddress);

				  clickOn(btn_SAPAddressPopupUsethisAddress);
			  }
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("SAP Address Validation popup is not displayed");
		  }
	  }


	  public boolean CheckIfEditBillingModelisDisplayed(){
		  boolean flag=false;
		  try
		  {
			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]")).isDisplayed()) 
			  {
				  testStepPassed("Edit Billing Modal is displayed");
				  flag=true;
			  }

		  }
		  catch(Exception e)
		  {

		  }
		  return flag;
	  }



	  public static final String txt_EditBillingSavedCardCvv="Edit Billing Modal Saved Card Cvv Textbox#xpath=//div[contains(@id,'billingEditModal')]//input[contains(@id,'savedCardCVV')]";
	  public static final String btn_EditBillingContinue="Edit Billing Modal Continue Button#xpath=//div[contains(@id,'billingEditModal')]//button[contains(@id,'js-continue-payment')]";


	  public void EnterSavedCardCvvandClickContinue(String SavedCvv){
		  typeIn(txt_EditBillingSavedCardCvv, SavedCvv);
		  clickOn(btn_EditBillingContinue);
	  }



	  public static final String lnk_Reviewpage_GiftCardReedem_GiftCardColapseLink="Review Tab Gift Card Reedem Gift Card Colapse Link#xpath=//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//a[contains(text(),'Gift Card')]";

	  public void checkGiftCardCollapseLink(){
		  try {
			  waitTime(3);
			  if (driver.findElement(By.xpath("//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'payment-info')]//form[contains(@id,'giftCardForm')]//input[contains(@id,'giftCardNumber')]")).isDisplayed()) {
				  clickOn(lnk_Reviewpage_GiftCardReedem_GiftCardColapseLink);
			  } else {
				  testStepPassed("The Gift Card Reedemtion is not opened");
			  }
		  } catch (Exception e) {
			  testStepPassed("The Gift Card Reedemtion is not opened");
		  }
	  }



	  public String getReviewTabShippingAddressFirstName()
	  {
		  String Fname = null;
		  String FLName = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][1]//p")).getText();
		  Fname = FLName.substring(0, FLName.lastIndexOf(' '));
		  //Fname = FnameEdited.replaceAll("\\s","");
		  System.out.println("First Name : "+Fname);
		  return Fname;

	  }


	  public String getReviewTabShippingAddressLastName()
	  {
		  //String Fname = null;
		  String Lname = null;
		  String LnameFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][1]//p")).getText();
		  System.out.println("LnameFull : "+LnameFull);
		  Lname = LnameFull.substring(LnameFull.lastIndexOf(' ')+1, LnameFull.length());
		  //Lname = LnameEdited.replaceAll("\\s","");
		  System.out.println("Last Name : "+Lname);
		  return Lname;
	  }



	  public String getReviewTabShippingAddressStreet()
	  {
		  String Street = null;
		  Street = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][2]//p[1]")).getText();
		  //Street = StringUtils.trim(StreetEdited);
		  return Street;
	  }


	  public String getReviewTabShippingAddressCity()
	  {
		  String City = null;
		  String CityFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][2]//p[2]")).getText();
		  City = CityFull.substring(0, CityFull.lastIndexOf(","));
		  //City = CityEdited.replaceAll("\\s","");
		  System.out.println("City : "+City);
		  return City;
	  }


	  public String getReviewTabShippingAddressState()
	  {
		  String State = null;
		  String StateFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][2]//p[2]")).getText();
		  State = StateFull.substring(StateFull.lastIndexOf(",")+2, StateFull.lastIndexOf(' '));
		  //State = StateEdited.replaceAll("\\s","");
		  System.out.println("State : "+State);
		  return State;
	  }


	  public String getReviewTabShippingAddressZip()
	  {
		  String ZipCode = null;
		  String ZipFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][2]//p[2]")).getText();
		  ZipCode = ZipFull.substring(ZipFull.lastIndexOf(' ')+1, ZipFull.length());
		  //ZipCode = ZipCodeEdited.replaceAll("\\s","");
		  System.out.println("ZipCode : "+ZipCode);
		  return ZipCode;
	  }


	  public String getReviewTabShippingAddressPhoneNo()
	  {
		  String PhoneNo = null;
		  PhoneNo = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//li/p[contains(text(),'Name')]/following::div[contains(@class,'value')][2]//p[3]")).getText();
		  //PhoneNo = PhoneNoEdited.replaceAll("\\s","");
		  System.out.println("PhoneNo : "+PhoneNo);
		  return PhoneNo;
	  }







	  public String getReviewTabPaymentDetailsCardType()
	  {
		  String CardType = null;
		  String CardTypeFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[1]//span[contains(@class,'text-payment-method')]")).getText();
		  String CardTypeEdited = CardTypeFull.substring(0, CardTypeFull.lastIndexOf("|"));
		  CardType = CardTypeEdited.replaceAll("\\s","");
		  System.out.println("CardType : "+CardType);
		  return CardType;
	  }


	  public String getReviewTabPaymentDetailsPayPalDetails()
	  {
		  String CardType = null;
		  String CardTypeFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[1]//span[contains(@class,'text-payment-method')]")).getText();
		  String CardTypeEdited = CardTypeFull.substring(0, CardTypeFull.lastIndexOf("|"));
		  CardType = CardTypeEdited.replaceAll("\\s","");
		  System.out.println("CardType : "+CardType);
		  return CardType;
	  }


	  public String getReviewTabPaymentDetailsCardNo()
	  {
		  String CardNo = null;
		  String CardNoFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[1]//span[contains(@class,'text-payment-method')]")).getText();
		  String CardNoEdited = CardNoFull.substring(CardNoFull.lastIndexOf("|")+1, CardNoFull.lastIndexOf(","));
		  String CardNoTrimmed = StringUtils.trim(CardNoEdited);
		  CardNo = CardNoTrimmed.replaceAll("\\s","");
		  System.out.println("CardNo : "+CardNo);
		  return CardNo;
	  }


	  public String getReviewTabPayPalPaymentAccountEmailId()
	  {
		  String EmailId = null;
		  String CardNoFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[1]//span[contains(@class,'text-payment-method')]")).getText();
		  EmailId = CardNoFull.substring(CardNoFull.lastIndexOf("|")+1, CardNoFull.length());
		  System.out.println("EmailId : "+EmailId);
		  return EmailId;
	  }


	  public String getReviewTabPaymentDetailsCardExpiryDateYear()
	  {
		  String CardExpiryDateYear = null;
		  String CardExpiryDateYearFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[1]//span[contains(@class,'text-payment-method')]")).getText();
		  String CardExpiryDateYearEdited = CardExpiryDateYearFull.substring(CardExpiryDateYearFull.lastIndexOf(".")+1, CardExpiryDateYearFull.length());
		  CardExpiryDateYear = CardExpiryDateYearEdited.replaceAll("\\s","");
		  System.out.println("CardExpiryDateYear : "+CardExpiryDateYear);
		  return CardExpiryDateYear;
	  }



	  public String getReviewTabPaymentDetailsFirstName()
	  {
		  String Fname = null;
		  String FLName = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[2]//p[contains(@class,'value')]")).getText();
		  Fname = FLName.substring(0, FLName.lastIndexOf(' '));
		  //Fname = FnameEdited.replaceAll("\\s","");
		  System.out.println("First Name : "+Fname);
		  return Fname;
	  }


	  public String getReviewTabPaymentDetailsLastName()
	  {
		  //String Fname = null;
		  String Lname = null;
		  String LnameFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[2]//p[contains(@class,'value')]")).getText();
		  System.out.println("LnameFull : "+LnameFull);
		  Lname = LnameFull.substring(LnameFull.lastIndexOf(' ')+1, LnameFull.length());
		  //Lname = LnameEdited.replaceAll("\\s","");
		  System.out.println("Last Name : "+Lname);
		  return Lname;
	  }



	  public String getReviewTabPaymentDetailsAddressStreet()
	  {
		  String Street = null;
		  String StreetFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[3]//p[contains(@class,'value')]")).getText();
		  String StreetEdited = StreetFull.substring(0, StreetFull.lastIndexOf(","));
		  System.out.println("StreetEdited :"+StreetEdited);
		  Street = StreetEdited.split("\\n")[0];
		  System.out.println("Street : "+Street);
		  return Street;
	  }


	  public String getReviewTabPaymentDetailsAddressCity()
	  {
		  String City = null;
		  String CityFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[3]//p[contains(@class,'value')]")).getText();
		  String CityEdited = CityFull.substring(0, CityFull.lastIndexOf(","));
		  System.out.println("CityEdited :"+CityEdited);
		  City = CityEdited.split("\\n")[1];
		  System.out.println("City : "+City);
		  return City;
	  }


	  public String getReviewTabPaymentDetailsAddressState()
	  {
		  String State = null;
		  String StateFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[3]//p[contains(@class,'value')]")).getText();
		  String StateEdited = StateFull.substring(StateFull.lastIndexOf(",")+2, StateFull.lastIndexOf("("));
		  System.out.println("StateEdited : "+StateEdited);
		  State = StateEdited.substring(0, StateFull.length());
		  //State = StateEdited.replaceAll("\\s","");
		  System.out.println("State : "+State);
		  return State;
	  }


	  public String getReviewTabPaymentDetailsAddressZip()
	  {
		  String ZipCode = null;
		  String ZipFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[3]//p[contains(@class,'value')]")).getText();
		  String ZipEdited = ZipFull.substring(ZipFull.lastIndexOf(",")+1, ZipFull.lastIndexOf("("));
		  String ZipEdited2 = ZipEdited.substring(0, ZipEdited.lastIndexOf(' '));
		  String ZipEdited3 = ZipEdited2.substring(ZipEdited2.lastIndexOf(' ')+1, ZipEdited2.length());
		  ZipCode = ZipEdited3.split("\\n")[0];
		  //ZipCode = ZipCodeEdited.replaceAll("\\s","");
		  System.out.println("ZipCode : "+ZipCode);
		  return ZipCode;
	  }


	  public String getReviewTabPaymentDetailsAddressPhoneNo()
	  {
		  String PhoneNo = null;
		  String PhoneNoFull = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//ul[contains(@class,'key-value')]//li[3]//p[contains(@class,'value')]")).getText();
		  //PhoneNo = PhoneNoEdited.replaceAll("\\s","");
		  PhoneNo = PhoneNoFull.substring(PhoneNoFull.lastIndexOf("(")+1, PhoneNoFull.length());
		  return PhoneNo;
	  }



	  public String getReviewTabProductName()
	  {
		  String ProductName = null;
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//h3[contains(@class,'product-name')]//a")).isDisplayed()) 
		  {
			  ProductName = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//h3[contains(@class,'product-name')]//a")).getText();
			  return ProductName;
		  }
		  else 
		  {
			  testStepFailed("Product name is not displayed in Review Tab");
		  }
		  return ProductName;
	  }




	  public void verifyPerfitRewardsReedemSectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//a[contains(text(),'Perfect Fit CERTIFICATE & REWARDS')]")).isDisplayed())
			  
			//  if (driver.findElement(By.xpath("//div[contains(@id,'panel-payment')]//a[contains(text(),'Perfect Fit CERTIFICATE & REWARDS')]")).isDisplayed()) 
				  
			  
			  
		  {
			  testStepPassed("Perfecct Fit Rewards Reedem Section in Review Tab is displayed");

		  }
		  else 
		  {
			  testStepFailed("Perfecct Fit Rewards Reedem Section in Review Tab is not displayed");
		  }

	  }


	  public void verifyGiftCardReedemSectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//a[contains(text(),'Gift Card')]")).isDisplayed()) 
		  {
			  testStepPassed("Gift Card Reedem Section in Review Tab is displayed");

		  }
		  else 
		  {
			  testStepFailed("Gift Card Reedem Section in Review Tab is not displayed");
		  }

	  }


	  public void verifyPromoCodeReedemSectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//a[contains(text(),'Promo Code')]")).isDisplayed()) 
		  {
			  testStepPassed("Promo Code Reedem Section in Review Tab is displayed");

		  }
		  else 
		  {
			  testStepFailed("Promo Code Reedem Section in Review Tab is not displayed");
		  }

	  }





	  public void verifyOrderSummarySectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'orderTotalsSummaryWidget')]")).isDisplayed()) 
		  {
			  testStepInfo("Order Summary Section in Review Tab is displayed");
		  }
		  else 
		  {
			  testStepFailed("Order Summary Section in Review Tab is not displayed");
		  }

	  }






	  public void verifyEstTaxesinOrderSummarySectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("(//div[contains(@id,'orderTotalsSummaryWidget')]//ul[contains(@class,'order-summary-list')]//span[contains(@class,'value product-price')])[2]")).isDisplayed()) 
		  {
			  String EstTaxes = driver.findElement(By.xpath("(//div[contains(@id,'orderTotalsSummaryWidget')]//ul[contains(@class,'order-summary-list')]//span[contains(@class,'value product-price')])[2]")).getText();
			  testStepPassed("Est.Taxes : "+EstTaxes);
		  }
		  else 
		  {
			  testStepFailed("Est Taxes in Order Summary Section in Review Tab is not displayed");
		  }

	  }


	  public void verifyEstShippinginOrderSummarySectionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("(//div[contains(@id,'orderTotalsSummaryWidget')]//ul[contains(@class,'order-summary-list')]//span[contains(@class,'value product-price')])[3]")).isDisplayed()) 
		  {
			  String EstShipping = driver.findElement(By.xpath("(//div[contains(@id,'orderTotalsSummaryWidget')]//ul[contains(@class,'order-summary-list')]//span[contains(@class,'value product-price')])[3]")).getText();
			  testStepPassed("Est.Shipping : "+EstShipping);
		  }
		  else 
		  {
			  testStepFailed("Est Shipping in Order Summary Section in Review Tab is not displayed");
		  }

	  }


	  public void verifyShippingEditOptionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'shipping-info')]//div[contains(@class,'bag-edit-links')]")).isDisplayed()) 
		  {
			  testStepPassed("Shipping Edit Option is displayed in Review Tab");
		  }
		  else 
		  {
			  testStepFailed("Shipping Edit Option is not displayed in Review Tab");
		  }

	  }



	  public void verifyPaymentEditOptionisdisplayedinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//div[contains(@class,'bag-edit-links')]")).isDisplayed()) 
		  {
			  testStepPassed("Payment Edit Option is displayed in Review Tab");
		  }
		  else 
		  {
			  testStepFailed("Payment Edit Option is not displayed in Review Tab");
		  }

	  } 



	  public boolean verifyTailoringOptionisAddedtoProductandDisplayedinReviewTab()
	  {
		  boolean flag=false;

		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//div[contains(@class,'tailoring-line')]")).isDisplayed()) 
		  {
			  testStepPassed("Tailoring Option is Added to the Product and displayed in Review Tab");

			  flag= true;
		  }
		  else 
		  {
			  testStepFailed("Tailoring Option is Added to the Product and displayed in Review Tab");
		  }
		  return flag;

	  } 


	  public String getTailoringAmountAddedtoProductinReviewTab()
	  {
		  String TailoringAmount = null;

		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//div[contains(@class,'tailoring-line')]//span[contains(@data-gtm,'finish-price')]")).isDisplayed()) 
		  {
			  TailoringAmount = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//div[contains(@class,'tailoring-line')]//span[contains(@data-gtm,'finish-price')]")).getText();

			  System.out.println("Tailoring Amount : "+TailoringAmount);
		  }
		  else 
		  {
			  testStepFailed("Tailoring Option is not Added to the Product and displayed in Review Tab");
		  }
		  return TailoringAmount;

	  }  




	  public String getProductCartCountinReviewTab(String ProductCartCount)
	  {
		  //String ProductCartCount = null;

		  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shopping-bag-header')]//span")).isDisplayed()) 
		  {
			  ProductCartCount = driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'orderReviewDisplay')]//div[contains(@class,'shopping-bag-header')]//span")).getText();

			  System.out.println("ProductCartCount : "+ProductCartCount);
		  }
		  else 
		  {
			  testStepFailed("ProductCartCount is not displayed in Review Tab");
		  }
		  return ProductCartCount;

	  }  




	  public void verifyTailoringOptionisRemovedtoProductandNotDisplayedinReviewTab()
	  {


		  try {
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@id,'order_details')]//div[contains(@class,'tailoring-line')]")).isDisplayed()) 
			  {

				  testStepFailed("Tailoring Option is not Removed from the Product and displayed in Review Tab");

			  }
			  else 
			  {
				  testStepPassed("Tailoring Option is Removed from the Product and not displayed in Review Tab");


			  }
		  } catch (Exception e) {
			  testStepPassed("Tailoring Option is Removed from the Product and not displayed in Review Tab");
		  }


	  } 



	  public boolean verifyEditShippingModalisdisplayedinReviewTab()
	  {
		  boolean flag=false;

		  try 
		  {

			  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]")).isDisplayed()) 
			  {

				  testStepInfo("Edit Shipping Modal Popup is displayed");  

				  flag=true;

			  } 
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Edit Shipping Modal Popup is not displayed");
		  }
		  return flag;
	  }



	  public String getFistNameinEditShippingModalinReviewTab()
	  {
		  String Fname = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[3]")).isDisplayed()) 
		  {
			  String FnameFull = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[3]")).getText();
			  Fname =  FnameFull.substring(0, FnameFull.lastIndexOf(' '));
			  System.out.println("Fname : "+Fname);
		  }
		  else 
		  {
			  testStepFailed("First Name in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return Fname;

	  }  


	  public String getLastNameinEditShippingModalinReviewTab()
	  {
		  String Lname = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[3]")).isDisplayed()) 
		  {
			  String LnameFull = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[3]")).getText();
			  Lname =  LnameFull.substring(LnameFull.lastIndexOf(' '), LnameFull.length());
			  System.out.println("Lname : "+Lname);
		  }
		  else 
		  {
			  testStepFailed("Last Name in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return Lname;

	  }  



	  public String getAddressStreetinEditShippingModalinReviewTab()
	  {
		  String Street = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[4]")).isDisplayed()) 
		  {
			  Street = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[4]")).getText();
			  System.out.println("Street : "+Street);
		  }
		  else 
		  {
			  testStepFailed("Address Street in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return Street;

	  }  


	  public String getAddressCityinEditShippingModalinReviewTab()
	  {
		  String City = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).isDisplayed()) 
		  {
			  String CityFull = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).getText();

			  City = CityFull.substring(0, CityFull.lastIndexOf(","));

			  System.out.println("City : "+City);
		  }
		  else 
		  {
			  testStepFailed("Address City in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return City;

	  }  


	  public String getAddressStateinEditShippingModalinReviewTab()
	  {
		  String State = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).isDisplayed()) 
		  {
			  String StateFull = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).getText();

			  State = StateFull.substring(StateFull.lastIndexOf(' '), StateFull.lastIndexOf("-"));

			  System.out.println("State : "+State);
		  }
		  else 
		  {
			  testStepFailed("Address State in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return State;

	  }  



	  public String getAddressZipinEditShippingModalinReviewTab()
	  {
		  String Zip = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).isDisplayed()) 
		  {
			  String ZipFull = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[5]")).getText();

			  Zip = ZipFull.substring(ZipFull.lastIndexOf("-"), ZipFull.length());

			  System.out.println("Zip : "+Zip);
		  }
		  else 
		  {
			  testStepFailed("Address Zip in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return Zip;

	  }  



	  public String getAddressPhoneinEditShippingModalinReviewTab()
	  {
		  String Phone = null;

		  if (driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[6]")).isDisplayed()) 
		  {
			  Phone = driver.findElement(By.xpath("(//div[contains(@id,'shippingEditModal')]//div[contains(@id,'selectedAddress')]//div)[6]")).getText();

			  System.out.println("Phone : "+Phone);
		  }
		  else 
		  {
			  testStepFailed("Address Phone No in Edit Shipping Modal is not displayed in Review Tab");
		  }
		  return Phone;

	  }   



	  public void verifySavedAddressDropdownisDispalyedWithValuesinEditShippingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'ship-to-address-panel')]//div[contains(@id,'dropdown-ship-address')]//span[contains(@id,'selectedShippingAddress')]")).isDisplayed()) 
		  {
			  testStepPassed("Address is displayed in the Saved Address Dropdown is displayed");

		  }
		  else 
		  {
			  testStepFailed("Saved Address Dropdown or Saved Address in Edit Shipping Modal is not displayed");
		  }

	  } 



	  public void verifySavedAddressinSavedAddressSectionisDisplayedinEditShippingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@class,'selected-address-data')]")).isDisplayed()) 
		  {
			  testStepPassed("Saved Address in Saved Address Section in Edit Shipping Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Saved Address in Saved Address Section in Edit Shipping Modal is not displayed");
		  }

	  } 


	  public void verifyChangeAddressLinkisDisplayedinEditShippingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//a[contains(@id,'editNewShipAddr')]")).isDisplayed()) 
		  {
			  testStepPassed("Change Address Link in Edit Shipping Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Change Address Link in Edit Shipping Modal is not displayed");
		  }

	  } 


	  public void verifyCreateNewAddressLinkisDisplayedinEditShippingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//a[contains(@id,'createNewShipAddr')]")).isDisplayed()) 
		  {
			  testStepPassed("Create New Address Link in Edit Shipping Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Create New Address Link in Edit Shipping Modal is not displayed");
		  }

	  } 


	  public void verifyShippingModeDropdownWithValueisDisplayedinEditShippingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//div[contains(@id,'shipModeReg')]//div[contains(@id,'regularShippingDropDown')]//span[contains(@class,'selected-item dropdown')]")).isDisplayed()) 
		  {
			  testStepPassed("Shipping Mode dropdown with value in Edit Shipping Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Shipping Mode dropdown with value in Edit Shipping Modal is not displayed");
		  }

	  } 

	  public static final String lnk_ChangeAddressinEditShippingOverlay="Change Address Link in Edit Shipping Modal#xpath=//div[contains(@id,'shippingEditModal')]//a[contains(@id,'editNewShipAddr')]";

	  public void ClickChangeAddressLinkinEditShippingModalinReviewTab()
	  {
		  waitForElement(lnk_ChangeAddressinEditShippingOverlay);
		  //clickOn(lnk_ChangeAddressinEditShippingOverlay);
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//a[contains(@id,'editNewShipAddr')]")).click();
	  } 






	  public void VerifyChangeAddressFormisPrefilledwithDatainEditShippingModalinReviewTab()
	  {
		  String a = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-firstname')]")).getAttribute("value");
		  String b = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-lastname')]")).getAttribute("value");
		  String c = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-street1')]")).getAttribute("value");
		  String d = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-city')]")).getAttribute("value");
		  String e = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-zip')]")).getAttribute("value");
		  String f = driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-tel')]")).getAttribute("value");
		  if (!a.equals("")) 
		  {
			  if (!b.equals("")) 
			  {
				  if (!c.equals("")) 
				  {
					  if (!d.equals("")) 
					  {
						  if (!e.equals("")) 
						  {
							  if (!f.equals("")) 
							  {
								  testStepPassed("Change Address Form is Prefilled with Data");
							  }
						  }
					  }
				  }
			  }
		  }

		  else 
		  {
			  testStepFailed("Change Address Form is not Prefilled with Data");
		  }
	  }



	  public static final String txt_ChangeAddressFistnameinEditShippingOverlay="Change Address Firstname in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-firstname')]";
	  public static final String txt_ChangeAddressLastnameinEditShippingOverlay="Change Address Firstname in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-lastname')]";
	  public static final String txt_ChangeAddressAddressStreetinEditShippingOverlay="Change Address Street in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-street1')]";
	  public static final String txt_ChangeAddressAddressCityinEditShippingOverlay="Change Address City in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-city')]";
	  public static final String drp_ChangeAddressAddressStateinEditShippingOverlay="Change Address State in Edit Shipping Modal Dropdown#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//select[contains(@id,'ship-state')]";
	  public static final String txt_ChangeAddressAddressZipinEditShippingOverlay="Change Address Zip in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-zip')]";
	  public static final String txt_ChangeAddressAddressPhoneinEditShippingOverlay="Change Address Phone No in Edit Shipping Modal Textbox#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-tel')]";
	  public static final String drp_ChangeAddressShippingModeinEditShippingOverlay="Change Address Shipping Mode in Edit Shipping Modal Dropdown#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//div[contains(@id,'regularShippingDropDown')]";
	  //public static final String lnk_ChangeAddressShippingModeExpressinEditShippingOverlay="Change Address Shipping Mode Express in Edit Shipping Modal Link#xpath=//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//div[contains(@id,'regularShippingDropDown')]//ul//li[contains(@id,'Express')]";
	  public static final String lnk_ChangeAddressShippingModeExpressinEditShippingOverlay="Change Address Shipping Mode Express in Edit Shipping Modal Link#xpath=//label[contains(@for,'addressShippingExpress')]//input[@id='addressShippingExpress']";
	  public static final String btn_ChangeAddressContinueinEditShippingOverlay="Change Address Continue in Edit Shipping Modal Button#xpath=//div[contains(@id,'shippingEditModal')]//button[contains(text(),'Continue')]";

	  public void EnterNewAddressinChangeAddressForminEditShippingModalinReviewTab(String Firstname, String Lastname, String Street, String City, String State, String Zip, String Phone)
	  {

		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-firstname')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-lastname')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-street1')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-city')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-zip')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-tel')]")).clear();



		  typeIn(txt_ChangeAddressFistnameinEditShippingOverlay, Firstname);
		  typeIn(txt_ChangeAddressLastnameinEditShippingOverlay, Lastname);
		  typeIn(txt_ChangeAddressAddressStreetinEditShippingOverlay, Street);
		  typeIn(txt_ChangeAddressAddressCityinEditShippingOverlay, City);
		  System.out.println("State:"+State);
		  selectFromDropdown(drp_ChangeAddressAddressStateinEditShippingOverlay, State);
		  typeIn(txt_ChangeAddressAddressZipinEditShippingOverlay, Zip);
		  typeIn(txt_ChangeAddressAddressPhoneinEditShippingOverlay, Phone);
		 //clickOn(drp_ChangeAddressShippingModeinEditShippingOverlay);
		  waitForElement(lnk_ChangeAddressShippingModeExpressinEditShippingOverlay);
		  clickOnSpecialElement(lnk_ChangeAddressShippingModeExpressinEditShippingOverlay);
		  clickOn(btn_ChangeAddressContinueinEditShippingOverlay);
		 
	  }

	  public void EnterNewAddressinCreatenewAddressForminEditShippingModalinReviewTab(String Firstname, String Lastname, String Street, String City, String State, String Zip, String Phone)
	  {

		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-firstname')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-lastname')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-street1')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-city')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-zip')]")).clear();
		  driver.findElement(By.xpath("//div[contains(@id,'shippingEditModal')]//form[contains(@id,'ChangeAddressForm')]//input[contains(@id,'ship-tel')]")).clear();



		  typeIn(txt_ChangeAddressFistnameinEditShippingOverlay, Firstname);
		  typeIn(txt_ChangeAddressLastnameinEditShippingOverlay, Lastname);
		  typeIn(txt_ChangeAddressAddressStreetinEditShippingOverlay, Street);
		  typeIn(txt_ChangeAddressAddressCityinEditShippingOverlay, City);
		  System.out.println("State:"+State);
		  selectFromDropdown(drp_ChangeAddressAddressStateinEditShippingOverlay, State);
		  typeIn(txt_ChangeAddressAddressZipinEditShippingOverlay, Zip);
		  typeIn(txt_ChangeAddressAddressPhoneinEditShippingOverlay, Phone);
		 //clickOn(drp_ChangeAddressShippingModeinEditShippingOverlay);
		// waitForElement(lnk_ChangeAddressShippingModeExpressinEditShippingOverlay);
		  //clickOnSpecialElement(lnk_ChangeAddressShippingModeExpressinEditShippingOverlay);
		  clickOn(btn_ChangeAddressContinueinEditShippingOverlay);
		 
	  }

	  public static final String lnk_CreateNewAddressinEditShippingOverlay="Create New Address in Edit Shipping Modal Link#xpath=//div[contains(@id,'shippingEditModal')]//a[contains(@id,'createNewShipAddr')]";

	  public void ClickCreateNewAddressLinkinEditShippingModalinReviewTab()
	  {
		  waitForElement(lnk_CreateNewAddressinEditShippingOverlay);
		  clickOn(lnk_CreateNewAddressinEditShippingOverlay);

	  } 

	  public static final String lnk_BillingTabEditinReviewTab="Edit Billing Tab in Review Tab Link#xpath=//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//div[contains(@class,'bag-edit-links')]";

	  public void clickPaymentEditLinkinReviewTab(){
		  try {
			  //waitTime(2);
			  if (driver.findElement(By.xpath("//div[contains(@id,'panel-review')]//div[contains(@class,'payment-info')]//div[contains(@class,'bag-edit-links')]")).isDisplayed()) {
				  clickOn(lnk_BillingTabEditinReviewTab);
			  } 
		  } catch (Exception e) {
			  testStepFailed("Review Tab Payment Edit Link is not present");
		  }
	  }


	  public boolean verifyEditPaymentModalisdisplayedinReviewTab()
	  {
		  boolean flag=false;

		  try 
		  {

			  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]")).isDisplayed()) 
			  {

				  testStepInfo("Edit Billing Modal Popup is displayed");  

				  flag=true;

			  } 
		  } 
		  catch (Exception e) 
		  {
			  testStepFailed("Edit Billing Modal Popup is not displayed");
		  }
		  return flag;
	  }


	  public void verifySavedCardDropdownisDispalyedWithValuesinEditBillingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//div[contains(@id,'savedCardPair')]//span[contains(@id,'selectedCC')]")).isDisplayed()) 
		  {
			  testStepPassed("Payment Card Details is displayed in the Payment Details Dropdown is displayed");

		  }
		  else 
		  {
			  testStepFailed("Payment Card Details Dropdown or Payment Card Details in Edit Billing Modal is not displayed");
		  }

	  } 






	  public void verifyEditCardLinkisDisplayedinEditBillingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//a[contains(@id,'edit-cc')]")).isDisplayed()) 
		  {
			  testStepPassed("Edit Card Link in Edit Billing Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Edit Card Link in Edit Billing Modal is not displayed");
		  }

	  } 



	  public void verifyAddNewCardLinkisDisplayedinEditBillingModalinReviewTab()
	  {
		  if (driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//a[contains(@id,'add-new-cc')]")).isDisplayed()) 
		  {
			  testStepPassed("Add New Card Link in Edit Billing Modal is displayed");
		  }
		  else 
		  {
			  testStepFailed("Add New Card Link in Edit Billing Modal is not displayed");
		  }

	  } 



	  public static final String lnk_EditCardinEditBillingOverlay="Edit Card Link in Edit Billing Modal#xpath=//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//a[contains(@id,'edit-cc')]";

	  public void ClickEditCardLinkinEditShippingModalinReviewTab()
	  {
		  clickOn(lnk_EditCardinEditBillingOverlay);
	  } 



	  public void VerifyEditCardFormisPrefilledwithDatainEditBillingModalinReviewTab()
	  {
		  String a = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//input[contains(@id,'pay-ccnum')]")).getAttribute("value");
		  String b = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-firstname')]")).getAttribute("value");
		  String c = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-lastname')]")).getAttribute("value");
		  String d = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-street1')]")).getAttribute("value");
		  String e = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-city')]")).getAttribute("value");
		  String f = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-zip')]")).getAttribute("value");
		  String g = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//form[contains(@id,'BillingAddressForm')]//div[contains(@class,'change-address')]//input[contains(@id,'bill-tel')]")).getAttribute("value");
		  if (!a.equals("")) 
		  {
			  if (!b.equals("")) 
			  {
				  if (!c.equals("")) 
				  {
					  if (!d.equals("")) 
					  {
						  if (!e.equals("")) 
						  {
							  if (!f.equals("")) 
							  {
								  if (!g.equals("")) 
								  {
									  testStepPassed("Edit Card Form is Prefilled with Data");
								  }
							  }
						  }
					  }
				  }
			  }
		  }

		  else 
		  {
			  testStepFailed("Edit Card Form is not Prefilled with Data");
		  }
	  }


	  public static final String txt_EditCardNoinEditBillingOverlay="Edit Card No in Edit Billing Modal Textbox#xpath=//div[contains(@id,'billingEditModal')]//input[contains(@id,'pay-ccnum')]";
	  public static final String txt_EditCardCvvinEditBillingOverlay="Edit Card Cvv in Edit Billing Modal Textbox#xpath=//div[contains(@id,'billingEditModal')]//input[contains(@id,'pay-cvv')]";
	  public static final String drp_EditCardExpiryMonthinEditBillingOverlay="Edit Card Expiry Month in Edit Billing Modal Dropdown#xpath=//div[contains(@id,'billingEditModal')]//select[contains(@id,'exp-date-mo')]";
	  public static final String drp_EditCardExpiryYearinEditBillingOverlay="Edit Card Expiry Year in Edit Billing Modal Dropdown#xpath=//div[contains(@id,'billingEditModal')]//select[contains(@id,'exp-date-yr')]";
	  public static final String btn_EditCardContinueinEditBillingOverlay="Edit Card Continue in Edit Billing Modal Button#xpath=//div[contains(@id,'billingEditModal')]//button[contains(@id,'continue-payment')]";


	  public void EnterNewCardinChangeCardForminEditBillingModalinReviewTab(String CardNo, String CardCVV, String CardExpiryMonth, String CardExpiryYear)
	  {

		  driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//input[contains(@id,'pay-ccnum')]")).clear();



		  typeIn(txt_EditCardNoinEditBillingOverlay, CardNo);
		  typeIn(txt_EditCardCvvinEditBillingOverlay, CardCVV);
		  selectFromDropdown(drp_EditCardExpiryMonthinEditBillingOverlay, CardExpiryMonth);
		  selectFromDropdown(drp_EditCardExpiryYearinEditBillingOverlay, CardExpiryYear);
		  clickOn(btn_EditCardContinueinEditBillingOverlay);
	  }





	  public static final String lnk_AddNewCardinEditBillingOverlay="Add New Card Link in Edit Billing Modal#xpath=//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//a[contains(@id,'add-new-cc')]";

	  public void ClickAddNewCardLinkinEditShippingModalinReviewTab()
	  {
		  clickOn(lnk_AddNewCardinEditBillingOverlay);
	  }  




	  public static final String chk_SavethisCardtoyourAccountinEditBillingOverlay="Save this Card to your Account in Edit Billing Modal Checkbox#xpath=//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//form[contains(@id,'PaymentForm')]//div[contains(@id,'creditCardFormBox')]//div[contains(@id,'saveCreditCard')]//input[contains(@id,'SaveCreditCard')]";
	  public static final String chk_MakethisYourDefaultPaymentMethodinEditBillingOverlay="Make this your Default Payment Method in Edit Billing Modal Checkbox#xpath=//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//form[contains(@id,'BillingAddressForm')]//input[contains(@id,'billingSetPrimary')]";



	  public void verifySavethisCardtoYourAccountisCheckedinEditShippingModalinReviewTab()
	  {
		  String checked = driver.findElement(By.xpath("//div[contains(@id,'billingEditModal')]//div[contains(@id,'panel-payment-cc')]//form[contains(@id,'PaymentForm')]//div[contains(@id,'creditCardFormBox')]//div[contains(@id,'saveCreditCard')]//input[contains(@id,'SaveCreditCard')]")).getAttribute("checked");
		  if (checked.equalsIgnoreCase("checked")) 
		  {
			  testStepPassed("Save this Card to Your Account is already checked");
		  }
		  else 
		  {
			  clickOn(chk_SavethisCardtoyourAccountinEditBillingOverlay);
		  }
	  }  


	  public void verifyMakeThisDefaultPaymentMethodinEditShippingModalinReviewTab()
	  {
		  clickOn(chk_MakethisYourDefaultPaymentMethodinEditBillingOverlay);
	  } 



	  public void EnterCardCvvandContinueinEditBillingModalforShoppingCart(String CreditCardCvv)
	  {
		  waitTime(2);
		  if (driver.findElement(By.xpath("//section[contains(@class,'payment-cc-section')]//input[contains(@id,'savedCardCVV')]")).isDisplayed()) 
		  {
			  typeIn(txt_Payment_SavedCardCreditCardCvvNo_new, CreditCardCvv);
			  clickOn(btn_EditCardContinueinEditBillingOverlay);
		  }
		  else {
			testStepPassed("Edit billing Modal Cvv is not displayed");
		}
	  } 

	  
	  String subTotalPrice, giftCardPrice;
	  public String getSubTotalPrice() {
		  try {
		  if(isElementDisplayed(txt_SubTotalPrice))
			{
			  if(elementPresent(txt_GiftcardProduct)) {
				 String subTotalAmount = getText(txt_SubTotalPrice);
				 subTotalAmount = subTotalAmount.substring(subTotalAmount.lastIndexOf("$")+1, subTotalAmount.length()-1);
				   testStepPassed("subTotalAmount:" +subTotalAmount);

				  String giftCardAmount = getText(txt_GiftcardPrice);

				  giftCardAmount = giftCardAmount.substring(giftCardAmount.lastIndexOf("$")+1, giftCardAmount.length()-1);
				   testStepPassed("giftCardAmount:" +giftCardAmount);

				  double subTotal = Double.parseDouble(subTotalAmount);
				  
				 double giftCard = Double.parseDouble(giftCardAmount);

				   double subTotalPricing = subTotal - giftCard;
				   testStepPassed("subtotal after subtraction:" +subTotalPricing);
				
					 subTotalPrice = Double.toString(subTotalPricing);
					if(subTotalPrice.contains(".0")) {
						subTotalPrice = subTotalPrice+0;
					}
				//subTotalPrice = subTotalPrice.substring(subTotalPrice.lastIndexOf("$")+1, subTotalPrice.length()-1);

				testStepPassed("Subtotal Price  :" + " \""+subTotalPrice+"\"");
			}
			  else if(elementPresent(txt_TravelCrease)) {
				  subTotalPrice = getText(txt_TravelCreaseAmount);
				  subTotalPrice = subTotalPrice.substring(subTotalPrice.lastIndexOf("$")+1, subTotalPrice.length()-1);

					testStepPassed("Subtotal Price  :" + " \""+subTotalPrice+"\"");
			  }
			  
		  else {
				  subTotalPrice = getText(txt_SubTotalPrice);
				  
				subTotalPrice = subTotalPrice.substring(subTotalPrice.lastIndexOf("$")+1, subTotalPrice.length()-1);

				testStepPassed("Subtotal Price  :" + " \""+subTotalPrice+"\"");
		  }
		  
	  }else{
			testStepFailed("SubTotal Price not displayed");
		}
		  return subTotalPrice;
	  }
	 
	  catch(Exception e) {
			testStepFailed("SubTotal Price not displayed");
			return null;
	  }
	  } 
	  String estTaxes;
	  public String getEstTaxes() {
		  if(isElementDisplayed(txt_estTaxes))
			{
			  estTaxes = getText(txt_estTaxes);
				
			  estTaxes = estTaxes.substring(estTaxes.lastIndexOf("$")+1, estTaxes.length());

				testStepPassed("Est. Taxes" + " \""+estTaxes+"\"");
	  }else{
			testStepFailed("Est. Taxes is not displayed");
		}
		  return estTaxes;
	  }


}