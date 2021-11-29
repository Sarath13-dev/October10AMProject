package org.learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassB {

	@AfterTest
	private void m4() {
		System.out.println("@AfterTest - Test1");
	}
	
	@BeforeClass
	private void mf1() {
		System.out.println("@BeforeClass - ClassB");
	}
	
	@AfterClass
	private void mf2() {
		System.out.println("@AfterClass - ClassB");
	}
	@AfterMethod
	private void mg1() {
		System.out.println("@AfetrMethod - ClassB ---@Test");
	}
	
	@BeforeMethod
	private void mg2() {
		System.out.println("@BeforeMethod - ClassB ---@Test");
	}
	@Test
	private void mt1() {
		System.out.println("@Test----ClassB");
	}
	
	
}
