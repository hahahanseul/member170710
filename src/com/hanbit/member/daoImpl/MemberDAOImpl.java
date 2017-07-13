package com.hanbit.member.daoImpl;

import java.util.List;

import com.hanbit.member.constants.Database;
import com.hanbit.member.dao.MemberDAO;
import com.hanbit.member.domain.MemberBean;
import java.sql.*;

public class MemberDAOImpl implements MemberDAO {
	@Override
	public void insert(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberBean selectById(String id) {
		MemberBean member = new MemberBean();
		try {
			Class.forName(Database.DRIVER);
			Connection conn = DriverManager.getConnection(Database.URL,Database.USERID,Database.PASSWORD);
			Statement stmt = conn.createStatement();
			String sql="SELECT * FROM Member WHERE id ='"+id+"'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				member.setRegdate(rs.getString("Regdate"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public List<MemberBean> selectByNames(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
