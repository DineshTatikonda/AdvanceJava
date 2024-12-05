package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import com.model.Jewellery;

public class JewelleryDAO {
	Connection connection = null;
	public boolean save(Jewellery item) throws ClassNotFoundException, SQLException {
		connection = ConnectionManager.getConnection();
		String query = "insert into jewellery(style,material_type,weight,carats, price,state) values(?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, item.getStyle());
		ps.setString(2, item.getMaterialType());
		ps.setString(3, item.getWeight());
		ps.setString(4, item.getCarats());
		ps.setString(5, item.getPrice());
		ps.setString(6, item.getState());

		int count = ps.executeUpdate();
		
		if(count != 0 ) {
			return true;
		}
		else {
			return false;
		}	
	}

	public void commit() throws SQLException {
	connection.commit();
	connection.close();
	
	}
	public void rollback() throws SQLException {
	connection.rollback();
	connection.close();
	
	}

	public List<Jewellery> findAll() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.getConnection();
		connection.setAutoCommit(true);
		String query = "select * from jewellery";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.executeQuery();
		ResultSet set = ps.executeQuery();
		List<Jewellery> list = new ArrayList<Jewellery>();
		while(set.next()) {
			Jewellery jl = new Jewellery();
			jl.setId(set.getInt(1));
			jl.setStyle(set.getString(2));
			jl.setWeight(set.getString(3));
			jl.setMaterialtype(set.getString(4));
			jl.setCarats(set.getString(4));
			jl.setPrice(set.getString(5));
			jl.setState(set.getString(6));

	
			list.add(jl);
			
		}
		if(connection != null) {
			connection.close();
		}
		
		return list;
	
		
	}


	
	
	public boolean edit(Jewellery jewellery) throws ClassNotFoundException, SQLException {
		connection  = ConnectionManager.getConnection();
		String query = "update jewellery set style = ?,material_type=?,weight = ?, carats=?,price = ?,state=? where id = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, jewellery.getStyle());
		ps.setString(2, jewellery.getMaterialType());
		ps.setString(3, jewellery.getWeight());
		ps.setString(4, jewellery.getCarats());
		ps.setString(5, jewellery.getPrice());
		ps.setString(6, jewellery.getState());
        ps.setInt(7, jewellery.getId());
		
      		return false;
	}


	public boolean deleteById(int id) throws ClassNotFoundException, SQLException {
		connection=ConnectionManager.getConnection();
        String query="select *from jewellery where id=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		int count=ps.executeUpdate();
		if(count!=0)
			return true;
      else
				return false;
		
	}

    public Jewellery findById(int id) throws SQLException, ClassNotFoundException {
	connection  = ConnectionManager.getConnection();
	String query = "select * from jewellery where id = ?";
	PreparedStatement ps = connection.prepareStatement(query);
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	Jewellery jl = new Jewellery();
	if(rs.next()) {
	      jl.setId(rs.getInt("id"));
	      jl.setStyle(rs.getString("style"));
	      jl.setMaterialtype(rs.getString("materialtype"));			
	      jl.setWeight(rs.getString("weight"));			
	      jl.setCarats(rs.getString("carats"));			
	      jl.setPrice(rs.getString("price"));	
	      jl.setState(rs.getString("state"));

	}
	if(connection != null)
		connection.close();
	return jl;
}
}


         
	