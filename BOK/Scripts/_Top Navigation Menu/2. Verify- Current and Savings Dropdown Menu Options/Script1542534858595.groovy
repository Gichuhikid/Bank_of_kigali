import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//When Current and savings is clicked, there should be a dropdown menu displayed
KeywordLogger log = new KeywordLogger()

WebUI.delay(1)

if (WebUI.verifyTextNotPresent(text1, false, FailureHandling.OPTIONAL) && WebUI.verifyTextNotPresent(text2, false, FailureHandling.OPTIONAL)) {
    log.logWarning('Verified *'+text1+'* & *'+text2+'* texts NOT Present Before Click ON ||Current and Savings||')
} else {
    log.logError('*'+text1+'* & *'+text2+'* texts Present Before Click ON *Current and Savings*')
}

WebUI.mouseOver(findTestObject('Top Navigation/Current and Savings Account Link'))

log.logWarning('Mouse Over/Click on Navigation Menu *CURRENT & SAVINGS*')

WebUI.delay(1)

if (WebUI.verifyTextPresent(text1, false, FailureHandling.OPTIONAL) && WebUI.verifyTextPresent(text2, false, FailureHandling.OPTIONAL)) {
    log.logWarning('Verified *'+text1+'* & *'+text2+'* texts Present After Click ON ||Current and Savings||')
	log.logWarning("Confirmed *Current & Savings* Dropdown contains link options")
} else {
    log.logError('*'+text1+'* & *'+text2+'* texts Present NOT Present After Click ON *Current and Savings*')
}