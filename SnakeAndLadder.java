public class SnakeAndLadder {
	public static final int startPosition = 0;
	public static final int minPosition = 0;
	public static final int maxPosition = 100;
	public static final int noPlay=1;
	public static final int ladder=2;
	public static final int snake=3;
	
	public static void main(String[] args) {
		
		int playerPosition = startPosition;
		System.out.println("Starting position of a Player is " + startPosition);
		while(playerPosition < 100) {	
			int diceRoll = ((int)Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("Rolling Dice: " + diceRoll);
			int choice = (int)Math.floor(Math.random() * 10) % 3 + 1;
			switch (choice) {
				case noPlay: System.out.println("No Play");
					 		 break;
				case ladder: System.out.println("Ladder is there");
							 if(playerPosition + diceRoll > maxPosition)
							 System.out.println("Current Player Position: " + playerPosition);
							 playerPosition = (playerPosition + diceRoll) <= maxPosition ? (playerPosition + diceRoll) : playerPosition;
							 break;
				case snake:  System.out.println("Snake is there");
							 playerPosition = (playerPosition - diceRoll) >= minPosition ? (playerPosition - diceRoll) : minPosition;
							 if(playerPosition == 0)					
							 System.out.println("Start from 0 position.");
				default:
			}
			System.out.println("Latest Player Position is " + playerPosition);
		}
	}
}
