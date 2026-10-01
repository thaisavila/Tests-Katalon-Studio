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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://127.0.0.1:5500/')

WebUI.click(findTestObject('Page_Document/a_Entrar'))

WebUI.setText(findTestObject('Page_Login/input_Digite seu email'), 'thais@ufc.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Digite sua senha'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Login/label_Manter conectado'))

WebUI.click(findTestObject('Page_Login/button_entrar'))

// Verifica se o alerta apareceu (aguarda até 5 segundos)
boolean alertaPresente = WebUI.verifyAlertPresent(5)

if (alertaPresente) {
	// Captura o texto do alerta
	String textoAlerta = WebUI.getAlertText()
	
	// Valida se o texto está correto
	WebUI.verifyMatch(textoAlerta, 'Email ou Senha Incorretos', false)
	
	WebUI.comment('✅ Alerta correto: ' + textoAlerta)
	
	// Aceita o alerta (clica em OK)
	WebUI.acceptAlert()
} else {
	WebUI.comment('❌ Alerta NÃO apareceu!')
}