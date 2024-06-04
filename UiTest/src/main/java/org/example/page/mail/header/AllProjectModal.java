package org.example.page.mail.header;

import io.qameta.allure.Step;
import org.example.page.BaseElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Класс описывающий модальное окно всех проектов
 */
public class AllProjectModal extends BaseElement {
    @FindBy(xpath = "//*[text()='VK']/..")
    private WebElement vk;

    @FindBy(xpath = "//*[contains(@class, 'VkIdForm__header')]")
    private WebElement vkTitle;

    @Step("Нажать на иконку VK")
    public AllProjectModal checkGoToVk() {
        click(vk);
        switchTo(1);
        elementContainText(vkTitle, "Вход ВКонтакте");
        return this;
    }
}
