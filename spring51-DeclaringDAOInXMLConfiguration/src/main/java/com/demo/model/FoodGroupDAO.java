/**
 * 
 */
package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.jdbc.MysqlParameterMetadata;

/**
 * @author channaveer.p
 *
 */

//@Repository("foodGroupDAO")
public class FoodGroupDAO {

	private	NamedParameterJdbcTemplate myJdbcTemplate;
	
	private SimpleJdbcCall procdureReadFoodGroup;
	
	private SimpleJdbcInsert insertFoodGroup;
	
	private JdbcTemplate jdbcTemplate;
	
	//@Autowired
	public void setMyJdbcTemplate(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
		
		this.myJdbcTemplate = new NamedParameterJdbcTemplate(ds);
	
		
	}

	public List<FoodGroup> getFoodGroups(){
		// Old way of queryinh : select * from foodgroups where name='fruits'"
		
		MapSqlParameterSource myMap = new MapSqlParameterSource();
		myMap.addValue("groupName", "Meat");
		
		return myJdbcTemplate.query("select * from foodgroups where name=:groupName", myMap , new RowMapper<FoodGroup>(){

			public FoodGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				FoodGroup fg = new FoodGroup();
				fg.setId(rs.getInt("id"));
				fg.setName(rs.getString("name"));
				fg.setDescription(rs.getString("description"));
				return fg;
			}
		});
	 
	}
	 
	public FoodGroup getFoodGoup(int id){
		
		MapSqlParameterSource myMap = new MapSqlParameterSource();
		myMap.addValue("id", id);
		
		return myJdbcTemplate.queryForObject("select * from foodgroups where id = :id", myMap, new RowMapper<FoodGroup>(){
			public FoodGroup mapRow(ResultSet rs, int rowNum) 
					throws SQLException {
				
				FoodGroup fg = new FoodGroup();
				fg.setId(rs.getInt("id"));
				fg.setName(rs.getString("name"));
				fg.setDescription(rs.getString("description"));
				
				return fg;
			}
		});
	 
	}

	public Boolean addFoodGroup(String name, String description){
		
		Boolean response = false;
		
		MapSqlParameterSource myMap = new MapSqlParameterSource();
		
		myMap.addValue("name", name);
		myMap.addValue("description", description);
		
		int noOfRoowsaffected = myJdbcTemplate.update("insert into foodgroups (name, description) values (:name, :description)", myMap );
		
		if(noOfRoowsaffected == 1){
			System.out.println("One row added to group successfully!");
			response = true;
		}else{
			System.out.println("There was a problem adding to table foodgroup");
		}
		
		return response;
	}

	public Boolean create(FoodGroup fg){
		Boolean response = false;
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(fg);
		
		int noOfRoowsaffected = myJdbcTemplate.update("insert into foodgroups (name, description) values (:name, :description)", params );
		
		if(noOfRoowsaffected == 1){
			System.out.println("One row added to group successfully!");
			response = true;
		}else{
			System.out.println("There was a problem adding to table foodgroup");
		}
		
		return response;
	}

	public Boolean update(FoodGroup fg){
		Boolean response = false;
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(fg);
		
		int noOfRoowsaffected = myJdbcTemplate.update("update foodgroups set name =:name, description = :description where id=:id", params );
		
		if(noOfRoowsaffected == 1){
			System.out.println("One row added to group successfully!");
			response = true;
		}else{
			System.out.println("There was a problem adding to table foodgroup");
		}
		
		return response;
	}

	public Boolean delete(int id){
		Boolean res = false;

		MapSqlParameterSource params = new MapSqlParameterSource();
		
		params.addValue("id", id);
		
		int noOfRoowsaffected = myJdbcTemplate.update("delete from foodgroups where id = :id", params);
		
		if(noOfRoowsaffected == 1){
			System.out.println("One row deleted to food group successfully!");
			res = true;
		}else{
			System.out.println("There was a problem deleting to table foodgroup");
		}
		
		
		
		return res;
		
		
	}

	//@Transactional("myTransactionManager")
	public int[] createFoodGroups(List<FoodGroup> groups){
	
//		ArrayList<MapSqlParameterSource> paramArrayList = new ArrayList<MapSqlParameterSource>();
//		
//		for (FoodGroup fg : groups) {
//			
//			MapSqlParameterSource tempParam = new MapSqlParameterSource();
//			
//			tempParam.addValue("name", fg.getName());
//			tempParam.addValue("description", fg.getDescription());
//			paramArrayList.add(tempParam);
//		}
//		
//		SqlParameterSource[] batchParams = new MapSqlParameterSource[paramArrayList.size()];
//		
//		paramArrayList.toArray(batchParams);
		
		SqlParameterSource[] batchParams = SqlParameterSourceUtils.createBatch(groups.toArray());
		
		int [] noOfRowsAffectedArray = myJdbcTemplate.batchUpdate("insert into foodgroups (name, description) values (:name, :description)", batchParams);
		
		return noOfRowsAffectedArray;
		
	}

	public FoodGroup readFoodGroup(int groupID){
		 
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("in_id", groupID);
		
		Map<String, Object> outValues = procdureReadFoodGroup.execute(params);
		
		FoodGroup out = new FoodGroup();
		
		out.setName( (String) outValues.get("group_name"));
		
		out.setDescription( (String) outValues.get("group_description").toString());
		
		return out;
	}
	
	public void demoMethod(){
		Integer value = jdbcTemplate.queryForObject("select count(*) from foodgroups", Integer.class);
		
		System.out.println("Value Count: "+value);
		
		String valueName = jdbcTemplate.queryForObject("select name from foodgroups where id='3'", String.class);
		
		System.out.println("FoodGroupp Name: " +valueName);
		
		FoodGroup myGroup = jdbcTemplate.queryForObject("select * from foodgroups where id='4'", new RowMapper<FoodGroup>(){

			public FoodGroup mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new FoodGroup(rs.getInt("id"), rs.getString("name"), rs.getString("description"));
			}
			
		});
		
		System.out.println("Domain Object: " +myGroup.talkAboutYourself());
	}
	
}
