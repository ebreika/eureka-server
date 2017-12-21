package org.ebreika.waybe.ebreikaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EbreikaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbreikaServerApplication.class, args);
	}
}
