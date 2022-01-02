package com.milton.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milton.model.Comment;
import com.milton.model.Post;
import com.milton.model.User;

public interface CommentRepository extends JpaRepository<Comment, BigInteger>{
	
	List<Comment> findByPost(Post post);
	
	List<Comment> findByUser(User user);

}
