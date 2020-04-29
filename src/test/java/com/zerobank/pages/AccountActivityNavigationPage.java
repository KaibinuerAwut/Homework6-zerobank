package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationPage extends PageBase{

@FindBy(xpath = "((//table)[1]//td[1])[1]/a")
    public WebElement clickOnSavings;

@FindBy(id = "aa_accountId")
public WebElement selectedBox;

@FindBy(xpath = "((//table)[2]//td)[1]/a")
public WebElement clickBrokerage;

@FindBy(xpath = "((//table)[3]//td)[1]/a")
public WebElement clickChecking;

@FindBy(xpath = "((//table)[3]//td)[4]/a")
public WebElement clickCreditCard;

@FindBy(xpath = "((//table)[4]//td)[1]/a")
public WebElement clickLoan;



public void clickOnSavings(){
    clickOnSavings.click();
    BrowserUtilities.wait(2);

}

public void savingsSelected(){
    Select select = new Select(selectedBox);
    System.out.println(select.getFirstSelectedOption());
    Assert.assertEquals(select.getFirstSelectedOption().getText(), "Savings");

}

public void clickOnBrokerage(){
    clickBrokerage.click();
    BrowserUtilities.wait(2);

}

public void brokerageSelected(){
    Select select = new Select(selectedBox);
    System.out.println(select.getFirstSelectedOption());
    Assert.assertEquals(select.getFirstSelectedOption().getText(), "Brokerage");


}
public void clickOnChecking(){
    clickChecking.click();
    BrowserUtilities.wait(2);


}
public void checkingSelected(){
    Select select = new Select(selectedBox);
    System.out.println(select.getFirstSelectedOption());
    Assert.assertEquals(select.getFirstSelectedOption().getText(), "Checking");

}

public void clickCreditCard(){
    clickCreditCard.click();
    BrowserUtilities.wait(2);


}
public void creditCardSelected(){
    Select select = new Select(selectedBox);
    System.out.println(select.getFirstSelectedOption());
    Assert.assertEquals(select.getFirstSelectedOption().getText(), "Credit Card");


}

public void clickOnLoan(){
    clickLoan.click();
    BrowserUtilities.wait(2);

}
public void loanSelected(){
    Select select = new Select(selectedBox);
    System.out.println(select.getFirstSelectedOption());
    Assert.assertEquals(select.getFirstSelectedOption().getText(), "Loan");




}


}
