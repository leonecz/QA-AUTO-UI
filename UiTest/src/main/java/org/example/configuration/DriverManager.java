package org.example.configuration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class DriverManager {
    private final static ThreadLocal<DriverManager> instance = ThreadLocal.withInitial(DriverManager::new);
    private static ThreadLocal<RemoteWebDriver> driver = ThreadLocal.withInitial(DriverManager::init);

    public static DriverManager getInstance() {
        return instance.get();
    }

    private static RemoteWebDriver init() {
        RemoteWebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1620, 1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        return driver;
    }

    public static WebDriver getDriver() {
        var driverRemote = driver.get();
        if (driverRemote == null) {
            driverRemote = init();
            driver.set(driverRemote);
        }
        return driverRemote;
    }

    public static void open(String url) {
        getDriver().get(url);
    }

    public static void closeDriver() {
        var driverRemote = driver.get();
        if (driverRemote != null) {
            driverRemote.close();
            driver.remove();
        }
    }
}
