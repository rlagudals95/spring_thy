package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.Repository.MemoryMemberRepository;
import com.example.demo.service.MemberService;


// 직접 빈등록
@Configuration
public class SpringConfig {

	// 멤버 서비스 직접 등록
//	@Bean
//	public MemberService memberService() {
//		return new MemberService(); 
//	}
//	
//	@Bean
//	public MemberRepository memberRepository() {
//		return new MemoryMemberRepository(); 
//	}
}
