import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

public class LoginTest extends BaseTest {
    @DisplayName("Тест авторизации в mail.ru")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void loginTest() {
        login();
    }

    @DisplayName("Тест отправки письма")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void sendMailTest() {
        var theme = "Тема для письма";
        var messages = "Сообщение для отправки";

        login()
                .clickSendMail()
                .sendMail(properties.login(), theme, messages)
                .closeModal();
        leftPanel
                .clickIncomingMessages()
                .checkContainsMessages(theme);
    }

    @DisplayName("Проверка наличия элементов в хедере страницы")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkHeadersElementsTest() {

    }

    @DisplayName("Проверка наличия почты в раскрывающемся профиле")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkEmailTest() {

    }

    @DisplayName("Проверка ввода некорректного пароля при входе в почту")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkIncorrectPasswordTest() {

    }
}
