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

WebUI.callTestCase(findTestCase('Shared T.Cs/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/textarea_ _docSubject'), 'Test_1711-3')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), 'داخلية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ _1_2'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_  - Template Employment Ad'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button__1_2'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_  Test_1711'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e58203'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/div_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-icon_1_2'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button__1_2_3'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ _1_2_3'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ _1_2_3_4'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/a_Test_1711'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button__1_2_3_4'))
Thread.sleep(5000)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/review books queue'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

not_run: WebUI.closeBrowser()

