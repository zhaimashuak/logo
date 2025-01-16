package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}

@RestController
class UserController {

	@GetMapping("/api/users")
	public List<String> getAllUsers() {
		// Просто возвращаем статичный список пользователей
		return Arrays.asList("User1", "User2", "User3");
	}
}