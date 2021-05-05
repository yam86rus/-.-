package Chapter7;
//7.1. Вывести на экран все целые числа от 100 до 200, кратные трем.
public class Ex7_1 {
    public static void main(String[] args) {
        for (int i=100; i<200;i++){
            if (i%3==0){
                System.out.print(i + " ");
            }
        }
    }
}
