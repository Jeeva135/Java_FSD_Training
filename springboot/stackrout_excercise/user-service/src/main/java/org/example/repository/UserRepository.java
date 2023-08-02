package org.example.repository;

import org.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  UserRepository extends JpaRepository<User,String> {
    Optional<User> findByUserNameAndPassword(String userName,String password);
}
