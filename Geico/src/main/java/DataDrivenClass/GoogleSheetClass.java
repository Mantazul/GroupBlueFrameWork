package DataDrivenClass;

import base.ReusableAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static base.GoogleSheetReader.getSheetsService;

public class GoogleSheetClass extends Login{

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
<<<<<<< Updated upstream
                .get(spreadsheetId, range).execute();
=======
                .get(spreadsheetId, range)
                .execute();
>>>>>>> Stashed changes
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        driver.navigate().to("https://ecams.geico.com/ecams/login.xhtml?r=true");
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
<<<<<<< Updated upstream
            Thread.sleep(3000);
            inputValueInTextBoxByWebElement(loginTextBox, row.get(1).toString());
            inputValueInTextBoxByWebElement(passwordTextBox, row.get(2).toString());
            Thread.sleep(3000);
=======
            Thread.sleep(5000);
            inputValueInTextBoxByWebElement(loginTextBox, row.get(1).toString());
            inputValueInTextBoxByWebElement(passwordTextBox, row.get(2).toString());
            Thread.sleep(5000);
>>>>>>> Stashed changes
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(errorMessage));
            System.out.println(getTextByWebElement(errorMessage));
            clearInputBox(loginTextBox);
            clearInputBox(passwordTextBox) ;
<<<<<<< Updated upstream
            Thread.sleep(3000);
=======
            Thread.sleep(5000);
>>>>>>> Stashed changes
        }
        return actual;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}
