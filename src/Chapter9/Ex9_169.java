package Chapter9;
//9.169. Дано предложение. Вывести на экран:
//        а) его слова, начинающиеся и оканчивающиеся на одну и ту же букву;
//        б) его слова, которые содержат ровно три буквы е;
//        в) его слова, которые содержат хотя бы одну букву о.
public class Ex9_169 {
    static void foo(String str){
        String [] arr = str.split(" ");
        for (String s1: arr){
            if (s1.charAt(0)==s1.charAt(s1.length()-1)){
                System.out.print(s1 + " ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "его слова, лол начинающиеся и оканчивающиеся на одну и ту же букву";
        foo(s);
    }
}
