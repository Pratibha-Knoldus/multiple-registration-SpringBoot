package com.example.multiple.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The type Multiple registration application.
 */
@EnableSwagger2
@SpringBootApplication
public class MultipleRegistrationApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MultipleRegistrationApplication.class, args);
	}

}
