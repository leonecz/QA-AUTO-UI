package org.example.page.mail;

import io.qameta.allure.Step;
import org.example.page.BasePage;
import org.example.page.mail.elements.SendingLetterModal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Главная страница вкладки почта
 */
public class MailMainPage extends BasePage {
    @FindBy(className = "compose-button__txt")
    private WebElement sendMail;

    @Step("Нажать на кнопку 'Написать письмо'")
    public SendingLetterModal clickSendMail() {
        click(sendMail);
        return new SendingLetterModal();
    }
}
