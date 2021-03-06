package org.gorany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.gorany.domain.UserVO;
import org.gorany.service.KakaoLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class RestTestController {

	@RequestMapping(value = "/kakaologin" , produces = "application/json", method = {RequestMethod.GET, RequestMethod.POST})
	public String kakaoLogin(@RequestParam("code") String code , HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception{

	  JsonNode token = KakaoLogin.getAccessToken(code);

	  JsonNode profile = KakaoLogin.getKakaoUserInfo(token.path("access_token").toString());
	  System.out.println(profile);
	  UserVO vo = KakaoLogin.changeData(profile);
	  vo.setUser_snsId("k"+vo.getUser_snsId());

	  System.out.println(session);
	  session.setAttribute("login", vo);
	  System.out.println(vo.toString());

	  vo = service.kakaoLogin(vo);  
	  return "login/kakaoLogin";
	}



}
