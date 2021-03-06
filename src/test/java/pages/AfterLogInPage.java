package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AfterLogInPage {
    public AfterLogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(linkText = "My Operations")
    public WebElement myOperations;
    @FindBy(linkText = "Manage Customers")
    public WebElement manageCustomers;
    @FindBy(linkText = "Manage Accounts")
    public WebElement manageAccounts;
    @FindBy(linkText = "My Accounts")
    public WebElement myAccounts;
    @FindBy(linkText = "Transfer Money")
    public WebElement transferMoney;
}





