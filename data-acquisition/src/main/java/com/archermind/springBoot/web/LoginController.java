package com.archermind.springBoot.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.session.PersistentManagerBase;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.archermind.springBoot.entity.User;
import com.archermind.springBoot.service.UserService;
import com.archermind.springBoot.utils.Utils;

@RestController
public class LoginController {
	Log log = org.apache.juli.logging.LogFactory.getLog(LoginController.class);

	@Autowired
	private UserService userService;

	private Map<String, User> userMap = new HashMap<>();
	PersistentManagerBase mb = new PersistentManagerBase() {
	};

	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
		try {

			// request.getSession(true)强制获取session，否则session有可能为null.
			// request.getSession()在第一个请求返回时，才产生
			String sessionId = request.getSession(true).getId();

			String encryptPassWord = Utils.MD5Encode(passWord, null);

			User user = userService.findByUserNameAndPassWord(userName, encryptPassWord);

			if (user == null) {

				return "userName or passWord error!";
			}

			// request.getSession().setAttribute(sessionId, user);
			response.addCookie(new Cookie("JSSESIONID", sessionId));
		} catch (Exception e) {

			return e.getMessage();
		}
		return "login success!";
	}
}
