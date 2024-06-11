package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.configuration.AppConfig;


@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class ReadYamlFileExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadYamlFileExampleApplication.class, args);

	}

}
