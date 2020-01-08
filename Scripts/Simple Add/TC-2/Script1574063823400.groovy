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

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/input_concat(id(  input_279  ))_input_279'), 'داخلية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ _1_2'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/body_                                      _35f8cc'))

not_run: WebUI.scrollToElement(findTestObject('Test suite Simple Add/TC2/Page_/Sub Area'), 60)

not_run: WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/Sub Area'), 'ت')

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/name of sub area'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_  - Template Employment Ad'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ (2)'))

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC2/Page_/md-backdrop__md-menu-backdrop md-click-catcher'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

//WebUI.uploadFile(findTestObject('Upload File'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')
//
//
//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')
//
//
//WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)
WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/span_    Test1811-1'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2_3'))

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/Double click for ensure delete'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ (2)'))

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC2/Page_/md-backdrop__md-menu-backdrop md-click-catcher_1'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/span_    Test1811-1'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button_1_2_3_edit'))

WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/input_ _documentTitle'), 'مرفق1')

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5'))

WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/input_ _docSubject'), 'test')

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5_6'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/checkbox for search'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/div__md-container md-ink-ripple'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2_3_4_5'))

//WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/linked books double click'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/Close linked books button'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button__1_2'))

Thread.sleep(5000)

not_run: WebUI.closeBrowser()

