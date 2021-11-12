
public class Dealer {
	private Card[] hand;
	private int number_of_cards;
	
	public Dealer(int n) {
		hand = new Card[n];
	}
	
	public boolean receiveCard(Card c) {
		if (number_of_cards < hand.length) {
			hand[number_of_cards] = c;
			number_of_cards += 1;
			return true;
		}
		else
			return false;
	}
	
	public Card removeCard() {
		if (number_of_cards > 0) {
			int index = (int)(Math.random() * number_of_cards);
			Card card = hand[index];
			for (int i = index  + 1; i < number_of_cards; i++)
				hand[i - 1] = hand[i];
			number_of_cards -= 1;
			return card;
		}
		else
			return null;
	}
}
