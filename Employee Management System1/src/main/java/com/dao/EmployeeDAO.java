package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDAO {
	Connection connection=null;
	public boolean save(Employee emp) throws ClassNotFoundException, SQLException {
        connection=ConnectionManager.getConnection();
        String query="insert into employee(name,email,gender,dept,salary,mobile,addr)values(?,?,?,?,?,?,?)";
        PreparedStatement ps=connection.prepareStatement(query);
        
        ps.setString(1, emp.getName());
        ps.setString(2,emp.getEmail());
        ps.setString(3, emp.getGender());
        ps.setString(4, emp.getDept());
        ps.setString(5, emp.getSalary());
        ps.setString(6, emp.getMobile());
        ps.setString(7, emp.getAddress());
       int count=ps.executeUpdate();
       if(count!=0) 
    	   return true;
       else
        		return false;
	}
	public void commit() throws SQLException {
		connection.commit();
		connection.close();
	}
	public void rollback() throws SQLException {
		connection.rollback();
		connection.close();
	}
	public List<Employee> findAll() throws ClassNotFoundException, SQLException{
        Connection connection=ConnectionManager.getConnection();
        connection.setAutoCommit(true);
        String query="select *from employee";
        PreparedStatement ps=connection.prepareStatement(query);
        ResultSet set=ps.executeQuery();
        List<Employee> employees=new ArrayList<Employee>();
        while(set.next()) {
        	Employee obj=new Employee();
        	obj.setId(set.getInt(1));
        	obj.setName(set.getString(2));
        	obj.setEmail(set.getString(3));
        	obj.setGender(set.getString(4));
        	obj.setDept(set.getString(5));
        	obj.setSalary(set.getString(6));
        	obj.setMobile(set.getString(7));
        	obj.setAddress(set.getString(8));
        	employees.add(obj);

        	
        	
        }
        if(connection!=null) {
        	connection.close();
        	
        }
        		return employees;
	}
	public boolean edit(Employee employee) throws ClassNotFoundException, SQLException {
		connection = ConnectionManager.getConnection();
		String query = "update employee set name = ?, email =?, dept =?, salary=?, mobile=?, addr=? where id=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1,employee.getName());
		ps.setString(2,employee.getEmail());
		ps.setString(3,employee.getGender());
		ps.setString(4,employee.getDept());
		ps.setString(5,employee.getSalary());
		ps.setString(6,employee.getMobile());
		ps.setString(7,employee.getAddress());
		ps.setInt(8, employee.getId());
		int count = ps.executeUpdate();
		if(count != 0) return true;
		else return false;
	
	}
	public boolean deleteById(int id) throws ClassNotFoundException, SQLException {
      connection=ConnectionManager.getConnection();
      String query="delete from employee where id=?";
      PreparedStatement ps=connection.prepareStatement(query);
      ps.setInt(1, id);
      int count=ps.executeUpdate();
      if(count!=0) 
    	  return true;
      else
    	  return false;
      
	}
}
