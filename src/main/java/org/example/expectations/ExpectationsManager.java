package org.example.expectations;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

/**
 * Класс обертка для выполнения проверок элементов
 */
public class ExpectationsManager {
    @Step("Проверить, что элемент '{0}' содержит текст '{1}'")
    public ExpectationsManager elementContainText(WebElement element, String text) {
        Assertions.assertEquals(element.getText(), text);
        return this;
    }
}
