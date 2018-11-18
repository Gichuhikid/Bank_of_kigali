import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tezza\\AppData\\Local\\Temp\\Katalon\\Test Cases\\_Top Navigation Menu\\2. Verify- Current and Savings Dropdown Menu Options\\20181118_150735\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/_Top Navigation Menu/2. Verify- Current and Savings Dropdown Menu Options', new TestCaseBinding('Test Cases/_Top Navigation Menu/2. Verify- Current and Savings Dropdown Menu Options', [:]), FailureHandling.STOP_ON_FAILURE , false)
    
