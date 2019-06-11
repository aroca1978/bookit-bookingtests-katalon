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


String propName = 'Cheese BK-' + ticketNumber + ' Resort'
String propId = 'CHBK' + ticketNumber + ''

WebUI.openBrowser('')

WebUI.navigateToUrl('https://extranet.bookit-qa6.com/')

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Username_userName'), 'kayla.tuttle')

WebUI.setEncryptedText(findTestObject('Object Repository/extranet_create_property/input_Password_userPassword'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_Password_button'))

WebUI.navigateToUrl('https://extranet.bookit-qa6.com/modify_property.php')

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_or_hotelDisplayName'), 'cheese base property')

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_or_text'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/span_Please select a hotel from the list'))

WebUI.waitForElementVisible(findTestObject('extranet_create_property/li_Cheese Base Property  Cheese Base Property (ChampaignUrbana Illinois US) - (Rate Codes Rate Codes)'), 
    10)

WebUI.click(findTestObject('Object Repository/extranet_create_property/li_Cheese Base Property  Cheese Base Property (ChampaignUrbana Illinois US) - (Rate Codes Rate Codes)'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/button_Duplicate'))

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Hotel ID_hotelId'), propId)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Hotel Name_hotelName1'), propName)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Page Title_title'), propName)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Meta Keywords_metaKeywords'), propName)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Meta Description_metaDescription'), propName)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Hotel Display Name_hotelDisplayName'), propName)

WebUI.setText(findTestObject('Object Repository/extranet_create_property/input_Hotel Marketing Snipe_hotelMarketingSnipe'), 
    'CHBK')

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_Hotel Connections_add-connection'))

WebUI.selectOptionByValue(findTestObject('Object Repository/extranet_create_property/select_EANHBSI ReplicativeHBSI TransactionalHiltonHyattOutriggerRate CodesSynxisTouricoTourico Opaque'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/extranet_create_property/select_EANHBSI ReplicativeHBSI TransactionalHiltonHyattOutriggerRate CodesSynxisTouricoTourico Opaque'), 
    '12', true)

WebUI.click(findTestObject('Object Repository/extranet_create_property/input'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_YesNo_applyFeeDisplay385'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_YesNo_applyFeeDisplayMobile385'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_YesNo_applyFeeDisplayTablet385'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_YesNo_metaPartnerDiscount385'))

WebUI.click(findTestObject('Object Repository/extranet_create_property/input_Available Themes_themes1'))

WebUI.click(findTestObject('extranet_create_property/submit_duplicate_property_button'))


WebUI.closeBrowser()

