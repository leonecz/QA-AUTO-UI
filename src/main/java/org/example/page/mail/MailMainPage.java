package org.example.page.mail;

import io.qameta.allure.Step;
import org.example.page.BasePage;
import org.example.page.mail.elements.MiniProfileSidebar;
import org.example.page.mail.elements.SendingLetterModal;
import org.example.page.mail.header.AllProjectModal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Главная страница вкладки почта
 */
public class MailMainPage extends BasePage {
    @FindBy(className = "compose-button__txt")
    private WebElement sendMail;

    @FindBy(xpath = "//*[contains(@class, 'ph-avatar-img')]")
    private WebElement profile;

    @FindBy(xpath = "//*[contains(@class, 'ph-project__text')]")
    private WebElement allProject;

    @Step("Нажать на иконку профиля в углу экрана")
    public MiniProfileSidebar clickMiniProfile() {
        click(profile);
        return new MiniProfileSidebar();
    }

    @Step("Нажать на кнопку 'Написать письмо'")
    public SendingLetterModal clickSendMail() {
        click(sendMail);
        return new SendingLetterModal();
    }

    @Step("Нажать на раскрывающийся список 'Все проекты'")
    public AllProjectModal clickAllProject() {
        click(allProject);
        return new AllProjectModal();
    }
}
