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

println(Username)

TestData data = findTestData('Data Files/CSTestData')

row = getRowIndexByCellValue(data, 'TestcaseID', 'T30')

println(row)

Username = data.getValue('Username', row)

println(Username)

WebUI.callTestCase(findTestCase('Publish SFA'), [('row') : findTestData('CSTestData').getValue('TestcaseID', 1), ('SFATitle') : 'Title: SFA'
        , ('Password') : 'park4701', ('Market') : GlobalVariable.QuarkLoginPage], FailureHandling.STOP_ON_FAILURE)

int getRowIndexByCellValue(TestData testdata, String columnName, String rowCellValue) {
    for (def index : (1..testdata.getRowNumbers())) {
        def value = testdata.getValue(columnName, index)

        if (value.equals(rowCellValue)) {
            return index
        }
    }
    
    return 0
    
    WebUI.callTestCase(findTestCase('Publish SFA'), [('row') : findTestData('CSTestData').getValue('TestcaseID', 1), ('SFATitle') : 'Title: SFA'
            , ('Password') : 'park4701', ('Market') : GlobalVariable.QuarkLoginPage], FailureHandling.STOP_ON_FAILURE)
}

