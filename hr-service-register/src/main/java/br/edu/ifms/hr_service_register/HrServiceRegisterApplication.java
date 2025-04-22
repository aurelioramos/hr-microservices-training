package br.edu.ifms.hr_service_register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrServiceRegisterApplication.class, args);
	}

}
