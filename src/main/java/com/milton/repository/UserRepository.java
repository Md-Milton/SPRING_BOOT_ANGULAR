package com.milton.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.User;

public interface UserRepository extends JpaRepository<User, BigInteger> {
	Optional<User> findByUserName(String userName);

}
