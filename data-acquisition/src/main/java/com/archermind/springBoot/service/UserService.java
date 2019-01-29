/**
 * 
 */
package com.archermind.springBoot.service;

import com.archermind.springBoot.entity.User;

/**
 * @author Administrator
 *
 */
public interface UserService {
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

	/**
	 * 
	 * @param user
	 */
	void save(User user);

}
