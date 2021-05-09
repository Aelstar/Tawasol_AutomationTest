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

//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon_1'))
//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_ (1)'))
WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar_1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

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

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ _1_2'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'مكتب الوزير')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC8/Upload Document'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

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

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/No save button alert'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/review books queue'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/3 points in prepare'))

WebUI.click(findTestObject('Full Entry/TC4/reject paper from review'))

WebUI.doubleClick(findTestObject('Full Entry/TC3/double click at reject comment box'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Full Entry/TC3/comment for reject'), 'reject document')

WebUI.click(findTestObject('Full Entry/TC3/save comment'))

WebUI.delay(5)

WebUI.click(findTestObject('Full Entry/TC3/Reject Queue'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/3 points in prepare'))

WebUI.click(findTestObject('Full Entry/TC4/send to review queue from reject paper'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/review books queue'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/3 points in prepare'))

WebUI.click(findTestObject('Full Entry/TC4/accept paper and send from review queue'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e58203'))

WebUI.delay(2)

WebUI.click(findTestObject('Full Entry/TC4/egraa elmostahdeth paper'))

WebUI.click(findTestObject('Full Entry/TC4/plus icon for paper'))

WebUI.click(findTestObject('Full Entry/TC4/send document'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/inbox user'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/inbox show'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book in inbox'))

WebUI.delay(4)

WebUI.click(findTestObject('Test suite Review and Prepare/TC3/Open book'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/header of book'))

WebUI.delay(5)

WebUI.click(findTestObject('Full Entry/TC4/send to redy to export'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ready to Export queue'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Export click'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ensure from data'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Export Ensure'))

WebUI.delay(4)

WebUI.click(findTestObject('Test suite Simple Add/TC9/inbox electronic in department'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/inbox electronic department stop at selected book'))

WebUI.delay(8)

not_run: WebUI.closeBrowser()

