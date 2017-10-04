package com.updatetoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DBManager {
	
public static int updateTestResult(GetterSetter sets) {
		
		Connection conn= ConnectionManager.getInstance().getConnection();
		java.util.Date date=new java.util.Date();
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			int count =0;
			
			System.out.println("Hello");
		
		try{
			
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sqlQuery=("INSERT INTO wamaf.test_result_web (test_step_id,Automation_startTime,Automation_endTime,status,date) VALUES(?,?,?,?,?)");

		PreparedStatement prepstmt = conn.prepareStatement(sqlQuery);
		
		 prepstmt.setInt(1, sets.getTestStepID());
		 prepstmt.setTimestamp(2,sets.getExecutionStartTime());
		 prepstmt.setTimestamp(3, sets.getExecutionEndTime());
		 prepstmt.setString(4,sets.getScriptStatus());
		 prepstmt.setDate(5,sqlDate);
		 	 		 
		 count=prepstmt.executeUpdate();

			
		 	 
		}catch(SQLException e){
			System.out.println(e);
		}
		
			
		ConnectionManager.getInstance().closeConnection();
		return count;
		
	}
	
	
	

}
