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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_LOGIN_SUCCESS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout Page/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Checkout Page/icon_cart'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Checkout Page/txt_Your Cart'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout Page/txt_Your Cart'), 2)

WebUI.click(findTestObject('Object Repository/Checkout Page/button_Checkout'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Checkout Page/txt_checkout_info'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout Page/txt_checkout_info'), 2)

WebUI.setText(findTestObject('Object Repository/Checkout Page/txt_firstname'), 'Bianca')

WebUI.setText(findTestObject('Object Repository/Checkout Page/txt_lastname'), 'ID')

WebUI.setText(findTestObject('Object Repository/Checkout Page/txt_zipcode'), '33333')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('Object Repository/Checkout Page/btn_continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout Page/txt_Checkout Overview'), 1)

WebUI.click(findTestObject('Object Repository/Checkout Page/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout Page/txt_Thank you for your order'), 1)

WebUI.delay(3)

WebUI.closeBrowser()

