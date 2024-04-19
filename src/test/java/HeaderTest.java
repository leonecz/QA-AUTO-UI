import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic(value = "Mail")
@Feature(value = "Элементы хедера")
public class HeaderTest {
    @DisplayName("Проверка наличия элементов в хедере страницы")
    @Owner("Леонов Алексей Евгеньевич")
    @Test
    public void checkHeadersElementsTest() {

    }
}
