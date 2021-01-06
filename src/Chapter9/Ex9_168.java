package Chapter9;

//9.168. Дано предложение. Определить:
//        а) количество слов, начинающихся с буквы н;
//        б) количество слов, оканчивающихся буквой р.
public class Ex9_168 {
    static int foo(String str) {
        int result = 0;
        String[] ar = str.split(" ");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].startsWith("н")) {
                result++;
            }
        }
        return result;
    }

    static int foo1(String str) {
        int result = 0;
        String [] arr = str.split(" ");
        for (String s: arr){
            if (s.endsWith("р")){
                result++;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        String s = "количество слов, начинающихсяр с буквы н";
        System.out.println(foo(s));
        System.out.println(foo1(s));
    }
}
