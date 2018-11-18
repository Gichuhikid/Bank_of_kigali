import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.delay(1)

HomePage_URL = WebUI.getUrl()

WebUI.mouseOver(findTestObject('Top Navigation/Current and Savings Account Link'))

WebUI.delay(1)

WebUI.click(findTestObject('Top Navigation/link- Online Banking'))

WebUI.delay(2)

OnlineBanking_URL = WebUI.getUrl()

if ((HomePage_URL != OnlineBanking_URL) && WebUI.verifyTextPresent('Apply for Online Banking', false, FailureHandling.OPTIONAL)) {
    log.logWarning(((('Home Page URL = ' + HomePage_URL) + '|| ') + 'Online Page URL =') + OnlineBanking_URL)

    log.logWarning('Successfully Navigated to Online Banking Page')
} else {
	log.logError(((('Home Page URL = ' + HomePage_URL) + '|| ') + 'Online Page URL =') + OnlineBanking_URL)

    KeywordUtil.markFailed('Navigation To Page Failed')
}

