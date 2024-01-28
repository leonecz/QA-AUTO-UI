import org.example.configuration.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @AfterEach
    public void closeDriver() {
        DriverManager.closeDriver();
    }
}
