package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilitiy.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    // Creating Methods

    public String verifyTextDesktops(){
        Reporter.log("Verify text desktops");
        CustomListeners.test.log(Status.PASS, "Verify text desktops");
        return getTextFromElement(desktopsText);
    }
    public void sortByDropDown(String text){
        Reporter.log("Select from SortBy list:  "+text);
        CustomListeners.test.log(Status.PASS,"Select from SortBy list:  "+text);
        selectByVisibleTextFromDropDown(sortBy,text);
    }
    public void displayDropDown(String text){
        Reporter.log("Select from Display list:  "+text);
        CustomListeners.test.log(Status.PASS,"Select from Display list:  "+text);
        selectByVisibleTextFromDropDown(display,text);
    }




}
