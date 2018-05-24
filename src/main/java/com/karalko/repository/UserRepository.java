package com.karalko.repository;

import com.karalko.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link User} class.
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
