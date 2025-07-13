package com.dhsdev.authorityserver;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dhsdev.authorityserver.repositories.UserRepository;
import com.dhsdev.authorityserver.security.user.User;

@SpringBootApplication
public class AuthorityserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorityserverApplication.class, args);
	}

	@Bean
	public ApplicationRunner dataLoader(UserRepository userRepo, PasswordEncoder encoder){
		return args -> {
			userRepo.save(new User("diego123", encoder.encode("admin1"), "ROLE_ADMIN"));
			userRepo.save(new User("hele123", encoder.encode("admin2"), "ROLE_ADMIN"));
		};
	}
}
