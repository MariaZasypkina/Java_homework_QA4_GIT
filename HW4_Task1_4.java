public class HW4_Task1_4 {
    /**
     Задача №4
     Дан массив:
     int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     необходимо вывести среднее арифметическое всех значений массива.
     */

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 56};
        double sum = array[0];

    for (int i = 0; i < array.length; i++)
        sum += array[i];
    System.out.println(sum/ array.length);
    }
}
