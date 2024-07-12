package com.jackpotjoy.pages;

import com.jackpotjoy.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SportsPage extends Utility {
    private static final Logger log = Logger.getLogger(SportsPage.class);

    @CacheLookup
    @FindBy(id = "sports-tab")
    WebElement sportsTab;

    public void clickOnSportsTab() {
        mouseHoverToElementAndClick(sportsTab);
        log.info("Click On Sports Tab" + sportsTab.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Explore')]")
    WebElement explorer;

    public void clickOnExplorerTab() {
        mouseHoverToElementAndClick(explorer);
        log.info("Click on Explorer Tab" + explorer.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app-main']/div[1]/div[1]/div[1]/div[4]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/section[1]/ul[1]/li[4]/a[1]/button[1]/div[1]")
    WebElement tennis;

    public void clickOnTennisTab() {
        mouseHoverToElementAndClick(tennis);
        log.info("click on Tennis Tab" + tennis.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Tennis')]")
    WebElement tennisText;

    public void verifyTennisText() {
        Assert.assertEquals(tennisText.getText(), "Tennis");
        log.info("verify Tennis Text" + tennisText.toString());
    }
}
