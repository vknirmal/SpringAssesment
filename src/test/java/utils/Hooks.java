package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import static steps.BaseClass.driver;

public class Hooks {

    ReadConfigFile readConfigFile = new ReadConfigFile();
    public String url = readConfigFile.readValue("contactsus_url");
    @Before
    public void setUp(){
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
