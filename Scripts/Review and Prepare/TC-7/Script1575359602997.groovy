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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://eblaepm.no-ip.org:9080/ui/#/login/entity/motc')

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_username'), 'nr16')

not_run: WebUI.setEncryptedText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_password'), 'znlRn9TMc3s=')

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_'))

not_run: boolean en = WebUI.verifyElementPresent(findTestObject('Test suite Simple Add/TC6/en language'), 15)

not_run: if (en == true) {
    println('English language to Displayed')

    WebUI.click(findTestObject('Test suite Simple Add/TC6/en language'))

    WebUI.click(findTestObject('Test suite Simple Add/TC6/Ar language'))
} else {
    println('Arabic language to Displayed')
}

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))

//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon_1'))
//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_ (1)'))
WebUI.delay(3)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ (1)'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-bar'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-thumb md-ink-ripple'))

WebUI.setText(findTestObject('Test suite Review and Prepare/Normal Add/Page_/textarea_ _docSubject'), 'Test1012-22')

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

WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-bar'))

println(' cant add paper outgoing from Add')

WebUI.delay(5)

WebUI.closeBrowser()

