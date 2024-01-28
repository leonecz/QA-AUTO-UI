package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.configuration.DriverManager.getDriver;

public class BasePage {
    public WebElement getElement(By xpath) {
        return getDriver().findElement(xpath);
    }

    public BasePage invisibility(WebElement webElement) {
        getWebDriverWait(ExpectedConditions.visibilityOf(webElement));
        return this;
    }

    private void getWebDriverWait(ExpectedCondition<WebElement> webElementExpectedCondition) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(expectedCondition);
    }

    private WebDriverWait getWebDriverWait(ExpectedConditions expectedCondition, WebDriver driver) {

    }
}
