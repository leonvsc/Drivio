package nl.avans.drivio.config;

import nl.avans.drivio.data.ICrudData;
import nl.avans.drivio.model.accountModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class accountConfig {

    @Bean
    CommandLineRunner commandLineRunner(ICrudData data) {
        return args -> {
//            accountModel hallo = new accountModel("info@hallo.nl", "password123");
//            accountModel test = new accountModel("info@test.nl", "password124523");

//            data.saveAll(List.of(hallo, test));
        };
    }
}
