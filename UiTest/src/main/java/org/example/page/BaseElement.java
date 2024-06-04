package org.example.page;

import org.example.ActionPage;
import org.example.configuration.DriverManager;
import org.example.expectations.ExpectationsManager;
import org.openqa.selenium.support.PageFactory;

public class BaseElement extends ExpectationsManager implements ActionPage {
    public BaseElement() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
