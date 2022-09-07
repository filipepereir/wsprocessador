package com.mercado.wsprocessador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WsprocessadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsprocessadorApplication.class, args);
	}

}
