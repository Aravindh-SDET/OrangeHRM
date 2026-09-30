package org.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Browser {
    protected WebDriver driver;
    @BeforeMethod
    public void Launch(){
        driver = new ChromeDriver();
        Property Prop = new Property();
        Prop.Propertyfiledata();
        String Url = Prop.Getname("app.url");
        driver.get(Url);
        driver.manage().window().maximize();
        Timeouts();
    }

    @AfterMethod
    public void Teardown(){
        driver.quit();
    }

    public void Timeouts(){
        Property Prop = new Property();
        Prop.Propertyfiledata();
        int Time = Integer.parseInt(Prop.Getname("implicittime"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
    }
}
