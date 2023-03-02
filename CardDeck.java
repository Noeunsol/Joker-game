public class CardDeck {

	private int card_count; // 남은 카드 수
	private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT+1];
	// Invariant: deck[0], .., decl[card_count-1] 에 카드가 있다.

	/** Constructor - CardDeck 카드 한 벌 생성  */
	public CardDeck() {
		createDeck();
	}

	/** createSuit - 주어진 무늬로 카드 13장 생성  */
	private void createSuit(String which_suit) {
		if (which_suit.equals("JOKER")){
			deck[card_count] = new Card(which_suit, 52);
			card_count = card_count + 1;
		}
		else{
			for(int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
				deck[card_count] = new Card(which_suit, i);
				card_count = card_count + 1;
			}
		}
	}

	private void createDeck() {
		createSuit(Card.SPADES);
		createSuit(Card.HEARTS);
		createSuit(Card.CLUBS);
		createSuit(Card.DIAMONDS);
		createSuit(Card.JOKER);

	}

	/** moreCards - 카드 덱에 카드가 남아있는지 알려줌
	 * @return 있으면 true, 없으면 false */
	public boolean moreCards() {
		return card_count > 0;
	}

	public int CardCount() {
		return card_count;
	}


}
