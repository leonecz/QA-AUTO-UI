package org.example;

import io.qameta.allure.Step;
import org.example.configuration.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static org.example.configuration.DriverManager.getDriver;

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

    @Step("Переключится на вкладку с индексом '{0}'")
    default void switchTo(final int index) {
        Set<String> handles = getDriver().getWindowHandles();
        String tabHandle = (String) handles.toArray()[index];
        getDriver().switchTo().window(tabHandle);
    }
}
