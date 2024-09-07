package sgr.compliance.sgr_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "sgr.compliance.sgr_backend.repositories")
public class SgrTechTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgrTechTestApplication.class, args);
	}

}
