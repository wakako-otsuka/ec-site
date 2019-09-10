package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

/**
 * ユーザ情報を操作するサービス.
 * @author otsuka
 *
 */
@Service
public class RegisterService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * ユーザ情報を登録する.
	 * 
	 * @param user
	 */
	public void insert(User user) {
		userRepository.insert(user);
	}
}
