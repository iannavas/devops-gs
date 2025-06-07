package br.com.fiap.money_control_api.controller;

import br.com.fiap.money_control_api.model.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.money_control_api.model.User;
import br.com.fiap.money_control_api.model.dto.UserResponse;
import br.com.fiap.money_control_api.repository.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UserResponse create(@RequestBody @Valid UserRequest userRequest){
        User user = new User(
                userRequest.email(),
                passwordEncoder.encode(userRequest.password()),
                userRequest.role()
        );

        var userSaved = repository.save(user);
        return new UserResponse(userSaved.getId(),userSaved.getEmail(), userSaved.getRole());
    }
    
}
