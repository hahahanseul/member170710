package com.hanbit.member.dao;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberDAO {
	public void insert(MemberBean member);
	public List<MemberBean> selectAll();
	public int countMembers();
	public MemberBean selectById(String id);
	public List<MemberBean> selectByNames(String name);
	public void update(MemberBean member);
	public void delete(String id);
	//MemberBean[] list=new MemberBean[4];
}
