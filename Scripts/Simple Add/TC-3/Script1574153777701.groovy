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

not_run: WebUI.callTestCase(findTestCase('Shared T.Cs/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC3/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC3/Page_/Page_/input_concat(id(  input_279  ))_input_279'), 'داخلية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/body_                                      _35f8cc'))

not_run: WebUI.scrollToElement(findTestObject('Test suite Simple Add/TC3/Page_/Page_/Sub Area'), 60)

not_run: WebUI.setText(findTestObject('Test suite Simple Add/TC3/Page_/Page_/Sub Area'), 'ت')

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/name of sub area'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/NEW Document confirmation button'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/div_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_  - Template Employment Ad'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8_9'))
WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8'))
WebUI.doubleClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/td_  3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_1_2_3_4_5_6'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_en_action-green'))
WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e58203'))

WebUI.delay(2)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/approve clickk'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/check mail sent'))

//not_run: WebUI.rightClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/a_Test1911-1'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_ (1)'))
WebUI.delay(3)

Thread.sleep(5000)

not_run: WebUI.closeBrowser()

