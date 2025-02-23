package com.Gen2Play.ConfigService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    // private final Dotenv dotenv = Dotenv.load();

    // @Bean
    // public Dotenv dotenv() {
    //     return dotenv;
    // }

    // public String getEnv(String key) {
    //     return dotenv.get(key);
    // }

    @Bean
    public String getEnv(String key) {
        return System.getenv(key);  // Đọc biến từ Railway ENV
    }
}