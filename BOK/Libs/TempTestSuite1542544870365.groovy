import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/_Homepage Tests')

suiteProperties.put('name', '_Homepage Tests')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Tezza\\Desktop\\BankOfKigali\\Bank_Of_Kigali\\Reports\\_Homepage Tests\\20181118_154110\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/_Homepage Tests', suiteProperties, [new TestCaseBinding('Test Cases/Navigate to Homepage', 'Test Cases/Navigate to Homepage',  null), new TestCaseBinding('Test Cases/_Homepage/1. Verify- Homepage Sections', 'Test Cases/_Homepage/1. Verify- Homepage Sections',  null), new TestCaseBinding('Test Cases/_Homepage/2. Verify- Open Account Section Available Links', 'Test Cases/_Homepage/2. Verify- Open Account Section Available Links',  null), new TestCaseBinding('Test Cases/_Homepage/3. Verify- Open Account Section Links Link to desired Screen', 'Test Cases/_Homepage/3. Verify- Open Account Section Links Link to desired Screen',  null), new TestCaseBinding('Test Cases/_Homepage/4 .Verify- USD Foreign Exchange Rate Values', 'Test Cases/_Homepage/4 .Verify- USD Foreign Exchange Rate Values',  null)])
