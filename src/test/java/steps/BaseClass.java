package steps;

import org.openqa.selenium.WebDriver;
import pages.ContactUs;
import utils.ReadConfigFile;

public abstract class BaseClass {

    public static WebDriver driver;
    ReadConfigFile readConfigFile;
    ContactUs contactUs;

    public BaseClass(){
        readConfigFile = new ReadConfigFile();

    }

}
