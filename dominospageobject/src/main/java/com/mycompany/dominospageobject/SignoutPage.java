/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominospageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author swetu
 */

public class SignoutPage {

    WebDriver driver;

    public SignoutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/div/button")
    private WebElement signoutPage;

    public void signoutPage() throws Exception {
        try {
            signoutPage.click();
// Logout logout = new Logout(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

