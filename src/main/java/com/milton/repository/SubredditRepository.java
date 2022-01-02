package com.milton.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, BigInteger>{
	
	Optional<Subreddit> findByName(String name);

}
