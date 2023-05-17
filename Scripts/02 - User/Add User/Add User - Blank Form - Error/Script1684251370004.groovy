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

'Leave all field blank and save'
WebUI.click(findTestObject('Page_OrangeHRM/user_addUser/button_SaveAddUser'))

'Verify error user role is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_UserRole'), 0)

'Verify error employee name is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_EmployeeName'), 0)

'Verify error status is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_Status'), 0)

'Verify error username is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_Username'), 0)

'Verify error password is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_Password'), 0)

'Verify error confirm password is required\r\n'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/user_addUser/error_Required_ConfirmPassword'), 0)

WebUI.closeBrowser()

