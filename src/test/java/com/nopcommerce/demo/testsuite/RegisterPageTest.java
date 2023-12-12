package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)

public class RegisterPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    RegisterPage registerPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        registerPage = new RegisterPage();
        softAssert = new SoftAssert();

    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //   Click on Register Link
        homePage.clickOnRegisterLink();
        //   Verify "Register" text
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message");

    }
    @Test(groups = {"sanity","smoke"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        //  Click on Register Link
        homePage.clickOnRegisterLink();
        //   Click on "REGISTER" button
        registerPage.clickOnRegister();
        //Verify the error message "First name is required."
        String expectedFirstName = "First name is required.";
        String actualFirstName = registerPage.getFirstNameErrror();
        Assert.assertEquals(actualFirstName, expectedFirstName, "Error message");
        //   Verify the error message "Last name is required."
        String expectedLastName = "Last name is required.";
        String actualLastName = registerPage.getLastNameError();
        Assert.assertEquals(actualLastName, expectedLastName, "Error message");
        //   Verify the error message "Email is required."
        String expectedEmail = "Email is required.";
        String actualEmail = registerPage.getEmailError();
        Assert.assertEquals(actualEmail, expectedEmail, "Error message");
        // Verify the error message "Password is required."
        String expectedPassword = "Password is required.";
        String actualPassword = registerPage.getPasswordError();
        Assert.assertEquals(actualPassword, expectedPassword, "Password required is not displayed");
        // Verify the error message "Password is required."
        String expectedConfirmPassword = "Password is required.";
        String actualConfirmPassword = registerPage.getConfirmPasswordError();
        Assert.assertEquals(actualConfirmPassword, expectedConfirmPassword, "Confirm password required is not displayed");

    }

    @Test(groups = {"regression"})
    public void  VerifyThatUserShouldCreateAccountSuccessfully(){
        // Click on RegisterLink
        homePage.clickOnRegisterLink();
        //Select Gender
        registerPage.selectGender();
        //Enter FirstName
        registerPage.enterFirstName("Prime");
        //Enter LastName
        registerPage.enterLastName("Testing");
        //Select Date
        registerPage.selectDate("20");
        //Selcet Month
        registerPage.selectMonth("November");
        //Select year
        registerPage.selectYear("1986");
        //Enter Email
        registerPage.enterEmail("primetesting123@gmail.com");
        //Enter Password
        registerPage.enterPassword("Prime123");
        //Enter ConfirmPassword
        registerPage.enterConfirmPassword("Prime123");
        //Click on register Button
        registerPage.clickOnRegister();
        //Verify that "Your registration completed"
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.verifyRegistrationCompleted();
        Assert.assertEquals(expectedMessage,actualMessage);
        //

    }





}
