package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FindTrasactionsPage extends PageBase {

@FindBy(xpath = "//a[@href='#ui-tabs-2']")
public WebElement clickFindTransactions;

@FindBy(id = "aa_fromDate")
public WebElement fromDate;

@FindBy(id = "aa_toDate")
public WebElement toDate;

@FindBy(tagName = "button")
public WebElement Find;

@FindBy(id = "aa_description")
public WebElement description;

@FindBy(xpath = "(//table//tbody)[2]/tr/td[2]")
public List<WebElement> onlineDescription;



public void clickToFindTransaction(){
    clickFindTransactions.click();
    BrowserUtilities.wait(2);

}

public void enterDate(){
    fromDate.sendKeys("2012-09-01");
    toDate.sendKeys("2012-09-06");

}

public void clickToFind(){
    Find.click();
}

public void setDescription(){
    description.sendKeys("ONLINE");
}


public void listOfDescriptions(){
    for (WebElement onlineDescription : onlineDescription) {
        String str = onlineDescription.getText();
        Assert.assertTrue(str.contains("ONLINE"));

        }


   }


}
