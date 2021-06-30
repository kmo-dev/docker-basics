package kmo.docker.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);
	}

}
