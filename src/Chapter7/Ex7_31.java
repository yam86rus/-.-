package Chapter7;
//7.31. Для каждой команды-участницы чемпионата по футболу известно ее количество выигрышей и количество проигрышей.
//        Определить, сколько команд имеют больше выигрышей, чем проигрышей.

import java.util.ArrayList;
import java.util.List;

public class Ex7_31{
private int win =0;
private int loss =0;

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    @Override
    public String toString() {
        return "Ex7_31{" +
                "win=" + win +
                ", loss=" + loss +
                '}';
    }
}



class Start {
    public static void main(String[] args) {
        Ex7_31 team1 = new Ex7_31();
        team1.setWin(10);
        team1.setLoss(6);

        Ex7_31 team2 = new Ex7_31();
        team2.setWin(11);
        team2.setLoss(5);

        Ex7_31 team3 = new Ex7_31();
        team3.setWin(4);
        team3.setLoss(7);

        List<Ex7_31> list = new ArrayList<>();
        list.add(team1);
        list.add(team2);
        list.add(team3);

        System.out.println(list);
        long result = list.stream().filter(e->e.getWin()>e.getLoss()).count();
        System.out.println(result);

    }
}

