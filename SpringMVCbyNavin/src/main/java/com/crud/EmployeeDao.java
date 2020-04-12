package com.crud;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int Save(Employee emp) {
		String sql = "insert into employee(Emid,name,salary,designation)"
					 + " values (empl_seq.NEXTVAL,'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getDesignation()+"')";
		return template.update(sql);	
	}
}
