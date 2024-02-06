package org.example.authorization;

import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.example.configuration.Configurations;
import org.example.configuration.DriverManager;
import org.example.page.AuthorizationPage;
import org.example.page.MainPage;

/**
 * Класс авторизации на странице
 */
public class Authorization {
    private static final Configurations properties = ConfigFactory.create(Configurations.class);

    @Step("Авторизоваться на mail.ru")
    public static MainPage login() {
        DriverManager.open(properties.urlMail());
        new AuthorizationPage()
                .checkOpenPage()
                .login();
        return new MainPage().checkOpenPage();
    }
}
