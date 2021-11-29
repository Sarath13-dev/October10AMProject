package org.learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassC {

	@BeforeTest
	private void m5() {
		System.out.println("@BeforeTest----Test2");
	}
		
	
	@BeforeClass
	private void mf1() {
		System.out.println("@BeforeClass - ClassC");
	}
	
	@AfterClass
	private void mf2() {
		System.out.println("@AfterClass- ClassC");
	}
	@AfterMethod
	private void mg1() {
		System.out.println("@AfterMethod - ClassC- @Test");
	}
	
	@BeforeMethod
	private void mg2() {
		System.out.println("@BeforeMethod - ClassC- @Test");
	}
	@Test
	private void mt1() {
		System.out.println("@Test - ClassC");
	}
	
	
}
