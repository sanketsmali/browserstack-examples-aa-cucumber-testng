package com.browserstack.examples.pages;

import org.openqa.selenium.support.PageFactory;

import com.browserstack.examples.utils.MobileHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
    protected AppiumDriver<?> driver;
    protected MobileHelper mobileHelper;

    public BasePage(AppiumDriver<?> driver) {
        this.driver = driver;
        this.mobileHelper = new MobileHelper(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}