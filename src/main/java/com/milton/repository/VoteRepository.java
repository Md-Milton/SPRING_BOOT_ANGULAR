package com.milton.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.Post;
import com.milton.model.User;
import com.milton.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, BigInteger> {
	
	Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);

}
