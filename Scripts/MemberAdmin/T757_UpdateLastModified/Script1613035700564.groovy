import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectXpath as TestObjectXpath
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.ClassicAdminLoginPage)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ClassicSite/Page_CreditSights - Login Required/input_Username'), admin)

WebUI.setEncryptedText(findTestObject('ClassicSite/Page_CreditSights - Login Required/input_Password'), 'BHDR9pWVXLG0HNOBuHCiHw==')

WebUI.click(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Login Required/input_Login'))

WebUI.click(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Your Account/a_Member Admin'))

WebUI.selectOptionByLabel(findTestObject('ClassicSite/Page_CreditSights - Member Lookup/select_SalesDropdown'), salesperson, 
    true)

WebUI.click(findTestObject('ClassicSite/Page_CreditSights - Member Lookup/input_btnApply_search'))

TestObject user = findTestObject('Object Repository/ClassicSite/Page_CreditSights - Member Lookup/a_andread')

String username = WebUI.getText(user)

print(username)

WebUI.click(user)

TestObject modifiedDate = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified Date')

String initialModifiedDate = WebUI.getAttribute(modifiedDate, 'value')

TestObject modifiedBy = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified By')

String initialModifiedBy = WebUI.getAttribute(modifiedBy, 'value')

'Changing the Reassigning Master Companies and verification'
TestObject masterComp = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Master List Company')

String masterComp1 = WebUI.getAttribute(masterComp, 'value')

print(masterComp1)

WebUI.click(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Account Admin andread/a_Sales'))

WebUI.click(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Account Admin andread/a_Reassign Master Companies'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Member Lookup/select_SalesDropdown'), 
    salesperson, false)

TestObject checkBoxOfCompany = findTestObject('ClassicSite/Page_CreditSights - Reassign Master Companies/input_chkReassign')

setDynamicXpath(checkBoxOfCompany.xpaths, masterComp1)

WebUI.click(checkBoxOfCompany)

WebUI.selectOptionByLabel(findTestObject('ClassicSite/Page_CreditSights - Reassign Master Companies/select_Unassignedahigherpower'), 
    newsalesperson, true)

WebUI.click(findTestObject('ClassicSite/Page_CreditSights - Reassign Master Companies/input_New Assigned Sales'))

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Reassign Master Companies/a_Member Admin'))

lookForMember(username)

TestObject newmodifiedDate = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified Date')

TestObject newmodifiedBy = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified By')

String newmodifiedDateValue = WebUI.getAttribute(newmodifiedDate, 'value')
WebUI.verifyNotMatch(initialModifiedDate, newmodifiedDateValue, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(admin, WebUI.getAttribute(newmodifiedBy, 'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

'Changing the Master Company and verifying'

'To verify new time, do timepass for one minute'
WebUI.delay(60)

WebUI.setText(findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Master List Company'), 'bacalso Corp.')

WebUI.sendKeys(findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Master List Company'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Save'))

WebUI.waitForPageLoad(5)

TestObject newmodifiedDate2 = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified Date')

TestObject newmodifiedBy2 = findTestObject('ClassicSite/Page_CreditSights - Account Admin andread/input_Last Modified By')

WebUI.verifyNotMatch(newmodifiedDateValue, WebUI.getAttribute(newmodifiedDate2, 'value'), false, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(admin, WebUI.getAttribute(newmodifiedBy2, 'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

void setDynamicXpath(List<TestObjectXpath> paths, String comp) {
    for (TestObjectXpath path : paths) {
        path.setValue(path.getValue().replace('xxxxx', comp))

        println(path.getValue())
    }
}

boolean lookForMember(String memberLook) {
    boolean isLookUp = false

    WebUI.setText(findTestObject('ClassicSite/Page_CreditSights - Member Lookup/input_LoginUsername'), memberLook)

    WebUI.click(findTestObject('ClassicSite/Page_CreditSights - Member Lookup/input_btnApply_search'))

    if (WebUI.getText(findTestObject('Object Repository/ClassicSite/Page_CreditSights - Account Admin andread/Searched User Heading')).contains(
        memberLook)) {
        return true
    } else {
        TestObject userLink = findTestObject('Object Repository/ClassicSite/Page_CreditSights - Member Lookup/a_SearchedUser_FromList')

        setDynamicXpath(userLink.xpaths, memberLook)

        WebUI.click(userLink)

        return true
    }
}

