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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bookit-qa6.com/')

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Departing_ember532-fd'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Returning_ember532-td'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/test_homepage/span_Flight_tp-icon icon-checkbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Check In_ember532-fd'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Check Out_ember532-td'), '', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/test_homepage/input_Going to_ember584-input'), 'cheese', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/test_homepage/div_Cheese City IL US'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Check In_ember532-fd'), '05/13/2019', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/test_homepage/input_Check Out_ember532-td'), '05/16/2019', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/test_homepage/select_JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    '5', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/test_homepage/select_201920202021'), '2020', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

