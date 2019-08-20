package top.arrietty.mall.portal.component;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import cn.hutool.json.JSONUtil;
import top.arrietty.mall.common.api.CommonResult;

public class GoAuthenticationFailureHandler implements AuthenticationFailureHandler
{
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException
	{
		response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.getWriter().print(JSONUtil.parse(CommonResult.failed("登录失败："+exception.getMessage())));
        response.getWriter().flush();
	}
}
