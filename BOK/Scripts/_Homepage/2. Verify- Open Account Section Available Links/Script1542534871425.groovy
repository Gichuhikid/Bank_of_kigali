import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger log = new KeywordLogger()

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.delay(1)

WebDriver driver = DriverFactory.getWebDriver()

'To locate links on Open Account Section'
WebElement Links = driver.findElement(By.xpath('//div[@class=\'container personal-home-shtcuts\']/div/div[1]//ul/li'))

'Locate all links available on the section'
List<WebElement> sumLinks = Links.findElements(By.xpath('//div[@class=\'container personal-home-shtcuts\']/div/div[1]//ul/li/a'))

def TotalLinks = sumLinks.size()

log.logWarning('Number of Links= ' + TotalLinks)

for (links = 1; links <= TotalLinks; links++) {
    LinkName = WebUI.getText(findTestObject('Homepage/Open Account_Link Name', [('linkName') : links]))

    log.logWarning(((('Link Number |' + links) + '|') + ' is Named -> ') + LinkName)

    if ((((((LinkName.contains(link_1) || LinkName.contains(link_2)) || LinkName.contains(link_3)) || LinkName.contains(
        link_4)) || LinkName.contains(link_5)) || LinkName.contains(link_6)) || LinkName.contains(link_7)) {
        log.logWarning(('Verified Link Name |' + LinkName) + '| Against Expected Link Names')
    } else {
        log.logError('FAILED to verify Existing Link Name against expected Link Names')

        KeywordUtil.markError('A Link exists that is not Expected')
    }
}

