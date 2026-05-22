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

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/img_Komodo Reservation'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/div_w-6 h-6 rounded-lg border-2 flex items-cente'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/Page_SIORA/button_inline-flex items-center justify-center g'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Continue to Tickets'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Komodo National Park'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Continue to Tickets'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/Page_SIORA/button_FOREIGNER1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Reservasi_OR/Page_SIORA/input_Alexander Thorne'), 'testing')

WebUI.setText(findTestObject('Reservasi_OR/Page_SIORA/input_Passport or National ID'), '0123456789')

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/Page_SIORA/div_css-1xc3v61-indicatorContainer'))

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/Page_SIORA/div_react-select-3-option-17'))

WebUI.setText(findTestObject('Reservasi_OR/Page_SIORA/input_e.g. London'), 'testing')

WebUI.setText(findTestObject('Reservasi_OR/Page_SIORA/input_44'), '1412')

WebUI.delay(2)

WebUI.setText(findTestObject('Reservasi_OR/Page_SIORA/input_7700 900000'), '1412123')

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Continue to Tickets'))

WebUI.delay(2)

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/Page_SIORA/button_Confirm'))

WebUI.click(findTestObject('Reservasi_OR/Page_SIORA/button_Continue to Tickets'))

WebUI.delay(2)

