package org.example.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/main/resources/configuration.properties")
public interface Configurations extends Config {
    String urlMail();

    String login();

    String password();
}
