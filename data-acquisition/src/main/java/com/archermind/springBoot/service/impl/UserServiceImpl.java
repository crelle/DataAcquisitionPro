/**
 * 
 */
package com.archermind.springBoot.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.archermind.springBoot.dao.UserRepository;
import com.archermind.springBoot.entity.User;
import com.archermind.springBoot.service.UserService;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.archermind.springBoot.service.UserService#findByUserName(java.lang.
	 * String)
	 */
	@Override
	public User findByUserName(String userName) {

		return userRepository.findByUserName(userName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.archermind.springBoot.service.UserService#findByUserNameAndPassWord(
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public User findByUserNameAndPassWord(String userName, String passWord) {

		return userRepository.findByUserNameAndPassWord(userName, passWord);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.archermind.springBoot.service.UserService#findByUserNameAndPhone(java
	 * .lang.String, java.lang.String)
	 */
	@Override
	public User findByUserNameAndPhone(String userName, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {

		userRepository.save(user);

	}

}
