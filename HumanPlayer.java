import javax.swing.*;

public class HumanPlayer extends Cardplayer {
    private Sting name;
    private int chips = 0;

    public int deleteACard()
    {
        int input = JOptionPane.showInputDialog("버릴 카드 한 쌍을 순서에 따라 골라주세요.");
        return input;
    }
    public void youWin(){
        chips += 1;
        System.out.println(name + "손님이 승리하셨습니다.");
        System.out.println("칩의 개수는"+chips+"개");
    }

    public void youLose(){
        chips -= 1;
        System.out.println(name + "손님께서 패배하셨습니다. 아쉽네요.");
        System.out.println("칩의 개수는"+chips+"개");
    }


}