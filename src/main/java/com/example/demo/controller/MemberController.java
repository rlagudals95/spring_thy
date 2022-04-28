package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.MemberService;

@Controller
public class MemberController {
	
	
	private final MemberService memberService;
	
	// 생성자 주입 - 제일 권장
	// 처음 어플리케이션 조립? 시 한번 생성되고 끝남
	@Autowired
	public MemberController(MemberService memberService){
		this.memberService = memberService;
	}
	
	
}
