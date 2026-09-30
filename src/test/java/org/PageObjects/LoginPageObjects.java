package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
    WebDriver driver;
    public LoginPageObjects(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement Loginbutton;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    private WebElement Forgetpassword;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    private WebElement Heading;
    @FindBy(xpath = "(//label[@class='oxd-label'])[1]")
    private WebElement username_Label;
    @FindBy(xpath = "(//label[@class='oxd-label'])[2]")
    private WebElement password_Label;
    @FindBy(xpath = "//input[@name='username']//parent::*//following-sibling::span")
    private WebElement usernameerror;
    @FindBy(xpath = "//input[@name='password']//parent::*//following-sibling::span")
    private WebElement passworderror;

    public WebElement Username(){
        return username;
    }
    public WebElement Password(){
        return password;
    }
    public WebElement LoginButton(){
        return Loginbutton;
    }
    public WebElement ForgetPassword(){
        return Forgetpassword;
    }
    public WebElement Heading(){
        return Heading;
    }
    public WebElement Username_Label(){
        return username_Label;
    }
    public WebElement Password_Label(){
        return password_Label;
    }
    public WebElement Username_Error(){
        return usernameerror;
    }
    public WebElement Password_Error(){
        return passworderror;
    }
    public void Login(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        Loginbutton.click();
    }
}
