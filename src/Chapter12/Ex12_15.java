package Chapter12;

//12.15. Составить программу:
//        а) расчета суммы двух любых элементов двумерного массива;
//        б) расчета среднего арифметического трех любых элементов двумерного массива.
public class Ex12_15 {
    public static void main(String[] args) {
        double[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("суммы двух любых элементов двумерного массива " + (doubleArray[0][1] + doubleArray[2][0]));
        System.out.println("суммы двух любых элементов двумерного массива " + ((doubleArray[0][1] + doubleArray[2][0] + doubleArray[1][1]) / 3));
    }
}
