package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.UbenchPage;
import utilites.ConfigReader;
import utilites.Driver;


public class UbenchTest {
    UbenchPage ubenchPage = new UbenchPage();
    @Given("Go to homepage")
    public void go_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("ubench"));

    }
    @Given("Enter valid license plate {string}")
    public void enter_valid_license_plate(String string) {
        ubenchPage.plate.sendKeys(string);

    }
    @Given("Press continue button")
    public void press_continue_button() {
    ubenchPage.continueButton.click();

    }
    @Given("Enter a location")
    public void enter_a_location() {
    ubenchPage.locationBox.sendKeys("Antwerpen, Belgium");

    }
    @Given("Select date of accident")
    public void select_date_of_accident() {
    ubenchPage.dateBox.sendKeys("March 12, 2024");

    }
    @Given("Select Time of accident")
    public void select_time_of_accident() {
    ubenchPage.timeBox.sendKeys("10:00");

    }
    @Given("Enter name")
    public void enter_name() {
    ubenchPage.nameBox.sendKeys("Birol");

    }
    @Given("Enter lastname")
    public void enter_lastname() {
    ubenchPage.lastNameBox.sendKeys("Cetin");

    }
    @Given("Enter {string}")
    public void enter_invalid(String string) {
    ubenchPage.emailBox.sendKeys(string);

    }
    @Given("Enter phone")
    public void enter_phone() {
    ubenchPage.phoneBox.sendKeys("+32492176686");

    }


}
