package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilitiy.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement WelcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement alertMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    // Creating Methods

    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "Get Welcome Text " + WelcomeText);
        Reporter.log("Get welcome text " + WelcomeText.toString());
        return getTextFromElement(WelcomeText);


    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter" + email + "to" + emailField);
        Reporter.log("Enter" + email + "to" + emailField.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter" + password + "to" + passwordField);
        Reporter.log("Enter" + password + "to" + password.toString());

    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click On" + loginButton);
        Reporter.log("Click On" + loginButton.toString());
    }

    public String getAlertMessage() {
        CustomListeners.test.log(Status.PASS, "Get alert Text " + alertMessage);
        Reporter.log("Get alert text " + alertMessage.toString());
        return getTextFromElement(alertMessage);
    }


    public String getErrorMessage() {

        CustomListeners.test.log(Status.PASS, "Get errorMessage");
        return getTextFromElement(errorMessage);

    }
}

