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

//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon_1'))
//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_ (1)'))
WebUI.delay(1)

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar_1'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), 'داخلية')

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

WebUI.click(findTestObject('Test suite Simple Add/TC9/Yes Save buttton'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-select_                                 _e58203'))

WebUI.delay(2)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/approve clickk'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/md-icon_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC3/Choose comment when you sending'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC3/Add your new Comment'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/TC3/double click at comments pop up'))

WebUI.setText(findTestObject('Test suite Review and Prepare/TC3/Small Comment'), 'Automation Test')

WebUI.setText(findTestObject('Test suite Review and Prepare/TC3/Large Comment'), 'Automation Test 12345678910 TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT BY Automationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn')

WebUI.click(findTestObject('Test suite Review and Prepare/TC3/Save Comment'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button__1_2_3_4_5_6_7_8_9_10'))

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

WebUI.closeBrowser()

