package com.zd.jewellery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JewelleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JewelleryApplication.class, args);
	}

}
