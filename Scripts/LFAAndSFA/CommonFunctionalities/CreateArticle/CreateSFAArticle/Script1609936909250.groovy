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
import org.openqa.selenium.Keys as Keys

GlobalVariable.SFAArticleName = ('Title: SFA-' + CustomKeywords.'newPackage.DynamicID.getUniqueId'())

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/td_New'))

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/a_Short Form Article'))

WebUI.setText(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/input_Title_articleTitle'), 
    GlobalVariable.SFAArticleName)

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/button_Select author(s)'))

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/a_Andrew Belton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/select_Amarveer SinghAndrew BeltonAndrew Br_f69fc1'), 
    'analyst/abelton', true)

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_Quark Publishing Platform Web Client/button_Create'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/CreateSFAArticle/Page_TitleSFA-2.xml/div_Teaser__f45sc98b5-1054-4afc-a40a-fdc6533a311c'))

