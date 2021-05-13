package Chapter9;

import java.util.ArrayList;
import java.util.List;

//9.184.*Дан текст. Проверить, правильно ли в нем расставлены круглые скобки (т. е.
//        находится ли справа от каждой открывающей скобки соответствующая ей
//        закрывающая скобка, а слева от каждой закрывающей — соответствующая
//        ей закрывающая). Предполагается, что внутри каждой пары скобок нет других скобок.
//        а) Ответом должны служить слова да или нет.
//        б) В случае неправильности расстановки скобок:
//        если имеются лишние правые (закрывающие) скобки, то выдать сообщение с указанием позиции первой такой скобки;
//        если имеются лишние левые (открывающие) скобки, то выдать сообщение с указанием количества таких скобок.
//        Если скобки расставлены правильно, то сообщить об этом
public class Ex9_184 {
    private static boolean getValid(String string) {
        List<Character> characterList = new ArrayList<>();
        boolean result = false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == ')') {
                characterList.add(string.charAt(i));
                continue;
            }
        }
            System.out.println(characterList);

        if (characterList.size()>=2) {
            for (int i = 1; i < characterList.size(); i++) {
                if (characterList.get(i) != ')' && characterList.get(i - 1) == '(') {
                    result = false;
                    break;
                } else result = true;
            }
            return result;
        } else {
            System.out.println("мало скобок");
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "Дан текст. (Проверить, (правильно ли) в нем расставлены( круглые скобки)";
        String str2 = "Дан текст. ((Проверить, (правильно ли в нем расставлены)( круглые скобки)";
        String str3 = "Дан текст. (Проверить, правильно ли в нем расставлены круглые скобки";
        System.out.println(getValid(str1));
        System.out.println(getValid(str2));
        System.out.println(getValid(str3));

    }
}
