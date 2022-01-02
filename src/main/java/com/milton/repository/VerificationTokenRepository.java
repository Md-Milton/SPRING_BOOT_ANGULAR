package com.milton.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, BigInteger>{
	
	Optional<VerificationToken> findByToken(String token);

}
