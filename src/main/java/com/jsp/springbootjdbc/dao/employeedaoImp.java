package com.jsp.springbootjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class employeedaoImp implements employeedao
{
	@Autowired
	private JdbcTemplate jdbctemplate;

 
 @Autowired
   public employeedaoImp(JdbcTemplate jdbcTemplate) 
  {
	  this.jdbctemplate=jdbctemplate;
}
 
	@Override
	public int addemployee(employee e1)
	{
		String query="insert into employee values(?,?,?,?,?,?,?)";
		return jdbctemplate.update(query, e1.getEID(), e1.getENAME(), e1.getESALARY(), e1.getEDEPTNO(), e1.getEMAIL(), e1.getPASSWORD(), e1.getEMOBILENO());

	}
  
}
