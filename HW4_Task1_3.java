public class HW4_Task1_3 {
    /**
     * Задача №3
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести минимальное значение массива.
     */
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

//        int min = array[0];    ver 1 but the following is more correct

int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        System.out.println(min);
    }
}
