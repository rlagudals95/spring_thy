package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.Repository.MemoryMemberRepository;
import com.example.demo.domain.Member;

public class MemberService {
	// final 키워드는 엔티티를 한 번만 할당합니다. 즉, 두 번 이상 할당하려 할 때 컴파일 오류가 발생하여 확인이 가능합니다.
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	public Long join(Member member) {
		// 중복확인
		//Optional<Member> result =  
		validateDupChk(member);
		
		memberRepository.save(member);
		return member.getId();
	}
	
	private void validateDupChk (Member member) {
		memberRepository.findByName(member.getName())
		.ifPresent(m -> { // 중복 값이 있으면 - Optional을 사용하는 경우 사용가능
 			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
	}
	
	// 서비스 클래스는 비즈니스적인 네이밍 필요
	private List<Member> findMembers () {	
		return memberRepository.findAll();
	}
		
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
	
}
