package homePage;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceProducts extends CommonClass {
    @FindBy(how = How.CSS, using = "#submitButton")
    public static WebElement submitButton;
    @FindBy(how=How.ID, using = "zip")
    public static WebElement zipCodeTextBox;
    @FindBy(how = How.CLASS_NAME, using = "icon-chevron-right")
    public static WebElement rightArrow;

    @FindBy(css = "#home > div > span")
    public static WebElement homeOwnersInsuranceIcon;
    @FindBy(css = ".icon-renters-ins")
    public static WebElement rentersInsuranceIcon;
    @FindBy(css = ".icon-condo-ins")
    public static WebElement condoInsuranceIcon;
    @FindBy(css = ".icon-motorcycle")
    public static WebElement motorCycleInsuranceIcon;
    @FindBy(css = ".icon-boat-ins")
    public static WebElement boatInsuranceIcon;
    @FindBy(css = ".icon-umbrella-ins")
    public static WebElement umbrellaInsuranceIcon;
    @FindBy(css = ".icon-rv-ins")
    public static WebElement rvInsuranceIcon;
    @FindBy(css = ".icon-auto-collector-ins")
    public static WebElement collectorAutoIcon;
    @FindBy(css = ".icon-mobile-home-ins")
    public static WebElement mobileHomeIcon;
    @FindBy(css = ".icon-flood-ins")
    public static WebElement floodIcon;
    @FindBy(css = ".icon-commercial-ins")
    public static WebElement commercialAutoIcon;
    @FindBy(css = "#general > div > span")
    public static WebElement generalLiabilityIcon;
    @FindBy(css = ".icon-professional-liability")
    public static WebElement professionalLiability;
    @FindBy(css = "#businessowners > div > span")
    public static WebElement businessOwnersIcon;

    public void clickOnHomeOwnersInsuranceIcon(){
        homeOwnersInsuranceIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnRentersInsuranceIcon(){
        rentersInsuranceIcon.click();
        sendZipCodeKeys("11435");
    }

    public void clickOnCondoInsurance(){
        condoInsuranceIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnMotorCycleInsurance(){
        motorCycleInsuranceIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnBoatInsurance(){
        boatInsuranceIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnUmbrellaInsurance()throws NullPointerException{
        boatInsuranceIcon.click();
        submitButton.click();
    }
    public void clickOnRVInsurance(){
        rvInsuranceIcon.click();
        submitButton.click();
    }
    public void clickOnCollectorAutoIcon(){
        collectorAutoIcon.click();
        submitButton.click();
    }
    public void clickOnMobileHomeIcon(){
        mobileHomeIcon.click();
        submitButton.click();
    }
    public void clickOnFloodIcon(){
        floodIcon.click();
        submitButton.click();
    }
    public void clickOnCommercialAutoIcon(){
        commercialAutoIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnGeneralLiabilityIcon(){
        generalLiabilityIcon.click();
        submitButton.click();
    }
    public void clickOnProfessionalLiabilityIcon(){
        professionalLiability.click();
        submitButton.click();
    }
    public void clickOnBusinessOwnersIcon(){
        businessOwnersIcon.click();
        submitButton.click();
    }

    public void goRight(){
        rightArrow.click();
    }

    public void sendZipCodeKeys(String zipCode){
        zipCodeTextBox.sendKeys(zipCode);
        submitButton.click();
    }

}
