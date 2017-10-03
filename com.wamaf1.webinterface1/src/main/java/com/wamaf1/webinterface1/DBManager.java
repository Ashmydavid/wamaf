package com.wamaf1.webinterface1;

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
	
	public static boolean checklogin(GetterAndSetter sets){
		
		Connection conn= ConnectionManager.getInstance().getConnection();
		ResultSet myresultset;
		boolean loginSuccess = false;
		
		try{
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sqlQuery=("SELECT *FROM wamaf.registration where UserName=? and Password=?");
			
			
			
			PreparedStatement prepstmt = conn.prepareStatement(sqlQuery);
			
			prepstmt.setString(1, sets.getUserName());
			prepstmt.setString(2, sets.getPassWrod());		
		
			
			myresultset=prepstmt.executeQuery();
			if(myresultset.next()){
				
				loginSuccess=true;
				
							
				}else{
					
					loginSuccess=false;
				}
				
			}catch(Exception exc){
				exc.printStackTrace();
				
			}
				
		ConnectionManager.getInstance().closeConnection();
		return loginSuccess;
			
				
		}

	
	

}
