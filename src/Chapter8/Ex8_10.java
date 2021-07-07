package Chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Баллы, полученные в соревнованиях по пятиборью каждым из восьми спортсменов по каждому виду спорта,
//        представлены в виде таблицы (рис. 8.2).
public class Ex8_10 {
    private int id;
    private int Sport1;
    private int Sport2;
    private int Sport3;
    private int Sport4;
    private int Sport5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSport1() {
        return Sport1;
    }

    public void setSport1(int sport1) {
        Sport1 = sport1;
    }

    public int getSport2() {
        return Sport2;
    }

    public void setSport2(int sport2) {
        Sport2 = sport2;
    }

    public int getSport3() {
        return Sport3;
    }

    public void setSport3(int sport3) {
        Sport3 = sport3;
    }

    public int getSport4() {
        return Sport4;
    }

    public void setSport4(int sport4) {
        Sport4 = sport4;
    }

    public int getSport5() {
        return Sport5;
    }

    public void setSport5(int sport5) {
        Sport5 = sport5;
    }


    public Ex8_10(int id, int sport1, int sport2, int sport3, int sport4, int sport5) {
        this.id = id;
        Sport1 = sport1;
        Sport2 = sport2;
        Sport3 = sport3;
        Sport4 = sport4;
        Sport5 = sport5;
    }

    @Override
    public String toString() {
        return "Ex8_10{" +
                "id=" + id +
                ", Sport1=" + Sport1 +
                ", Sport2=" + Sport2 +
                ", Sport3=" + Sport3 +
                ", Sport4=" + Sport4 +
                ", Sport5=" + Sport5 +
                '}';
    }

    public Ex8_10() {
    }

    public Ex8_10 createNewSportsmen() {
        Scanner scanner = new Scanner(System.in);
        Ex8_10 Sportsmen = new Ex8_10();

        System.out.println("Введите id спортсмена");
        Sportsmen.setId(scanner.nextInt());

        System.out.println("Введите оценку по первому виду спорта");
        Sportsmen.setSport1(scanner.nextInt());

        System.out.println("Введите оценку по второму виду спорта");
        Sportsmen.setSport2(scanner.nextInt());

        System.out.println("Введите оценку по третьему виду спорта");
        Sportsmen.setSport3(scanner.nextInt());

        System.out.println("Введите оценку по четвертому виду спорта");
        Sportsmen.setSport4(scanner.nextInt());

        System.out.println("Введите оценку по пятому виду спорта");
        Sportsmen.setSport5(scanner.nextInt());

        System.out.println("Создан новый спортсмен " + Sportsmen);
        return Sportsmen;
    }

    public static void main(String[] args) {
        List<Ex8_10> sportsmens = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            sportsmens.add(new Ex8_10().createNewSportsmen());
        }
        System.out.println("Созданы спортсмены");
        for (Ex8_10 sportsmen: sportsmens){
            System.out.println(sportsmen);
        }
    }
}
