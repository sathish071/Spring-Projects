package com.Sample.demo_Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRun {
	
	
	private GameConsole object;
	@Autowired
	//@Qualifier("free fire")
	GameRun(GameConsole object ){
		this.object=object;
	}
	
	public void runGame() {
		object.up();
		object.down();
		object.left();
		object.right();
		
	}

}
