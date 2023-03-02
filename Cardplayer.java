import java.util.Scanner;

public abstract class Cardplayer implements CardPlayerBehavior{

    private Card[] hand;
    private int count;


    public Card[] showCards(){
        Card[] cards = new Card[count];
        for (int i =0; i<cards.length; i++)
            cards[i] = hand[i];
        return cards;
    }

    public boolean sameCard(){
        Card[] cards = new Card[count];
        Scanner scan = new Scanner(System.in);
        int choose1 = scan.nextInt();
        int choose2 = scan.nextInt();
        if(cards[choose1].getRank()==cards[choose2].getRank()){
            System.out.println(cards[choose1] + "과" + cards[choose2] + "을/를 버립니다.");
            for (int i =choose1+1; i<count; i++)
                cards[i-1] = cards[i];
            count -= 1;
            return true;
        }
        else{
            System.out.println("버릴 수 없습니다. 두 카드의 숫자를 잘 살펴보세요.");
            return false;
        }
    }




}
