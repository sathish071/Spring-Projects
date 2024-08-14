package com.example.queryPractice.demoDb.bean;

public class TestPractice {

	public int add(int a, int b) {
		
		if(a>0 && a<Integer.MAX_VALUE) {
			return a+b;
		}

		return a + b;

	}
	public int subtract(int a, int b) {
		return a - b;
	}

}
