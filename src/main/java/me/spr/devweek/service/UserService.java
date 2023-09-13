package me.spr.devweek.service;

import me.spr.devweek.domain.model.User;
import me.spr.devweek.domain.repository.UserRepository;
import org.springframework.stereotype.Service;


public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
