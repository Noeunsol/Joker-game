public class BlackjackController {
    Dealer dealer;
    HumanPlayer hand_player;
    ComputerPlayer hand_dealer;

    public BlackjackController(Dealer d){
        dealer = d;
    }
    public void manageBlackjack(){
        String name = JOptionPane.showInputDialog("이름을 입력하시오.");
        hand_player = new HumanPlayer(11,name);
        hand_dealer = new ComputerPlayer(11);

        dealer.dealOneTo(hand_player);
        dealer.dealOneTo(hand_dealer);
        dealer.dealOneTo(hand_player);
        dealer.dealOneTo(hand_dealer);
        printhand(hand_player);
        printhand_dealer(hand_dealer);
        if(hand_player.totalScore()==21){
            hand_player.youBlackjack();
        }
        else if(hand_player.totalScore()>21){
            hand_player.youLose();
        }

    }
    public void printhand(HumanPlayer hand){
        Card[] c = hand.showCards();
        for(int i=0; i<c.length; i++)
            System.out.println(c[1].getSuit()+" "+ c[1].getRank());
    }
    public void printhand_dealer(Cardplayer hand){
        Card[] c = hand.showCards();
        System.out.println("X  X");
        for(int i=0; i<c.length; i++)
            System.out.println(c[1].getSuit()+" "+ c[1].getRank());
    }
}
