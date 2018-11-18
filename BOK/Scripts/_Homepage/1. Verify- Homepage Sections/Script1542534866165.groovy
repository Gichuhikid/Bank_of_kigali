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

WebUI.scrollToPosition(0, 500)

WebUI.delay(1)

if (WebUI.verifyTextPresent('Open account', false, FailureHandling.OPTIONAL)) {
    log.logWarning('OPEN ACCOUNT is Present On Page')
} else {
    log.logError('OPEN ACCOUNT is NOT Present on Page')
}

if (WebUI.verifyTextPresent('Get a loan', false, FailureHandling.OPTIONAL)) {
    log.logWarning('GET A LOAN is Present on Page')
} else {
    log.logError('GET A LOAN is NOT Present on Page')
}

if (WebUI.verifyTextPresent('Get a Mortgage', false, FailureHandling.OPTIONAL)) {
    log.logWarning('GET A MORTAGE is present on Page')
} else {
    log.logError('GET A MORTAGE is NOT Present on Page')
}

if (WebUI.verifyTextPresent('Card Center', false, FailureHandling.OPTIONAL)) {
    log.logWarning('CARD CENTER is Present on Page')
} else {
    log.logError('CARD CENTER is NOT Present on Page')
}

