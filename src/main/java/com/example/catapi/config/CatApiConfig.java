package com.example.catapi.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "catapi")
public class CatApiConfig {

    private String defaultCatName;
    private String defaultCatBreed;


    public String getDefaultCatName() {
        return defaultCatName;
    }

    public void setDefaultCatName(String defaultCatName) {
        this.defaultCatName = defaultCatName;
    }

    public String getDefaultCatBreed() {
        return defaultCatBreed;
    }

    public void setDefaultCatBreed(String defaultCatBreed) {
        this.defaultCatBreed = defaultCatBreed;
    }
}
