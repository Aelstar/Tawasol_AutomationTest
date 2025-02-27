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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://eblaepm.no-ip.org:9080/ui/#/login/entity/motc')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_username'), 'ahmed2')

WebUI.setEncryptedText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_password'), 'V35d/XPbheB4hLrWdRI8/A==')

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_'))

boolean en = WebUI.verifyElementPresent(findTestObject('Test suite Simple Add/TC6/en language'), 15)

if (en == true) {
    println('English language to Displayed')

    WebUI.click(findTestObject('Test suite Simple Add/TC6/en language'))

    WebUI.click(findTestObject('Test suite Simple Add/TC6/Ar language'))
} else {
    println('Arabic language to Displayed')
}

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))

//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon_1'))
//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_ (1)'))
WebUI.delay(3)

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

WebUI.setText(findTestObject('Test suite Simple Add/TC4/Page_/Page_/input_concat(id(  input_279  ))_input_279'), 'حكومية')

WebUI.click(findTestObject('Test suite Simple Add/TC1/Page_/internal department'))

WebUI.delay(2)

boolean choosemainsite = WebUI.verifyElementClickable(findTestObject('Test suite Simple Add/TC6/main area'), FailureHandling.OPTIONAL)

if (choosemainsite == true) {
    WebUI.click(findTestObject('Test suite Simple Add/TC6/main area'))
} else {
    WebUI.click(findTestObject('Test suite Simple Add/Auto Button that changing in Simple Add/Main Site Click for Main SiteTC6-1'))
}

WebUI.setText(findTestObject('Test suite Simple Add/TC6/search main area'), 'جهة تجربة ربط مستخدم')

WebUI.click(findTestObject('Test suite Simple Add/TC6/rabt main area'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Simple Add/TC4/Page_/Page_/div_ _md-bar'))

println(' cant add paper outgoing')

WebUI.delay(5)

WebUI.closeBrowser()

