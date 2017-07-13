package com.hanbit.member.service;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberService {
	public void addMember(MemberBean member);
	public List<MemberBean> getMembers();
	public int countMembers();
	public MemberBean findById(String id);
	public List<MemberBean> findByNames(String name);
	public void modify(MemberBean member);
	public void remove(String id);
	//MemberBean[] list=new MemberBean[4];
}
