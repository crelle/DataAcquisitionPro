package com.archermind.springBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archermind.springBoot.entity.User;

/**
 * 
 * @author Administrator
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 
	 * @param userName
	 * @return
	 */
	User findByUserName(String userName);

	/**
	 * 
	 * @param username
	 * @param email
	 * @return
	 */
	User findByUserNameAndPassWord(String userName, String passWord);

	/**
	 * 
	 * @param username
	 * @param phone
	 * @return
	 */
	User findByUserNameAndPhone(String userName, String phone);

}