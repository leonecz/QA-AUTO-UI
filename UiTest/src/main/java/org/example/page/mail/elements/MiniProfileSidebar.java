package org.example.page.mail.elements;

import io.qameta.allure.Step;
import org.example.page.BaseElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий элемент раскрывающегося сайдбара с информацией о пользователе
 */
public class MiniProfileSidebar extends BaseElement {
    @FindBy(xpath = ".//*[contains(@class, 'ph-desc__email')]")
    private WebElement mail;

    @Step("Проверить, что в окне профиля отображается mail '{0}'")
    public void checkMail(String login) {
        elementContainText(mail, login);
    }
}
