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

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC3/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

boolean choosemaincorrespondingsite = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'), 
    FailureHandling.OPTIONAL)

if (choosemaincorrespondingsite == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Select main site Type in Simple Add TC1-1'))
}

boolean setcorrespondingvalue = WebUI.verifyElementVisible(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), 
    FailureHandling.OPTIONAL)

if (setcorrespondingvalue == true) {
    WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), GlobalVariable.Internal_Corresponding_Site_Type)
} else {
    WebUI.setText(findTestObject('Full Entry/Auto Button that change in Full Entry/set corresponding value TC1-1'), GlobalVariable.Internal_Corresponding_Site_Type)
}

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'مكتب الوزير')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_  - Template Employment Ad'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ (2)'))

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC2/Page_/md-backdrop__md-menu-backdrop md-click-catcher'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/span_    Test1811-1'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Add attachement'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/close uploade attached popup'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5'))

WebUI.setText(findTestObject('Test suite Simple Add/TC2/Page_/input_ _docSubject'), 'test')

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5_6'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/checkbox for search'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/div__md-container md-ink-ripple'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button__1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2_3_4_5'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/td_  3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC8/No Button'))

WebUI.click(findTestObject('Test suite Simple Add/TC8/Book Excecution'))

boolean clickatapproveandExportbuttonfromactions = WebUI.verifyElementClickable(findTestObject('Full Entry/TC12/approve and Export from Actions'), 
    FailureHandling.OPTIONAL)

if (clickatapproveandExportbuttonfromactions == true) {
    WebUI.click(findTestObject('Full Entry/TC10/launch from actions'))
} else if (clickatapproveandExportbuttonfromactions == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/approve and export from actions TC12-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/approve and export from actions TC12-2'))
}

WebUI.click(findTestObject('Full Entry/TC10/excute'))

WebUI.doubleClick(findTestObject('Full Entry/TC12/double click at export popup'), FailureHandling.OPTIONAL)

boolean ExportButton = WebUI.verifyElementClickable(findTestObject('Full Entry/TC12/click at export button'), FailureHandling.OPTIONAL)

if (ExportButton2 == true) {
    WebUI.click(findTestObject('Full Entry/TC12/click at export button'))
} else if (ExportButton2 == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/click at export button TC-12-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/click at export button TC-12-2'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/wared electronic'))

WebUI.delay(5)

WebUI.check(findTestObject('Workflow Action/Electronic/TC9/checkbox 1st document'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/quick recieve bulk'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/double click at popup for quick recieve bulk'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/yes quick receive bulk'))

WebUI.delay(2)

boolean chooseApproveAction = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC3/Page_/Page_/approve clickk'), 
    FailureHandling.OPTIONAL)

if (chooseApproveAction == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/approve clickk'))
} else if (chooseApproveAction == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Choose Action for launch dropdown list TC10-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Choose Action for launch dropdown list TC10-2'))
}

boolean plusclickforApprove = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_1_2_3_4_5_6_7'), 
    FailureHandling.OPTIONAL)

if (plusclickforApprove == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_1_2_3_4_5_6_7'))
} else if (plusclickforApprove == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/click at plus for approve TC10-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/click at plus for approve TC10-2'))
}

boolean sendbuttonclick = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8_9_10'), 
    FailureHandling.OPTIONAL)

if (sendbuttonclick == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8_9_10'))
} else if (sendbuttonclick == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Send document button TC10-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Send document button TC10-2'))
}

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3_4'))

//not_run: WebUI.rightClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/a_Test1911-1'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_ (1)'))
WebUI.delay(4)

