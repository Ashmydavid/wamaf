package com.updatetoDB;
import java.sql.Timestamp;

public class Details {

	static java.util.Date date;
	 static java.sql.Timestamp sqlTime;
	 java.sql.Timestamp endtime;	
 
     static java.sql.Date sqlDate;
	
	public static Timestamp getStartTime(){
		
		date=new java.util.Date(); //this and below line is to get the current SQl time 
	   	sqlTime=new java.sql.Timestamp(new java.util.Date().getTime());		
		return sqlTime;
			
	}
public static Timestamp getEndTime(){
		
		date=new java.util.Date(); //this and below line is to get the current SQl time 
	   	sqlTime=new java.sql.Timestamp(new java.util.Date().getTime());		
		
		return sqlTime;
			
	}
	

}
