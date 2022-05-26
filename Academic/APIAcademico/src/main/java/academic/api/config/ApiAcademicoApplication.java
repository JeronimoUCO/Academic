package academic.api.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "academic" })
@EnableJpaRepositories(basePackages = { "academic" })
@EntityScan(basePackages = { "academic" })
public class ApiAcademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAcademicoApplication.class, args);
	}

}
