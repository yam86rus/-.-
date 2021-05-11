package Chapter10;

//10.19. Даны два натуральных числа. Выяснить, в каком из них больше цифр. (Определить функцию для расчета количества цифр натурального числа.)
public class Ex10_19 {
    public static void main(String[] args) {
        int n1 = 132, n2 = 234;
        checkLength(n1, n2);
    }

    private static void checkLength(int n1, int n2) {
        if (counter(n1)>counter(n2)) {
            System.out.println(n1);
        } else if (counter(n1)==counter(n2)){
            System.out.println("количество цифр - одинаково");
        }
    }

    private static int counter(int x1) {
        int count = 0;
        while (x1 / 10 != 0) {
            count++;
            x1 = x1 / 10;
        }
        return count;
    }
}
