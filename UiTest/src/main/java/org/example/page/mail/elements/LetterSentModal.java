package org.example.page.mail.elements;

import io.qameta.allure.Step;
import org.example.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий модальное окно 'Письмо отправлено'
 */
public class LetterSentModal extends BasePage {
    @FindBy(xpath = "//*[contains(@class, 'layer__controls')]//*[contains(@class, 'button2__wrapper')]")
    private WebElement closeModalButton;

    @Step("Закрыть модальное окно отправленного письма")
    public void closeModal() {
        click(closeModalButton);
    }
}
