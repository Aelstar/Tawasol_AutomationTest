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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://eblaepm.no-ip.org:9080/ui/#/login/entity/motc')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_username'), 'ahmed1')

WebUI.setEncryptedText(findTestObject('Test suite Simple Add/TC5/Page_/input_English_password'), 'x8YlipdcAoUuB2dag9h+Rg==')

WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_'))

WebUI.delay(5)

boolean en = WebUI.verifyElementPresent(findTestObject('Test suite Simple Add/TC6/en language'), 10)

if (en == true) {
    println('English language to Displayed')

    WebUI.click(findTestObject('Test suite Simple Add/TC6/en language'))

    WebUI.click(findTestObject('Test suite Simple Add/TC6/Ar language'))
} else {
    println('Arabic language to Displayed')
}

boolean sidebar = WebUI.verifyElementNotChecked(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'), 2)

if (sidebar == true) {
    //	WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))
    //	WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))
    println('sidebar enabled')
} else {
    WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))
}

//WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon'))
not_run: WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/md-icon_1'))

not_run: WebUI.click(findTestObject('Test suite Simple Add/TC5/Page_/button_ (1)'))

WebUI.delay(5)

