package Chapter14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//14.8. В конец существующего типизированного файла записать:
//        а) число 0;
//        б) фразу До свидания!.
public class Ex14_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Chapter14/Ex14_8.txt");
        FileWriter fw = new FileWriter(file, true);

        fw.write('\n' + "0" + '\n');
        fw.write("До свидания!" + '\n');
        fw.close();


    }
}
