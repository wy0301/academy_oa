package com.woniu.web.handlerexceptionresolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		String path = "";
		
		if(ex instanceof UnauthorizedException) {
			path = "exceptionResolver/unauthorized";
		} else if(ex instanceof ArithmeticException) {
			path = "exceptionResolver/math";
		} else {
			path = "exceptionResolver/error";
		}
		
		return new ModelAndView(path);
	}

}
