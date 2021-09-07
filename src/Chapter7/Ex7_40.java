package Chapter7;

import java.util.ArrayList;
import java.util.List;

//7.40. В ходе хоккейного матча игроки обеих команд удалялись в общей сложности
//        24 раза. По каждому удалению известен номер команды удаленного игрока и
//        продолжительность удаления (2, 5 или 10 мин.).
//        Для каждой команды определить общее число удалений и общее время всех удалений.
public class Ex7_40 {
    int commandNumber;
    int playerNumber;
    int time;

    public int getCommandNumber() {
        return commandNumber;
    }

    public void setCommandNumber(int commandNumber) {
        this.commandNumber = commandNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ex7_40{" +
                "commandNumber=" + commandNumber +
                ", playerNumber=" + playerNumber +
                ", time=" + time +
                '}';
    }

    // Принимает номер команды и заполняет случайными данными
    static List<Ex7_40> fillData(int command, List<Ex7_40> list) {
        for (int i = 0; i < 2; i++) {
            int randomPlayer = 1 + (int) ((20 - 1 + 1) * Math.random());
            int randomTime = 1 + (int) ((20 - 1 + 1) * Math.random());
            list.add(new Ex7_40.Builder().withCommandNumber(command).withPlayerNumber(randomPlayer).withTime(randomTime).build());
        }
        return list;
    }

    public static class Builder {
        private Ex7_40 newEx7_40;

        public Builder() {
            newEx7_40 = new Ex7_40();
        }

        public Builder withCommandNumber(int number) {
            newEx7_40.commandNumber = number;
            return this;
        }

        public Builder withPlayerNumber(int playerNumber) {
            newEx7_40.playerNumber = playerNumber;
            return this;
        }

        public Builder withTime(int time) {
            newEx7_40.time = time;
            return this;
        }

        public Ex7_40 build() {
            return newEx7_40;
        }



    }


    public static void main(String[] args) {
        List<Ex7_40> listTeam = new ArrayList<>();

        // Заполняем list случайными значениями 12 раз для первой команды
        fillData(1,listTeam);
        fillData(2,listTeam);
        for (Ex7_40 e: listTeam){
            System.out.println(e);
        }
        int result = listTeam.stream().mapToInt(i -> i.getTime()).sum();
        System.out.println("Общее время удаления " + result);
        int result2 = listTeam.size();
        System.out.println("Общее количество удалений " + result2);
    }
}
