public class Dealer {
    CardDeck deck;

    public Dealer(){
        deck = new CardDeck();
    }


    public void cardShake(){
        System.out.println(name + "딜러가 의미심장한 웃음을 지으며 카드를 섞습니다.");
    }

    public void cardShake_2(){
        System.out.println(name + "딜러가 초조한듯 카드를 황급히 섞습니다.");
    }

}
