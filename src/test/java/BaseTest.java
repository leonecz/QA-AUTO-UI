import org.aeonbits.owner.ConfigFactory;
import org.example.configuration.Configurations;
import org.example.configuration.DriverManager;
import org.example.page.mail.LeftPanel;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    protected static final Configurations properties = ConfigFactory.create(Configurations.class);
    protected LeftPanel leftPanel = new LeftPanel();

    @AfterEach
    public void closeDriver() {
        DriverManager.closeDriver();
    }
}
