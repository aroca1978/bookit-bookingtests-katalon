package bookitKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class commonFunctions {
	@Keyword
	def getMonthName(String theMonth) {
		String treturn = '';
		switch(theMonth) {
			case '01':
				treturn = 'January'
				break
			case '02':
				treturn = 'February'
				break
			case '03':
				treturn = 'March'
				break
			case '04':
				treturn = 'April'
				break
			case '05':
				treturn = 'May'
				break
			case '06':
				treturn = 'June'
				break
			case '07':
				treturn = 'July'
				break
			case '08':
				treturn = 'August'
				break
			case '09':
				treturn = 'September'
				break
			case '10':
				treturn = 'October'
				break
			case '11':
				treturn = 'November'
				break
			case '12':
				treturn = 'December'
				break
		}
		return treturn
	}
}
