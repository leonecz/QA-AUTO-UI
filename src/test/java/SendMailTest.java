import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

@Epic("Mail")
@Feature(value = "Отправка письма")
public class SendMailTest extends BaseTest {
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
}
