package utils

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
import io.cucumber.datatable.DataTable
import model.*


public class Read {
	def static the(DataTable data){
		List<Map<String,String>> values = data.asMaps(String.class, String.class)
		
		if (values[0].containsKey("categoria")){
			Product.set_category(values[0].categoria)
			Product.set_subcategory(values[0].subcategoria)
			Product.set_sub_item(values[0].subitem)
			Product.set_Product_Name(values[0].producto)
		}else if(values[0].containsKey("cantidad")){
			Product.set_cantidad(values[0].cantidad)
			Product.set_talla(values[0].talla)
		}
	}
}
