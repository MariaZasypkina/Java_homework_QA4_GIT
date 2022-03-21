import java.sql.SQLOutput;

public class HW4_Task2_1 {
    /**
     * Задача №1
     * Дана строка:
     * String s = “Перестановочный алгоритм быстрого действия”;
     * необходимо вывести все буквы “о” из этой строки.
     * Для указанной строки ответ будет “ооооо” (или в столбик)
      */

    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        String[] strArray = null;
        strArray = s.split(" ");
        System.out.println(strArray);
//        for (int i = 0; i < s.length(); i++)
//            if (s[i] == 'o')
//                System.out.println('o');

    }
}
