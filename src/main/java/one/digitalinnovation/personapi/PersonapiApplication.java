package one.digitalinnovation.personapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.openmbean.OpenMBeanParameterInfo;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonapiApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI().info(new Info().title("API para Cadastro de Pessoas").version("1.0")
				.termsOfService("http://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
