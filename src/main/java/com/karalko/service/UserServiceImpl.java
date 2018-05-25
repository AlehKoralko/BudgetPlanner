package com.karalko.service;

import com.karalko.model.User;
import com.karalko.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id) {
        log.info("UserServiceImpl getById {}", id);
        return userRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        log.info("UserServiceImpl save {}", user);
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        log.info("UserServiceImpl delete {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        log.info("UserServiceImpl find all");
        return userRepository.findAll();
    }
}
