package com.onezero.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.onezero.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("UserName"));
		user.setName(rs.getString("Name"));
		user.setBranch(rs.getString("BranchName"));
		user.setDepartment(rs.getString("DeptName"));
		user.setDesignation(rs.getString("DesigName"));
		user.setFirstname(rs.getString("FirstName"));
		return user;
	}

}
