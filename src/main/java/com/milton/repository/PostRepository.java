package com.milton.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.Post;
import com.milton.model.Subreddit;
import com.milton.model.User;

public interface PostRepository extends JpaRepository<Post, BigInteger> {

	List<Post> findAllBySubreddit(Subreddit subreddit);

	List<User> findByUser(User user);

}
