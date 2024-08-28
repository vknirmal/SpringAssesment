package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUs{

    WebDriverWait wait;

    @FindBy(xpath="//input[@name=\"first_name\"]")
    WebElement firstName;

    @FindBy(xpath="//input[@name=\"last_name\"]")
    WebElement lastName;

    @FindBy(xpath="//input[@name=\"email\"]")
    WebElement emailAddress;

    @FindBy(xpath="//textarea[@name=\"message\"]")
    WebElement comments;

    @FindBy(xpath="//input[@value=\"SUBMIT\"]")
    WebElement submitButton;

    @FindBy(xpath = "//div[@id=\"contact_reply\"]/h1")
    WebElement successMsg;

    @FindBy(xpath = "/html/body")
    WebElement failMsg;

    public ContactUs(WebDriver driver){
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    }

    public void enterFirstName(String fn){
        firstName.sendKeys(fn);
    }
    public void enterLastName(String ln){
        lastName.sendKeys(ln);
    }
    public void enterEmailAddress(String email){
        emailAddress.sendKeys(email);
    }
    public void enterComments(String com){
        comments.sendKeys(com);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
    public String getSuccessMsgTxt(){
        wait.until(ExpectedConditions.visibilityOf(successMsg));
        return successMsg.getText();
    }
    public String getFailMsgText(){
        wait.until(ExpectedConditions.visibilityOf(failMsg));
        return failMsg.getText();
    }

}
