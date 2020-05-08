package com.onezero.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.onezero.mapper.UserMapper;
import com.onezero.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	@Qualifier("jdbcTemplate1")
	JdbcTemplate jdbcTemplate;

	@Override
	public User getUserByName(String username) {
		
		String sql = "select SD02ECD as UserName,SD01NIN as Name,SA04BLN as BranchName,SA09DLN as DeptName,SA02DLN as DesigName, SD01OTH as FirstName from \r\n" + 
				"HRMSPRDDT2.SDP001 AS EmpM \r\n" + 
				"inner join HRMSPRDDT2.SDL00210 AS EmpD \r\n" + 
				"on EmpD.SD02ECD = EmpM.SD01ECD and EmpM.SD01CCD = 'CB' and EmpD.SD02CCD = 'CB' and EmpD.SD02RFC <> 'RS'\r\n" + 
				"inner join HRMSPRDDT2.SAP009 AS Dept \r\n" + 
				"on Dept.SA09DCD = EmpD.SD02DEP and Dept.SA09CCD = 'CB'\r\n" + 
				"inner join HRMSPRDDT2.SAP002 AS Desig\r\n" + 
				"on Desig.SA02SCD = EmpD.SD02DSG and Desig.SA02CCD = 'CB' and Desig.SA02CTP = 'DSGC'\r\n" + 
				"inner join HRMSPRDDT2.SAP004 AS Bran\r\n" + 
				"on EmpD.SD02BRN = Bran.SA04BCD and Bran.SA04CCD = 'CB' and Bran.SA04ACT IN ('A','N') where  \r\n" + 
				"EmpM.SD01ECD = ? and (Dept.SA09DCD = '107' or Dept.SA09DCD = '22' or Dept.SA09DCD = '05' or Dept.SA09DCD = '133' or Dept.SA09DCD = '123')";

		try {
			
			User user = (User) jdbcTemplate.queryForObject(sql,new Object[] { username } ,new UserMapper());

			return user;
			
		} catch (EmptyResultDataAccessException e) {
			
			return null;
		}
	}

}
