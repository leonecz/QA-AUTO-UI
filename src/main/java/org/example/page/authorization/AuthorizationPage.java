package org.example.page.authorization;

import io.qameta.allure.Step;
import org.example.page.BasePage;
import org.example.page.mail.MailMainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Описывает страницу авторизации
 */
public class AuthorizationPage extends BasePage {
    @FindBy(name = "username")
    private WebElement loginField;
    @FindBy(name = "password")
    private WebElement passwordField;

    public AuthorizationPage checkOpenPage() {
        return this;
    }

    @Step("Авторизоваться на странице mail.ru")
    public MailMainPage login(String login, String password) {
        sendKeys(loginField, login, Keys.ENTER);
        sendKeys(passwordField, password, Keys.ENTER);
        return new MailMainPage();
    }


}
