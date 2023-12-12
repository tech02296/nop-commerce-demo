package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilitiy.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender' and @value='F']")
    WebElement femaleRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'E')]")
    WebElement emailLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement headingText;

    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstNameMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordMessage;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateLink;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthLink;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    // Creating Methods

    public String getHeadingText() {
        CustomListeners.test.log(Status.PASS, "Get text" + headingText);
        Reporter.log("Get text " + headingText.toString());
        return getTextFromElement(headingText);

    }

    public void selectGender() {
        clickOnElement(femaleRadio);
        CustomListeners.test.log(Status.PASS, "click on" + femaleRadio);
        Reporter.log("click on" + femaleRadio.toString());
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstNameLink, name);
        CustomListeners.test.log(Status.PASS, "click on" + firstNameLink);
        Reporter.log("click on" + firstNameLink.toString());
    }

    public void enterLastName(String name) {
        sendTextToElement(lastNameLink, name);
        CustomListeners.test.log(Status.PASS, "click on" + lastNameLink);
        Reporter.log("click on" + lastNameLink.toString());
    }

    public void selectDate(String date) {
        selectByValueFromDropDown(dateLink, date);
        CustomListeners.test.log(Status.PASS, "Select" + date + " to " + dateLink);
        Reporter.log("Enter" + date + dateLink.toString());
    }

    public void selectMonth(String month) {
        selectByVisibleTextFromDropDown(monthLink, month);
        CustomListeners.test.log(Status.PASS, "Select" + month + " to " + monthLink);
        Reporter.log("Enter" + month + monthLink.toString());
    }

    public void selectYear(String year) {
        selectByValueFromDropDown(yearLink, year);
        CustomListeners.test.log(Status.PASS, "Select" + year + " to " + yearLink);
        Reporter.log("Enter" + year + yearLink.toString());
    }

    public void enterEmail(String email) {
        sendTextToElement(emailLink, email);
        CustomListeners.test.log(Status.PASS, "Enter" + email + " to " + emailLink);
        Reporter.log("Enter" + email + " to " + emailLink.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordLink, password);
        CustomListeners.test.log(Status.PASS, "Enter" + password + " to " + passwordLink);
        Reporter.log("Enter" + password + " to " + passwordMessage.toString());


    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(confirmPasswordLink, password);
        CustomListeners.test.log(Status.PASS, "Enter" + password + " to " + confirmPasswordLink);
        Reporter.log("Enter" + password + " to " + confirmPasswordLink.toString());

    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click on " + registerButton);
        Reporter.log("Click on " + registerButton.toString());
    }

    public String getRegisterMessage() {
        CustomListeners.test.log(Status.PASS, "Get Message " + registerMessage);
        Reporter.log("Get message " + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }

    public void clickOnContinue() {
        clickOnElement(continueLink);
        CustomListeners.test.log(Status.PASS, "Click on " + continueLink);
        Reporter.log("Click on " + continueLink.toString());

    }

    public String getFirstNameErrror() {
        CustomListeners.test.log(Status.PASS, "Get text" + firstNameMessage);
        Reporter.log("Get text" + firstNameMessage.toString());
        return getTextFromElement(firstNameMessage);

    }

    public String getLastNameError() {
        CustomListeners.test.log(Status.PASS, "Get text " + lastNameMessage);
        Reporter.log("Get text " + lastNameMessage.toString());
        return getTextFromElement(lastNameMessage);
    }

    public String getEmailError() {
        CustomListeners.test.log(Status.PASS, "Get text " + emailMessage);
        Reporter.log("Get text " + emailMessage.toString());
        return getTextFromElement(emailMessage);
    }

    public String getPasswordError() {
        CustomListeners.test.log(Status.PASS, "Get text " + passwordMessage);
        Reporter.log("Get text " + passwordMessage.toString());
        return getTextFromElement(passwordMessage);
    }

    public String getConfirmPasswordError() {
        CustomListeners.test.log(Status.PASS, "Get text " + confirmPasswordMessage);
        Reporter.log("Get text " + confirmPasswordMessage.toString());
        return getTextFromElement(confirmPasswordMessage);
    }

    public String verifyRegistrationCompleted() {
        Reporter.log("verifyRegistrationCompleted");
        CustomListeners.test.log(Status.PASS, "verifyRegistrationCompleted");
        return getTextFromElement(registrationCompleted);
    }

    public String VerifyErrorMessage() {
        Reporter.log("Verify Error Message");
        CustomListeners.test.log(Status.PASS, "Verify Error Message");
        return getTextFromElement(errorMessage);


    }
}













