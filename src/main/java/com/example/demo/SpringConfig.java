package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.Repository.MemoryMemberRepository;
import com.example.demo.service.MemberService;


// ���� ����
@Configuration
public class SpringConfig {

	// ��� ���� ���� ���
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
