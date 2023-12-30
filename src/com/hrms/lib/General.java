package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global {
	
	

	//To Provide all re-usable fun: for whole application
			public void openApplication() {
//			System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Application Opened");
			}
			
			public void login() {
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			driver.findElement(By.name(btn_login)).click();
			System.out.println("Login completed");
			}
			
			public void enterFrame() {
			driver.switchTo().frame(frame_empinfo);
			System.out.println("Entered into Frame");
			}
			
			public void addNewEmp() {
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
			driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
			driver.findElement(By.id(btn_Save)).click();
		    System.out.println("New Employee Added");	
			}
			
			public void exitFrame() {
				driver.switchTo().defaultContent();
				System.out.println("Exit from frame");
				}
			
			public void logout() {
				driver.findElement(By.linkText(link_logout)).click();
				System.out.println("Logout completed");
				}
			
			public void closeApplication() {
				driver.close();
				System.out.println("Application closed");
				}
			


}

