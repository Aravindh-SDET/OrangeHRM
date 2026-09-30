package org.Validations;

import org.PageObjects.DashboardPageObjects;
import org.Utilities.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.*;

import java.util.List;

public class Dashboardpage_Validations extends Browser {
    SoftAssert SF = new SoftAssert();
    @Test(invocationCount = 4)
    public void Clickoptions() throws InterruptedException {
        DashboardPageObjects DPO = new DashboardPageObjects(driver);
        List<WebElement> AllOptions = DPO.DashBoardoptions();
        JavascriptExecutor JS = (JavascriptExecutor)driver;
        for(WebElement Currentoption : AllOptions){
            if((Currentoption.getText()).equals("PIM")){
                Currentoption.click();
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
    }
    @Test
    public void Myactions(){
        DashboardPageObjects DPO = new DashboardPageObjects(driver);
        String Myactions_Text = DPO.MyactionsList().getText();
        SF.assertEquals("My actions",Myactions_Text);
        SF.assertAll();
    }
    @Test()
    public void Todolist(){
        DashboardPageObjects DPO = new DashboardPageObjects(driver);
        List<WebElement> All = DPO.MYTodoList();
        int count=0;
        for (WebElement Cr : All){
            String current = Cr.getText();
            System.out.println(current);
            count++;
        }
        System.out.println(count);
    }
}
