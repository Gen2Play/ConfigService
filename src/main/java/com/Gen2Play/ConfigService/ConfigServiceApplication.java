package com.Gen2Play.ConfigService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EnableConfigServer
// @EnableAutoConfiguration(exclude = VaultAutoConfiguration.class)
public class ConfigServiceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
