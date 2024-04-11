package org.example.page.mail.elements;

import io.qameta.allure.Step;
import org.example.page.BaseElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendingLetterModal extends BaseElement {
    @FindBy(xpath = "//*[contains(@class, 'focus-zone')]//*[contains(@type, 'text')]")
    private WebElement toWhom;

    @FindBy(name = "Subject")
    private WebElement subject;

    @FindBy(xpath = "//*[contains(@role, 'textbox')]")
    private WebElement message;

    @FindBy(xpath = "//*[contains(@data-test-id, 'send')]")
    private WebElement send;

    @Step("Написать письмо на адрес '{mail}' c темой '{theme}' и текстом '{text}'")
    public LetterSentModal sendMail(final String mail, final String theme, final String text) {
        sendKeys(toWhom, mail);
        sendKeys(subject, theme);
        sendKeys(message, text);
        click(send);
        return new LetterSentModal();
    }
}
