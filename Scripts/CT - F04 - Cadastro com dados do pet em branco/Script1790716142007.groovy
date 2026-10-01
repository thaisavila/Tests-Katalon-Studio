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

WebUI.click(findTestObject('Page_Login/a_Cadastre-se'))

WebUI.setText(findTestObject('Page_Cadastro/input_Seu nome completo'), 'Thaisaaa ')

WebUI.setText(findTestObject('Page_Cadastro/input_nomegmail.com'), 'thais@')

WebUI.setText(findTestObject('Page_Cadastro/input_000.000.000-00'), '00000000000')

WebUI.setText(findTestObject('Page_Cadastro/input_Sua Rua'), 'suarua')

WebUI.click(findTestObject('Page_Cadastro/input_Sua Cidade'))

WebUI.setText(findTestObject('Page_Cadastro/input_Sua Rua'), 'suaruaaaaaaa')

WebUI.setText(findTestObject('Page_Cadastro/input_Sua Cidade'), 'itapaje')

WebUI.setEncryptedText(findTestObject('Page_Cadastro/input_Crie uma senha'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Page_Cadastro/input_Senha'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Page_Cadastro/button_cadastrar'))

// Verifica se o alerta apareceu (aguarda até 5 segundos)
boolean alertaPresente = WebUI.verifyAlertPresent(5)

if (alertaPresente) {
	WebUI.comment('Alerta apareceu!')
	
	// Opcional: validar o texto do alerta
	String textoAlerta = WebUI.getAlertText()
	WebUI.comment('Texto do alerta: ' + textoAlerta)
	
	// Aceita o alerta (clica em OK)
	WebUI.acceptAlert()
} else {
	WebUI.comment('Alerta NÃO apareceu!')
}