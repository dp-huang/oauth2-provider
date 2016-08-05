package com.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author huangd7
 */
@SpringBootApplication
public class OAuth2ProviderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ProviderApplication.class, args);
    }
}
