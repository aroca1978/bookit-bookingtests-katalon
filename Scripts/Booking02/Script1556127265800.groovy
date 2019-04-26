import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://bookit-qa6.com')

//WebUI.delay(2)
WebUI.click(findTestObject('homepage/flight_checkbox'))

/* WebUI.setText(findTestObject('homepage/city_or_airport'), 'cheese')

WebUI.delay(1)

WebUI.click(findTestObject('homepage/div_Cheese City IL US'))

WebUI.delay(1)
*/
checkinId = WebUI.getAttribute(findTestObject('homepage/checkin_date'), 'id')

checkoutId = WebUI.getAttribute(findTestObject('homepage/checkout_date'), 'id')

String iniDate = (((moIni + '/') + dayIni) + '/') + yrIni

String myIniDate = ((('$(\'#' + checkinId) + '\').val(\'') + iniDate) + '\')'

// WebUI.executeJavaScript(myIniDate, null)
String endDate = (((moEnd + '/') + dayEnd) + '/') + yrEnd

String myEndDate = ((('$(\'#' + checkoutId) + '\').val(\'') + endDate) + '\')'

String strMoIni = CustomKeywords.'bookitKeywords.commonFunctions.getMonthName'(moIni)

String strMoEnd = CustomKeywords.'bookitKeywords.commonFunctions.getMonthName'(moEnd)

//WebUI.executeJavaScript(myEndDate, null)
WebUI.click(findTestObject('homepage/checkin_date'))

WebUI.delay(1)


if (WebUI.verifyElementPresent(findTestObject('homepage/sel_date01'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	//WebUI.click(findTestObject('homepage/sel_date01'))
	if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/sel_date01'), strMoIni, false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.selectOptionByLabel(findTestObject('homepage/sel_date01'), strMoIni, false, FailureHandling.CONTINUE_ON_FAILURE)
	}
}

//if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/selmonth1'), strMoIni, false, 1)) {
//	WebUI.selectOptionByLabel(findTestObject('homepage/selmonth1'), strMoIni, false)
//}
not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('homepage/button_Search'))

WebUI.closeBrowser()

