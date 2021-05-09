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

WebUI.delay(1)

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ (1)'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/div_ _md-bar'))

WebUI.setText(findTestObject('Test suite Review and Prepare/Normal Add/Page_/textarea_ _docSubject'), 'Test212-2')

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/Corresponding sites click'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1'))

WebUI.delay(2)

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/governmet correspondings'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/Main correspondings'))

WebUI.setText(findTestObject('Test suite Review and Prepare/TC6/search main correspondings'), 'ربط')

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/rabt corresponding site'))

WebUI.delay(3)

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/plus corresponding'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/click at defalt button'))

WebUI.delay(5)

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/rechoose anathor correspond'))

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

boolean replusagain = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/TC6/re plus again for internal correspo'), 
    FailureHandling.OPTIONAL)

if (replusagain == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/TC6/re plus again for internal correspo'))
} else if (replusagain == false) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Re Plus add corrsponding site Review and prepare TC6-1'))
} else {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Re Plus add corrsponding site Review and prepare TC6-2'))
}

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/re default for internal correspo'))

boolean chossefollowaction = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button_ (2)'), 
    FailureHandling.OPTIONAL)

if (chossefollowaction == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/button_ (2)'))
} else if (chossefollowaction == false) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Rechoose folow action Review and prepare TC6-1'))
} else {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Rechoose folow action Review and prepare TC6-2'))
}

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/need follow'))


boolean chosseDatefollow = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/TC6/clich at date follow'), 
    FailureHandling.OPTIONAL)

if (chosseDatefollow == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/TC6/clich at date follow'))
} else if (chosseDatefollow == false) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Click at Follow Date Review and prepare TC6-2'))
} else {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Click at Follow Date Review and prepare TC6-1'))
}


WebUI.click(findTestObject('Test suite Review and Prepare/TC6/Select Date'))

boolean Replusiconfor3rdsite = WebUI.verifyElementClickable(findTestObject('Test suite Review and Prepare/Normal Add/Page_/plus icon 3rd site'), 
    FailureHandling.OPTIONAL)

if (Replusiconfor3rdsite == true) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/plus icon 3rd site'))
} else if (Replusiconfor3rdsite == false) {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Replus icon for 3rd site Review and prepare TC6-1'))
} else {
    WebUI.click(findTestObject('Test suite Review and Prepare/Auto Button that changing/Replus icon for 3rd site Review and prepare TC6-2'))
}

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/Copy of book'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/md-icon_1_2_3'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/span_ _1_2_3'))

WebUI.uploadFile(findTestObject('Test suite Review and Prepare/TC5/Uploade Book paper'), 'C:\\Ahmed\\EBLA\\EBLA Test.png')

not_run: WebUI.click(findTestObject('Test suite Review and Prepare/TC5/close book paper'))

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

WebUI.delay(2)

WebUI.click(findTestObject('Test suite Simple Add/TC6/save and print barcode'))

WebUI.delay(7)

not_run: WebUI.click(findTestObject('Test suite Review and Prepare/TC6/teba3et el barcode'))

WebUI.click(findTestObject('Test suite Review and Prepare/TC6/close barcode'))

WebUI.doubleClick(findTestObject('Test suite Review and Prepare/Normal Add/Page_/double click for save button alert'))

WebUI.click(findTestObject('Test suite Review and Prepare/Normal Add/Page_/No save button alert'))

not_run: WebUI.verifyElementNotClickable(findTestObject('Test suite Simple Add/TC6/print barcodddd'))

WebUI.delay(8)

not_run: WebUI.closeBrowser()

