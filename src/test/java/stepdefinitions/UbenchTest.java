package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.UbenchPage;
import utilites.ConfigReader;
import utilites.Driver;


public class UbenchTest {

    public UbenchTest() {
    }

    UbenchPage ubenchPage = new UbenchPage();
    @Given("Go to homepage")
    public void go_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("ubench"));

    }
    @Given("Enter valid license plate {string}")
    public void enter_valid_license_plate(String string) {
       Driver.wait(2);
        ubenchPage.plate.sendKeys(string);

    }
    @Given("Press continue button")
    public void press_continue_button() {
    ubenchPage.continueButton.click();

    }
    @Given("Enter a location")
    public void enter_a_location() {
        Driver.wait(2);
  //  ubenchPage.locationBox.sendKeys("Antwerpen, Belgium" + Keys.ENTER);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].value='Antwerpen, Belgium';", ubenchPage.locationBox);
    }
    @Given("Select date of accident")
    public void select_date_of_accident() {
        Driver.wait(1);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].value='March 12, 2024';", ubenchPage.dateBox);


    }
    @Given("Select Time of accident")
    public void select_time_of_accident() {
        Driver.wait(1);

        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].value='10:00';", ubenchPage.dateBox);

    }
    @Given("Enter name")
    public void enter_name() {
        Driver.wait(1);

        ubenchPage.nameBox.sendKeys("Birol");

    }
    @Given("Enter lastname")
    public void enter_lastname() {
        Driver.wait(1);

        ubenchPage.lastNameBox.sendKeys("Cetin");

    }
    @Given("Enter {string}")
    public void enter_invalid(String string) {
        Driver.wait(1);

        ubenchPage.emailBox.sendKeys(string);

    }
    @Given("Enter phone")
    public void enter_phone() {
        Driver.wait(1);

        ubenchPage.phoneBox.sendKeys("+32492176686");

    }
    @Given("Press continue button and quit")
    public void press_continue_button_and_quit() {
        Driver.wait(1);
        Assert.assertTrue(ubenchPage.continueButton.isEnabled());
        ubenchPage.continueButton.click();
        Assert.assertTrue(ubenchPage.assertionElement.isDisplayed());
        Driver.closeDriver();
    }





}
