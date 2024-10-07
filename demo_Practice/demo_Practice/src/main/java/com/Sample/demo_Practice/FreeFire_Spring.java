package com.Sample.demo_Practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("free fire")
@Primary
public class FreeFire_Spring implements GameConsole {

	@Override
	public void up() {
		System.out.println("ff up");
		
	}

	@Override
	public void down() {
		System.out.println("ff down");
		
	}

	@Override
	public void left() {
		System.out.println("ff left");
		
	}

	@Override
	public void right() {
		System.out.println("ff right");
		
	}

}
