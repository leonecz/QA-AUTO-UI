import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.checkerframework.checker.units.qual.A;
import org.example.authorization.Authorization;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

@Epic(value = "Mail")
@Feature(value = "Логин на mail")
public class LoginTest extends BaseTest {
    @DisplayName("Тест авторизации в mail.ru")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void loginTest() {
        login();
    }

    @DisplayName("Проверка ввода некорректного пароля при входе в почту")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkIncorrectPasswordTest() {
        Authorization authorization = new Authorization();
        authorization.loginIncorrectPassword().checkTextUnderPassword();
    }
}
