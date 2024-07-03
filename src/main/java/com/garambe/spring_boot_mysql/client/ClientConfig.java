package com.garambe.spring_boot_mysql.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    private static final Logger logger = LoggerFactory.getLogger(ClientConfig.class);

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            logger.info(repository.findAll().toString());
/*            Client client = new Client(null, "CAMARA", "Amaar");
            Client client2 = new Client(null, "DIABY", "Ibrahim");
            repository.saveAll(List.of(
                            client,
                            client2));*/


        };
    }

}
