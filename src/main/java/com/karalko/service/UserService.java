package com.karalko.service;

import com.karalko.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getById(Long id);

    void save(User user);

    void delete(Long id);

    List<User> getAll();
}
