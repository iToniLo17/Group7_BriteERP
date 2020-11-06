package com.cybertek.BriteERP.pages;

import com.cybertek.BriteERP.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










}
