package com.nadl.fiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@ComponentScan({"com.nadl.fiu.*","services.*","dto.*","service.*"})
@EntityScan("com.nadl.fiu.*")
@ComponentScan(basePackages={"com.nadl.fiu.controller","com.nadl.fiu.dao","com.nadl.fiu.service","services","dto"})
@EnableJpaRepositories("com.nadl.fiu.*")
public class JuspayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuspayApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
