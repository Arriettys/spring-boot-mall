package top.arrietty.mall.portal.component;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import cn.hutool.json.JSONUtil;
import top.arrietty.mall.common.api.CommonResult;

public class GoLogoutSuccessHandler implements LogoutSuccessHandler
{
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException
	{
		response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.getWriter().print(JSONUtil.parse(CommonResult.success(null,"已注销")));
        response.getWriter().flush();
	}
}
