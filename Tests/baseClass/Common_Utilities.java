package baseClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import iSAFE.ApplicationKeywords;

public class Common_Utilities extends ApplicationKeywords{

	public static String prefix; 
	public static boolean orderPlacementFlag=false;
	public static final String img_MensWearLogo="Men's Wearhouse Logo #xpath=//section[contains(@class,'logo-bar')]/a";
	public static final String home_MenswearLogo="Men's Wearhouse Home Logo #xpath=//*[@id='logo' and text()!='Mens Wearhouse']";
	public String miniCartXpath = "//a[contains(@id,'mini-cart-tab') or contains(@class,'mini-cart-tab')]";
	public static final String img_CheckOutPage_MensWearLogo="Men's Wearhouse Logo #xpath=//section[contains(@class,'logo')]//img";
	public static final String lnk_frontEmailpopupclose = "Email Popup Close Link#xpath=//div[contains(@id,'emailSignup')]//a[contains(text(),'PRIVACY POLICY')]/following::a";
	public static final String img_PromotionPopup="Promotion Popup Close image #xpath=//div[contains(@class,'t001-toggle')]//img[contains(@class,'toggle_close')]";



	public Common_Utilities(BaseClass obj) {
		
		super(obj);
	}
	public Common_Utilities() {
		
	}
	public void setEnvironmentTimeouts()
	{
		setTimeouts();
	}

	public void setup(String machineName, String host, String port,String browser, String os, String browserVersion, String osVersion, String sheetNo) {

		testDataSheetNo=Integer.parseInt(sheetNo);
		testResultsFolder(machineName,host,port,browser,os,browserVersion,osVersion);	
		currentExecutionMachineName(machineName);
		setEnvironmentTimeouts();
	}

	public void setEnvironmentFlag(){

		if(getConfigProperty("AppURL").contains("www.menswearhouse.com")) {
			prefix="www";
			orderPlacementFlag=false;
		}
		else if(getConfigProperty("AppURL").contains("tst.menswearhouse.com")){
			prefix="tst";
			orderPlacementFlag=true;
		}
		else if(getConfigProperty("AppURL").contains("tst3.menswearhouse.com")){
			prefix="tst3";
			orderPlacementFlag=true;

		}
		else if(getConfigProperty("AppURL").contains("tst5.menswearhouse.com")){
			prefix="tst5";
			orderPlacementFlag=true;

		}
		else if(getConfigProperty("AppURL").contains("tst2.menswearhouse.com")){
			prefix="tst2";
			orderPlacementFlag=true;

		}
		else if(getConfigProperty("AppURL").contains("stg-mw.tmw.com")){
			prefix="stg-mw";
			orderPlacementFlag=true;
		}
		else if(getConfigProperty("AppURL").contains("stage-mw.tmw.com")){
			prefix="stg-mw";
			orderPlacementFlag=true;
		}
		else if(getConfigProperty("AppURL").contains("tst4.menswearhouse.com")){
			prefix="tst4";
			orderPlacementFlag=true;
		}
	}

	public void closeAllSessions(){
		try{
			driver.quit();
		}catch(Exception e){

		}
	}



	public String getCurrentPageFromBreadCrum(){
		String currentpage = null;
		try{
			currentpage=getText("Breadcrum current page#xpath=//span[contains(@class,'breadcrumb-item current-page')]");
		}catch(Exception e){

		}
		return currentpage.trim();
	}

	public String getLastBeforeCurrentPageFromBreadCrum(){
		String breadcrum=null;
		try{
			List<WebElement> ele=driver.findElements(By.xpath("//a[contains(@id,'WC_BreadCrumb_Link')]"));
			breadcrum=ele.get(ele.size()-1).getText().trim();
		}catch(Exception e){

		}
		return breadcrum;
	}



	public void scrolldown(){
		driver.findElement(By.xpath("")).sendKeys(Keys.PAGE_DOWN);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);	
	}


	public void scrolldownSafari(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");	
	}







	public void waitForLoadingAndDissappearMWLoadingImg(){
		try{
			WebDriverWait wait=new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'images/colors/color1/loading.gif')]")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'Redesign/images/icons/loading.svg')]")));
			WebDriverWait wait2=new WebDriverWait(driver,implicitlyWaitTime);
			//wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[contains(@src,'images/colors/color1/loading.gif')]")));
			wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[contains(@src,'Redesign/images/icons/loading.svg')]")));
			waitTime(5);
		}catch(Exception e){

		}
	}

	public void pageRefresh(){

		driver.navigate().refresh();

	}







	public String getJSESSIONIDOnceBrowserInitiated(){

		/*try{
			String Jsession = driver.manage().getCookieNamed("JSESSIONID")+"";
			//testStepInfo(Jsession);
			String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
			String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);

			System.out.println("JSession :" +Jsession);
			System.out.println("Trimmed JSession : "+JsessionTrimmed);
			System.out.println("JSession ID : "+JSessionID);
			//testStepPassed("JSESSION FROM APPLICATION : "+JSessionID);
			testStepInfo("Existing Jsession Id : "+JSessionID);

			return JSessionID;
			//driver.manage().deleteCookieNamed("JSESSIONID");
			 *
		 return null;
			}catch(Exception e){
			e.printStackTrace();*/
			return null;
		//}


		/*//driver.manage().addCookie(new Cookie("JSESSIONID", "0000iuOUF-aeJ5NyBKKXZctDKN1:1881j3etj"));
            driver.manage().addCookie(new Cookie(retrieve("Cookie"), retrieve("CookieValue")));
            //driver.manage().addCookie(new cookie.Builder("JSESSIONID", "0000iuOUF-aeJ5NyBKKXZctDKN1:1881j3etj"));
            Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
            System.out.println("JSession :" +Jsession);*/


	}



	public String getCLONEIDOnceBrowserInitiated(){

		/*String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("Clone Id : "+CloneId);
		//testStepPassed("Clone ID FROM APPLICATION : "+CloneId);
		testStepInfo("Existing Clone Id : "+CloneId);

		return CloneId;*/
		
		
		
		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}
		
		else {
			JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		}
		
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("Existing CLONE ID : "+CloneId);
		//testStepPassed("CLONE ID AFTER CHANGED: "+CloneId);
		testStepInfo("Existing Clone Id : "+CloneId);

		return CloneId;

	}

	
	
	

	public void setJSESSIONID(){
		
		driver.manage().addCookie(new Cookie(retrieve("Cookie"), retrieve("CookieValue")));
		testStepInfo("Setting Jsession ID : "+retrieve("CookieValue"));

	}


/*	public String getJSESSIONIDAfterNewValueChanged(){
		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("Trimmed JSession 2 : "+JsessionTrimmed2);
		System.out.println("New Jsession Id : "+JSessionID);
		//testStepPassed("JSESSION ID AFTER CHANGED: "+JSessionID);
		testStepInfo("New Jsession Id : "+JSessionID);

		return JSessionID;
	}



	public String getCLONEIDAfterNewValueChanged(){

		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}
		
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("New CLONE ID : "+CloneId);
		//testStepPassed("CLONE ID AFTER CHANGED: "+CloneId);
		testStepInfo("New Clone Id : "+CloneId);

		return CloneId;
	}
*/

	
	
	public String getJSESSIONIDAfterNewValueChanged(){
		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}
		
		else {
			JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		}

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("Trimmed JSession 2 : "+JsessionTrimmed2);
		System.out.println("New Jsession Id : "+JSessionID);
		//testStepPassed("JSESSION ID AFTER CHANGED: "+JSessionID);
		testStepInfo("New Jsession Id : "+JSessionID);

		return JSessionID;
	}



	public String getCLONEIDAfterNewValueChanged(){

		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}
		
		else {
			JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		}
		
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("New CLONE ID : "+CloneId);
		//testStepPassed("CLONE ID AFTER CHANGED: "+CloneId);
		testStepInfo("New Clone Id : "+CloneId);

		return CloneId;
	}

	
	
	
	

	public String getJSESSIONIDAfterAddingProduct(){

		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		//testStepPassed("JSESSION ID AFTER ADDING PRODUCT: "+JSessionID);
		testStepInfo("Jsession Id After Adding a Product: "+JSessionID);

		return JSessionID;
	}


	public String getCLONEIDAfterAddingProduct(){

	/*	String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("CLONE ID AFTER ADDING PRODUCT: "+CloneId);
		//testStepPassed("CLONE ID AFTER ADDING PRODUCT: "+CloneId);
		testStepInfo("Clone Id After Adding a Product : "+CloneId);

		return CloneId;*/
		
		String JSessionID = null;
		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JsessionTrimmed2 = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		
		if (JsessionTrimmed2.contains("expires")) {
			String JsessionTrimmed3  = JsessionTrimmed2.substring(0, JsessionTrimmed2.lastIndexOf("expires"));
			JSessionID = JsessionTrimmed3.substring(0, JsessionTrimmed3.lastIndexOf(";"));
		}
		
		else {
			JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		}
		
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("CLONE ID After Adding product : "+CloneId);
		//testStepPassed("CLONE ID AFTER CHANGED: "+CloneId);
		testStepInfo("CLONE ID After Adding product : "+CloneId);

		return CloneId;
		
		
		
	}


	public String getJSESSIONIDAfterPageRefresh(){

		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);

		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		//testStepPassed("JSESSION ID AFTER ADDING PRODUCT: "+JSessionID);
		testStepInfo("Jsession Id After Page Refresh: "+JSessionID);

		return JSessionID;
	}


	public String getCLONEIDAfterPageRefresh(){

		String Jsession = driver.manage().getCookieNamed("JSESSIONID").toString();
		//testStepInfo(Jsession);
		String JsessionTrimmed = Jsession.substring(Jsession.indexOf("=")+1, Jsession.lastIndexOf("path"));
		String JSessionID = JsessionTrimmed.substring(0, JsessionTrimmed.length()-2);
		String CloneId = JSessionID.substring(JSessionID.indexOf(":")+1);
		System.out.println("JSession :" +Jsession);
		System.out.println("Trimmed JSession : "+JsessionTrimmed);
		System.out.println("JSession ID : "+JSessionID);
		System.out.println("CLONE ID AFTER PAGE REFRESH: "+CloneId);
		//testStepPassed("CLONE ID AFTER ADDING PRODUCT: "+CloneId);
		testStepInfo("Clone Id After Page Refresh : "+CloneId);

		return CloneId;
	}




	public void verify404ErrorPage(){
		String pageSource = driver.getPageSource();
		if(!pageSource.contains("404")){
			testStepFailed("Landing page gives a 404 error page");			
		}else
			testStepPassed("Landing page do not give a 404 error page");
	}


	public void PageRefresh(){
		driver.navigate().refresh();
		testStepPassed("Page Refreshed");
	}


	/**returns the currentDate and time
	 * @return String Date(ddMMyyyyhhmmss)
	 */
	public String getCurrentDateAndTimeStamp() {
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyhhmmss");
		return dateFormat.format(new Date());
	}
	public void selectInputListOptionDropdown(String drpobjectLocator,String option)
	{
		try{
			clickOn(drpobjectLocator);
			int optionNo=Integer.parseInt(getAttributeValue(option+" option#xpath=//select[contains(@id,'inseamDrop''"+option+"')]", "inseamDrop").trim());
			//waitForElement(inputObjectLocator);
			waitTime(10);
			for(int i=0;i<=optionNo;i++)
			{
				if(i==0)
				{

				}
				else
				{
					webElement.sendKeys(Keys.DOWN);
					waitTime(1);
				}
			}
			webElement.sendKeys(Keys.ENTER);

		}
		catch(Exception e)
		{
			testStepFailed(e.toString());
		}
	}
	public String getCurrentPageFromBreadCrum(int loopNumber){
		String currentpage = null;
		for(int i=0;i<loopNumber;i++){
			try{
				currentpage=driver.findElement(By.xpath("//span[contains(@class,'breadcrumb-item current-page')]")).getText();
			}catch(NoSuchElementException e){
				refreshPage();
				waitTime(2);
			}
			catch(Exception e){

			}
		}
		return currentpage.trim();
	}

	public void closeAlertWindow(){
		try{
			if(isAlertWindowPresent()) alertOk();
		}catch(Exception e){}
	}

	public void switchToWindowUsingWindowHandle(String windowHandle){
		try{
			driver.switchTo().window(windowHandle);
		}catch(Exception e){
			testStepFailed("Failure Description: "+e);
		}
	}
	//	
	//	public void removeAllAddressDetailInAddressBook()
	//	{
	//		List<WebElement> removeLink=driver.findElements(By.xpath("//div[contains(@id,'acct-right')]"));
	//		if(removeLink.size()>0)
	//		{
	//			for(int i=removeLink.size();i>0;i--)
	//			{
	//				clickOn("Delete Saved Item link#xpath=//a[contains(text(),'Delete')]");
	//
	//
	//			}
	//		}
	//	}
	public boolean onMouseOverSafari(WebElement element)
	{
		boolean result = false;
		try
		{
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject){ arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(mouseOverScript, element);
			result = true;
		}catch (Exception e)
		{
			testStepFailed("Exception occured :"+e);
			result = false;
		}
		return result;
	}

	public void clickOnMensWearhouseLogo(){
		try{
			waitTime(3);
			waitForElement(img_MensWearLogo);
			clickOn(img_MensWearLogo);		
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
	}
	public void clickOnMensWearhouseHomeLogo(){
		try{
			waitTime(3);
			waitForElement(home_MenswearLogo);
			clickOn(home_MenswearLogo);		
		}
		catch(Exception e){
			testStepFailed(e.toString());
		}
	}

	public boolean switchToSpecificWindow(String window){
		boolean flag=false;
		Set<String> windows=driver.getWindowHandles();
		if(windows.size()>1){
			for(String win : windows){
				driver.switchTo().window(win);
				if(driver.getTitle().trim().equalsIgnoreCase(window)){
					testStepPassed("Successfully switched to "+window+" window");
					flag=true;
					break;
				}
			}
			/*if(flag==false){
				testStepFailed(window+" window is not available to switch");
			}*/
		}else{
			testStepFailed(window+" window is not available to switch");
		}
		return flag;
	}

	public void mouseMoveToMiniCart(){
		mouseOver("Mini cart button#xpath="+miniCartXpath);
	}

	public void clickOnMiniCartButton(){
		try{
			if(driver.findElement(By.xpath(miniCartXpath)).isDisplayed()){
				clickOn("Mini cart button#xpath="+miniCartXpath);
			}else{
				testStepFailed("Mini Cart Button is not Displayed");
			}
		}catch(Exception e){
			testStepFailed("Mini Cart Button Functionality Failed : "+e);
		}
	}

	public void waitForCheckoutPopupToAppearAndDisappear(){
		try{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'added-items')]")));
			WebDriverWait wait2=new WebDriverWait(driver,implicitlyWaitTime);
			wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'added-items')]")));
		}catch(Exception e){

		}
	}
	public void clickOnMensWearhouseLogoInCheckOutPage(){
		clickOn(img_CheckOutPage_MensWearLogo);		
	}





	public String getLastBeforeCurrentPageFromBreadCrumb(){
		String breadcrum=null;
		try{
			List<WebElement> ele=driver.findElements(By.xpath("//a[contains(@id,'WC_BreadCrumb_Link')]"));
			breadcrum=ele.get(ele.size()-1).getText().trim();
		}catch(Exception e){

		}
		return breadcrum;
	}

	public String getCurrentPageFromBreadCrumb(){
		String currentpage = null;
		try{
			currentpage=getText("Breadcrum current page#xpath=//span[contains(@class,'breadcrumb-item current-page')]").split(":")[1];
		}catch(Exception e){

		}
		return currentpage.trim();
	}
	public void waitForLoadingAndDissappearMWLoadingImg_New(){
		try{
			WebDriverWait wait=new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'Loading')]")));
			WebDriverWait wait2=new WebDriverWait(driver,5);
			wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[contains(@alt,'Loading')]")));
		}catch(Exception e){

		}finally{
			driver.manage().timeouts().implicitlyWait(implicitlyWaitTime, TimeUnit.SECONDS);
		}

	}


	public String CheckSubCategoryName(String SubCategoryName){
		if (SubCategoryName.contains("Levis") || SubCategoryName.contains("Levi's")) {
			SubCategoryName = SubCategoryName.substring(0, SubCategoryName.lastIndexOf("i"));
			//testStepPassed("FinalSubCategoryLinkName : "+SubCategoryName);
		}
		else if (SubCategoryName.contains("Mens")) {
			SubCategoryName = SubCategoryName.substring(0, SubCategoryName.lastIndexOf("s"));
		}

		else if (SubCategoryName.contains("'")) {
			SubCategoryName = StringUtils.substringBefore(SubCategoryName, "'");
		}

		return SubCategoryName;
	}

	public String CheckSubCategoryNameforapostrophe(String SubCategoryName){
		if (SubCategoryName.contains("'")) {
			String FinalSubCategoryLinkName = SubCategoryName.substring(0, SubCategoryName.lastIndexOf("i"));
			System.out.println(FinalSubCategoryLinkName);
		}
		return SubCategoryName;
	}



	public boolean verifyApplicationLogoisDisplayed(){
		boolean flag = false;
		waitTime(2);
		if (driver.findElement(By.xpath("//section[contains(@class,'logo-bar')]//a//i")).isDisplayed()) {
			testStepPassed("Application Logo is displayed");
			flag =true;
		}
		return flag;
	}




	String CertonaGuidedShoppingTitle;


	/*public void verifyandgetCertonaGuidedShoppingTitle(){
		try
		{
			if (driver.findElement(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__title')]//span")).isDisplayed()) {
				System.out.println("Title is displayed");

			}
			else {

			}

		}
		catch(Exception e)
		{
			testStepWarning("Title is not dis[played");
		}

	}*/

	public String getCertonaGuidedShoppingTitle(){
		try{
			waitTime(3);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__title')]")).isDisplayed()) 
			{
				CertonaGuidedShoppingTitle = driver.findElement(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__title')]//span")).getText();
				//System.out.println("CertonaGuidedShoppingTitle : "+CertonaGuidedShoppingTitle);
			}
		}
		catch(Exception e)
		{
			testStepWarning("Warning : Guided Shopping Widget Title is not displayed");
		}
		return CertonaGuidedShoppingTitle;
	}


	int CertonaGuidedShoppingProductsCount;


	public int getCertonaGuidedShoppingProductsCount(){
		try
		{
			waitTime(2);

			if (driver.findElement(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__products')]/div")).isDisplayed()) 
			{
				List<WebElement> CertonaGuidedShoppingProducts = driver.findElements(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__products')]/div"));

				CertonaGuidedShoppingProductsCount = CertonaGuidedShoppingProducts.size();

				testStepPassed("Guided Shopping Products Count : "+CertonaGuidedShoppingProductsCount);
			}
		}
		catch(Exception e)
		{
			testStepWarning("Warning : Guided Shopping Widget Products are not displayed");
		}
		return CertonaGuidedShoppingProductsCount;

	}




	public void NavigatetoURL(String Url){
		driver.get(Url);		
	}


	
	
	public void clickPDPAddtoShoppingBagButton(){
		try{
			//waitTime(2);
			if (driver.findElement(By.xpath("//div[contains(@class,'js-pfinder-widget pfinder-widget-holder')]//section[contains(@class,'pfinder-widget certona-widget__horizontal')]//div[contains(@class,'pfinder-widget__title')]//span")).isDisplayed()) {
				System.out.println("Check");
			} 

		}catch(Exception e){
			testStepInfo("Add to Shopping Button is not found");
		}
	}
	

	
	
	public static int getResponseCode(String urlString) throws MalformedURLException, IOException{
	    URL url = new URL(urlString);
	    HttpURLConnection huc = (HttpURLConnection)url.openConnection();
	    huc.setRequestMethod("GET");
	    huc.connect();
	    System.out.println("Code : "+huc.getResponseCode());
	    return huc.getResponseCode();
	}

	
	
	
	
	
	
	
	
	
}
