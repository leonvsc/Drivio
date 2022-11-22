package nl.avans.drivio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DrivioApplication {
	public static void main(String[] args) {
		SpringApplication.run(DrivioApplication.class, args);


	}
}