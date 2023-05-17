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

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobTitles/jobTab_JobTitles'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobTitles/button_AddJobTitles'))

inputJobTitle = CustomKeywords.'master.RandomNS.genRandomNumber'('Testing', 4)

'Enter job title\r\n'
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_jobTitles/input_JobTitle'), inputJobTitle)

'Enter job description'
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_jobTitles/input_JobDescription'), 'Testing')

'Enter note'
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_jobTitles/input_Note'), 'Testing123')

'Upload file attachment'
CustomKeywords.'master.RobotUpload.uploadFile'(findTestObject('Page_OrangeHRM/job/job_jobTitles/button_Browse'), 'C:\\Users\\abdul\\Desktop\\SmallFile.pdf')

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobTitles/button_SaveJobTitle'))

'Verify job title is added successfully'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/job/job_jobTitles/popup_SuccessfullySaved'), 0)

WebUI.closeBrowser()

