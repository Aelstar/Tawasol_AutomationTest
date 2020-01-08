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

not_run: WebUI.callTestCase(findTestCase('Shared T.Cs/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/input_concat(id(  input_279  ))_input_279'), 'حكومية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(2)

WebUI.click(findTestObject('Test suite Simple Add/TC6/main area'))

WebUI.setText(findTestObject('Test suite Simple Add/TC6/search main area'), 'ربط')

WebUI.click(findTestObject('Test suite Simple Add/TC6/rabt main area'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC6/save and print barcode'))

WebUI.delay(7)

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC6/print barcodddd'))

WebUI.click(findTestObject('Test suite Simple Add/TC6/close barcodddd'))

WebUI.verifyElementNotClickable(findTestObject('Test suite Simple Add/TC6/print barcodddd'))

not_run: WebUI.closeBrowser()

