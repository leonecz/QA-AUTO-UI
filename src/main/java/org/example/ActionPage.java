package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface ActionPage {
    @Step("Ввести '{text}' в элемент '{element}'")
    default void sendKeys(final WebElement element, final String text) {
        element.sendKeys(text);
    }

    @Step("Ввести '{text}' в элемент '{element}' и нажать кнопку '{keys}'")
    default void sendKeys(final WebElement element, final String text, final Keys keys) {
        element.sendKeys(text, keys);
    }

    @Step("Нажать на элемент '{element}'")
    default void click(final WebElement element) {
        element.click();
    }
}
