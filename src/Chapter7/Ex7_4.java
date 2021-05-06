package Chapter7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

//7.4. Найти сумму целых положительных чисел из промежутка от a до b, кратных
//        четырем.
public class Ex7_4 {

    public static String stringRevers(String str){
        String result = new StringBuilder(str).reverse().toString().trim().toUpperCase();
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число начало");
        int n = scanner.nextInt();
        System.out.println("Введите число окончание");
        int b = scanner.nextInt();
//        int result = Stream.iterate(n,x->x+1).limit(Math.abs(b-n)).filter(e->e%4==0).mapToInt(Integer::intValue).sum();
        Stream.iterate(n,x->x+1).limit(Math.abs(b-n)).filter(e->e%4==0).mapToInt(Integer::intValue).forEach(System.out::println);
//        System.out.println(result);

//
//        List<String> users = new ArrayList<>();
//        String[] users2 = {" Максим   ","   Иван ", "   Олег "};
//        Arrays.stream(users2).forEach(Ex7_4::stringRevers);



    }
}
