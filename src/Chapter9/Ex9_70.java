package Chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//9.70. Дано предложение. Определить, сколько в нем гласных букв.
public class Ex9_70 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File("src/Chapter9/Ex9_70.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        String string = sb.toString();
        char[] vowels = {'a', 'y', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        int count = 0;
        System.out.println(string);
        for (int i = 0; i <= vowels.length - 1; i++) {
            for (int j = 0; j <= string.length() - 1; j++) {
                if (string.charAt(j) == vowels[i]) {
                    count++;
                }
            }
        }
        System.out.println("Гласных " + count);
    }

}
