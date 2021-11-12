import java.util.Scanner;

public class Hand {
	private Card[] hand;
	private int number_of_cards;
	
	public Hand(int n) {
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
	
	public Card removeCard(int[] c) {
		System.out.println("버릴 카드 두장을 선택하시오.");
		Scanner scan = new Scanner(System.in);
		int choose1 = scan.nextInt();
		int choose2 = scan.nextInt();
		
		if (c[choose1].getRank() == c[choose2].getRank()) {
			System.out.println(choose1 + "과" + choose2 + "을/를 버립니다.");
		}
			
		
			//int index = (int)(Math.random() * number_of_cards);
			//Card card = hand[index];
			//for (int i = index  + 1; i < number_of_cards; i++)
			//	hand[i - 1] = hand[i];
			//number_of_cards -= 1;
			return card;
		}
		else {
			System.out.println("두 카드의 숫자가 같지 않아 버릴 수 없습니다.");
			return null;
		}
	}
}
