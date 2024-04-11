package org.example.expectations;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.configuration.DriverManager.getDriver;

/**
 * Класс обертка для выполнения ожиданий selenium
 */
public class ExpectationsManager {
    private static final int timeWait = 10;
    private static final WebDriverWait driverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeWait));

    @Step("Проверить, что элемент '{0}' содержит текст '{1}'")
    public ExpectationsManager shouldBeVisible(WebElement element, String text) {
        Assertions.assertEquals(element.getText(), text);
        return this;
    }
}
