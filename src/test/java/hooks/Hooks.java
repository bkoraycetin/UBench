package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import utilites.Driver;


public class Hooks {


    @After
    public void afterScenario(Scenario scenario){
        if (scenario.isFailed())   {
            try {
                Driver Driver = null;
                final byte[] screenshot = ((TakesScreenshot)  Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot name");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
            finally {
                utilites.Driver.getDriver().quit();
            }
        }
        }





    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","screenshots");
    }}
