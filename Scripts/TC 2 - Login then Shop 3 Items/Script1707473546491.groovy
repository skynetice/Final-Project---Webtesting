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

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('TC 2/Page_Advantage Shopping/a_My account                        My orders                        Sign out'))

WebUI.setText(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/input_username'), 'nicehsk')

WebUI.setEncryptedText(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/input_password'), 'IUzobqKA7NU0EdNVQvmFCA==')

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/div_SPEAKERS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/li_SOLD OUT                                _e4d6fd'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/a_HOME'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/div_HEADPHONES                        Shop Now'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/li_SOLD OUT                                _ad00b0'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/a_HOME'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/div_MICE                        Shop Now'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/li_SOLD OUT                                _269779'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/div_plus'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('TC 2/Page_Advantage Shopping/a_0'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_CHECKOUT (2,170.94)'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_NEXT'))

WebUI.click(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/button_PAY NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/h2_Thank you for buying with Advantage'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/TC 2/Page_Advantage Shopping/label_Budi Saja'), 'Budi Saja')

WebUI.delay(3)

WebUI.closeBrowser()

