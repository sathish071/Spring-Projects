package com.example.queryPractice.demoDb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.queryPractice.demoDb.bean.TestPractice;

public class CalciTest {
	
	@Test
	public void testCalci() {
		TestPractice  sample = new TestPractice();
	int addition =	sample.add(2, 3);
		assertEquals(5, addition);
		
	}
	@Test
	public void testCalci1() {
		TestPractice  sample = new TestPractice();
	int addition =	sample.add(-2, 3);
		assertEquals(1, addition);
		
	}
		
	@Test
	public void testSubtract() {
		TestPractice  sample = new TestPractice();
		int sub = sample.subtract(1, 3);
		assertEquals(2, sub);
		
	}
}
