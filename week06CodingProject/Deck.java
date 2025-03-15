package week06CodingProject;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Deck {
		List<Cards> cards = new ArrayList<Cards>();
		
		
		Deck () {
			String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
			String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
								"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
			for (String suit : suits) {
				int count = 2;
				for (String numberName : numbers) {
					cards.add(new Cards(numberName, suit, count));				
					count++;
				}
			}
		}
		
		
		
		public List<Cards> getCards() {
			return cards;
		}

		public void setCards(List<Cards> cards) {
			this.cards = cards;
		}

		public void describe() {
			for (Cards cards : this.cards) {
				cards.describe();
			}		
		}

		public void shuffle() {
			Collections.shuffle(this.cards);
		}

		public Cards draw() {
			Cards cards = this.cards.remove(0);
			return cards;
		}
	}