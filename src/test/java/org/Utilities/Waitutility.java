package org.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waitutility {
    WebDriver driver;
    WebDriverWait wait;
    int Seconds;

    public Waitutility(WebDriver driver){
        this.driver=driver;
        Property POP = new Property();
        POP.Propertyfiledata();
        String S = POP.Getname("explicittime");
        Seconds = Integer.parseInt(POP.Getname("explicittime"));
        System.out.println(Seconds);
    }

    public void WaitUntilvisiblityofelement(String Locator){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
    }

    public void WaitUntiElementisclickable(String Locator){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds) );
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
    }
}
