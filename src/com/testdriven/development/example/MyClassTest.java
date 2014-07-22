package com.testdriven.development.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {

	int[] a;
	@Before
	public void setUp() throws Exception {
		
		a = new int [] {2,3,4,5,0,8};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSearchNoItem() {
		
		boolean val = (new MyClass()).search(a,9);

		assertFalse(val);

	}
	@Test
	public final void testSearchItem() {
		
		boolean val = (new MyClass()).search(a,2);

		assertTrue(val);

	}

}
