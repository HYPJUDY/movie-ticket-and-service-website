package com.team.legendary.web.controllers;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginoutController {
	
	@RequestMapping("/loginout")
    public String loginout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject != null) {
			String cname = subject.getPrincipal().toString();
			System.out.println(cname + "login out");
			subject.logout();
		}
        return "index";
    }
}
