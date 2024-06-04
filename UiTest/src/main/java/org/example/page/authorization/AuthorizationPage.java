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
    @FindBy(xpath = "//*[@data-test-id='password-input-error']")
    private WebElement incorrectPasswordText;

    public AuthorizationPage checkOpenPage() {
        return this;
    }

    @Step("Авторизоваться на странице mail.ru")
    public MailMainPage login(String login, String password) {
        sendKeys(loginField, login, Keys.ENTER);
        sendKeys(passwordField, password, Keys.ENTER);
        return new MailMainPage();
    }

    @Step("Проверить, что под поле ввода 'Пароль' отобразилась надпись 'Неверный пароль, попробуйте ещё раз'")
    public AuthorizationPage checkTextUnderPassword() {
        elementContainText(incorrectPasswordText, "Неверный пароль, попробуйте ещё раз");
        return this;
    }
}
