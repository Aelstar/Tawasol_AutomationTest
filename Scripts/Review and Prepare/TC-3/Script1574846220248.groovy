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

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ (1)'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-thumb md-ink-ripple'))

WebUI.setText(findTestObject('Test suite Review and Prepare/Normal Add/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Corresponding sites click'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1_2'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button_'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1_2_3'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button_  - Template Employment Ad'))

WebUI.delay(10)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3_4'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3_4_5'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span__1'))

WebUI.uploadFile(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-backdrop__md-menu-backdrop md-click-catcher'), 
    'C:\\Ahmed\\EBLA\\EBLA Test.png')

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/Normal Add/Page_/click for attached activated'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button__1_2'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3_4_5_6'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button__1_2_3'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/stop at search box header'))

WebUI.setText(findTestObject('Test suite Review and Prepare/Normal Add/Page_/input_ _docSubject'), 'test')

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button__1_2_3_4'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div__md-container md-ink-ripple'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button__1_2_3_4_5'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/close linked books box'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Save button'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/Normal Add/Page_/double click for save button alert'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/No save button alert'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/review books queue'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/3 points in prepare'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/Accept and start sending book'))

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

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/inbox user'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/inbox show'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book in inbox'))

WebUI.delay(4)

WebUI.click(findTestObject('Test suite Review and Prepare/TC3/Open book'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/header of book'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/TC3/double click at prevouis comment'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/button_'))

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/button_ (1)'))

WebUI.delay(8)

WebUI.click(findTestObject('Test suite Simple Add/TC10/Page_/Approve from out'))

WebUI.delay(15)

not_run: WebUI.closeBrowser()

