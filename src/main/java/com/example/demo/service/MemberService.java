package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.Repository.MemoryMemberRepository;
import com.example.demo.domain.Member;

public class MemberService {
	// final Ű����� ��ƼƼ�� �� ���� �Ҵ��մϴ�. ��, �� �� �̻� �Ҵ��Ϸ� �� �� ������ ������ �߻��Ͽ� Ȯ���� �����մϴ�.
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	public Long join(Member member) {
		// �ߺ�Ȯ��
		//Optional<Member> result =  
		validateDupChk(member);
		
		memberRepository.save(member);
		return member.getId();
	}
	
	private void validateDupChk (Member member) {
		memberRepository.findByName(member.getName())
		.ifPresent(m -> { // �ߺ� ���� ������ - Optional�� ����ϴ� ��� ��밡��
 			throw new IllegalStateException("�̹� �����ϴ� ȸ���Դϴ�.");
		});
	}
	
	// ���� Ŭ������ ����Ͻ����� ���̹� �ʿ�
	private List<Member> findMembers () {	
		return memberRepository.findAll();
	}
		
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	}
	
}
