package com.jackpotjoy.pages;

import com.jackpotjoy.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = Logger.getLogger(LoginPage.class);
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Allow all cookies')]")
    WebElement allCookies;

    public void acceptCookies() {
        clickOnElement(allCookies);
        driver.switchTo().defaultContent();
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginLink;

    public void clickOnLoginLink(){
       waitUntilVisibilityOfElementLocated(By.xpath("//span[contains(text(),'Login')]"),2);
       mouseHoverToElementAndClick(loginLink);
        log.info("Click on Login Link"+loginLink.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='field-username']")
    WebElement emailField;

    public void clickOnEmailField(String email){
        sendTextToElement(emailField,email);
        log.info("Enter email"+emailField.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='field-password']")
    WebElement passwordField;

    public void clickOnPasswordField(String password){
        sendTextToElement(passwordField,password);
        log.info("Enter password"+passwordField.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginSubmit;

    public void clickOnLoginButton(){
        clickOnElement(loginSubmit);
    }
}
