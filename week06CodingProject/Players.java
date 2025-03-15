package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Players {

	    private List<Cards> hand;
	    private int score;
	    private String name;

	    public Players(String name) {
	        this.hand = new ArrayList<>();
	        this.score = 0;
	        this.name = name;
	    }

	    public List<Cards> getHand() {
	        return hand;
	    }

	    public int getScore() {
	        return score;
	    }

	    public String getName() {
	        return name;
	    }

	    public void describe() {
	        System.out.println("Player: " + name + ", Score: " + score);
	        System.out.println("Hand:");
	        for (Cards card : hand) {
	            card.describe();
	        }
	    }
	    public Cards flip() {
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        }
	        return null;
	    }

	    public void draw(Deck deck) {
	        Cards card = deck.draw();
	        if (card != null) {
	            hand.add(card);
	        }
	    }

	    public void incrementScore() {
	        score++;
	    }
	}