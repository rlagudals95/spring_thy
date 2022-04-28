package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.Member;

public interface MemberRepository {
	
	Member save(Member member);
	Optional<Member> findById(Long id); // Optional null일 경우 방지
	Optional<Member> findByName(String name);
	List<Member> findAll();
	
}
