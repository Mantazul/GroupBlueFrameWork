package homePage;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InformationMenu extends BeforeNAfterMethods {
    @Test
    public void clickOnInformationMenu() {
        WebElement information = ((ChromeDriver) driver).findElementByCssSelector("ul.desktop-links > li:nth-child(2)>a");

        Actions builder = new Actions(driver);
        builder.moveToElement(information).click();
        builder.build().perform();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe-applicationname_ModalDialog_0"));
        WebElement myAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/a/span[2]")));
        builder.moveToElement(myAccount).click();
        builder.perform();
        driver.switchTo().defaultContent();
       /*
        WebElement myAccount = driver.findElement(By.cssSelector("#primary-navigation > div.panel-wrapper.open > ul > li.geico-nav--bluejay.section--bluejay > a > span.geico-nav-menu-item"));

        WebElement claimsAndIncident = driver.findElement(By.cssSelector("#primary-navigation > div > ul > li.geico-nav--marigold.section--marigold > a > span.geico-nav-menu-item"));
        WebElement toolsAndResources = driver.findElement(By.cssSelector("#primary-navigation > div.panel-wrapper.open > ul > li.geico-nav--storm.section--storm.open > a > span.geico-nav-menu-item"));
        WebElement aboutGeico = driver.findElement(By.cssSelector("#primary-navigation > div > ul > li.geico-nav--geico-blue.section--geico-blue.open > a > span.geico-nav-menu-item"));
        WebElement webAndMobile = driver.findElement(By.cssSelector("#primary-navigation > div > ul > li.geico-nav--wisteria.section--wisteria.open > a > span.geico-nav-menu-item"));
        WebElement contactUs = driver.findElement(By.cssSelector("#primary-navigation > div > ul > li.geico-nav--coral.section--coral > a > span.geico-nav-menu-item"));
        builder.moveToElement(myAccount);
        builder.moveToElement(claimsAndIncident);
        builder.moveToElement(toolsAndResources).pause(2000);
        builder.moveToElement(aboutGeico).pause(2000);
        builder.moveToElement(webAndMobile).pause(2000);
        builder.moveToElement(contactUs).pause(2000);*/
        // builder.build().perform();
    }
}
