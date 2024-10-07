package com.Sample.demo_Practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pubg")

public class Pubg_Spring implements GameConsole {

	@Override
	public void up() {
		System.out.println("pubg up");
		
	}

	@Override
	public void down() {
		System.out.println("pubg down");
		
	}

	@Override
	public void left() {
		System.out.println("pubg left");
		
	}

	@Override
	public void right() {
		System.out.println("pubg right");
		
	}
	
}
