package org.example.page;

import org.example.authorization.Authorization;
import org.example.configuration.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Описывает страницу авторизации
 */
public class AuthorizationPage {
    public AuthorizationPage checkOpenPage() {
        return this;
    }

    public MainPage login() {
        return new MainPage();
    }
}
