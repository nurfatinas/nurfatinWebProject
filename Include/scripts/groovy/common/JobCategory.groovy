package common
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



public class JobCategory {


	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to job category")
	def navigateToJobCategory() {

		WebUI.callTestCase(findTestCase('01 - Login/Login - Valid Credentials - Success'), [('validUsername') : 'Admin', ('validPassword') : 'hUKwJTbofgPU9eVlw/CnDQ=='
			, ('pageURL') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Page_OrangeHRM/dashboard/sideTab_Admin'))

		WebUI.click(findTestObject('Page_OrangeHRM/job/jobTab'))

		WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/jobTab_JobCategories'))

		WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/button_AddJobCategory'))
	}

	@When("User enter (.*)")
	def enterJobCategory(String jobCategory) {

		WebUI.setText(findTestObject('Page_OrangeHRM/job/job_jobCategory/input_JobCategory'), jobCategory)
	}

	@And("User clicks on save button")
	def saveJobCategory() {

		WebUI.click(findTestObject('Page_OrangeHRM/job/job_jobCategory/button_SaveJobCategory'))
	}

	@Then("User redirected to job category page")
	def redirectedToPage(String status) {

		WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/job/job_jobCategory/verify_SuccessfullySaved'), 0)
		WebUI.closeBrowser()
	}


}