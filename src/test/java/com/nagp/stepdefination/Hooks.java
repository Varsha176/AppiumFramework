package com.nagp.stepdefination;
import com.nagp.utility.GlobalParams;
import driverManager.DriverManager;
import driverManager.ServerManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Hooks {

    @Before
    public void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
        new ServerManager().startServer();
        new DriverManager().initializeDriver();

    }




        @After
        public void quit(Scenario scenario) throws IOException {
            if(scenario.isFailed()){
                byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
                final byte[] screenshot1 = ((TakesScreenshot) new DriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot1, "image/png",scenario.getName());
            }


       DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
        }
}