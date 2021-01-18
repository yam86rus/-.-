package Chapter11;

//11.62. Известно число жителей, проживающих в каждом доме улицы. Нумерация домов проведена подряд.
//        Дома с нечетными номерами расположены на од-ной стороне улицы, с четными — на другой.
//        На какой стороне улицы про-живает больше жителей?
public class Ex11_62 {
    static String foo(int[] a) {
        int res1 = 0;
        int res2 = 0;
        for (int i = 0; i < a.length; i += 2) {
            res1 += a[i];
        }
        for (int i = 1; i < a.length; i += 2) {
            res2 += a[i];
        }
        if (res1 > res2) return "Нечетных больше";
        else if (res1 < res2) return "Четных больше";
        else return "Одинаково";
    }

    public static void main(String[] args) {
        int[] arr = {21, 22, 1, 1, 2, 2, 3, 3};
        System.out.println((foo(arr)));
    }
}
