package com.ricin.msconfig2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsConfig2Application {

    public static void main(String[] args) {
        SpringApplication.run(MsConfig2Application.class, args);
    }

}
