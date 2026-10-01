import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:5500/')

WebUI.click(findTestObject('Page_Document/div_card-img-overlay'))

WebUI.click(findTestObject('Page_Document/button_Agendar'))

WebUI.click(findTestObject('Page_Document/div_card-img-overlay_1'))

WebUI.click(findTestObject('Page_Document/button_Adicionar ao agendamento'))

WebUI.click(findTestObject('Page_Document/button_Ver agendamentos'))

WebUI.setText(findTestObject('Page_Agendamento/input_input_data'), '2026-09-19')

WebUI.click(findTestObject('Page_Agendamento/label_09_00'))

WebUI.click(findTestObject('Page_Agendamento/img_Gato'))

WebUI.click(findTestObject('Page_Agendamento/label_Mdio'))

WebUI.click(findTestObject('Page_Agendamento/label_Adulto'))

WebUI.click(findTestObject('Page_Agendamento/button_finalizar_agend'))


WebUI.verifyAlertPresent(5)
String texto = WebUI.getAlertText()
WebUI.verifyMatch(texto, 'Agendamento confirmado! Nossa equipe entrará em contato em breve.', false)
WebUI.acceptAlert()