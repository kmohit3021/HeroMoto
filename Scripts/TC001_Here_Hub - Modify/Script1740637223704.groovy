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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/mohit/Katalon Studio/HeroMotoSample/App/Hero_Hub_UAT.apk', true)

Mobile.setText(findTestObject('Object Repository/OR_Here_Hub - Modify/Enter Email Id'), 'prathmesh.mahure.ext@heromotocorp.com', 
    10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Test Login'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Health Wellness'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Medical Policies'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

def text1 = Mobile.getAttribute(findTestObject('Object Repository/OR_Here_Hub - Modify/android.view.View'), 'contentDescription', 
    10)

println(('************* ' + text1) + ' ***************')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/MEDI-CLAIM'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Service type'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Empanelled Hospital'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Location'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Agra'), 10)

Mobile.swipe(200, 600, 200, 200)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Search for hospital name'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Centre'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Search'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/android.widget.Button'), 10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/My Apps'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/TRAVEL EXPENSES'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Travel Request'), 10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub - Modify/Approvals'), 10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

