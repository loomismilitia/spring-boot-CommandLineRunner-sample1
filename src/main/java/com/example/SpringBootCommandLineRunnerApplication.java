package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootCommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommandLineRunnerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (UserRepository userRepository){
		return new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {
				Arrays.asList("Simon", "Loomis", "Suicmez")
						.forEach(u -> userRepository.save(new User(u)));
				userRepository.findAll().forEach(System.out::println);
			}

		};
	}

}

