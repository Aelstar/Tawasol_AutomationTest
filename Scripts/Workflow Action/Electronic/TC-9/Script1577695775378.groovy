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

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/wared electronic'))

WebUI.delay(5)

WebUI.check(findTestObject('Workflow Action/Electronic/TC9/checkbox 1st document'))

WebUI.check(findTestObject('Workflow Action/Electronic/TC9/checkbox 2nd document'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/quick recieve bulk'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/double click at popup for quick recieve bulk'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/yes quick receive bulk'))

WebUI.delay(2)

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/users you want send'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/choose egraaa'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/egraaaaaa el mostahdeth'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/plus egraaa el mostahdethhhh'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/send buutton in egraaaa elmostahdetjhhhh'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/span_ _1_2_3_4'))

WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/check mail sent'))

//not_run: WebUI.rightClick(findTestObject('Test suite Simple Add/TC3/Page_/Page_/a_Test1911-1'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_'))
//
//not_run: WebUI.click(findTestObject('Test suite Simple Add/TC3/Page_/Page_/p_ (1)'))
WebUI.delay(8)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC4/wared electronic'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/estlam saree3 mn 3 points in wared electronic'))

not_run: WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC9/double click at estlam sare3 pop up from 3points'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/No for quick recieve saree3'))

WebUI.delay(5)

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/bareed waredd'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC9/review queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC1/stop at book'))

WebUI.delay(8)

not_run: WebUI.closeBrowser()

