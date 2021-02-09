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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.QuarkLoginPage)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/input_User Name_userName'), 
    'TestQA1')

WebUI.setEncryptedText(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/input_Password_Password'), 
    '3Z9vEXbPUsD5eDQOwLR1+w==')

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/button_Log On'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/em_New'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/span_Short Form Article'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/div_TitleArticle must have a unique and valid title'))

Date today = new Date()

String todaysDate = today.format('MMddhhmmss')

SFATitle = (SFATitle + todaysDate)

WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/input_Title_articleTitle'), 
    SFATitle)

WebUI.setText(findTestObject('PublishSFA/Page_Quark Publishing Platform Web Client/input_FileName_articleTitle'), SFATitle)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/div_Select author(s)'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/span_Andrew Belton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/select_Andrew BeltonAndrew BradyAndrew Moul_3d91ee'), 
    'analyst/abelton', true)

//WebUI.deselectOptionByValue(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/select_Andrew BeltonAndrew BradyAndrew Moul_3d91ee'), 
// 'analyst/abelton', true)
WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/span_Create'))

WebUI.switchToWindowTitle(SFATitle + '.xml')

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserBody'))

WebUI.setText(findTestObject('PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserBody'), 'Sample teaser')

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserSample teaeserBody'))

WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserSample teaeserBody'), 
    'Sample body text')

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_'))

//WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserSample teaserBod_6ae0a5'), 
//  '<div data-qxe-type="shortFormArticle" data-qxe-element="section" data-qxe-id="_af03929b-0b94-4241-b950-c58e3f59077d" id="_7ee0c454-e56f-44eda-af0d-48661c8afb67" class="section shortFormArticle" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5c06e8ba-047e-474d-b67b-74862573044d" class="title" data-qxe-token-id="_3eb3e30f-2489-44c3-a66a-3e6b87084dca" style="">ShortFormArticle1</h1><div data-qxe-type="teaser" data-qxe-element="section" data-qxe-id="_b23ec7d3-b474-4cfa-ae76-0dc422955013" id="_5955bs252-ffba-49df-939f-164c661501b0" class="section teaser" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_fd5607e6-dcfa-4952-bacb-fdbc4ad0527a" class="title noneditable customSectionHeader" data-qxe-token-id="_d1a12663-01b9-4463-9143-5c7cbc1e4835" style="">Teaser<span class="teaser-automation-button" data-qxe-linked-command="populateteasercontent" title="Populate content from Body Section"></span></h1><div data-qxe-element="body" data-qxe-id="_eb21b094-99a9-42b3-a912-edd7775a4ebe" class="body" style=""><div data-qxe-element="p" data-qxe-id="_717778c8-c542-4a0a-9559-ba5823ae0b07" id="_f0ef16c4-29a1-4c53-b5fd-38e0aa0feef3" class="p" data-qxe-token-id="_124cad4b-3100-4956-8e85-820b35eeb093" style="">Sample teaser</div></div></div><div data-qxe-type="body" data-qxe-element="section" data-qxe-id="_914ef2ed-1c38-4220-bb49-679797fb0d20" id="_66c886f5-8f83-4aa0-bscf9-d10bcd2e340a" class="section body" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5a076778-3aa2-4352-b1e2-4a2d6bff81a3" class="title noneditable" data-qxe-token-id="_fd56a6aa-546e-4479-8fea-ca7b623d0f91" style="">Body</h1><div data-qxe-element="body" data-qxe-id="_be36a59d-1e21-4fd3-8d8a-e2b41ba1cfec" class="body" style=""><div data-qxe-element="p" data-qxe-id="_566517b3-71ab-4d70-87b7-9ec6a3bb6ebc" id="_34ffb02b-2b9d-48d7-a811-56db77c4e2ef" class="p" data-qxe-token-id="_fa6b9ca2-df1e-44d8-9012-4464ef4a21d1" style="">Sample body test text</div></div></div></div>')
WebUI.doubleClick(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Andrew Brady'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/select_ChooseOutperformUnderperformMarket p_26911d'))

WebUI.doubleClick(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Trip Notes'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/label_Channel Reports'))

WebUI.doubleClick(findTestObject('PublishSFA/Page_ShortFormArticle1xml/li_Asia Summary'))

//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Subscriber Highlights (1)'))
WebUI.doubleClick(findTestObject('PublishSFA/Page_ShortFormArticle1xml/li_Subscriber Highlights'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/select_ChooseTags_Tab'))

WebUI.doubleClick(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Apple'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/label_Focused_on_apple'))

WebUI.doubleClick(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Asia-Pacific'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/label_Focused on'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/a_Recommendations'))

WebUI.selectOptionByValue(findTestObject('PublishSFA/Page_ShortFormArticle1xml/select_ChooseRecommendation'), 'Hold', true)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Author(s)'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Content Type Tags'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Tags'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/a_Recommendations'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/button_Save'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_'))

//WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div_ShortFormArticle1TeaserSample teaserBod_6ae0a5'), 
// '<div data-qxe-type="shortFormArticle" data-qxe-element="section" data-qxe-id="_af03929b-0b94-4241-b950-c58e3f59077d" id="_7ee0c454-e56f-44eda-af0d-48661c8afb67" class="section shortFormArticle" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5c06e8ba-047e-474d-b67b-74862573044d" class="title" data-qxe-token-id="_3eb3e30f-2489-44c3-a66a-3e6b87084dca" style="">ShortFormArticle1</h1><div data-qxe-type="teaser" data-qxe-element="section" data-qxe-id="_b23ec7d3-b474-4cfa-ae76-0dc422955013" id="_5955bs252-ffba-49df-939f-164c661501b0" class="section teaser" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_fd5607e6-dcfa-4952-bacb-fdbc4ad0527a" class="title noneditable customSectionHeader" data-qxe-token-id="_d1a12663-01b9-4463-9143-5c7cbc1e4835" style="">Teaser<span class="teaser-automation-button" data-qxe-linked-command="populateteasercontent" title="Populate content from Body Section"></span></h1><div data-qxe-element="body" data-qxe-id="_eb21b094-99a9-42b3-a912-edd7775a4ebe" class="body" style=""><div data-qxe-element="p" data-qxe-id="_717778c8-c542-4a0a-9559-ba5823ae0b07" id="_09ee02dc-6031-49ee-941e-1a817d57dc74" class="p" data-qxe-token-id="_124cad4b-3100-4956-8e85-820b35eeb093" style="">Sample teaser</div></div></div><div data-qxe-type="body" data-qxe-element="section" data-qxe-id="_914ef2ed-1c38-4220-bb49-679797fb0d20" id="_66c886f5-8f83-4aa0-bscf9-d10bcd2e340a" class="section body" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5a076778-3aa2-4352-b1e2-4a2d6bff81a3" class="title noneditable" data-qxe-token-id="_fd56a6aa-546e-4479-8fea-ca7b623d0f91" style="">Body</h1><div data-qxe-element="body" data-qxe-id="_be36a59d-1e21-4fd3-8d8a-e2b41ba1cfec" class="body" style=""><div data-qxe-element="p" data-qxe-id="_566517b3-71ab-4d70-87b7-9ec6a3bb6ebc" id="_34ffb02b-2b9d-48d7-a811-56db77c4e2ef" class="p" data-qxe-token-id="_fa6b9ca2-df1e-44d8-9012-4464ef4a21d1" style="">Sample body test text</div></div></div></div>')
WebUI.verifyElementPresent(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Andrew Belton'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Andrew Brady'), 0)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Content Type Tags'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Trip Notes'), 0)

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/label_Channel Reports'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Asia Summary (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Subscriber Highlights (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Tags'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/a_Recommendations (1)'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/body_Save RevisionSave and Check InDiscard _52ac35_1_2'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/button_Save'))

WebUI.click(findTestObject('PublishSFA/Page_ShortFormArticle1xml/span_Save Revision'))

//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div__ext-gen1806'))
//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Publish'))
//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div__ext-gen1843'))
//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Admin'))
WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_Save_button-1267-btnIconEl'))

//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_OK_button-1280-btnIconEl'))
//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/h1_ShortFormArticle1'))
//WebUI.setText(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div_Title  ShortFormArticle1TeaserSample te_cf04db'), 
//  '<div data-qxe-type="shortFormArticle" data-qxe-element="section" data-qxe-id="_af03929b-0b94-4241-b950-c58e3f59077d" id="_7ee0c454-e56f-44eda-af0d-48661c8afb67" class="section shortFormArticle" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5c06e8ba-047e-474d-b67b-74862573044d" class="title" data-qxe-token-id="_3eb3e30f-2489-44c3-a66a-3e6b87084dca" style="">Title : ShortFormArticle1</h1><div data-qxe-type="teaser" data-qxe-element="section" data-qxe-id="_b23ec7d3-b474-4cfa-ae76-0dc422955013" id="_5955bs252-ffba-49df-939f-164c661501b0" class="section teaser" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_fd5607e6-dcfa-4952-bacb-fdbc4ad0527a" class="title noneditable customSectionHeader" data-qxe-token-id="_d1a12663-01b9-4463-9143-5c7cbc1e4835" style="">Teaser<span class="teaser-automation-button" data-qxe-linked-command="populateteasercontent" title="Populate content from Body Section"></span></h1><div data-qxe-element="body" data-qxe-id="_eb21b094-99a9-42b3-a912-edd7775a4ebe" class="body" style=""><div data-qxe-element="p" data-qxe-id="_717778c8-c542-4a0a-9559-ba5823ae0b07" id="_09ee02dc-6031-49ee-941e-1a817d57dc74" class="p" data-qxe-token-id="_124cad4b-3100-4956-8e85-820b35eeb093" style="">Sample teaser</div></div></div><div data-qxe-type="body" data-qxe-element="section" data-qxe-id="_914ef2ed-1c38-4220-bb49-679797fb0d20" id="_66c886f5-8f83-4aa0-bscf9-d10bcd2e340a" class="section body" style=""><h1 title="Title" data-qxe-element="title" data-qxe-id="_5a076778-3aa2-4352-b1e2-4a2d6bff81a3" class="title noneditable" data-qxe-token-id="_fd56a6aa-546e-4479-8fea-ca7b623d0f91" style="">Body</h1><div data-qxe-element="body" data-qxe-id="_be36a59d-1e21-4fd3-8d8a-e2b41ba1cfec" class="body" style=""><div data-qxe-element="p" data-qxe-id="_566517b3-71ab-4d70-87b7-9ec6a3bb6ebc" id="_34ffb02b-2b9d-48d7-a811-56db77c4e2ef" class="p" data-qxe-token-id="_fa6b9ca2-df1e-44d8-9012-4464ef4a21d1" style="">Sample body test text</div></div></div></div>')
WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_Save and Check In'))

println('Selecting dropdown of Status')

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div__ext-gen1978'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Publish'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/div__ext-gen2015'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/li_Admin'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_ShortFormArticle1xml/span_Save_button-1330-btnIconEl'))

WebUI.switchToWindowTitle('Quark Publishing Platform Web Client')

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/span_Short Form Article_1'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/img_Your session will expire inseconds()_sh_f5cdf9'))

WebUI.click(findTestObject('Object Repository/PublishSFA/Page_Quark Publishing Platform Web Client/span_Log Off TestQA1'))

//WebUI.click(findTestObject('Object Repository/PublishSFA/Page_CreditSights Insights - CreditSights/span_Request A Trial_icon-salient-m-user'))
WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.LTESiteLoginPage)

WebUI.setText(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Login/input_username_username'), 'a.higherpower')

WebUI.setEncryptedText(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Login/input_password_password'), 
    'BHDR9pWVXLG0HNOBuHCiHw==')

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - My CS/a_markets'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - My CS/span_Asia-Pacific'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Asia-Pacific/a_Title ShortFormArticle1'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Title ShortFormArticle1/img_Dave Lang_company-logo-img'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - My CS/a_Global CS'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Global CreditSights/a_Title ShortFormArticle1'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Title ShortFormArticle1/img_Dave Lang_company-logo-img'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - My CS/a_Archive'))

WebUI.click(findTestObject('Object Repository/LTE_site/Page_CreditSights(S_B) - Global CreditSight_3bb915/a_Title ShortFormArticle1'))

WebUI.closeBrowser()

