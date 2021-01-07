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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('ArticleTagging/Page_LFA-1005012021042000.xml/span_Article Tagging'))

WebUI.click(findTestObject('ArticleTagging/Page_LFA-1005012021042000.xml/a_Content Type Tags'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/li_Trip Notes'))

WebUI.click(findTestObject('ArticleTagging/Page_LFA-1005012021042000.xml/a_Tags'))

WebUI.doubleClick(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/li_Apple'))

WebUI.doubleClick(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/li_Asia-Pacific'))

WebUI.click(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/a_Recommendations'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/select_Choose...OutperformUnderperformMarke_7c50ff'), 
    'Marketperform', true)

WebUI.click(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/a_Multipart'))

WebUI.click(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/a_Miscellaneous'))

WebUI.scrollToElement(findTestObject('ArticleTagging/Page_LFA-1005012021042000.xml/button_Save'), 100)

WebUI.click(findTestObject('Object Repository/ArticleTagging/Page_LFA-1005012021042000.xml/button_Save'))

