package loosCoupling;

public class MainGame1 {

	public static void main(String[] args) {
		
		Pubg1 pubg1 = new Pubg1();
		FreeFire1 ff = new FreeFire1();
		GameRunner1 game = new GameRunner1(ff);
		game.runGame1();
		
	}

}
