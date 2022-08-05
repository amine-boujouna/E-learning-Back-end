package com.example.backendproject.repos;

import com.example.backendproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//User findByUsername(String username);
	User findByEmail(String email);
	User findByUsername(String username);

	Boolean existsByUsername(String username);
	User findByPassword(String password);
}