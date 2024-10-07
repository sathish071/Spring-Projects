package Practice.New_Maven_Sample;

public class GameRunner {
	
	Pubg object;
	//freeFire object;
	AllApplication allApplication;
	
	GameRunner(AllApplication object ){
		this.allApplication =object;
	}
	
	public void runGame() {
		object.up();
		object.down();
		object.left();
		object.right();
		
	}

}
