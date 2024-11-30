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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
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
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.joacademy.com/')

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/select_ program-tawjihi'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/close-ads'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login_by_email'))

WebUI.setText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__email'), 'mohannadqaisy343@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/submit'))

WebUI.click(findTestObject('Object Repository/shababek/Page_UserView Page - joacademy.com/logo_joacademy'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/close-ads'))

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_2007 - joacademy.com/click on shababek'))

//Verify group joining

WebUI.click(findTestObject('Object Repository/group/Page_- joacademy.com/groups'))

//findTestObject('Object Repository/group/Page_- joacademy.com/groups')

WebElement scss = WebUI.findWebElement(findTestObject('Object Repository/group/group3/Page_- joacademy.com/group'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jssds = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jssds.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scss)


WebUI.click(findTestObject('Object Repository/group/group3/Page_- joacademy.com/group'))

//findTestObject('Object Repository/group/group2/Page_- joacademy.com/button_join')
WebUI.click(findTestObject('Object Repository/group/group2/Page_- joacademy.com/button_join'))

WebElement scs = WebUI.findWebElement(findTestObject('Object Repository/group/Page_- joacademy.com/button_add_video-image'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jsss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scs)

boolean isPopupVisiblll = WebUI.waitForElementVisible(findTestObject('Object Repository/group/Page_- joacademy.com/button_add_video-image'),5)

if (isPopupVisiblll) {
	println('The user has joined the group')
} else {
	println('User has not joined the group')
}

