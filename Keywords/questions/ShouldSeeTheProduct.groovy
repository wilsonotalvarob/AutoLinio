package questions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import model.Product

public class ShouldSeeTheProduct {
	def static is_added(){
		WebUI.click(findTestObject('Carrito/Ir al Carrito'))
		WebUI.verifyElementText(findTestObject("Carrito/TxtMensaje"), GlobalVariable.MESSAGE)
		WebUI.verifyElementText(findTestObject("Carrito/span_Nombre_producto"), Product.get_Product_Name())
		WebUI.verifyElementText(findTestObject("Carrito/span_talla_added"), "Talla: " + Product.get_talla())
		
		
		WebUI.takeScreenshot()
	}
}
