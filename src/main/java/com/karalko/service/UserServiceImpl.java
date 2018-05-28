package com.karalko.service;

import com.karalko.model.User;
import com.karalko.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User getById(Long id) {
        log.info("UserServiceImpl getById {}", id);
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        log.info("UserServiceImpl save {}", user);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        log.info("UserServiceImpl delete {}", id);
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        log.info("UserServiceImpl find all");
        return userRepository.findAll();
    }
}
