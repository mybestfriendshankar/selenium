package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	
	//public static void main(String args[]) {
	@Test
	public void tc002() {
	    //Test Steps
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.addNewEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();


}
}