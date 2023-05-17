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

WebUI.click(findTestObject('Page_OrangeHRM/job/jobTab'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrades/jobTab_PayGrades'))

'Parameterize using custom xpath'
WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/button_EditCurrency', [('param') : Grade]))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/button_AddCurrency'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/div_-- Select --'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/span_MYR - Malaysian Ringgit'))

'Enter minimum salary '
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/input_MinimumSalary'), '2000')

'Enter maximum salary '
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/input_MaximumSalary'), '6000')

WebUI.click(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/button_SaveCurrency'))

'Verify currency is added successfully'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/job/job_payGrade_Currency/popup_SuccessfullySaved'), 0)

WebUI.closeBrowser()

