package loosCoupling;

import Practice.New_Maven_Sample.AllApplication;

public class GameRunner1 {
	
	AllApplication object;
	
	GameRunner1(AllApplication object){
		this.object = object;
	}
	
	public void runGame1() {
		object.up();
		object.down();
		object.left();
		object.right();
	}

}
