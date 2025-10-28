package br.edu.ifsp.prw3.api_2025_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Api20252Application {

	public static void main(String[] args) {

        SpringApplication.run(Api20252Application.class, args);
	}

}
