package br.edu.ifms.hr_authorization_server.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.edu.ifms.hr_authorization_server.entities.User;
import br.edu.ifms.hr_authorization_server.feignclients.UserFeignClient;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserFeignClient userClient;

    public UserService(UserFeignClient userClient) {
        this.userClient = userClient;
    }

    public User findByEmail(String email) {
        User user = userClient.findByEmail(email).getBody();
        if (user == null) {
            logger.error("No user was found with the email={}.", email);
            throw new IllegalArgumentException("Email not found");
        }
        logger.info("user={} found by email={}.", user.getId(), email);
        return user;
    }
}