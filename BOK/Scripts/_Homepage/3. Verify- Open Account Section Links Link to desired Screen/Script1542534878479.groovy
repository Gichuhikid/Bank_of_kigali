import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.delay(1)

homePageURL = WebUI.getUrl()

for (link = 1; link <= 7; link++) {
    linkName = WebUI.getText(findTestObject('Homepage/Open Account_Link Name', [('linkName') : link]))

    WebUI.click(findTestObject('Homepage/Open Account_Link Name', [('linkName') : link]))

    WebUI.delay(2)

    link_URL = WebUI.getUrl()

    log.logWarning('Page Link cliked on =' + linkName)

    if (homePageURL == link_URL) {
        log.logError((('Home Page URL =' + homePageURL) + ' | Link URL = ') + link_URL)

        log.logError('Failed to Navigate to Page URL linked to |' + linkName)
    } else {
        log.logWarning((('Home Page URL =' + homePageURL) + ' | Link URL = ') + link_URL)

        log.logWarning('Successfully Navigated to Page URL linked to |' + linkName)
    }
    
    WebUI.back()

    WebUI.delay(2)
}

