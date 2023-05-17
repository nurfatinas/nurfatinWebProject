import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('01 - Login/Login - Valid Credentials - Success'), [('validUsername') : 'Admin', ('validPassword') : 'hUKwJTbofgPU9eVlw/CnDQ=='
        , ('pageURL') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OrangeHRM/dashboard/sideTab_Admin'))

WebUI.click(findTestObject('Page_OrangeHRM/job/jobTab'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/jobTab_JobCategories'))

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/button_AddJobCategory'))

inputCategory = CustomKeywords.'master.RandomNS.genRandomNumber'('Tester', 4)

'Enter job category'
WebUI.setText(findTestObject('Page_OrangeHRM/job/job_jobCategory/input_JobCategory'), inputCategory)

WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/button_SaveJobCategory'))

'Verify job category is added successfully'
WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/job/job_jobCategory/verify_SuccessfullySaved'), 0)

WebUI.closeBrowser()

