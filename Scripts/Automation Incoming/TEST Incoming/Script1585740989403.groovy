import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Shared T.Cs/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

not_run: WebUI.navigateToUrl('http://eblaepm.no-ip.org:9080/ui/#/entity/motc/landing-page')

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_-  -'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_ _1'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span__1'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_ _1_2'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span__1_2'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span__1_2_3'))

WebUI.setText(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/textarea_ _docSubject'), 
    'Test Incoming-1')

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/span_ _1_2_3'))

WebUI.setText(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/input_concat(id(  input_28953  ))_input_28953'), 
    'داخلية')

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/body_                                      _35f8cc'))

WebUI.setText(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/input_   ENTER_input-28958'), 
    'تكنولوجيا')

WebUI.click(findTestObject('Object Repository/Automation Incoming/Test Incoming/All Queue in test incoming/Page_/li_'))

WebUI.acceptAlert()

WebUI.acceptAlert()

