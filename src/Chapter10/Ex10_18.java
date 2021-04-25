package Chapter10;

//import static sun.swing.MenuItemLayoutHelper.max;

//10.18. Даны два натуральных числа. Выяснить, в каком из них сумма цифр больше.
//        (Определить функцию для расчета суммы цифр натурального числа.)
public class Ex10_18 {
    static int getSum(int n) {
        int result = 0;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    static int checkValues(int n1, int n2) {
        return Math.max(getSum(n1),getSum(n2));
    }

    public static void main(String[] args) {
        int a = 17, b = 34;
        System.out.println(checkValues(a,b));
    }
}
