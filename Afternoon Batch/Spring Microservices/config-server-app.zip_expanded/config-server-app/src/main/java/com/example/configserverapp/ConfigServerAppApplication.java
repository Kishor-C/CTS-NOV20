package com.example.configserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // this creates a configuration server that locates the configurations in GIT, SVN
public class ConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAppApplication.class, args);
	}

}
