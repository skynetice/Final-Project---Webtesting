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

WebUI.click(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/a_My account                        My orde_124641'))

WebUI.click(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_usernameRegisterPage'), 'nicehsk')

WebUI.setEncryptedText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_passwordRegisterPage'), 'NuaXv/4AAps=')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_emailRegisterPage'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_confirm_passwordRegisterPage'), 
    'NuaXv/4AAps=')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_first_nameRegisterPage'), 'Santi')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_last_nameRegisterPage'), 'Satu')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_phone_numberRegisterPage'), '0000000000000')

WebUI.selectOptionByLabel(findTestObject('TC 3/Page_Advantage Shopping/select_AfganistanAlbaniaAlgeriaAmerican Sam_3cef8a'), 
    'Indonesia', false)

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_cityRegisterPage'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_addressRegisterPage'), 'Jakarta')

WebUI.click(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/label_State  Province  Region'))

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_state__province__regionRegisterPage'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_postal_codeRegisterPage'), '0000')

WebUI.click(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/input_i_agree'))

WebUI.click(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/button_REGISTER'))

WebUI.verifyElementText(findTestObject('Object Repository/TC 3/Page_Advantage Shopping/label_center block smollMargin'), 
    'User name already exists')

WebUI.delay(3)

WebUI.closeBrowser()

