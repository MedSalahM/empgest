package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<User,Integer> {

    Optional<User> findUserByUsername(String username);
}
