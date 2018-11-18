import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

KeywordLogger log = new KeywordLogger()

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Homepage/table- Exchange Rate', [('row') : '1', ('col') : '1']), 5)

WebUI.delay(1)

Currency_Name = WebUI.getText(findTestObject('Homepage/table- Exchange Rate', [('row') : '2', ('col') : '1']))

Buy_Price = WebUI.getText(findTestObject('Homepage/table- Exchange Rate', [('row') : '2', ('col') : '2']))

Sell_Price = WebUI.getText(findTestObject('Homepage/table- Exchange Rate', [('row') : '2', ('col') : '3']))

BuyPrice_Int = Buy_Price.toDouble()

SellPrice_Int = Sell_Price.toDouble()

if ((SellPrice_Int > BuyPrice_Int) && (SellPrice_Int >= 800.00)) {
    log.logWarning('Currency Name = ' + Currency_Name)

    log.logWarning((('Sell Price = ' + SellPrice_Int) + '| Buy Price = ') + BuyPrice_Int)

   log.logWarning('Successfully Verified ->Sell Price is Higher than Buy Price & Sell Price is Higher than or Equal to 800')
} else if ((SellPrice_Int < BuyPrice_Int) || (SellPrice_Int < 800)) {
    log.logError('Currency Name = ' + Currency_Name)

    log.logError((('Sell Price = ' + SellPrice_Int) + '| Buy Price = ') + BuyPrice_Int)

    KeywordUtil.markFailed('Sell Price is Either lower than Buy Price OR Sell Price is Lower than 800')
}

