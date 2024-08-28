package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactUs;

public class ContactUsTest extends BaseClass{

    @Given("User is on Contact Us Page")
    public void contact_us_page_loaded() {
        contactUs = new ContactUs(BaseClass.driver);
    }
    @When("When the user enters a valid email address")
    public void enter_valid_email(String string) {
        contactUs.enterFirstName("Nirmal");
        contactUs.enterLastName("Vk");
        contactUs.enterEmailAddress(string);
        contactUs.enterComments("This a Comment");
    }

    @When("the user enters an email address missing the @ symbol")
    public void enter_invalid_email1(String string) {
        contactUs.enterFirstName("Nirmal");
        contactUs.enterLastName("Vk");
        contactUs.enterEmailAddress(string);
        contactUs.enterComments("This a Comment");
    }
    @When("the user enters an email address missing the domain part")
    public void enter_invalid_email2(String string) {
        contactUs.enterFirstName("Nirmal");
        contactUs.enterLastName("Vk");
        contactUs.enterEmailAddress(string);
        contactUs.enterComments("This a Comment");
    }
    @When("the user enters an email address with multiple @ symbols")
    public void enter_invalid_email3(String string) {
        contactUs.enterFirstName("Nirmal");
        contactUs.enterLastName("Vk");
        contactUs.enterEmailAddress(string);
        contactUs.enterComments("This a Comment");
    }

    @When("the user submits the form")
    public void click_submit() {
        contactUs.clickSubmitButton();
    }

    @Then("the form should be submitted successfully")
    public void submit_success(){
        String msg = contactUs.getSuccessMsgTxt();
        Assert.assertEquals("Thank You for your Message!",msg);
    }
    @Then("user should see an error message indicating that the email address is invalid")
    public void submit_fail(){
        String msg = contactUs.getFailMsgText();
        Assert.assertEquals("Error: Invalid email address",msg);
    }

}
