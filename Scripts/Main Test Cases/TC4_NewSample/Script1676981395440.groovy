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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 'Make Appointment')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), encryptedPassword)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.rightClick(findTestObject('Object Repository/Page_CURA Healthcare Service/section_Make Appointment                   _57f49e'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.closeBrowser()

