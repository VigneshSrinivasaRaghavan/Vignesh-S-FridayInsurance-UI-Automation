package tests;

import driver.Driver;
import listeners.Listener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(value = {Listener.class})
public class BaseTest {

    protected BaseTest(){}

    @BeforeMethod
    public void startUp(){
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
