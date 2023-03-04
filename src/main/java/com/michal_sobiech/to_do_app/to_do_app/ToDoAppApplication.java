package com.michal_sobiech.to_do_app.to_do_app;

import com.michal_sobiech.to_do_app.to_do_app.database.database_classes.User;
import com.michal_sobiech.to_do_app.to_do_app.database.repositories.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;


@SpringBootApplication
@RestController
@CrossOrigin
public class ToDoAppApplication {

    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoAppApplication.class, args);
	}

	@GetMapping("/")
	public static List<String> sampleText() {
		return List.of("Sample", "text", "!!!");
	};

    @PostMapping("/signUp")
	public void registerUserInDataBase() {  //TODO static?
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        userRepository.save(
            new User(
                "test",
                "test",
                "test",
                "test"
            )
        );
	};

    @AllArgsConstructor
    public class LoginForm {
        @Getter @Setter private String email;
        @Getter @Setter private String password;
    }

    @PostMapping("/logIn")
    public void logAUserIn(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        System.out.println(email + " " + password);

    }
	
}
