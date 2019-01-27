/**
 * 
 */
package com.archermind.springBoot.web;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 *
 */
public class BaseController {

	void checkSession(HttpServletRequest request) throws Exception {

		String sessionId = request.getSession().getId();

		Object obj = request.getSession().getAttribute(sessionId);

		if (obj == null) {

			throw new Exception("You haven't logged in yet. Please log in first.");
		}

	}
}
