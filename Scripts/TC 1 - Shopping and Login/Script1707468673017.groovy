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

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/div_LAPTOPS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/li_SOLD OUT                                _252972'))

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/button_CHECKOUT  (1,261.99)'))

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_usernameInOrderPayment'), 'nicehsk')

WebUI.setEncryptedText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_passwordInOrderPayment'), 'IUzobqKA7NU0EdNVQvmFCA==')

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/a_Edit shipping details'))

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_first_name'), 'Budi')

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_last_name'), 'Saja')

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_phone_number'), '00000000000')

WebUI.selectOptionByLabel(findTestObject('TC1/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'Indonesia', false)

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_city'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_address'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_postal_code'), '0000')

WebUI.setText(findTestObject('Object Repository/TC1/Page_Advantage Shopping/input_state__province__region'), 'Jakarta')

WebUI.click(findTestObject('TC 1-2/Page_Advantage Shopping/button_NEXT'))

WebUI.click(findTestObject('Object Repository/TC1/Page_Advantage Shopping/button_PAY NOW'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC1/Page_Advantage Shopping/h2_Thank you for buying with Advantage'), 
    0)

WebUI.delay(3)

WebUI.closeBrowser()

