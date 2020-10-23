public class SnakeAndLadder {
	public static void main(String[] args) {
		int startPosition = 0;
		System.out.println("Starting position of a Player is " + startPosition);
		int diceRoll = ((int)Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Rolling Dice: " + diceRoll);
	}
}
