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

WebUI.callTestCase(findTestCase('01 - Login/Login - Valid Credentials - Success'), [('validUsername') : 'Admin', ('validPassword') : 'hUKwJTbofgPU9eVlw/CnDQ=='
        , ('pageURL') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OrangeHRM/dashboard/sideTab_Admin'))

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/button_AddUser'))

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/select_UserRole'))

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/span_Admin'))

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/select_Status'))

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/span_Enabled'))

'Enter employee name'
WebUI.setText(findTestObject('Page_OrangeHRM/user_addUser/input_EmployeeName'), 'Charlie  Carter')

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/username_Charlie Carter'))

inputUsername = CustomKeywords.'master.RandomNS.genRandomNumber'('charlieCarter', 4)

'Enter username'
WebUI.setText(findTestObject('Page_OrangeHRM/user_addUser/input_Username'), inputUsername)

nonAlphaNum = CustomKeywords.'master.RandomNS.genRandomNonAplhanumeric'(8)

'Enter non alpha-numeric number password'
WebUI.setText(findTestObject('Page_OrangeHRM/user_addUser/input_Password'), nonAlphaNum)

'Enter non alpha-numeric number confirm password'
WebUI.setText(findTestObject('Page_OrangeHRM/user_addUser/input_ConfirmPassword'), nonAlphaNum)

WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/button_SaveAddUser'))

'Verify error password must contain minimum 1 number'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_PasswordNoNumber'), 0)

WebUI.closeBrowser()

