package homePage;
import DataDrivenClass.ConnectToMongoDB;
import base.CommonClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;

public class DropDown extends CommonClass {
    @FindBy(id="homepage_manage_select")
    public static Select dropDownButton;

    public List<String> getDropDownList(){
        List<WebElement> dropDownList = dropDownButton.getOptions();
        List<String> dropDownListText = new LinkedList<>();
        for(WebElement it:dropDownList) {
            dropDownListText.add(it.getText());
           //ConnectToMongoDB.insertToMongoDB(it,"dropDown");
        }
        return dropDownListText;
    }
}