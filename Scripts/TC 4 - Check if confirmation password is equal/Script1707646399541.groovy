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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.site_url)

WebUI.click(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/a_My account                        My orde_124641'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/input_usernameRegisterPage'), username)

WebUI.setText(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/input_emailRegisterPage'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/input_passwordRegisterPage'), password)

WebUI.click(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/label_Confirm password'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/input_confirm_passwordRegisterPage'), 
    passwordConfirm)

WebUI.click(findTestObject('Object Repository/TC 4/Page_Advantage Shopping/label_Confirm password'))

if (password != passwordConfirm) {
    WebUI.verifyElementPresent(findTestObject('TC 4/Page_Advantage Shopping/label_password not match'), 1 //    WebUI.verifyElementHasAttribute(findTestObject('null'), 
        ) //        'Password do not match', 0)
} else {
    WebUI.verifyElementNotPresent(findTestObject('TC 4/Page_Advantage Shopping/label_password not match'), 1)
}

WebUI.delay(3)

WebUI.closeBrowser()

