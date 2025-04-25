package br.edu.ifms.hr_authorization_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HrAuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrAuthorizationServerApplication.class, args);
	}

}
