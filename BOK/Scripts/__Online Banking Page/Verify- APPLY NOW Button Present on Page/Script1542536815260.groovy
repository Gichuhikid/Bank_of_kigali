import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger log = new KeywordLogger()

WebUI.callTestCase(findTestCase('Navigate to Homepage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Top Navigation/Current and Savings Account Link'))

WebUI.delay(1)

WebUI.click(findTestObject('Top Navigation/link- Online Banking'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 700)

WebUI.delay(2)

button_text = WebUI.getText(findTestObject('Online Banking Page/button- Apply Now'))

if (WebUI.verifyElementText(findTestObject('Online Banking Page/button- Apply Now'), button_text, FailureHandling.OPTIONAL)) {
    log.logWarning("Successfuly Verified APPLY NOW Button is present on Page")
}

else{
	log.logWarning("Failed to Verify the Apply Button is Present on Page")
}