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

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

boolean choosemaincorrespondingsite = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'), 
    FailureHandling.OPTIONAL)

if (choosemaincorrespondingsite == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Select main site Type in Simple Add TC1-1'))
}

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), 'داخلية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1_2'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/body_                                      _35f8cc'))

not_run: WebUI.scrollToElement(findTestObject('Test suite Simple Add/TC4/Page_/Page_/Sub Area'), 60)

not_run: WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/Sub Area'), 'ت')

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/name of sub area'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar_1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/button__1'))

WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC4/Page_/Page_/button__1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span__1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/click at book before click 3 points'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/3 points in prepare'))

boolean adddocumentfromprepare = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC4/Page_/Page_/button__1_2'), 
    FailureHandling.OPTIONAL)

if (adddocumentfromprepare == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/button__1_2'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Add Document from PrepareTC4-1'))
}

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span__1_2'), FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-icon_1_2'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

boolean savedocumentprepare = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-icon_en_action-green_1'), 
    FailureHandling.OPTIONAL)

if (savedocumentprepare == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-icon_en_action-green_1'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/save documentin prepare'))
}

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/click review'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/3points in review'))

boolean exportfromreviewqueue = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC4/Page_/Page_/choose export from 3 points in review'), 
    FailureHandling.OPTIONAL)

if (exportfromreviewqueue == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/choose export from 3 points in review'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Export from Review TC4-1'))
}

Thread.sleep(7000)

not_run: WebUI.closeBrowser()

