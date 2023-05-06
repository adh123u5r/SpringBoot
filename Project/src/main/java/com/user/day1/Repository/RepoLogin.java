package com.user.day1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.day1.database.ModelLogin;

public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByusername(String username);
}