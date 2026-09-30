package org.Validations;

import org.PageObjects.LoginPageObjects;
import org.Utilities.Browser;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Loginpage_Validations extends Browser {
    SoftAssert SF = new SoftAssert();
    @Test
    public void URL_Validation(){
        String Current_Url = driver.getCurrentUrl();
        SF.assertEquals("https://opensource-demo.orangehrmlive.com/",Current_Url,"URL validation Failed");
        SF.assertAll();
    }
    @Test
    public void Title_Validation(){
        String Current_Title = driver.getTitle();
        SF.assertEquals("OrangeHRM",Current_Title,"Title is not matching");
        SF.assertAll();
    }
    @Test
    public void Heading_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Current_Heading = LPO.Heading().getText();
        SF.assertEquals("Login",Current_Heading,"");
    }
    @Test
    public void Username_Label_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Username_Label = LPO.Username_Label().getText();
        SF.assertEquals("Username",Username_Label);
    }
    @Test
    public void Password_Label_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Password_Label = LPO.Password_Label().getText();
        SF.assertEquals("Username",Password_Label);
    }
    @Test
    public void Username_Placeholder_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Username_Placeholder = LPO.Username().getAttribute("placeholder");
        SF.assertEquals("Username",Username_Placeholder);
    }
    @Test
    public void Password_Placeholder_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Password_Placeholder = LPO.Password().getAttribute("placeholder");
        SF.assertEquals("Username",Password_Placeholder);
    }
    @Test
    public void Username_Error_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        LPO.Password().sendKeys("admin123");
        LPO.LoginButton().click();
        String Username_Error = LPO.Username_Error().getText();
        SF.assertEquals("Required",Username_Error);
    }
    @Test
    public void Password_Error_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        LPO.Username().sendKeys("Admin");
        LPO.LoginButton().click();
        String Password_Error = LPO.Password_Error().getText();
        SF.assertEquals("Required",Password_Error);
    }
    @Test
    public void Both_Error_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        LPO.LoginButton().click();
        String Username_Error = LPO.Username_Error().getText();
        SF.assertEquals("Required",Username_Error);
        String Password_Error = LPO.Password_Error().getText();
        SF.assertEquals("Required",Password_Error);
    }
    @Test
    public void Forget_Password_Validation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        String Forget_password = LPO.ForgetPassword().getText();
        SF.assertEquals("Forgot your password?",Forget_password);
    }
    @Test
    public void Login_Navigation(){
        LoginPageObjects LPO = new LoginPageObjects(driver);
        LPO.Login();
        String Current_Url = driver.getCurrentUrl();
        SF.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",Current_Url);
    }
}
