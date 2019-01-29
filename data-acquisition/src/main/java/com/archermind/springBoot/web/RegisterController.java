/**
 * 
 */
package com.archermind.springBoot.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.archermind.springBoot.entity.User;
import com.archermind.springBoot.service.UserService;
import com.archermind.springBoot.utils.Utils;

/**
 * @author Administrator
 *
 */
@RestController
public class RegisterController extends BaseController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public String register(HttpServletRequest request, @RequestBody User user) {
		try {
			User dbUser = userService.findByUserName(user.getUserName());
			if (null == dbUser) {
				User newuser = new User();
				newuser.setAge(user.getAge());
				newuser.setCity(user.getCity());
				newuser.setEducation(user.getEducation());
				newuser.setEmail(user.getEmail());
				newuser.setPassWord(Utils.MD5Encode(user.getPassWord(), null));
				newuser.setPhone(user.getPhone());
				newuser.setRole(user.getRole());
				newuser.setSex(user.getSex());
				newuser.setStatus(user.getStatus());
				newuser.setTaskId(user.getTaskId());
				newuser.setUserName(user.getUserName());
				userService.save(newuser);
				System.out.println("succes register! userName=" + newuser.getUserName());
			} else {

				return "fail!userName already in use.";
			}
		} catch (Exception e) {

			return e.getMessage();

		}
		return "succes register!";
	}
}
