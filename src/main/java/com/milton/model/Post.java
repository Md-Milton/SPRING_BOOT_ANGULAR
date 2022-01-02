package com.milton.model;

import java.math.BigInteger;
import java.time.Instant;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigInteger postId;
	
	@NotBlank(message = "Post Name can't be empty")
	private String postName;
	
	@Nullable
	private String url;
	
	@Nullable
	private String description;
	
	private Integer voteCount;
	
	private Instant createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId",referencedColumnName = "userId")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id",referencedColumnName = "id")
	private Subreddit subreddit;
}
