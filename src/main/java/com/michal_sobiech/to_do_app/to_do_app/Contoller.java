package com.michal_sobiech.to_do_app.to_do_app;

import com.michal_sobiech.to_do_app.to_do_app.database.database_classes.User;
import com.michal_sobiech.to_do_app.to_do_app.database.repositories.UserRepository;
import com.michal_sobiech.to_do_app.to_do_app.security.TokenService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;


@RestController
@CrossOrigin
public class Contoller {
    
    @Autowired
    private UserRepository userRepository;

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    public Contoller(TokenService tokenService, 
            AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
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
    public String logAUserIn(@RequestBody Map<String, String> credentials) {//} throws AuthenticationException{
        System.out.println("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        String email = credentials.get("username");
        String password = credentials.get("password");
        try {
            Authentication authentication = authenticationManager
                .authenticate(
                    new UsernamePasswordAuthenticationToken(
                        email,
                        password
                    )
                );
            String token = tokenService.generateToken(authentication);
            System.out.println("Token:" + token);
            return token;
        } catch (AuthenticationException ex) {
            System.out.println(ex);
            return "errorr";
        }
    }

}
