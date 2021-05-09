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

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

boolean choosemaincorrespondingsite = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'), 
    FailureHandling.OPTIONAL)

if (choosemaincorrespondingsite == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/md-select_                                 _e3d27d'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Select main site Type in Simple Add TC1-1'))
}

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/input_concat(id(  input_279  ))_input_279'), 'داخلية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'تكنولوجيا ')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

///////////////////////////////
WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/button_  - Template Employment Ad'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/md-icon_1_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC2/Page_/span_ (2)'))

WebUI.uploadFile(findTestObject('Test suite Simple Add/TC2/Page_/md-backdrop__md-menu-backdrop md-click-catcher'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC2/Page_/span_    Test1811-1'))

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

/////////////////////****************
WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added1'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 2'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 3'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 4'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 5'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 6'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 7'), FailureHandling.STOP_ON_FAILURE)

'/tbody[1]/tr[5]/td[4]/span\r\ntr[العمود]/ td[الصف]\r\nمعموله ل 27/11'
WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 8'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 9'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 10'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/added 11'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 100'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 101'))

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/Added 12'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/button_1_2save'))

//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8'))
WebUI.doubleClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/td_  3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Yes Save buttton'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e58203'))

WebUI.delay(5)

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
WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/a_Test2411-2'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/header of book'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/Approve from out'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ready to Export queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

boolean ExportIcon = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export from 3 points menu in ready to Export -1'), 
    FailureHandling.OPTIONAL)

if (ExportIcon == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export from 3 points menu in ready to Export -1'))
} else if (ExportIcon == false) {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export from 3 points menu in ready to Export -2'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export from 3 points menu in ready to Export -3'))
}

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC9/Ensure from data'))

boolean ExportButton = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export button -1'), 
    FailureHandling.OPTIONAL)

if (ExportButton == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export button -1'))
} else if (ExportButton == false) {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export button -2'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Auto Changes Buttons for TC 5,9,10 SimpleAdd/Export button -3'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Log out'))

WebUI.doubleClick(findTestObject('Test suite Simple Add/TC9/log out pop out'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/log out Yessss'))

WebUI.delay(8)

WebUI.navigateToUrl('http://eblaepm.no-ip.org:9080/ui/#/login/entity/motc')

WebUI.setText(findTestObject('Test suite Simple Add/TC9/log in again'), 'ahmed2')

WebUI.setEncryptedText(findTestObject('Test suite Simple Add/TC9/password log in again'), 'V35d/XPbheB4hLrWdRI8/A==')

WebUI.click(findTestObject('Test suite Simple Add/TC9/log in again button'))

WebUI.delay(8)

WebUI.click(findTestObject('Test suite Simple Add/TC9/department inbox'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/inbox electronic in department'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/inbox electronic department stop at selected book'))

WebUI.delay(10)

WebUI.closeBrowser()

