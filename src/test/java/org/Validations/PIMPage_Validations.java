package org.Validations;

import org.PageObjects.PIMPageObjects;
import org.Utilities.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class PIMPage_Validations extends Browser {
    SoftAssert SF = new SoftAssert();
    @Test
    public void Geturl(){
        String Current_Url = driver.getCurrentUrl();
        SF.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList",Current_Url,"URL is not matched");
    }

    @Test
    public void AddEmployeePage(){
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        String Current_Url = driver.getCurrentUrl();
        SF.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee",Current_Url,"Add Employee page URL is not matching");
    }
    @Test
    public void Firstname(){
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        PPO.Firstname().sendKeys("David");
    }
    @Test
    public void Middlename(){
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        PPO.Middlename().sendKeys("SA");
    }
    @Test
    public void lastname(){
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        PPO.Lastname().sendKeys("Beckham");
    }
    @Test
    public void GetEmpId(){
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        String Empid = PPO.Empid().getText();
        SF.assertNotNull(Empid,"Emp Id not present");
    }
    @Test
    public void SaveBtn() throws InterruptedException {
        PIMPageObjects PPO = new PIMPageObjects(driver);
        PPO.Addbtn().click();
        PPO.Firstname().sendKeys("xs");
        PPO.Lastname().sendKeys("sx");
        //PPO.Empidclk().click();
        //PPO.Empid().clear();
        //PPO.Empid().sendKeys("505");
        PPO.Savebtn().click();
        //PPO.Wait("//div[@id='oxd-toaster_1']/div/div/child::div[2]/p[1]");
        System.out.println(PPO.Toastmessage("//div[@id='oxd-toaster_1']/div/div/child::div[2]/p[1]").getText());
        //PPO.Toastmessage().getAttribute("innerHTML");
    }
}
