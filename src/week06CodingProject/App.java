package week06CodingProject;

public class App {

	    public static void main(String[] args) {
	        Deck deck = new Deck();
	        deck.shuffle();

	        Players player1 = new Players("Player 1");
	        Players player2 = new Players("Player 2");

	        for (int i = 0; i < 52; i++) {
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            Cards card1 = player1.flip();
	            Cards card2 = player2.flip();

	            System.out.println("Round " + (i + 1) + ":");
	            System.out.print(player1.getName() + " flipped: ");
	            card1.describe();
	            System.out.print(player2.getName() + " flipped: ");
	            card2.describe();

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	                System.out.println(player1.getName() + " gets a point!");
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	                System.out.println(player2.getName() + " gets a point!");
	            } else {
	                System.out.println("Tie! No points awarded.");
	            }

	            System.out.println(player1.getName() + " Score: " + player1.getScore());
	            System.out.println(player2.getName() + " Score: " + player2.getScore());
	            System.out.println("--------------------");
	        }

	        System.out.println("Final Scores:");
	        System.out.println(player1.getName() + " Score: " + player1.getScore());
	        System.out.println(player2.getName() + " Score: " + player2.getScore());

	        if (player1.getScore() > player2.getScore()) {
	            System.out.println(player1.getName() + " wins!");
	        } else if (player2.getScore() > player1.getScore()) {
	            System.out.println(player2.getName() + " wins!");
	        } else {
	            System.out.println("Draw!");
	        }
	    }
	}