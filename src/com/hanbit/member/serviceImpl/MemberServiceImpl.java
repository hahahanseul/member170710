package com.hanbit.member.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hanbit.member.dao.MemberDAO;
import com.hanbit.member.daoImpl.MemberDAOImpl;
import com.hanbit.member.domain.MemberBean;
import com.hanbit.member.service.MemberService;

public class MemberServiceImpl implements MemberService {
	Map<String,MemberBean> map;
	public MemberServiceImpl() {
		map = new HashMap<>();
	} // i는 처음 입력받은 회원수, 총 회원수는 count에 담겨서 그 숫자만큼 MemberBean의 공간이 생성됨

	@Override
	public void addMember(MemberBean member) {
		map.put(member.getId(), member);
	}
	
	@Override
	public List<MemberBean> getMembers() {
		List<MemberBean> list = new ArrayList<>();
		Set<String> keys = map.keySet();
		for(String s: keys) {
			list.add(map.get(s));
		}
		return list;
	}
	@Override
	public int countMembers() {
		return map.size();
	}
	@Override
	public List<MemberBean> findByNames(String name) {
		List<MemberBean> temp = new ArrayList<>();
		Set<String> keys = map.keySet();
		for(String s: keys) {
			if(name.equals(map.get(s).getName())) {
				temp.add(map.get(s));
			}
		}
		return temp;
	}
	@Override
	public MemberBean findById(String id) {
		MemberBean member =new MemberBean();
		MemberDAO dao = new MemberDAOImpl();
		member = dao.selectById(id);
		return member;
	}

	@Override
	public void modify(MemberBean param) {
			if(!param.getName().equals("")) {
				map.get(param.getId()).setName(param.getName());
			}
			if(!param.getPw().equals("")) {
				map.get(param.getPw()).setPw(param.getPw());
			}
			if(!param.getSsn().equals("")) {
				map.get(param.getSsn()).setSsn(param.getSsn());
			}
	}
	@Override
	public void remove(String id) {
		map.remove(id);
	}
}