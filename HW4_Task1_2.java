public class HW4_Task1_2 {

    public static void main(String[] args) {
        /**
         *Задача №2
         *
         * Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести максимальное значение массива.
         *  */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];
        int i;
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        System.out.println(max);

    }
}