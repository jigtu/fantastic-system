package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author ZiQiang
 */
@SpringBootApplication
public class AntiTheftApp {
    private static Logger logger = LoggerFactory.getLogger(AntiTheftApp.class);

    private static final String PROD = "prod";

    public static void main(String[] args) {
        logger.info("begin to start  Anti Theft App  server...");
        ConfigurableApplicationContext cfg = SpringApplication.run(AntiTheftApp.class, args);
        logger.info("success to start Anti Theft App  server...");
        Arrays.asList(cfg.getEnvironment().getActiveProfiles()).forEach(profile -> {
            if (!PROD.equals(profile)) {
                logger.warn("project used profile is {}", profile);
            }
        });
    }
}
