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

WebUI.callTestCase(findTestCase('Shared T.Cs/TC-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

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

// WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), GlobalVariable.Internal_Corresponding_Site_Type)
WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_  - Template Employment Ad'))

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

//WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/linked books double click'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/Close linked books button'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8'))
WebUI.doubleClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/td_  3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Yes Save buttton'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e58203'))

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

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/Add user from screen click at 3point'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/add after 3 points in user screen'))

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

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/check mail sent'))

//not_run: WebUI.rightClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/a_Test1911-1'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_ (1)'))
WebUI.delay(4)

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/a_Test2411-2'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/header of book'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/button_'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC8/edit from web'))

WebUI.delay(8)

not_run: WebUI.switchToFrame(findTestObject('Test suite Simple Add/TC10/Page_/iframe_ _iframe-main-document'), 0)

not_run: WebUI.setText(findTestObject('Test suite Simple Add/TC10/Page_/p_'), 'editedddd')

not_run: WebUI.switchToDefaultContent()

boolean Approveafteropendocument = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC10/Page_/Approve from out'), 
    FailureHandling.OPTIONAL)

if (Approveafteropendocument == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/Approve from out'))
} else if (Approveafteropendocument == false) {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Approve document after open TC10-1'))
} else {
    WebUI.click(findTestObject('Full Entry/Auto Button that change in Full Entry/Approve document after open TC10-2'))
}

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/p_'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/td_2019-11-24'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/p_ (1)'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/approve click'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/button_ (3)'))

WebUI.delay(15)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.delay(4)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ready to Export queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC8/edit after export'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC8/double click at edit after export popup'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC8/save for edit after export popup'))

WebUI.delay(8)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Save button'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/Normal Add/Page_/double click for save button alert'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Yes save button alert'))

WebUI.delay(2)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/users you want send'))

//not_run: WebUI.click(findTestObject('Workflow Action/Electronic/TC4/stop at send user'))
WebUI.click(findTestObject('Workflow Action/Electronic/TC4/choose egraaa'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC8/approve in send box popup'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/plus button for egraa'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/send butoon'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/check mail sent'))

//not_run: WebUI.rightClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/a_Test1911-1'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_ (1)'))
WebUI.delay(8)

not_run: WebUI.closeBrowser()

