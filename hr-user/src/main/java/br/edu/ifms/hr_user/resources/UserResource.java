package br.edu.ifms.hr_user.resources;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.hr_user.entities.User;
import br.edu.ifms.hr_user.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);

    private UserRepository repository;

    public UserResource(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        Optional<User> result = repository.findById(id);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.status(HttpStatusCode.valueOf(204)).build();
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> search(@RequestParam String email) {
        User result = repository.findByEmail(email);
        return ResponseEntity.ok(result);
    }
}