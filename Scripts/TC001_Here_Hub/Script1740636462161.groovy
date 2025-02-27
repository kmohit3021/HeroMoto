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

Mobile.setText(findTestObject('Object Repository/OR_Here_Hub/android.widget.EditText'), 'prathmesh.mahure.ext@heromotocorp.com', 
    10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (1)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (2)'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

def text1 = Mobile.getAttribute(findTestObject('Object Repository/OR_Here_Hub/android.view.View (3)'), 'contentDescription', 
    10)

println(('************* ' + text1) + ' ***************')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (4)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (5)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView (1)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (6)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView (2)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (7)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (8)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.Button'), 10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView (3)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView (4)'), 10)

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.view.View (9)'), 10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/OR_Here_Hub/android.widget.ImageView (5)'), 10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

