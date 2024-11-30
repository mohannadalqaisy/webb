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
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-sub category'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-sub category-drop down list'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-subject'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-subject-drop down list'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-teacher'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_-    - joacademy.com/choose-teacher-drop down list'))

WebUI.delay(2)

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

boolean isPressed = WebUI.verifyElementPresent(findTestObject('Object Repository/harte/Page_2007 -  - joacademy.com/New Test Object'), 
    5, FailureHandling.OPTIONAL)

if (isPressed == true) {
    // If the button is not pressed, click it
    WebUI.click(findTestObject('Object Repository/harte/Page_2007 -  - joacademy.com/New Test Object'))

    println('Button was not pressed. Clicked the button.')
} else {
    println('Button is already pressed.')
}

WebUI.click(findTestObject('Object Repository/add favorite/Page_2007 -  - joacademy.com/my favorite'))

//findTestObject('Object Repository/files/Newwwww')
// Test Object for the container of target elements
TestObject targetElements = findTestObject('Object Repository/files/Newwwww')

// Test Object for the "Next" button
TestObject nextButton = findTestObject('Object Repository/pagination/Page_- joacademy.com/pagination')

// Target element text to search for
String targetText = 'دوسية الأستاذ احمد عرابي تأسيس 2007'

// Variable to track if the element is found
boolean elementFound = false

// Pagination loop
while (true) {
    // Find all target elements on the current page
    List<WebElement> elements = WebUI.findWebElements(targetElements, 10 // Timeout 10 seconds
        )

    WebUI.comment('Element Text: ' + WebElement)

    // Check each element
    for (WebElement element : elements) {
        String elementText = element.getText( // Get text of the current element
            )

        WebUI.comment('Element Text: ' + elementText)

        // Scroll the current element into view
        JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

        js.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', element)

        if (elementText.contains(targetText)) {
            // Adjust condition as needed
            WebUI.comment('Element found: ' + elementText)

            elementFound = true

            break
        }
    }
    
    if (elementFound) {
        break
    }
    
    // Check if the "Next" button is present and clickable
    if (WebUI.verifyElementClickable(nextButton, FailureHandling.OPTIONAL)) {
        WebElement element = WebUI.findWebElement(nextButton)

        JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

        js.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', element)

        WebUI.click(nextButton // Go to the next page
            )

        WebUI.delay(2 // Wait for the next page to load (adjust delay as needed)
            )
    } else {
        WebUI.comment('No more pages to check. Element not found.')

        break
    }
}

// Assert if the element was found
assert elementFound

WebUI.click(findTestObject('Object Repository/files/select-files'))

WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/share'))

WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/i__ri-file-copy-fill  tw-text-1A428A'))

//WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/copy file pop up'))
WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/copy file'))

//WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/copy file pop up'))
// Wait for the modal to be visible
boolean isPopupVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/after search/Page_-    - joacademy.com/copy file pop up'), 
    5 // Wait up to 10 seconds
    )

if (isPopupVisible) {
    println('Popup is visible.' // Perform actions on the popup if needed
        //WebUI.verifyElementText(findTestObject('Object Repository/YourPopupObject/PopupHeader'), 'Expected Header Text')
        )
} else {
    println('Popup did not appear.')
}

WebUI.delay(5)

//WebUI.closeWindowIndex(null)
//WebUI.back()
//WebUI.navigateToUrl('https://www.joacademy.com/files/tawjihi')
WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/category'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/select_category'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/sub_category'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/select_sub_category'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/subject'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/select_subject_in_drop-down-list'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/teacher'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/select_teacher_in_drop-down-list'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/select_file_in_drop-down-list'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/files'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/button_clear'))

WebUI.click(findTestObject('Object Repository/New Folder 1/Page_-    - joacademy.com/button_clear'))

WebUI.click(findTestObject('Object Repository/after search/Page_-    - joacademy.com/download file' //WebUI.executeJavaScript('window.close();', null)
        ))

WebUI.delay(5)

WebUI.closeBrowser()

TestObject createDynamicObject(String xpath) {
    TestObject dynamicObject = new TestObject()

    dynamicObject.addProperty('xpath', ConditionType.EQUALS, xpath)

    return dynamicObject
}
