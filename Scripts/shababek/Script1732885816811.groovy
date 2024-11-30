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

//login by eamil 
WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/select_ program-tawjihi'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/close-ads'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/login_by_email'))

WebUI.setText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__email'), 'mohannadqaisy343@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/shababek/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/submit'))

WebUI.click(findTestObject('Object Repository/shababek/Page_UserView Page - joacademy.com/logo_joacademy'))

WebUI.click(findTestObject('Object Repository/shababek/Page_- joacademy.com/close-ads'))

//Enter a group, create a post in it, do all the scenarios for the post, and then delete it
WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_2007 - joacademy.com/click on shababek'))

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/group'))

WebElement element = WebUI.findWebElement(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/my group'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', element)

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/my group'))

//create post in my group and verify that it has been create success
WebUI.setText(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/textarea_jo'), 'jo')

WebElement sc = WebUI.findWebElement(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/submit'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', sc)

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/submit'))

boolean isPopupVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/shababek/shababek2/Page_- joacademy.com/create sucess'), 
    5)

if (isPopupVisible) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

//Like the post in group
WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/like'))

//create comment in post in group
WebUI.setText(findTestObject('Object Repository/shab2/Page_- joacademy.com/textarea_joj'), 'joj')

WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/submit-commant'))

//create reply in post in group
WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/reply'))

WebUI.setText(findTestObject('Object Repository/shab2/Page_- joacademy.com/textarea_j_1'), 'j')

WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/submit-reply'))

//Like the comment for post in group
WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/like-commant'))

//Edit the comment in post and verify that it has been edited.
WebUI.click(findTestObject('Object Repository/edit/Page_- joacademy.com/button__edit_delete'))

WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/edit'))

WebUI.setText(findTestObject('Object Repository/shababek/shababek2/Page_UserView Page - joacademy.com/Page_- joacademy.com/textarea_joo'), 
    'joo')

WebUI.click(findTestObject('Object Repository/shab2/Page_- joacademy.com/save_edit'))

boolean isPopupVisiblee = WebUI.waitForElementVisible(findTestObject('Object Repository/shab2/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisiblee) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

//delete comment in post in group 
WebUI.click(findTestObject('Object Repository/edit/Page_- joacademy.com/button__edit_delete'))

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_UserView Page - joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/button-delete'))

WebUI.click(findTestObject('Object Repository/shababek/shababek2/Page_UserView Page - joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/delete'))

boolean isPopupVisibleee = WebUI.waitForElementVisible(findTestObject('Object Repository/shababek/shababek2/Page_UserView Page - joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/deleted_commant'), 
    5)

if (isPopupVisibleee) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

//Edit the post in group and verify that it has been edited.
WebUI.click(findTestObject('Object Repository/edit/Page_- joacademy.com/button__edit_deletee'))

WebUI.click(findTestObject('Object Repository/shab44/Page_- joacademy.com/edit'))

WebUI.setText(findTestObject('Object Repository/shab44/Page_- joacademy.com/textarea_jooo'), 'jooo')

WebUI.click(findTestObject('Object Repository/shab44/Page_- joacademy.com/button_post'))

boolean isPopupVisibl = WebUI.waitForElementVisible(findTestObject('Object Repository/shab44/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisibl) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

////Delete the post in group and verify that it has been deleted
WebUI.click(findTestObject('Object Repository/edit/Page_- joacademy.com/button__edit_deletee'))

WebUI.click(findTestObject('Object Repository/shab44/Page_- joacademy.com/Page_- joacademy.com/delete'))

WebUI.click(findTestObject('Object Repository/shab44/Page_- joacademy.com/Page_- joacademy.com/button_delete'))

boolean isPopupVisibll = WebUI.waitForElementVisible(findTestObject('Object Repository/shab44/Page_- joacademy.com/Page_- joacademy.com/Delete successfully'), 
    5)

if (isPopupVisibll) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

WebUI.back()

//Create a post in the general post and make sure it is published in the general post
WebUI.setText(findTestObject('Object Repository/post/Page_- joacademy.com/textarea_jo academy'), 'jo academy')

WebElement scs = WebUI.findWebElement(findTestObject('Object Repository/post/Page_- joacademy.com/button_post'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jsss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scs)

WebUI.click(findTestObject('Object Repository/post/Page_- joacademy.com/button_post'))

boolean isPopupVisiblll = WebUI.waitForElementVisible(findTestObject('Object Repository/post/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisiblll) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

WebUI.refresh()

//Make sure the post in general posts is the same as the post in my posts
WebElement scss = WebUI.findWebElement(findTestObject('Object Repository/post/Page_- joacademy.com/my post'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jssss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jssss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scss)

WebUI.click(findTestObject('Object Repository/post/Page_- joacademy.com/my post'))

String elem1 = findTestObject('Object Repository/post/Page_- joacademy.com/span_jo academy')

String elem2 = findTestObject('Object Repository/post/Page_- joacademy.com/span_jo academy_1')

if (elem1 == elem2) {
    WebUI.comment('Both elements match on the two pages.' // Additional actions if elements match
        // Additional actions if elements do not match
        )
} else {
    WebUI.comment('Elements do not match between the two pages.')
}

//Edit the post and verify that it has been edited.
WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/button__delete_edit'))

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/edit'))

WebUI.setText(findTestObject('Object Repository/post edit/Page_- joacademy.com/textarea_jo academyy'), 'jo academyy')

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/button__post'))

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/Updated successfully'))

//Delete the post and verify that it has been deleted
WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/button__delete_edit'))

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/delete'))

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/button__delete'))

WebUI.click(findTestObject('Object Repository/post edit/Page_- joacademy.com/Delete successfully'))

//Verify group joining
WebUI.click(findTestObject('Object Repository/group/Page_- joacademy.com/groups'))

WebElement scss = WebUI.findWebElement(findTestObject('Object Repository/group/group3/Page_- joacademy.com/group'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jssds = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jssds.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scss)

WebUI.click(findTestObject('Object Repository/group/group3/Page_- joacademy.com/group'))

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

WebUI.closeBrowser()

