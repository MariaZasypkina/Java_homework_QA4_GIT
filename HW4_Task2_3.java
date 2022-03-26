public class HW4_Task2_3 {
    /**
     *    Задача №3
     *      Дана строка:
     *      String s = “Посмотрите как Рите нравится ритм”;
     *      необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     *      Для указанной строки ответ будет 6, 15, 29.
     */
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();

        int index = s.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("рит", index +1);
        }
        }
    }

