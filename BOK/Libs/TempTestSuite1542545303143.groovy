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


suiteProperties.put('id', 'Test Suites/_Top Navigation')

suiteProperties.put('name', '_Top Navigation')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Tezza\\Desktop\\BankOfKigali\\Bank_Of_Kigali\\Reports\\_Top Navigation\\20181118_154823\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/_Top Navigation', suiteProperties, [new TestCaseBinding('Test Cases/Navigate to Homepage', 'Test Cases/Navigate to Homepage',  null), new TestCaseBinding('Test Cases/_Top Navigation Menu/1. Verify- Current and Savings Link Present', 'Test Cases/_Top Navigation Menu/1. Verify- Current and Savings Link Present',  null), new TestCaseBinding('Test Cases/_Top Navigation Menu/2. Verify- Current and Savings Dropdown Menu Options', 'Test Cases/_Top Navigation Menu/2. Verify- Current and Savings Dropdown Menu Options',  null), new TestCaseBinding('Test Cases/_Top Navigation Menu/3. Verify- Click on Online Banking Page', 'Test Cases/_Top Navigation Menu/3. Verify- Click on Online Banking Page',  null)])
