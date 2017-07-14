package com.hanbit.member.dao;

import java.util.List;

import com.hanbit.member.domain.MemberBean;

public interface MemberDAO {
	public int insert(MemberBean member);
	public List<MemberBean> selectAll();
	public int countMembers();
	public MemberBean selectById(String id);
	public List<MemberBean> selectByNames(String name);
	public int update(MemberBean member);
	public int delete(String id);
	//MemberBean[] list=new MemberBean[4];
}
