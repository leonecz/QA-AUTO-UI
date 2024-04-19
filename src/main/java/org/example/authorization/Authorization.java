package org.example.authorization;

import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.example.configuration.Configurations;
import org.example.configuration.DriverManager;
import org.example.page.authorization.AuthorizationPage;
import org.example.page.mail.MailMainPage;

/**
 * Класс авторизации на странице
 */
public class Authorization {
    private static final Configurations properties = ConfigFactory.create(Configurations.class);

    @Step("Авторизоваться на mail.ru")
    public static MailMainPage login() {
        DriverManager.open(properties.urlMail());
        new AuthorizationPage()
                .checkOpenPage()
                .login(properties.login(), properties.password());
        return new MailMainPage();
    }

    @Step("Авторизоваться на mail.ru")
    public AuthorizationPage loginIncorrectPassword() {
        DriverManager.open(properties.urlMail());
        new AuthorizationPage()
                .checkOpenPage()
                .login(properties.login(), "123");
        return new AuthorizationPage();
    }

//    @Step("Проверить, что ")
}
