package stepdefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.cucumber.datatable.DataTable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.junit.After
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




import tasks.*
import questions.*
import interactions.*
import utils.*

class carritoStepDefinition {

	@Given("the user has opened the website")
	def the_user_has_opened_the_website() {
		OpenBrowsers.to_url()
	}

	@When("he selects the category")
	def he_selects_the_category(DataTable data) {
		Read.the(data)
		Select_An_Item.of_menu()
		WebUI.takeScreenshot()
	}

	@When("he adds a products to the cart")
	def he_adds_a_products_to_the_cart(DataTable data) {
		Read.the(data)
		SelectProduct.s_product()
		WebUI.takeScreenshot()
		AddProduct.a_product()
		WebUI.takeScreenshot()
	}

	@Then("he sould see added product in the cart")
	def he_sould_see_added_product_in_the_cart() {
		ShouldSeeTheProduct.is_added()
		WebUI.takeScreenshot()
	}

	@After
	def finishing(){
		WebUI.closeBrowser()
	}
}