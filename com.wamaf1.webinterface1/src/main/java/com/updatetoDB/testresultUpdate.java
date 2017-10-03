package com.updatetoDB;

import java.sql.Timestamp;

public class testresultUpdate {

	public static void main(String[] args) {
		
		int testCyclenumber;//Increment your test cycle number each time.
		Timestamp startTime;
		Timestamp endTime;
		String status="pass";
		int stepID;
		int Inserstatus;
		
		GetterSetter objGetterSetter= new GetterSetter();
		
		objGetterSetter.setExecutionStartTime(Details.getStartTime());
		objGetterSetter.setTestStepID(1);
		objGetterSetter.setScriptStatus(status);
		objGetterSetter.setExecutionEndTime(Details.getEndTime());
		objGetterSetter.setTestCycleNumber(1);
		objGetterSetter.setCyclenumber(1);
		
		Inserstatus=DBManager.updateTestResult(objGetterSetter);
		if(Inserstatus==1){
			
			System.out.println("Value Inserted");
		}else{
			
			System.out.println("Value Not inserted");
		}
		
		

	}

}
