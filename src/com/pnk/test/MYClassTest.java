package com.pnk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pnk.service.MyClass;

public class MYClassTest {

	@Test
	public void testMultiply() {
		MyClass tester= new MyClass();
		assertEquals("Result",1,tester.multiply(5, 5));
	}

}
