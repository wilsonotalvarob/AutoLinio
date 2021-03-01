package model

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

public class Product {

	def static set_Product_Name(String producto){
		GlobalVariable.PRODUCT = producto
	}

	def static get_Product_Name(){
		return GlobalVariable.PRODUCT
	}

	def static set_category(String categoria){
		GlobalVariable.CATEGORIA = categoria
	}

	def static get_category(){
		return GlobalVariable.CATEGORIA
	}

	def static set_subcategory(String subcategoria){
		GlobalVariable.SUBCATEGORIA = subcategoria
	}

	def static get_subcategory(){
		return GlobalVariable.SUBCATEGORIA
	}

	def static set_sub_item(String subitem){
		GlobalVariable.SUBITEM = subitem
	}

	def static get_sub_item(){
		return GlobalVariable.SUBITEM
	}

	def static set_cantidad(String cantidad){
		GlobalVariable.CANTIDAD = cantidad
	}

	def static get_cantidad(){
		return GlobalVariable.CANTIDAD
	}

	def static set_talla(String talla){
		GlobalVariable.TALLA = talla
	}

	def static get_talla(){
		return GlobalVariable.TALLA
	}
	def static set_total(String total){
		GlobalVariable.TOTAL = total
	}

	def static get_total(){
		return GlobalVariable.TOTAL
	}
}

