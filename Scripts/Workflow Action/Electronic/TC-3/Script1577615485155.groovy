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

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/span_'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/span_ _1'))

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/textarea_ _docSubject'), GlobalVariable.Book_Name)

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/md-select_                                 _e3d27d'))

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_concat(id(  input_268  ))_input_268'), GlobalVariable.Internal_Corresponding_Site_Type)

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/body_                                      _35f8cc'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Test suite Simple Add/TC1/Page_/input_   _input-273'), 'مكتب الوزير')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/span_ (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_ _1'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/button_  - Template Employment Ad'))

WebUI.delay(3)

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

WebUI.delay(3)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/document action'))

WebUI.delay(3)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/approve and export'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Excecution button'))

WebUI.delay(5)

not_run: WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC4/signiture box'))

not_run: WebUI.click(findTestObject('Workflow Action/Electronic/TC4/select signiture'))

not_run: WebUI.click(findTestObject('Workflow Action/Electronic/TC4/approve buton for signiture box'))

not_run: WebUI.delay(3)

WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC4/double click at export box popup'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/export button'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/wared electronic'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/estelam saree3'))

WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC4/double click at estlam saree3 popup'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/yes button for estelam sare3'))

WebUI.delay(2)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/users you want send'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/choose egraaa'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/egraaaaaaa elmostahdeth'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/plus egraaaaaaaa elmostaheth'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/send book for egraaaaaa'))

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

