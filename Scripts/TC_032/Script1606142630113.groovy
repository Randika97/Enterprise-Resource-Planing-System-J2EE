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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/Enterprise-Resource-Planing-System-J2EE/index.htm')

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_User Name_userName'), 
    'melaka')

WebUI.setEncryptedText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Password_password'), 
    'UtnKLae0D3A=')

WebUI.click(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/button_Login'))

WebUI.click(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/div_MTWTFSS01020304050                     _551893'))

WebUI.click(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/a_UPDATE'))

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated name here_productName'), 
    'sahan')

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated quantity here_productStockInHand'), 
    '45')

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated Price here_price'), 
    '250')

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated category here_category'), 
    'Dry food')

WebUI.setText(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated description here_productDesc'), 
    'all goods')

WebUI.click(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/input_Updated description here_update'))

WebUI.click(findTestObject('Object Repository/Update-product/Page_Material Dashboard Dark Edition by Cre_136c65/td_C110'))

WebUI.closeBrowser()

