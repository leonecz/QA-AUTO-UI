package org.example.page;

import org.example.configuration.Configurations;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

/**
 * Описывает страницу авторизации
 */
public class AuthorizationPage extends BasePage{
    @FindBy(name = "username")
    private WebElement loginField;
    @FindBy(name = "password")
    private WebElement passwordField;
    private Configurations configurations;
    public AuthorizationPage checkOpenPage() {
        return this;
    }

    public MainPage login(String login, String password) {
        loginField.sendKeys(login, Keys.ENTER);
        passwordField.sendKeys(password, Keys.ENTER);
        return new MainPage();
    }


}
