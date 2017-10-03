package com.updatetoDB;
import java.sql.Date;
import java.sql.Timestamp;

public class GetterSetter {
	
private int testStepID;
private Timestamp executionStartTime;
private Timestamp executionEndTime;
private String scriptStatus;
private int testCycleNumber;
private int cyclenumber;

public int getCyclenumber() {
	return cyclenumber;
}
public void setCyclenumber(int cyclenumber) {
	
	System.out.println("CycleNumber"+cyclenumber);
	this.cyclenumber = cyclenumber;
}
public int getTestCycleNumber() {
	return testCycleNumber;
}
public void setTestCycleNumber(int testCycleNumber) {
	
	System.out.println("TestCycleNumber"+testCycleNumber);
	this.testCycleNumber = testCycleNumber;
}
private Date date;

public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getTestStepID() {
	return testStepID;
}
public void setTestStepID(int testStepID) {
	this.testStepID = testStepID;
}
public Timestamp getExecutionStartTime() {
	return executionStartTime;
}
public void setExecutionStartTime(Timestamp executionStartTime) {
	this.executionStartTime = executionStartTime;
}
public Timestamp getExecutionEndTime() {
	return executionEndTime;
}
public void setExecutionEndTime(Timestamp executionEndTime) {
	this.executionEndTime = executionEndTime;
}
public String getScriptStatus() {
	return scriptStatus;
}
public void setScriptStatus(String scriptStatus) {
	this.scriptStatus = scriptStatus;
}
	

}
