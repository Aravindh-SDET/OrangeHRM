package org.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPageObjects {
    WebDriver driver;
    public DashboardPageObjects(WebDriver driver){
        this.driver = driver;
        LoginPageObjects LOP = new LoginPageObjects(driver);
        LOP.Login();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='oxd-main-menu']/child::*")
    private List<WebElement> Dashboardoptions;
    @FindBy(xpath = "(//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white orangehrm-dashboard-widget'])[2]")
    private WebElement Myactionslist;
    @FindBy(xpath = "((//div[@class='orangehrm-dashboard-widget-header'])[2]/parent::div/child::div)[2]/div/div/p")
    private List<WebElement> Todolist;
    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement PIMoption;


    public List<WebElement> DashBoardoptions(){
        return Dashboardoptions;
    }
    public WebElement MyactionsList(){
        return Myactionslist;
    }
    public List<WebElement> MYTodoList(){
        return Todolist;
    }

    public void PIMpagenavigation(){
        PIMoption.click();
    }
}
