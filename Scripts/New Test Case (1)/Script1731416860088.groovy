import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

TestObject createDynamicObject(String xpath) {
	TestObject dynamicObject = new TestObject()

	dynamicObject.addProperty('xpath', ConditionType.EQUALS, xpath)

	return dynamicObject
}


// Function to create a dynamic TestObject
WebUI.openBrowser('')

WebUI.maximizeWindow()

// login by email 
WebUI.navigateToUrl('https://www.joacademy.com/')

WebUI.click(findTestObject('files/برنامج التوجيهي و الثانوي'))

WebUI.click(findTestObject('files/close ads'))

WebUI.click(findTestObject('files/log in'))

WebUI.click(findTestObject('files/log in by email'))

WebUI.setText(findTestObject('Object Repository/Page_- joacademy.com/input__email'), 'mohannadqaisy343@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('files/submit'))

// select file by drop down list 
WebUI.click(findTestObject('files/select-files'))

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/Choose_Program_Filter'))

WebUI.click(findTestObject('Page_-    - joacademy.com/choose_program-in drop down list'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-sub category'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-sub category-drop down list'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-subject'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-subject-drop down list'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-teacher'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-teacher-drop down list'))

WebUI.delay(5)

//WebUI.verifyElementText(findTestObject('file name/Page_-    - joacademy.com/name-file'), 'دوسية الأستاذ احمد عرابي تأسيس 2007')
TestObject h2Object = createDynamicObject('//h2[contains(@class, \'tw-line-clamp-2\')]')

String elimant1tesxtpage1 = WebUI.getText(h2Object)

println('Dynamic Title: ' + elimant1tesxtpage1)

WebUI.click(h2Object)

//String elimant1tesxtpage1 = WebUI.getText(findTestObject('file name/Page_-    - joacademy.com/name-file'))
//WebUI.navigateToUrl('https://www.joacademy.com/files/%D8%AF%D9%88%D8%B3%D9%8A%D8%A9-%D8%A7%D9%84%D8%A3%D8%B3%D8%AA%D8%A7%D8%B0-%D8%A7%D8%AD%D9%85%D8%AF-%D8%B9%D8%B1%D8%A7%D8%A8%D9%8A-%D8%AA%D8%A3%D8%B3%D9%8A%D8%B3-2007-507697')
//String elimant1tesxtpage2 = WebUI.getText(findTestObject('detalis/Page_-    - joacademy.com/file detalis'))
TestObject h2Object1 = createDynamicObject('//h2[contains(@class, \'docs_title-lg__AmdSG\')]')

String elimant1tesxtpage2 = WebUI.getText(h2Object1)

println('Dynamic Title: ' + elimant1tesxtpage2)

// Compare elements between pages
if (elimant1tesxtpage1 == elimant1tesxtpage2) {
    WebUI.comment('Both elements match on the two pages.' // Additional actions if elements match
        // Additional actions if elements do not match
        )
} else {
    WebUI.comment('Elements do not match between the two pages.')
}

WebUI.click(findTestObject('Object Repository/add favorite/Page_2007 -  - joacademy.com/click on heart'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/add favorite/Page_2007 -  - joacademy.com/my favorite'))

WebUI.navigateToUrl('https://www.joacademy.com/user/favorite')

// Define the item and pagination controls
//TestObject item = findTestObject('Object Repository/file in favorite/Page_- joacademy.com/section_2007 -  -   - 2007     (81)')   
TestObject nextButton = findTestObject('Object Repository/pagination/Page_- joacademy.com/pagination')

//findTestObject('Object Repository/file in favorite/Page_- joacademy.com/section_2007 -  -   - 2007     (81)')
boolean itemFound = true // Flag to track if the item is found

int pageNumber = 1 // Counter to keep track of the page number

// Start pagination loop
while ((itemFound)) {
    // Check if the item exists on the current page
    if (contains(elimant1tesxtpage2)) {
        println('Item found on page: ' + pageNumber)
        itemFound = false // Set the flag to true and exit the loop
        // Check if the "Next" button is present (i.e., not on the last page)
        // Navigate to the next page
        // Increment the page counter
        // Exit the loop if there are no more pages
    } else {
        println('Item not found on page: ' + pageNumber)

        if (WebUI.verifyElementPresent(nextButton, 5)) {
            WebUI.click(nextButton)

            pageNumber++
        } else {
            println('Reached the last page, item not found.')

            break
        }
    }
}


WebUI.delay(5)
WebUI.click(findTestObject('file in favorite/Page_- joacademy.com/section_2007 -  -   - 2007     (81)'))
WebUI.closeBrowser()

//*[@id="__next"]/div[1]/div[2]/div[2]/div[2]


