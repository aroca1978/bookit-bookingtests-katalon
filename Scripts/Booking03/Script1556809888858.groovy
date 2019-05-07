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

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.ConditionType




WebUI.openBrowser('https://bookit-qa6.com')

WebUI.click(findTestObject('homepage/flight_checkbox'))

WebUI.setText(findTestObject('homepage/city_or_airport'), 'cheese')

WebUI.delay(1)

WebUI.click(findTestObject('homepage/div_Cheese City IL US'))

//WebUI.delay(1)

checkinId = WebUI.getAttribute(findTestObject('homepage/checkin_date'), 'id')

checkoutId = WebUI.getAttribute(findTestObject('homepage/checkout_date'), 'id')

String iniDate = (((moIni + '/') + dayIni) + '/') + yrIni

String myIniDate = ((('$(\'#' + checkinId) + '\').val(\'') + iniDate) + '\')'

// WebUI.executeJavaScript(myIniDate, null)
String endDate = (((moEnd + '/') + dayEnd) + '/') + yrEnd

String myEndDate = ((('$(\'#' + checkoutId) + '\').val(\'') + endDate) + '\')'

String strMoIni = CustomKeywords.'bookitKeywords.commonFunctions.getMonthName'(moIni)

String strMoEnd = CustomKeywords.'bookitKeywords.commonFunctions.getMonthName'(moEnd)

int dIni = Integer.parseInt(dayIni)
int dEnd = Integer.parseInt(dayEnd)

println(dIni)
println(dEnd)
// CHECKIN DATE

WebUI.click(findTestObject('homepage/checkin_date'))

WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('homepage/sel_date_month1'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	//WebUI.takeScreenshot('Screenshots/seldate.png')
	
	if (WebUI.waitForElementClickable(findTestObject('homepage/sel_date_month1'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.click(findTestObject('homepage/sel_date_month1'), FailureHandling.CONTINUE_ON_FAILURE)
	    if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/sel_date_month1'), strMoIni, false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			WebUI.selectOptionByLabel(findTestObject('homepage/sel_date_month1'), strMoIni, false, FailureHandling.CONTINUE_ON_FAILURE)
			sleep(200)
			//WebUI.delay(1)
		}	
	}
}
if (WebUI.verifyElementPresent(findTestObject('homepage/sel_date_year1'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	//WebUI.takeScreenshot('Screenshots/seldate.png')
	if (WebUI.waitForElementClickable(findTestObject('homepage/sel_date_year1'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.click(findTestObject('homepage/sel_date_year1'), FailureHandling.CONTINUE_ON_FAILURE)
	
		if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/sel_date_year1'), yrIni, false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			WebUI.selectOptionByLabel(findTestObject('homepage/sel_date_year1'), yrIni, false, FailureHandling.CONTINUE_ON_FAILURE)
			sleep(200)
			//WebUI.delay(1)
		}
	
	}
}

String dynxpath = "//div[contains(@class, 'pika-single') and contains(@class, 'is-bound') and not(contains(@class, 'is-hidden'))]/div[@class='pika-lendar'][1]/table[@class='pika-table']/tbody/tr/td/button[count(. | //*[@type = 'button' and @data-pika-day = '" + dIni + "']) = count(//*[@type = 'button' and @data-pika-day = '" + dIni + "'])]"

TestObject to = new TestObject("eldia")
to.addProperty("xpath", ConditionType.EQUALS, dynxpath)
WebUI.click(to)
//WebUI.delay(1)


// CHECKOUT DATE

WebUI.click(findTestObject('homepage/checkout_date'))
WebUI.delay(1)

if (WebUI.verifyElementPresent(findTestObject('homepage/sel_date_month2'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	//WebUI.takeScreenshot('Screenshots/seldate.png')
	
	if (WebUI.waitForElementClickable(findTestObject('homepage/sel_date_month2'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.click(findTestObject('homepage/sel_date_month2'), FailureHandling.CONTINUE_ON_FAILURE)
		if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/sel_date_month2'), strMoEnd, false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			WebUI.selectOptionByLabel(findTestObject('homepage/sel_date_month2'), strMoEnd, false, FailureHandling.CONTINUE_ON_FAILURE)
			sleep(500)
			//WebUI.delay(1)
		}
	}
}
if (WebUI.verifyElementPresent(findTestObject('homepage/sel_date_year2'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
	//WebUI.takeScreenshot('Screenshots/seldate.png')
	if (WebUI.waitForElementClickable(findTestObject('homepage/sel_date_year2'), 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		WebUI.click(findTestObject('homepage/sel_date_year2'), FailureHandling.CONTINUE_ON_FAILURE)
	
		if (WebUI.verifyOptionPresentByLabel(findTestObject('homepage/sel_date_year2'), yrEnd, false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			WebUI.selectOptionByLabel(findTestObject('homepage/sel_date_year2'), yrEnd, false, FailureHandling.CONTINUE_ON_FAILURE)
			sleep(500)
			//WebUI.delay(1)
		}
	
	}
}

String dynxpath2 = "//div[contains(@class, 'pika-single') and contains(@class, 'is-bound') and not(contains(@class, 'is-hidden'))]/div[@class='pika-lendar'][1]/table[@class='pika-table']/tbody/tr/td/button[count(. | //*[@type = 'button' and @data-pika-day = '" + dEnd + "']) = count(//*[@type = 'button' and @data-pika-day = '" + dEnd + "'])]"

TestObject to2 = new TestObject("eldia2")
to2.addProperty("xpath", ConditionType.EQUALS, dynxpath2)
WebUI.click(to2)
//

// ROOMS
//WebUI.click(findTestObject('homepage/select_rooms'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.selectOptionByValue(findTestObject('homepage/select_rooms'), numRooms, false, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(1)
def tadults = adults.split(",")
def tchildren = children.split(",")
def tchildages = childrenages.split(",")
int tnumrooms = Integer.parseInt(numRooms)
int curchild = 0;

//println(tnumrooms)
//println(tadults)

for (int i=1; i<=tnumrooms; i++) {
	TestObject na = new TestObject("seladults")
	TestObject nc = new TestObject("selchildren")
	String nadynxpath
	String ncdynxpath
	String cadynxpath
	if (tnumrooms > 1) {
		nadynxpath = "//div[not(contains(@class, 'hidden-multi-room'))]/div/select[@name='ap" + i + "']"
		ncdynxpath = "//div[not(contains(@class, 'hidden-multi-room'))]/div/select[@name='mp" + i + "']"
	} else {
		nadynxpath = "//div[contains(@class, 'hidden-multi-room')]/div/select[@name='ap" + i + "']"
		ncdynxpath = "//div[contains(@class, 'hidden-multi-room')]/div/select[@name='mp" + i + "']"
	}
	//println(nadynxpath)
	//println(ncdynxpath)
	//println("\n" + i + "\n")
	na.addProperty("xpath", ConditionType.EQUALS, nadynxpath)
	nc.addProperty("xpath", ConditionType.EQUALS, ncdynxpath)
	
	if (WebUI.verifyElementPresent(na, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		//println("\nI'm here\n")
		WebUI.click(na)
		
		if (WebUI.verifyOptionPresentByValue(na, tadults[i-1], false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			//println("Now I am here")
			WebUI.selectOptionByValue(na, tadults[i-1], false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
	if (WebUI.verifyElementPresent(nc, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
		//println("\nI'm here children\n")
		WebUI.click(nc)
		
		if (WebUI.verifyOptionPresentByValue(nc, tchildren[i-1], false, 1, FailureHandling.CONTINUE_ON_FAILURE)) {
			//println("Now I am here children")
			WebUI.selectOptionByValue(nc, tchildren[i-1], false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}
	for (int j =1; j <= Integer.parseInt(tchildren[i-1]); j++) {
		
		if (tnumrooms == 1) {
			if (j == 1) {
				nadynxpath = "//div[not(contains(@class, 'hidden-xs'))]/div/div[not(contains(@class, 'hidden-xs')) and (not(contains(@class, 'visible-xs')))]/div/select[@name='ar1m1']"
			} else {
				nadynxpath = "//div[not(contains(@class, 'form-group'))]/div/div[not(contains(@class, 'hidden-xs')) and (not(contains(@class, 'visible-xs')))]/div/select[@name='ar1m" + j + "']"
			}
		} else {
			if (j == 1) {
				nadynxpath = "//div[contains(@class, 'hidden-xs')]/div/select[@name='ar" + i + "m1']"
			} else {
				nadynxpath = "//div[contains(@class, 'form-group')]/div/div[not(contains(@class, 'hidden-xs'))]/div/select[@name='ar" + i + "m" + j + "']"
			}
		}
		println("Room: " + i + ", child: " + j + ", age: " + tchildages[curchild])
		println("nadynxpath: " + nadynxpath)
		
		curchild++
	}
	
	
}





WebUI.click(findTestObject('homepage/button_Search'))
WebUI.waitForPageLoad(10)
WebUI.delay(5)
WebUI.closeBrowser()

