package org.axonframework.samples.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AxonBankApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(AxonBankApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(AxonBankApplication.class, args);
	}
}
