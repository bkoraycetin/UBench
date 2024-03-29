package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;


public class UbenchPage {
    public UbenchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@placeholder='1AAA111']")
    public WebElement plate;

    @FindBy (id = "next")
    public WebElement continueButton;


    @FindBy (xpath = "//input[@name='location']")
    public WebElement locationBox;

    @FindBy (name = "date")
    public WebElement dateBox;


    @FindBy (xpath = "//div[@placeholder='Time of accident']")
    public WebElement timeBox;



    @FindBy (xpath = "//input[@name='driver.firstName']")
    public WebElement nameBox;


    @FindBy (xpath = "//h2[normalize-space()='Third Party']")
    public  WebElement assertionElement;

    @FindBy (xpath = "//input[@name='driver.lastName']")
    public WebElement lastNameBox;


    @FindBy (xpath = "//input[@name='driver.email']")
    public WebElement emailBox;



    @FindBy (xpath = "//input[@name='driver.phone']")
    public WebElement phoneBox;





}
