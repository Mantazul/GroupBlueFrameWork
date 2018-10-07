package HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestLoginGoogleSheets extends LoginWithGoogleSheet {
    LoginWithGoogleSheet googleSheetsPage;
    @BeforeMethod
    public void initialization(){
        googleSheetsPage = PageFactory.initElements(driver, LoginWithGoogleSheet.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoolgleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInByInvalidIdPass("1H0JiWbL-Hq9to5oI21m65xpY0OQzJ4qCLjdzqbFgy6c","Sheet1!A2:C");
    }
}