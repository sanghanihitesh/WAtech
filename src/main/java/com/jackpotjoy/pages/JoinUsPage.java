package com.jackpotjoy.pages;

import com.jackpotjoy.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JoinUsPage extends Utility {
    private static final Logger log = Logger.getLogger(JoinUsPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@class='banner-content']//span[@class='BcnButton-label'][normalize-space()='Join Us']")
    WebElement joinBtn;

    public void clickOnJoinUsButton() {
        mouseHoverToElementAndClick(joinBtn);
        log.info("Click On JoinUs button" + joinBtn.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='email']")
    WebElement enterEmail;

    public void setEnterEmail() {
        clickOnElement(enterEmail);
        sendTextToElement(enterEmail, "hitu2005@gmail.com");
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='title']")
    WebElement enterTitle;

    public void selectTitle() {
        clickOnElement(enterTitle);
        selectByValueFromDropDown(enterEmail, "Mr");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement fName;

    public void setfName() {
        clickOnElement(fName);
        sendTextToElement(fName, "Hitesh");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='surname']")
    WebElement surName;

    public void setSurName() {
        clickOnElement(surName);
        sendTextToElement(surName, "Sanghani");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='dobYear']")
    WebElement dateOfBirth;

    public void setDateOfBirth() {
        clickOnElement(dateOfBirth);
        sendTextToElement(dateOfBirth, "12/08/1984");
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement gender;

    public void setGender() {
        clickOnElement(gender);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Next Step']")
    WebElement nextButton;

    public void clickOnNextButton() {
        clickOnElement(nextButton);
    }
}
