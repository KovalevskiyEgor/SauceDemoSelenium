package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class CheckoutPage extends BasePage{
    @FindBy(xpath = "//input[@name=\"firstName\"]")
    private WebElement firstnameField;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    private WebElement lastnameField;

    @FindBy(xpath = "//input[@name=\"postalCode\"]")
    private WebElement postalCodeField;

    @FindBy(xpath = "//input[@name=\"continue\"]")
    private WebElement continueButton;

    public CheckoutPage (){
        PageFactory.initElements(driver, this);
    }

    public void insertFirstname(String firstname){
        firstnameField.sendKeys(firstname);
    }
    public void insertLastname(String lastname){
        lastnameField.sendKeys(lastname);
    }
    public void insertPostalCode(String postalCode){
        postalCodeField.sendKeys(postalCode);
    }
    @Step("переходим на страницу с деталями заказа")
    public void clickOnContinueButton(){
        continueButton.click();
    }
}