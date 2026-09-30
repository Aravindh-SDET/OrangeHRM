package org.PageObjects;

import org.Utilities.Waitutility;
import org.Validations.Dashboardpage_Validations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMPageObjects {
    WebDriver driver;
    Waitutility wait;
    public PIMPageObjects(WebDriver driver){
        this.driver = driver;
        DashboardPageObjects DPO = new DashboardPageObjects(driver);
        DPO.PIMpagenavigation();
       this.wait = new Waitutility(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addbtn;
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstname;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middlename;
    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastname;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement empidclk;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement empid;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    private WebElement savebtn;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    private WebElement cancelbtn;
    @FindBy(xpath = "//div[@id='oxd-toaster_1']/div/div/child::div[2]/p[1]")
    private WebElement toastmessge;

    public WebElement Addbtn(){
        return addbtn;
    }
    public WebElement Firstname(){
        return firstname;
    }
    public WebElement Middlename(){
        return middlename;
    }
    public WebElement Lastname(){
        return lastname;
    }
    public WebElement Empid() {
        return empid;
    }
    public WebElement Empidclk(){
        return empidclk;
    }
    public WebElement Savebtn(){
        return savebtn;
    }
    public WebElement Cancelbtn(){
        return cancelbtn;
    }
    public WebElement Toastmessage(String location){
        wait.WaitUntilvisiblityofelement(location);
        return toastmessge;
    }
    /*public void Wait(String location){
        Waitutility wait = new Waitutility(driver);
        wait.WaitUntilvisiblityofelement(location);
    }*/
}
