public class SnakeAndLadder {
	public static final int startPosition = 0;
	public static final int minPosition = 0;
	public static final int maxPosition = 100;
	public static final int noPlay = 1;
	public static final int ladder = 2;
	public static final int snake = 3;
	public static final int player1 = 0;
	public static final int player2 = 1; 
	
	public static void main(String[] args) {
		
		int player1Position = startPosition;
		int player2Position = startPosition;
		int count = 0;
		
		System.out.println("Starting position of a Players is " + startPosition);
		while(player1Position < 100 && player2Position < 100) {	
			int playerChoice = count % 2;
			int diceRoll = ((int)Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("Rolling Dice: " + diceRoll);
			int choice = (int)Math.floor(Math.random() * 10) % 3 + 1;
			switch (choice) {
				case noPlay: System.out.println("No Play");
					 		 	 break;
				case ladder: System.out.println("Ladder is there");
							 	 if(playerChoice == player1){
								 	player1Position = (player1Position + diceRoll) <= maxPosition ? (player1Position + diceRoll) : player1Position;
								 	System.out.println("Player 1 turns");
							 	 }
							 	 else{
								 	player2Position = (player2Position + diceRoll) <= maxPosition ? (player2Position + diceRoll) : player2Position;
								 	System.out.println("Player 2 turns");
							 	 }
								 count++;
							 	 break;
				case snake:  System.out.println("Snake is there");
							 	 if(playerChoice == player1){
								 	player1Position = (player1Position - diceRoll) >= minPosition ? (player1Position - diceRoll) : minPosition;
								 	System.out.println("Player 1 turns");
							 	 }
							 	 else{
								 	player2Position = (player2Position - diceRoll) >= minPosition ? (player2Position - diceRoll) : minPosition;
								 	System.out.println("Player 2 turns");
							 	 }
							 	 break;
				default:
			}
			System.out.println("Player1 Position is at " + player1Position);
			System.out.println("Player2 Position is at " + player2Position);
			count++;
		}
		if(player1Position == 100)
			System.out.println("Player 1 is Winner.");
		else
			System.out.println("Player 2 is Winner");	
	}
}
