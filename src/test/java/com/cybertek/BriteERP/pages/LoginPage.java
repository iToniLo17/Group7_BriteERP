package com.cybertek.BriteERP.pages;

import com.cybertek.BriteERP.utilities.ConfigurationReader;
import com.cybertek.BriteERP.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.util.*;

public class LoginPage extends BasePage{



    @FindBy(xpath = "//input[@id='login']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;


    /* Pass in the parameter which user you want to login as
     * There are 4 different logins
     * ( pos manager, events manager, inventory manager, expenses manager )
     */

    public void login(String enterUser){


        boolean posManager = enterUser.equalsIgnoreCase("pos")
                || enterUser.equalsIgnoreCase("posmanager")
                ||enterUser.equalsIgnoreCase("pos manager");
        boolean eventsManager = enterUser.equalsIgnoreCase("eventsmanager")
                || enterUser.equalsIgnoreCase("events")
                ||enterUser.equalsIgnoreCase("events manager")
                || enterUser.equalsIgnoreCase("event");
        boolean inventoryManager = enterUser.equalsIgnoreCase("inventorymanager")
                ||enterUser.equalsIgnoreCase("inventory")
                ||enterUser.equalsIgnoreCase("inventory manager");
        boolean expensesManager = enterUser.equalsIgnoreCase("expensesmanager")
                ||enterUser.equalsIgnoreCase("expenses")
                ||enterUser.equalsIgnoreCase("expenses manager")
                ||enterUser.equalsIgnoreCase("expense manager");


        if(posManager) {
            emailInput.sendKeys(ConfigurationReader.getProperty("posmanager"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password_posmanager"),Keys.ENTER);
        }else if(eventsManager){
            emailInput.sendKeys(ConfigurationReader.getProperty("eventsmanager"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password_eventmanager"),Keys.ENTER);
        }else if(inventoryManager){
            emailInput.sendKeys(ConfigurationReader.getProperty("inventorymanager"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password_inventorymanager"),Keys.ENTER);
        }else if(expensesManager){
            emailInput.sendKeys(ConfigurationReader.getProperty("expensesmanager"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password_expensesmanager"),Keys.ENTER);
        }else{
            throw new RuntimeException("Not a valid User");
        }




    }








    }





