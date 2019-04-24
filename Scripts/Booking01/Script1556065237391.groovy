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

WebUI.delay(3)

WebUI.click(findTestObject('homepage/flight_checkbox'))

WebUI.delay(3)

WebUI.setText(findTestObject('homepage/city_or_airport'), 'cheese')

WebUI.delay(3)

WebUI.click(findTestObject('homepage/div_Cheese City IL US'))

WebUI.delay(1)

checkinId = WebUI.getAttribute(findTestObject('homepage/checkin_date'), 'id')

checkoutId = WebUI.getAttribute(findTestObject('homepage/checkout_date'), 'id')

String iniDate = (((moIni + '/') + dayIni) + '/') + yrIni

String myIniDate = ((('$(\'#' + checkinId) + '\').val(\'') + iniDate) + '\')'

WebUI.executeJavaScript(myIniDate, null)

String endDate = (((moEnd + '/') + dayEnd) + '/') + yrEnd

String myEndDate = ((('$(\'#' + checkoutId) + '\').val(\'') + endDate) + '\')'

WebUI.executeJavaScript(myEndDate, null)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('homepage/button_Search'))

String redirUrl = ((((((((((('https://results.bookit-qa6.com/hotels.php?ap1=2&fd=' + yrIni) + '-') + moIni) + '-') + dayIni) + 
'&mp1=0&pt=h&rm=1&td=') + yrEnd) + '-') + moEnd) + '-') + dayEnd) + '&tripType=hotel&hotelTo=Cheese%20City%2C%20IL%2C%20US&tl=CMI&areaId=1703&fromLocation=Panama%20City%2C%20FL%2C%20US%20(ECP)&fl=ECP'

WebUI.navigateToUrl(redirUrl)

WebUI.waitForPageLoad(5)

WebUI.closeBrowser()

