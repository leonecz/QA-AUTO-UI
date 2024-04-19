import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

@Epic(value = "Mail")
@Feature(value = "Профиль")
public class ProfileTest extends BaseTest{
    @DisplayName("Проверка наличия почты в раскрывающемся профиле")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkEmailTest() {
        login()
                .clickMiniProfile()
                .checkMail(properties.login());
    }
}
