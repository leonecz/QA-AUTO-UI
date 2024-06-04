package org.example.page.mail;

import io.qameta.allure.Step;
import org.example.page.BaseElement;
import org.example.page.IncomingMessagesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Описывает левую панель во вкладке почта
 */
public class LeftPanel extends BaseElement {
    @FindBy(id = "sideBarContent")
    private WebElement main;

    @FindBy(xpath = "//div[text()='Входящие']")
    private WebElement incomingButton;

    @Step("Нажать на кнопку 'Входящие'")
    public IncomingMessagesPage clickIncomingMessages() {
        click(incomingButton);
        return new IncomingMessagesPage();
    }
}
