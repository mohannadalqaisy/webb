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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.joacademy.com/')

//comment
WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/select_ program-tawjihi'))

WebUI.click(findTestObject('Object Repository/add favorite/CLOSE ads/Page_- joacademy.com/close-ads'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login_by_email'))

WebUI.setText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__email'), 'mohannadqaisy343@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/submit'))

WebUI.click(findTestObject('Object Repository/shababek/Page_UserView Page - joacademy.com/logo_joacademy'))

WebUI.click(findTestObject('Object Repository/add favorite/CLOSE ads/Page_- joacademy.com/close-ads'))

//WebUI.click(findTestObject('Object Repository/add favorite/CLOSE ads/Page_- joacademy.com/close--ads'))
//Enter a group, create a post in it, do all the scenarios for the post, and then delete it
WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_2007 - joacademy.com/click on shababek'))

WebElement scssx = WebUI.findWebElement(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/groups'))

JavascriptExecutor jso = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jso.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scssx)

WebUI.click(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/groups'))

WebElement scssc = WebUI.findWebElement(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/group'))

JavascriptExecutor jsj = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsj.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scssc)

WebUI.click(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/group'))

WebUI.click(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/join'))

WebElement ss = WebUI.findWebElement(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/add-image-video'))

JavascriptExecutor jo = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jo.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', ss)

boolean isVisiblee = WebUI.waitForElementVisible(findTestObject('Object Repository/shababek/join group/Page_- joacademy.com/add-image-video'), 
    5 // Wait up to 10 seconds
    )

if (isVisiblee) {
    println('Popup is visible.' // Perform actions on the popup if needed
        //WebUI.verifyElementText(findTestObject('Object Repository/YourPopupObject/PopupHeader'), 'Expected Header Text')
        )
} else {
    println('Popup did not appear.')
}

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

