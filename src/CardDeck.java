public class CardDeck {
    
    private Card[] deck = new Card[53];
    private int count;
    
    public void createDeck() {
        createSuit("Spade");
        createSuit("Heart");
        createSuit("Diamond");
        createSuit("Club");
        //조커 추가
        deck[52] = new Card("Joker", 0);
        count += 1;
    }
    
    private void createSuit(String suit) {
        for (int i = 1; i <= 13; i++) {
            deck[count] = new Card(suit, i);
            count += 1;
        }
    }
    
    public Card newCard() {
        if (! moreCard())
            createDeck();
        int index = (int)(Math.random() * count);
        Card card = deck[index];
        for (int i = index+1; i < count; i++)
            deck[i-1] = deck[i];
        count -= 1;
        //System.out.println(count);
        deck[count] = new Card("NULL", 0);
       
        //뽑은 카드 제거 suit를 바꾼다.
        return card;
    }
    
    public boolean moreCard() {
        return count > 0;
    }
    
    public static void drawCard(CardDeck d) {
        Card c = d.newCard();
        
        if (c.getSuit() == "NULL") {
            drawCard(d);
            
        }
        else {
            if (c.getSuit() == "Joker") {
                System.out.println(c.getSuit());
            }
            else {
                if(c.getRank() == 1) {
                    System.out.println(c.getSuit() + " " + "A");
                }
                else if(c.getRank() == 11) {
                    System.out.println(c.getSuit() + " " + "J");
                }
                else if(c.getRank() == 12) {
                    System.out.println(c.getSuit() + " " + "Q");
                }
                else if(c.getRank() == 13) {
                    System.out.println(c.getSuit() + " " + "K");
                }
                else {
                    System.out.println(c.getSuit() + " " + c.getRank());
                }
            }    
        }
    }
    
    public static void main(String[] args) {
        CardDeck d = new CardDeck();
        for (int i = 0; i < 53; i++) {
            drawCard(d);
        }
    }
}