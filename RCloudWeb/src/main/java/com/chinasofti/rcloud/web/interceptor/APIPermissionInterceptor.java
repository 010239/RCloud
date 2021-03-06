package com.chinasofti.rcloud.web.interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.chinasofti.rcloud.web.common.CommonConstant;
import com.chinasofti.rcloud.web.common.RequestMappingName;
import com.chinasofti.rcloud.web.common.ResponseEntity;
import com.google.gson.Gson;

public class APIPermissionInterceptor extends HandlerInterceptorAdapter {
	
	private static final String ACCESS_DENY_MSG = "对不起，您没有访问权限！";
	private static final String SESSION_PROMPT_MSG = "您处于离线状态，请登录！";
	private static final String RESPONSE_ENCODING = "UTF-8";
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HandlerMethod method = (HandlerMethod)handler;
		RequestMappingName requestMappingName = method.getMethodAnnotation(RequestMappingName.class);
		String value = requestMappingName.value();
		if(!CommonConstant.ROLE_PERMISSION_COMMON.equals(value)){	
			this.handleAccessDeny(response, "999999", ACCESS_DENY_MSG);
		}
		return true;
	}
	
	private void handleAccessDeny(HttpServletResponse response, String status,
			String errorMessage) throws IOException {
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>();
		responseEntity.setStatus(status);
		responseEntity.setErrorMessage(errorMessage);
		Gson gson = new Gson();
		String str = gson.toJson(responseEntity);
		response.setContentType("application/json");
		response.setCharacterEncoding(RESPONSE_ENCODING);
		PrintWriter pw = response.getWriter();
		pw.write(str);
		pw.flush();
		pw.close();
	}

}
