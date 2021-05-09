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

boolean choosecorrespondingsite = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1_2'), 
    FailureHandling.OPTIONAL)

if (choosecorrespondingsite == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1_2'))
} else if (choosecorrespondingsite == false) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/choose corresponding site TC1-1'))
} else {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/choose corresponding site TC1-2'))
}

boolean plusiconadd = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2'), 
    FailureHandling.OPTIONAL)

if (plusiconadd == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2'))
} else {
    WebUI.click(findTestObject('Workflow Action/Electronic/Auto Button that change in Work Floow/plus in advanced add correspondingsiteTC11-1'))
}

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

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/accordion of linked entites'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/add linked entite button'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/company added linked entity'))

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/company name added entity'), 'Ahmed')

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/company id entity linked'), '134679')

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/company phone entity linked'), '01122334455')

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/Company add to save added data'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/accordion of linked entites'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/occordion of comments'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/comments button'))

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/short comment'), 'Automation')

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/large comment'), 'Automation Test')

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/add comment button'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/occordion of comments'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/occordion of tags'))

WebUI.sendKeys(findTestObject('Workflow Action/Electronic/TC11/add tag name'), Keys.chord('Ahmed', Keys.ENTER))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/occordion of tags'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Save button'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/Normal Add/Page_/double click for save button alert'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/No save button alert'))

WebUI.delay(3)

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/choose action after save'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/Approve select'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/Do selected action'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Department mail queue'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ready to Export queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.click(findTestObject('Test suite Simple Add/TC9/3points'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/t3del b3d el approve'))

WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC11/double click at t3del b3d el approve popup'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/yes t3del bed el approve popup'))

WebUI.delay(5)

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/edit book again after approved'))

WebUI.setText(findTestObject('Workflow Action/Electronic/TC11/edit book again after approved'), 'Book Edited after approve ')

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/Save again after edit approve'))

WebUI.doubleClick(findTestObject('Workflow Action/Electronic/TC12/double click at resave again td'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/No save button alert'))

WebUI.delay(3)

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/rechoose action again'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/ReApprove again'))

WebUI.click(findTestObject('Workflow Action/Electronic/TC11/Re do acton again'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Ready to Export queue'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Simple Add/TC9/Stop at book'))

WebUI.delay(5)

not_run: WebUI.closeBrowser()

