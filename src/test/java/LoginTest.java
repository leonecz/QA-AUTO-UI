import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

public class LoginTest extends BaseTest{
    @DisplayName("Тест авторизации в mail.ru")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void loginTest() {
        login().checkOpenPage();
    }
}
