package org.example.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Класс описывающий страницу входящих сообщений
 */
public class IncomingMessagesPage extends BasePage {
    @FindBy(xpath = "//*[contains(@class, 'column_sidebar')]")
    private WebElement main;

    @FindBy(xpath = ".//*[contains(@class, 'column_sidebar')]//*[text()='Письма себе']")
    private WebElement mailMe;

    @FindBy(xpath = "//*[contains(@class, 'llc__container')]")
    private List<WebElement> messages;

    @FindBy(xpath = "//*[contains(@class, '_new-selection')][1]//a//*[contains(@class, 'mt-snt-tmslf__subject-value')]")
    private List<WebElement> firstRow;


    @Step("Проверить, что первое сообщение содержит :  '{0}'")
    public void checkContainsMessages(String theme) {
        click(mailMe);
        elementContainText(firstRow.get(0), theme);
    }
}
