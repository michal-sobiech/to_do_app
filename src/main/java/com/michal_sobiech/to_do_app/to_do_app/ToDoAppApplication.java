package com.michal_sobiech.to_do_app.to_do_app;

import com.michal_sobiech.to_do_app.to_do_app.database.database_classes.User;
import com.michal_sobiech.to_do_app.to_do_app.database.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class ToDoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

	@GetMapping("/")
	public static List<String> sampleText() {
		return List.of("Sample", "text", "!!!");
	};

    @PostMapping("/signUp")
	public static void registerUserInDataBase() {
		return;
	};
	
}
