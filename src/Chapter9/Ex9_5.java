package Chapter9;

import java.util.Scanner;

//9.5. Составить программу, которая запрашивает название романа и фамилию его
//        автора, а затем выводит сообщение: "Писатель ... — автор романа ..." (на мес-
//        те многоточий должны быть выведены соответствующие значения).
public class Ex9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название романа");
        String roman = scanner.nextLine();
        System.out.println("Введите фамилию автора");
        String lastName = scanner.nextLine();
        System.out.println("Писатель " + lastName + " - автор романа " + roman);
        scanner.close();
    }
}

