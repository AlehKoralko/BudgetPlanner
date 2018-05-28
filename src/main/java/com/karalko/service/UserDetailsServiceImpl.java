package com.karalko.service;

import com.karalko.model.User;
import com.karalko.repository.UserRepository;
import com.karalko.security.UserPrincipal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("UserDetailsServiceImpl call the loadUserByUsername method");
        Optional<User> userOptional = userRepository.findByUsername(username);

        userOptional.orElseThrow(() -> new UsernameNotFoundException("Username is not found!"));

        return userOptional.map(UserPrincipal::new).get();
    }
}
