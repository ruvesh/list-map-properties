package io.github.ruvesh.listmapproperties;

import io.github.ruvesh.listmapproperties.util.AdminAccountListProperties;
import io.github.ruvesh.listmapproperties.util.ServerHostIpProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({AdminAccountListProperties.class, ServerHostIpProperties.class})
@SpringBootApplication
public class ListMapPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListMapPropertiesApplication.class, args);
	}

}
