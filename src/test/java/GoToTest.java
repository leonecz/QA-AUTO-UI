import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.authorization.Authorization.login;

@Epic(value = "Mail")
@Feature(value = "Переходы на сторонние сервисы")
public class GoToTest extends BaseTest{
    @DisplayName("Проверить переход в VK")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkGoToVk() {
        login()
                .clickAllProject()
                .checkGoToVk();
    }
}
